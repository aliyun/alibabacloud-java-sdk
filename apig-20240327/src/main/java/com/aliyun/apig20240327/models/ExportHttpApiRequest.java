// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ExportHttpApiRequest extends TeaModel {
    /**
     * <p>Specifies whether to export plug-in configurations.</p>
     */
    @NameInMap("extensionConfig")
    public ExportHttpApiRequestExtensionConfig extensionConfig;

    /**
     * <p>The gateway instance ID. This parameter is required when you export gateway extension information.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The IDs of specific operations to export when you export a REST API.</p>
     */
    @NameInMap("operationIds")
    public java.util.List<String> operationIds;

    public static ExportHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportHttpApiRequest self = new ExportHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public ExportHttpApiRequest setExtensionConfig(ExportHttpApiRequestExtensionConfig extensionConfig) {
        this.extensionConfig = extensionConfig;
        return this;
    }
    public ExportHttpApiRequestExtensionConfig getExtensionConfig() {
        return this.extensionConfig;
    }

    public ExportHttpApiRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ExportHttpApiRequest setOperationIds(java.util.List<String> operationIds) {
        this.operationIds = operationIds;
        return this;
    }
    public java.util.List<String> getOperationIds() {
        return this.operationIds;
    }

    public static class ExportHttpApiRequestExtensionConfig extends TeaModel {
        /**
         * <p>Specifies whether to export consumer authorization configurations for operations or routes.</p>
         */
        @NameInMap("withAuthConfig")
        public Boolean withAuthConfig;

        /**
         * <p>Specifies whether to export authorized consumers.</p>
         */
        @NameInMap("withAuthConsumer")
        public Boolean withAuthConsumer;

        /**
         * <p>Specifies whether to export plug-in configurations.</p>
         */
        @NameInMap("withPlugin")
        public Boolean withPlugin;

        /**
         * <p>Specifies whether to export policy configurations.</p>
         */
        @NameInMap("withPolicy")
        public Boolean withPolicy;

        /**
         * <p>Specifies whether to export backend services.</p>
         */
        @NameInMap("withService")
        public Boolean withService;

        public static ExportHttpApiRequestExtensionConfig build(java.util.Map<String, ?> map) throws Exception {
            ExportHttpApiRequestExtensionConfig self = new ExportHttpApiRequestExtensionConfig();
            return TeaModel.build(map, self);
        }

        public ExportHttpApiRequestExtensionConfig setWithAuthConfig(Boolean withAuthConfig) {
            this.withAuthConfig = withAuthConfig;
            return this;
        }
        public Boolean getWithAuthConfig() {
            return this.withAuthConfig;
        }

        public ExportHttpApiRequestExtensionConfig setWithAuthConsumer(Boolean withAuthConsumer) {
            this.withAuthConsumer = withAuthConsumer;
            return this;
        }
        public Boolean getWithAuthConsumer() {
            return this.withAuthConsumer;
        }

        public ExportHttpApiRequestExtensionConfig setWithPlugin(Boolean withPlugin) {
            this.withPlugin = withPlugin;
            return this;
        }
        public Boolean getWithPlugin() {
            return this.withPlugin;
        }

        public ExportHttpApiRequestExtensionConfig setWithPolicy(Boolean withPolicy) {
            this.withPolicy = withPolicy;
            return this;
        }
        public Boolean getWithPolicy() {
            return this.withPolicy;
        }

        public ExportHttpApiRequestExtensionConfig setWithService(Boolean withService) {
            this.withService = withService;
            return this;
        }
        public Boolean getWithService() {
            return this.withService;
        }

    }

}
