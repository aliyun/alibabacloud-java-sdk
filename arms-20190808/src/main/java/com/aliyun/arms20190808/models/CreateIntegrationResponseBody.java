// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateIntegrationResponseBody extends TeaModel {
    @NameInMap("Integration")
    public CreateIntegrationResponseBodyIntegration integration;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationResponseBody self = new CreateIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationResponseBody setIntegration(CreateIntegrationResponseBodyIntegration integration) {
        this.integration = integration;
        return this;
    }
    public CreateIntegrationResponseBodyIntegration getIntegration() {
        return this.integration;
    }

    public CreateIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIntegrationResponseBodyIntegration extends TeaModel {
        // 是否开启恢复，默认true
        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        // 集成描述
        @NameInMap("Description")
        public String description;

        // 集成ID
        @NameInMap("IntegrationId")
        public Long integrationId;

        // 集成名称
        @NameInMap("IntegrationName")
        public String integrationName;

        // 集成产品类型
        @NameInMap("IntegrationProductType")
        public String integrationProductType;

        // 恢复时间，默认300s
        @NameInMap("RecoverTime")
        public Long recoverTime;

        public static CreateIntegrationResponseBodyIntegration build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegrationResponseBodyIntegration self = new CreateIntegrationResponseBodyIntegration();
            return TeaModel.build(map, self);
        }

        public CreateIntegrationResponseBodyIntegration setAutoRecover(Boolean autoRecover) {
            this.autoRecover = autoRecover;
            return this;
        }
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        public CreateIntegrationResponseBodyIntegration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateIntegrationResponseBodyIntegration setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public CreateIntegrationResponseBodyIntegration setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public CreateIntegrationResponseBodyIntegration setIntegrationProductType(String integrationProductType) {
            this.integrationProductType = integrationProductType;
            return this;
        }
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        public CreateIntegrationResponseBodyIntegration setRecoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }
        public Long getRecoverTime() {
            return this.recoverTime;
        }

    }

}
