// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateIntegrationResponseBody extends TeaModel {
    @NameInMap("Integration")
    public CreateIntegrationResponseBodyIntegration integration;

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
        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        @NameInMap("Description")
        public String description;

        @NameInMap("IntegrationId")
        public Long integrationId;

        @NameInMap("IntegrationName")
        public String integrationName;

        @NameInMap("IntegrationProductType")
        public String integrationProductType;

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
