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
     * 
     * <strong>example:</strong>
     * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
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
         * <p>Indicates whether alert events are automatically cleared. Default value: true. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        /**
         * <p>The description of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("IntegrationId")
        public Long integrationId;

        /**
         * <p>The name of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor integration</p>
         */
        @NameInMap("IntegrationName")
        public String integrationName;

        /**
         * <p>The service of the alert integration. Valid values:</p>
         * <ul>
         * <li>CLOUD_MONITOR: CloudMonitor</li>
         * <li>LOG_SERVICE: Log Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_MONITOR</p>
         */
        @NameInMap("IntegrationProductType")
        public String integrationProductType;

        /**
         * <p>The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
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
