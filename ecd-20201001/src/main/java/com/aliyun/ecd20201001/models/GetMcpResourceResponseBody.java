// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class GetMcpResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMcpResourceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMcpResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpResourceResponseBody self = new GetMcpResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpResourceResponseBody setData(GetMcpResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpResourceResponseBodyData getData() {
        return this.data;
    }

    public GetMcpResourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMcpResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcpResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMcpResourceResponseBodyData extends TeaModel {
        @NameInMap("ResourceUrl")
        public String resourceUrl;

        @NameInMap("SessionId")
        public String sessionId;

        public static GetMcpResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResourceResponseBodyData self = new GetMcpResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpResourceResponseBodyData setResourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        public GetMcpResourceResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
