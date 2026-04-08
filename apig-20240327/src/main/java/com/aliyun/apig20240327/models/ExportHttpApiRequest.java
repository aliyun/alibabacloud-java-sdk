// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ExportHttpApiRequest extends TeaModel {
    @NameInMap("extensionConfig")
    public ExportHttpApiRequestExtensionConfig extensionConfig;

    /**
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

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
        @NameInMap("withAuthConfig")
        public Boolean withAuthConfig;

        @NameInMap("withAuthConsumer")
        public Boolean withAuthConsumer;

        @NameInMap("withPlugin")
        public Boolean withPlugin;

        @NameInMap("withPolicy")
        public Boolean withPolicy;

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
