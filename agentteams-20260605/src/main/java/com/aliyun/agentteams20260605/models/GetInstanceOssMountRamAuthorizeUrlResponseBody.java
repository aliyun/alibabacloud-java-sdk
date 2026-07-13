// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceOssMountRamAuthorizeUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceOssMountRamAuthorizeUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceOssMountRamAuthorizeUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceOssMountRamAuthorizeUrlResponseBody self = new GetInstanceOssMountRamAuthorizeUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceOssMountRamAuthorizeUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponseBody setData(GetInstanceOssMountRamAuthorizeUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceOssMountRamAuthorizeUrlResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceOssMountRamAuthorizeUrlResponseBodyData extends TeaModel {
        @NameInMap("AuthorizeUrl")
        public String authorizeUrl;

        public static GetInstanceOssMountRamAuthorizeUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceOssMountRamAuthorizeUrlResponseBodyData self = new GetInstanceOssMountRamAuthorizeUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceOssMountRamAuthorizeUrlResponseBodyData setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
            return this;
        }
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

    }

}
