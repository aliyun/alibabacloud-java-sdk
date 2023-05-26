// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationRequest extends TeaModel {
    /**
     * <p>https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN******</p>
     */
    @NameInMap("ApiEndpoint")
    public String apiEndpoint;

    /**
     * <p>The name of the alert integration.</p>
     */
    @NameInMap("AutoRecover")
    public Boolean autoRecover;

    /**
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Information about the alert integration.</p>
     */
    @NameInMap("DuplicateKey")
    public String duplicateKey;

    /**
     * <p>The ID of the alert integration.</p>
     */
    @NameInMap("ExtendedFieldRedefineRules")
    public String extendedFieldRedefineRules;

    /**
     * <p>The predefined mapped fields are mapped to the fields of ARMS alerts. The predefined mapped fields were generated when the alert integration was created. For more information, see the description of the FieldRedefineRules parameter.</p>
     */
    @NameInMap("FieldRedefineRules")
    public String fieldRedefineRules;

    /**
     * <p>The predefined mapped fields are mapped to the fields of ARMS alerts. The predefined mapped fields were generated when the alert integration was created.</p>
     */
    @NameInMap("InitiativeRecoverField")
    public String initiativeRecoverField;

    /**
     * <p>The fields whose values are deduplicated.</p>
     */
    @NameInMap("InitiativeRecoverValue")
    public String initiativeRecoverValue;

    /**
     * <p>The name of the alert integration.</p>
     */
    @NameInMap("IntegrationId")
    public Long integrationId;

    /**
     * <p>The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
     * <br>
     * <p>> Only Log Service supports this parameter.</p>
     */
    @NameInMap("IntegrationName")
    public String integrationName;

    /**
     * <p>ok</p>
     */
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    /**
     * <p>true</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>\[ { "redefineType":"EXTRACT", "matchExpression":null, "fieldName":"alertname", "expression":null, "mappingRuleList":\[ ], "name":"Alert name", "integrationId":1234, "jsonPath":"$.alertName", "id":10001, "fieldType":"LABEL" }, { "redefineType":"MAP", "matchExpression":null, "fieldName":"severity", "expression":null, "mappingRuleList":\[ { "mappingValue":"critical", "mappingName":"P1", "mappingType":"MAP", "originValue":"CRITICAL" }, { "mappingValue":"error", "mappingName":"P2", "mappingType":"MAP", "originValue":"WARN" }, { "mappingValue":"warning", "mappingName":"P3", "mappingType":"MAP", "originValue":"INFO" } ], "name":"Alert level", "integrationId":1234, "jsonPath":"$.triggerLevel", "id":10002, "fieldType":"LABEL" }, { "redefineType":"EXTRACT", "matchExpression":null, "fieldName":"message", "expression":"{{$labels.namespace}} / {{$labels.dimensions}} Alert content {{ $labels.alertname }}, Current value {{$value}}.", "mappingRuleList":\[ ], "name":"Alert description", "integrationId":1234, "jsonPath":null, "id":10003, "fieldType":"ANNOTATION" }, { "redefineType":"EXTRACT", "matchExpression":null, "fieldName":"value", "expression":null, "mappingRuleList":\[ ], "name":"Alert sample value", "integrationId":1234, "jsonPath":"$.curValue", "id":10004, "fieldType":"ANNOTATION" }, { "redefineType":"EXTRACT", "matchExpression":null, "fieldName":"source", "expression":null, "mappingRuleList":\[ ], "name":"Source", "integrationId":1234, "jsonPath":null, "id":10007, "fieldType":"LABEL" }, { "redefineType":"ADD", "matchExpression":null, "fieldName":"generatorUrl", "expression":"https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name={{$labels.ruleId}}\&searchValue=\&searchType=name\&searchProduct=/history/all/searchKey:{{$labels.ruleId}},startTime:{{sub $startsAt 300000}},endTime:{{$endsAt}}", "mappingRuleList":\[ ], "name":"Event URL", "integrationId":1234, "jsonPath":"https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name={{$labels.ruleId}}\&searchValue=\&searchType=name\&searchProduct=/history/all/searchKey:{{$labels.ruleId}},startTime:{{sub $startsAt 300000}},endTime:{{$endsAt}}", "id":10012, "fieldType":"GENERATE_URL" } ]</p>
     */
    @NameInMap("RecoverTime")
    public Long recoverTime;

    /**
     * <p>The activity of the alert integration</p>
     */
    @NameInMap("ShortToken")
    public String shortToken;

    /**
     * <p>[</p>
     * <p>    {</p>
     * <p>        "redefineType":"EXTRACT",</p>
     * <p>        "matchExpression":null,</p>
     * <p>        "fieldName":"dimensions",</p>
     * <p>        "expression":null,</p>
     * <p>        "mappingRuleList":[</p>
     * <br>
     * <p>        ],</p>
     * <p>        "name":"dimensions",</p>
     * <p>        "integrationId":1234,</p>
     * <p>        "jsonPath":"$.dimensions",</p>
     * <p>        "id":10013,</p>
     * <p>        "fieldType":"LABEL"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "redefineType":"EXTRACT",</p>
     * <p>        "matchExpression":null,</p>
     * <p>        "fieldName":"expression",</p>
     * <p>        "expression":null,</p>
     * <p>        "mappingRuleList":[</p>
     * <br>
     * <p>        ],</p>
     * <p>        "name":"expression",</p>
     * <p>        "integrationId":1234,</p>
     * <p>        "jsonPath":"$.expression",</p>
     * <p>        "id":10014,</p>
     * <p>        "fieldType":"LABEL"</p>
     * <p>    }</p>
     * <p>]</p>
     */
    @NameInMap("Stat")
    public String stat;

    /**
     * <p>1234</p>
     */
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
