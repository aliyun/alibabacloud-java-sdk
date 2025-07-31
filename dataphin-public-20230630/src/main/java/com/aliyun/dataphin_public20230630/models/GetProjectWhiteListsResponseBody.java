// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetProjectWhiteListsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WhiteLists")
    public java.util.List<GetProjectWhiteListsResponseBodyWhiteLists> whiteLists;

    public static GetProjectWhiteListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectWhiteListsResponseBody self = new GetProjectWhiteListsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectWhiteListsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectWhiteListsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectWhiteListsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectWhiteListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectWhiteListsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProjectWhiteListsResponseBody setWhiteLists(java.util.List<GetProjectWhiteListsResponseBodyWhiteLists> whiteLists) {
        this.whiteLists = whiteLists;
        return this;
    }
    public java.util.List<GetProjectWhiteListsResponseBodyWhiteLists> getWhiteLists() {
        return this.whiteLists;
    }

    public static class GetProjectWhiteListsResponseBodyWhiteLists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ip</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.0.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public String port;

        public static GetProjectWhiteListsResponseBodyWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            GetProjectWhiteListsResponseBodyWhiteLists self = new GetProjectWhiteListsResponseBodyWhiteLists();
            return TeaModel.build(map, self);
        }

        public GetProjectWhiteListsResponseBodyWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectWhiteListsResponseBodyWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetProjectWhiteListsResponseBodyWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
