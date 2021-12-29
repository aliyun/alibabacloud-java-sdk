// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainConsortiumResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBaaSAntChainConsortiumResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaaSAntChainConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainConsortiumResponseBody self = new ListBaaSAntChainConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainConsortiumResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBaaSAntChainConsortiumResponseBody setData(java.util.List<ListBaaSAntChainConsortiumResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBaaSAntChainConsortiumResponseBodyData> getData() {
        return this.data;
    }

    public ListBaaSAntChainConsortiumResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaaSAntChainConsortiumResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBaaSAntChainConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaaSAntChainConsortiumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaaSAntChainConsortiumResponseBodyData extends TeaModel {
        @NameInMap("BaaSAntChainConsortiumId")
        public String baaSAntChainConsortiumId;

        @NameInMap("BaaSAntChainConsortiumName")
        public String baaSAntChainConsortiumName;

        public static ListBaaSAntChainConsortiumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaaSAntChainConsortiumResponseBodyData self = new ListBaaSAntChainConsortiumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaaSAntChainConsortiumResponseBodyData setBaaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
            this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
            return this;
        }
        public String getBaaSAntChainConsortiumId() {
            return this.baaSAntChainConsortiumId;
        }

        public ListBaaSAntChainConsortiumResponseBodyData setBaaSAntChainConsortiumName(String baaSAntChainConsortiumName) {
            this.baaSAntChainConsortiumName = baaSAntChainConsortiumName;
            return this;
        }
        public String getBaaSAntChainConsortiumName() {
            return this.baaSAntChainConsortiumName;
        }

    }

}
