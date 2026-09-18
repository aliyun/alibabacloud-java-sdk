// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class EnableConnectorResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The Connector details.</p>
     */
    @NameInMap("data")
    public EnableConnectorResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static EnableConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableConnectorResponseBody self = new EnableConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableConnectorResponseBody setData(EnableConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableConnectorResponseBodyData getData() {
        return this.data;
    }

    public EnableConnectorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public EnableConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableConnectorResponseBodyData extends TeaModel {
        /**
         * <p>The number of bound agents.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("boundAgentCount")
        public Long boundAgentCount;

        /**
         * <p>The time when the Connector was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T08:00:00Z</p>
         */
        @NameInMap("enabledAt")
        public String enabledAt;

        /**
         * <p>The Connector configuration JSON string. This is sensitive information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        /**
         * <p>The Connector name. The current value is qodercli.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The Connector status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("status")
        public String status;

        public static EnableConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableConnectorResponseBodyData self = new EnableConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableConnectorResponseBodyData setBoundAgentCount(Long boundAgentCount) {
            this.boundAgentCount = boundAgentCount;
            return this;
        }
        public Long getBoundAgentCount() {
            return this.boundAgentCount;
        }

        public EnableConnectorResponseBodyData setEnabledAt(String enabledAt) {
            this.enabledAt = enabledAt;
            return this;
        }
        public String getEnabledAt() {
            return this.enabledAt;
        }

        public EnableConnectorResponseBodyData setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public EnableConnectorResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EnableConnectorResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
