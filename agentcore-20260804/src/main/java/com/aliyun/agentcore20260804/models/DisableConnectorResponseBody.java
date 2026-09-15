// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DisableConnectorResponseBody extends TeaModel {
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
    public DisableConnectorResponseBodyData data;

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

    public static DisableConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableConnectorResponseBody self = new DisableConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableConnectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableConnectorResponseBody setData(DisableConnectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableConnectorResponseBodyData getData() {
        return this.data;
    }

    public DisableConnectorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DisableConnectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableConnectorResponseBodyData extends TeaModel {
        /**
         * <p>The number of Agents bound to the Connector.</p>
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
         * <p>A JSON string. For qodercli: {&quot;site&quot;:&quot;global|cn&quot;,&quot;organizationId&quot;:&quot;...&quot;,&quot;apiKey&quot;:&quot;...&quot;,&quot;serviceAccountKeys&quot;:[{&quot;id&quot;:&quot;ckey-xxx&quot;,&quot;name&quot;:&quot;default&quot;,&quot;serviceAccountKey&quot;:&quot;...&quot;}]}. This field is empty when the Connector is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        /**
         * <p>The Connector name.</p>
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

        public static DisableConnectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableConnectorResponseBodyData self = new DisableConnectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableConnectorResponseBodyData setBoundAgentCount(Long boundAgentCount) {
            this.boundAgentCount = boundAgentCount;
            return this;
        }
        public Long getBoundAgentCount() {
            return this.boundAgentCount;
        }

        public DisableConnectorResponseBodyData setEnabledAt(String enabledAt) {
            this.enabledAt = enabledAt;
            return this;
        }
        public String getEnabledAt() {
            return this.enabledAt;
        }

        public DisableConnectorResponseBodyData setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public DisableConnectorResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DisableConnectorResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
