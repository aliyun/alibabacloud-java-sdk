// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetExternalAgentBootstrapOptionsResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The access network information available for the external agent.</p>
     */
    @NameInMap("data")
    public GetExternalAgentBootstrapOptionsResponseBodyData data;

    /**
     * <p>The HTTP status code. The value is 200 when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
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
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetExternalAgentBootstrapOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExternalAgentBootstrapOptionsResponseBody self = new GetExternalAgentBootstrapOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExternalAgentBootstrapOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetExternalAgentBootstrapOptionsResponseBody setData(GetExternalAgentBootstrapOptionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExternalAgentBootstrapOptionsResponseBodyData getData() {
        return this.data;
    }

    public GetExternalAgentBootstrapOptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetExternalAgentBootstrapOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExternalAgentBootstrapOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExternalAgentBootstrapOptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions extends TeaModel {
        /**
         * <p>Indicates whether the access network is available.</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The access network type. Valid values: INTRANET (internal network) and INTERNET (public network).</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        public static GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions self = new GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class GetExternalAgentBootstrapOptionsResponseBodyData extends TeaModel {
        /**
         * <p>The external agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The list of available access networks.</p>
         */
        @NameInMap("networkOptions")
        public java.util.List<GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions> networkOptions;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetExternalAgentBootstrapOptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentBootstrapOptionsResponseBodyData self = new GetExternalAgentBootstrapOptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentBootstrapOptionsResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetExternalAgentBootstrapOptionsResponseBodyData setNetworkOptions(java.util.List<GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions> networkOptions) {
            this.networkOptions = networkOptions;
            return this;
        }
        public java.util.List<GetExternalAgentBootstrapOptionsResponseBodyDataNetworkOptions> getNetworkOptions() {
            return this.networkOptions;
        }

        public GetExternalAgentBootstrapOptionsResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
