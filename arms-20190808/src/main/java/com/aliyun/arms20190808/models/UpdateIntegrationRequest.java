// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationRequest extends TeaModel {
    // The endpoint of the alert integration.
    @NameInMap("ApiEndpoint")
    public String apiEndpoint;

    // Specifies whether to automatically clear alert events. Valid values:
    // 
    // *   true (default)
    // *   false
    @NameInMap("AutoRecover")
    public Boolean autoRecover;

    // The description of the alert integration.
    @NameInMap("Description")
    public String description;

    // The fields whose values are deduplicated.
    @NameInMap("DuplicateKey")
    public String duplicateKey;

    // The extended mapped fields are mapped to the fields of ARMS alerts. For more information, see the description of the ExtendedFieldRedefineRules parameter.
    @NameInMap("ExtendedFieldRedefineRules")
    public String extendedFieldRedefineRules;

    // The predefined mapped fields are mapped to the fields of ARMS alerts. The predefined mapped fields were generated when the alert integration was created. For more information, see the description of the FieldRedefineRules parameter.
    @NameInMap("FieldRedefineRules")
    public String fieldRedefineRules;

    // The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.
    // 
    // > Only the Log Service alert integration supports the parameter.
    @NameInMap("InitiativeRecoverField")
    public String initiativeRecoverField;

    // The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.
    // 
    // > Only the Log Service alert integration supports the parameter.
    @NameInMap("InitiativeRecoverValue")
    public String initiativeRecoverValue;

    // The ID of the alert integration.
    @NameInMap("IntegrationId")
    public Long integrationId;

    // The name of the alert integration.
    @NameInMap("IntegrationName")
    public String integrationName;

    // The service of the alert integration. Valid values:
    // 
    // *   CLOUD_MONITOR: CloudMonitor
    // *   LOG_SERVICE: Log Service
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    // The activity of the alert integration
    @NameInMap("Liveness")
    public String liveness;

    // The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.
    @NameInMap("RecoverTime")
    public Long recoverTime;

    // The authentication token of the alert integration.
    @NameInMap("ShortToken")
    public String shortToken;

    // The total number of alert events and the number of abnormal alert events in the last hour.
    @NameInMap("Stat")
    public String stat;

    // Indicates whether the alert integration was enabled. Valid values:
    // 
    // *   true
    // *   false
    @NameInMap("State")
    public Boolean state;

    public static UpdateIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationRequest self = new UpdateIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationRequest setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public UpdateIntegrationRequest setAutoRecover(Boolean autoRecover) {
        this.autoRecover = autoRecover;
        return this;
    }
    public Boolean getAutoRecover() {
        return this.autoRecover;
    }

    public UpdateIntegrationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIntegrationRequest setDuplicateKey(String duplicateKey) {
        this.duplicateKey = duplicateKey;
        return this;
    }
    public String getDuplicateKey() {
        return this.duplicateKey;
    }

    public UpdateIntegrationRequest setExtendedFieldRedefineRules(String extendedFieldRedefineRules) {
        this.extendedFieldRedefineRules = extendedFieldRedefineRules;
        return this;
    }
    public String getExtendedFieldRedefineRules() {
        return this.extendedFieldRedefineRules;
    }

    public UpdateIntegrationRequest setFieldRedefineRules(String fieldRedefineRules) {
        this.fieldRedefineRules = fieldRedefineRules;
        return this;
    }
    public String getFieldRedefineRules() {
        return this.fieldRedefineRules;
    }

    public UpdateIntegrationRequest setInitiativeRecoverField(String initiativeRecoverField) {
        this.initiativeRecoverField = initiativeRecoverField;
        return this;
    }
    public String getInitiativeRecoverField() {
        return this.initiativeRecoverField;
    }

    public UpdateIntegrationRequest setInitiativeRecoverValue(String initiativeRecoverValue) {
        this.initiativeRecoverValue = initiativeRecoverValue;
        return this;
    }
    public String getInitiativeRecoverValue() {
        return this.initiativeRecoverValue;
    }

    public UpdateIntegrationRequest setIntegrationId(Long integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public Long getIntegrationId() {
        return this.integrationId;
    }

    public UpdateIntegrationRequest setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
        return this;
    }
    public String getIntegrationName() {
        return this.integrationName;
    }

    public UpdateIntegrationRequest setIntegrationProductType(String integrationProductType) {
        this.integrationProductType = integrationProductType;
        return this;
    }
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    public UpdateIntegrationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public UpdateIntegrationRequest setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    public UpdateIntegrationRequest setShortToken(String shortToken) {
        this.shortToken = shortToken;
        return this;
    }
    public String getShortToken() {
        return this.shortToken;
    }

    public UpdateIntegrationRequest setStat(String stat) {
        this.stat = stat;
        return this;
    }
    public String getStat() {
        return this.stat;
    }

    public UpdateIntegrationRequest setState(Boolean state) {
        this.state = state;
        return this;
    }
    public Boolean getState() {
        return this.state;
    }

}
