// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallWorkspacePluginResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the plugin installation operation.</p>
     */
    @NameInMap("data")
    public InstallWorkspacePluginResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
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

    public static InstallWorkspacePluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallWorkspacePluginResponseBody self = new InstallWorkspacePluginResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallWorkspacePluginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallWorkspacePluginResponseBody setData(InstallWorkspacePluginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallWorkspacePluginResponseBodyData getData() {
        return this.data;
    }

    public InstallWorkspacePluginResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InstallWorkspacePluginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallWorkspacePluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallWorkspacePluginResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InstallWorkspacePluginResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the plugin is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>collaboration</p>
         */
        @NameInMap("pluginName")
        public String pluginName;

        /**
         * <p>The plugin status. Valid values: DISABLED, ENABLING, ENABLED, ENABLE_FAILED, DISABLING, and DISABLE_FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static InstallWorkspacePluginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallWorkspacePluginResponseBodyData self = new InstallWorkspacePluginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallWorkspacePluginResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstallWorkspacePluginResponseBodyData setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public InstallWorkspacePluginResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InstallWorkspacePluginResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
