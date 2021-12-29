// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricConsortiumResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBaaSFabricConsortiumResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaaSFabricConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricConsortiumResponseBody self = new ListBaaSFabricConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricConsortiumResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBaaSFabricConsortiumResponseBody setData(java.util.List<ListBaaSFabricConsortiumResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBaaSFabricConsortiumResponseBodyData> getData() {
        return this.data;
    }

    public ListBaaSFabricConsortiumResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaaSFabricConsortiumResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBaaSFabricConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaaSFabricConsortiumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaaSFabricConsortiumResponseBodyData extends TeaModel {
        @NameInMap("BaaSFabricConsortiumId")
        public String baaSFabricConsortiumId;

        @NameInMap("BaaSFabricConsortiumName")
        public String baaSFabricConsortiumName;

        public static ListBaaSFabricConsortiumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaaSFabricConsortiumResponseBodyData self = new ListBaaSFabricConsortiumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaaSFabricConsortiumResponseBodyData setBaaSFabricConsortiumId(String baaSFabricConsortiumId) {
            this.baaSFabricConsortiumId = baaSFabricConsortiumId;
            return this;
        }
        public String getBaaSFabricConsortiumId() {
            return this.baaSFabricConsortiumId;
        }

        public ListBaaSFabricConsortiumResponseBodyData setBaaSFabricConsortiumName(String baaSFabricConsortiumName) {
            this.baaSFabricConsortiumName = baaSFabricConsortiumName;
            return this;
        }
        public String getBaaSFabricConsortiumName() {
            return this.baaSFabricConsortiumName;
        }

    }

}
