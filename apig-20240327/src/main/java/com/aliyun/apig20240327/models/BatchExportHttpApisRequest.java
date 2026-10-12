// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchExportHttpApisRequest extends TeaModel {
    /**
     * <p>The list of API IDs to export.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiIds")
    public java.util.List<String> apiIds;

    /**
     * <p>The API type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("apiType")
    public String apiType;

    /**
     * <p>The export extension configuration. When this configuration is specified for a REST API, gatewayId is required. This configuration is required for batch export of HTTP APIs.</p>
     */
    @NameInMap("extensionConfig")
    public BatchExportHttpApisRequestExtensionConfig extensionConfig;

    /**
     * <p>The export format. Valid values: json and yaml. Default value: yaml.</p>
     * 
     * <strong>example:</strong>
     * <p>yaml</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>The gateway instance ID. This parameter is required when extensionConfig is specified for a REST API. This parameter is required for batch export of HTTP APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    public static BatchExportHttpApisRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchExportHttpApisRequest self = new BatchExportHttpApisRequest();
        return TeaModel.build(map, self);
    }

    public BatchExportHttpApisRequest setApiIds(java.util.List<String> apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public java.util.List<String> getApiIds() {
        return this.apiIds;
    }

    public BatchExportHttpApisRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public BatchExportHttpApisRequest setExtensionConfig(BatchExportHttpApisRequestExtensionConfig extensionConfig) {
        this.extensionConfig = extensionConfig;
        return this;
    }
    public BatchExportHttpApisRequestExtensionConfig getExtensionConfig() {
        return this.extensionConfig;
    }

    public BatchExportHttpApisRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public BatchExportHttpApisRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static class BatchExportHttpApisRequestExtensionConfig extends TeaModel {
        /**
         * <p>Specifies whether to export the consumer authorization configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("withAuthConfig")
        public Boolean withAuthConfig;

        /**
         * <p>Specifies whether to export the authorized consumers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("withAuthConsumer")
        public Boolean withAuthConsumer;

        /**
         * <p>Specifies whether to export the plugin configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("withPlugin")
        public Boolean withPlugin;

        /**
         * <p>Specifies whether to export the policy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("withPolicy")
        public Boolean withPolicy;

        /**
         * <p>Specifies whether to export the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("withService")
        public Boolean withService;

        public static BatchExportHttpApisRequestExtensionConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchExportHttpApisRequestExtensionConfig self = new BatchExportHttpApisRequestExtensionConfig();
            return TeaModel.build(map, self);
        }

        public BatchExportHttpApisRequestExtensionConfig setWithAuthConfig(Boolean withAuthConfig) {
            this.withAuthConfig = withAuthConfig;
            return this;
        }
        public Boolean getWithAuthConfig() {
            return this.withAuthConfig;
        }

        public BatchExportHttpApisRequestExtensionConfig setWithAuthConsumer(Boolean withAuthConsumer) {
            this.withAuthConsumer = withAuthConsumer;
            return this;
        }
        public Boolean getWithAuthConsumer() {
            return this.withAuthConsumer;
        }

        public BatchExportHttpApisRequestExtensionConfig setWithPlugin(Boolean withPlugin) {
            this.withPlugin = withPlugin;
            return this;
        }
        public Boolean getWithPlugin() {
            return this.withPlugin;
        }

        public BatchExportHttpApisRequestExtensionConfig setWithPolicy(Boolean withPolicy) {
            this.withPolicy = withPolicy;
            return this;
        }
        public Boolean getWithPolicy() {
            return this.withPolicy;
        }

        public BatchExportHttpApisRequestExtensionConfig setWithService(Boolean withService) {
            this.withService = withService;
            return this;
        }
        public Boolean getWithService() {
            return this.withService;
        }

    }

}
