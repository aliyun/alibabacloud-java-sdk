// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateIntegrationResponseBody extends TeaModel {
    /**
     * <p>The returned information about the alert integration.</p>
     */
    @NameInMap("Integration")
    public CreateIntegrationResponseBodyIntegration integration;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>Indicates whether alert events are automatically cleared. Valid values:</p>
         * <br>
         * <p>*   true (default)</p>
         * <p>*   false</p>
         */
        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        /**
         * <p>The description of the alert integration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the alert integration.</p>
         */
        @NameInMap("IntegrationId")
        public Long integrationId;

        /**
         * <p>The name of the alert integration.</p>
         */
        @NameInMap("IntegrationName")
        public String integrationName;

        /**
         * <p>The service of the alert integration. Valid values:</p>
         * <br>
         * <p>*   CLOUD_MONITOR: CloudMonitor</p>
         * <p>*   LOG_SERVICE: Log Service</p>
         */
        @NameInMap("IntegrationProductType")
        public String integrationProductType;

        /**
         * <p>The time when alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
         */
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
