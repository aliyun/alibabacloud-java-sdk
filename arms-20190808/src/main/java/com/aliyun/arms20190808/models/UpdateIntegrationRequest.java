// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationRequest extends TeaModel {
    @NameInMap("ApiEndpoint")
    public String apiEndpoint;

    @NameInMap("AutoRecover")
    public Boolean autoRecover;

    @NameInMap("Description")
    public String description;

    @NameInMap("DuplicateKey")
    public String duplicateKey;

    @NameInMap("ExtendedFieldRedefineRules")
    public String extendedFieldRedefineRules;

    @NameInMap("FieldRedefineRules")
    public String fieldRedefineRules;

    @NameInMap("InitiativeRecoverField")
    public String initiativeRecoverField;

    @NameInMap("InitiativeRecoverValue")
    public String initiativeRecoverValue;

    @NameInMap("IntegrationId")
    public Long integrationId;

    @NameInMap("IntegrationName")
    public String integrationName;

    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("RecoverTime")
    public Long recoverTime;

    @NameInMap("ShortToken")
    public String shortToken;

    @NameInMap("Stat")
    public String stat;

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
