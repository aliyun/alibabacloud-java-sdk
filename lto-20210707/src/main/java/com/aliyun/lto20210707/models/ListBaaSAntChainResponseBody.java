// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBaaSAntChainResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaaSAntChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainResponseBody self = new ListBaaSAntChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBaaSAntChainResponseBody setData(java.util.List<ListBaaSAntChainResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBaaSAntChainResponseBodyData> getData() {
        return this.data;
    }

    public ListBaaSAntChainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaaSAntChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBaaSAntChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaaSAntChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaaSAntChainResponseBodyData extends TeaModel {
        @NameInMap("BaaSAntChainChainId")
        public String baaSAntChainChainId;

        @NameInMap("BaaSAntChainChainName")
        public String baaSAntChainChainName;

        public static ListBaaSAntChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaaSAntChainResponseBodyData self = new ListBaaSAntChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaaSAntChainResponseBodyData setBaaSAntChainChainId(String baaSAntChainChainId) {
            this.baaSAntChainChainId = baaSAntChainChainId;
            return this;
        }
        public String getBaaSAntChainChainId() {
            return this.baaSAntChainChainId;
        }

        public ListBaaSAntChainResponseBodyData setBaaSAntChainChainName(String baaSAntChainChainName) {
            this.baaSAntChainChainName = baaSAntChainChainName;
            return this;
        }
        public String getBaaSAntChainChainName() {
            return this.baaSAntChainChainName;
        }

    }

}
