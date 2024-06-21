// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationResponseBody extends TeaModel {
    /**
     * <p>The Information about the alert integration.</p>
     */
    @NameInMap("Integration")
    public UpdateIntegrationResponseBodyIntegration integration;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationResponseBody self = new UpdateIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationResponseBody setIntegration(UpdateIntegrationResponseBodyIntegration integration) {
        this.integration = integration;
        return this;
    }
    public UpdateIntegrationResponseBodyIntegration getIntegration() {
        return this.integration;
    }

    public UpdateIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateIntegrationResponseBodyIntegration extends TeaModel {
        /**
         * <p>The endpoint of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN">https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN</a>******</p>
         */
        @NameInMap("ApiEndpoint")
        public String apiEndpoint;

        /**
         * <p>Indicates whether alert events are automatically cleared. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
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
         * <p>The fields whose values are deduplicated.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL.dimensions::LABEL.ruleId</p>
         */
        @NameInMap("DuplicateKey")
        public String duplicateKey;

        /**
         * <p>The extended mapped fields of the alert source.</p>
         */
        @NameInMap("ExtendedFieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules;

        /**
         * <p>The predefined mapped fields of the alert source.</p>
         */
        @NameInMap("FieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> fieldRedefineRules;

        /**
         * <p>The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
         * <blockquote>
         * <p>Only Log Service supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$.status</p>
         */
        @NameInMap("InitiativeRecoverField")
        public String initiativeRecoverField;

        /**
         * <p>The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
         * <blockquote>
         * <p>Only Log Service supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("InitiativeRecoverValue")
        public String initiativeRecoverValue;

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
         * <p>The activity of the alert integration</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>The time when alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("RecoverTime")
        public Long recoverTime;

        /**
         * <p>The authentication token of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p>ymQBN******</p>
         */
        @NameInMap("ShortToken")
        public String shortToken;

        /**
         * <p>The total number of alert events and the number of abnormal alert events in the last hour.</p>
         */
        @NameInMap("Stat")
        public java.util.List<Long> stat;

        /**
         * <p>Indicates whether the alert integration is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("State")
        public Boolean state;

        public static UpdateIntegrationResponseBodyIntegration build(java.util.Map<String, ?> map) throws Exception {
            UpdateIntegrationResponseBodyIntegration self = new UpdateIntegrationResponseBodyIntegration();
            return TeaModel.build(map, self);
        }

        public UpdateIntegrationResponseBodyIntegration setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }
        public String getApiEndpoint() {
            return this.apiEndpoint;
        }

        public UpdateIntegrationResponseBodyIntegration setAutoRecover(Boolean autoRecover) {
            this.autoRecover = autoRecover;
            return this;
        }
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        public UpdateIntegrationResponseBodyIntegration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateIntegrationResponseBodyIntegration setDuplicateKey(String duplicateKey) {
            this.duplicateKey = duplicateKey;
            return this;
        }
        public String getDuplicateKey() {
            return this.duplicateKey;
        }

        public UpdateIntegrationResponseBodyIntegration setExtendedFieldRedefineRules(java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules) {
            this.extendedFieldRedefineRules = extendedFieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendedFieldRedefineRules() {
            return this.extendedFieldRedefineRules;
        }

        public UpdateIntegrationResponseBodyIntegration setFieldRedefineRules(java.util.List<java.util.Map<String, ?>> fieldRedefineRules) {
            this.fieldRedefineRules = fieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFieldRedefineRules() {
            return this.fieldRedefineRules;
        }

        public UpdateIntegrationResponseBodyIntegration setInitiativeRecoverField(String initiativeRecoverField) {
            this.initiativeRecoverField = initiativeRecoverField;
            return this;
        }
        public String getInitiativeRecoverField() {
            return this.initiativeRecoverField;
        }

        public UpdateIntegrationResponseBodyIntegration setInitiativeRecoverValue(String initiativeRecoverValue) {
            this.initiativeRecoverValue = initiativeRecoverValue;
            return this;
        }
        public String getInitiativeRecoverValue() {
            return this.initiativeRecoverValue;
        }

        public UpdateIntegrationResponseBodyIntegration setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public UpdateIntegrationResponseBodyIntegration setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public UpdateIntegrationResponseBodyIntegration setIntegrationProductType(String integrationProductType) {
            this.integrationProductType = integrationProductType;
            return this;
        }
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        public UpdateIntegrationResponseBodyIntegration setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public UpdateIntegrationResponseBodyIntegration setRecoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        public UpdateIntegrationResponseBodyIntegration setShortToken(String shortToken) {
            this.shortToken = shortToken;
            return this;
        }
        public String getShortToken() {
            return this.shortToken;
        }

        public UpdateIntegrationResponseBodyIntegration setStat(java.util.List<Long> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<Long> getStat() {
            return this.stat;
        }

        public UpdateIntegrationResponseBodyIntegration setState(Boolean state) {
            this.state = state;
            return this;
        }
        public Boolean getState() {
            return this.state;
        }

    }

}
