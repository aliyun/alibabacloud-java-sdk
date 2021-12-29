// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricChannelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBaaSFabricChannelResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaaSFabricChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricChannelResponseBody self = new ListBaaSFabricChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricChannelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBaaSFabricChannelResponseBody setData(java.util.List<ListBaaSFabricChannelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBaaSFabricChannelResponseBodyData> getData() {
        return this.data;
    }

    public ListBaaSFabricChannelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaaSFabricChannelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBaaSFabricChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaaSFabricChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaaSFabricChannelResponseBodyData extends TeaModel {
        @NameInMap("BaaSFabricChannelId")
        public String baaSFabricChannelId;

        @NameInMap("BaaSFabricChannelName")
        public String baaSFabricChannelName;

        public static ListBaaSFabricChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaaSFabricChannelResponseBodyData self = new ListBaaSFabricChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaaSFabricChannelResponseBodyData setBaaSFabricChannelId(String baaSFabricChannelId) {
            this.baaSFabricChannelId = baaSFabricChannelId;
            return this;
        }
        public String getBaaSFabricChannelId() {
            return this.baaSFabricChannelId;
        }

        public ListBaaSFabricChannelResponseBodyData setBaaSFabricChannelName(String baaSFabricChannelName) {
            this.baaSFabricChannelName = baaSFabricChannelName;
            return this;
        }
        public String getBaaSFabricChannelName() {
            return this.baaSFabricChannelName;
        }

    }

}
