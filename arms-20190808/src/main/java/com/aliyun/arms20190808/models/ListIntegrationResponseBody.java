// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public ListIntegrationResponseBodyPageInfo pageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationResponseBody self = new ListIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationResponseBody setPageInfo(ListIntegrationResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListIntegrationResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail extends TeaModel {
        // Indicates whether alert events are automatically cleared. Valid values:
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

        // The extended mapped fields of the alert source.
        @NameInMap("ExtendedFieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules;

        // The predefined mapped fields of the alert source.
        @NameInMap("FieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> fieldRedefineRules;

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

        // The time when alert events are automatically cleared. Unit: seconds. Default value: 300.
        @NameInMap("RecoverTime")
        public Long recoverTime;

        // The total number of alert events and the number of abnormal alert events in the last hour.
        @NameInMap("Stat")
        public java.util.List<Long> stat;

        public static ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail self = new ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail();
            return TeaModel.build(map, self);
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setAutoRecover(Boolean autoRecover) {
            this.autoRecover = autoRecover;
            return this;
        }
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setDuplicateKey(String duplicateKey) {
            this.duplicateKey = duplicateKey;
            return this;
        }
        public String getDuplicateKey() {
            return this.duplicateKey;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setExtendedFieldRedefineRules(java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules) {
            this.extendedFieldRedefineRules = extendedFieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendedFieldRedefineRules() {
            return this.extendedFieldRedefineRules;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setFieldRedefineRules(java.util.List<java.util.Map<String, ?>> fieldRedefineRules) {
            this.fieldRedefineRules = fieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFieldRedefineRules() {
            return this.fieldRedefineRules;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setInitiativeRecoverField(String initiativeRecoverField) {
            this.initiativeRecoverField = initiativeRecoverField;
            return this;
        }
        public String getInitiativeRecoverField() {
            return this.initiativeRecoverField;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setInitiativeRecoverValue(String initiativeRecoverValue) {
            this.initiativeRecoverValue = initiativeRecoverValue;
            return this;
        }
        public String getInitiativeRecoverValue() {
            return this.initiativeRecoverValue;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setRecoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail setStat(java.util.List<Long> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<Long> getStat() {
            return this.stat;
        }

    }

    public static class ListIntegrationResponseBodyPageInfoIntegrations extends TeaModel {
        // The endpoint of the alert integration.
        @NameInMap("ApiEndpoint")
        public String apiEndpoint;

        // The time when the alert integration was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The information about the alert events.
        @NameInMap("IntegrationDetail")
        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail integrationDetail;

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

        // The authentication token of the alert integration.
        @NameInMap("ShortToken")
        public String shortToken;

        // Indicates whether the alert integration was enabled. Valid values:
        // 
        // *   true
        // *   false
        @NameInMap("State")
        public Boolean state;

        public static ListIntegrationResponseBodyPageInfoIntegrations build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationResponseBodyPageInfoIntegrations self = new ListIntegrationResponseBodyPageInfoIntegrations();
            return TeaModel.build(map, self);
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }
        public String getApiEndpoint() {
            return this.apiEndpoint;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setIntegrationDetail(ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail integrationDetail) {
            this.integrationDetail = integrationDetail;
            return this;
        }
        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail getIntegrationDetail() {
            return this.integrationDetail;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setIntegrationProductType(String integrationProductType) {
            this.integrationProductType = integrationProductType;
            return this;
        }
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setShortToken(String shortToken) {
            this.shortToken = shortToken;
            return this;
        }
        public String getShortToken() {
            return this.shortToken;
        }

        public ListIntegrationResponseBodyPageInfoIntegrations setState(Boolean state) {
            this.state = state;
            return this;
        }
        public Boolean getState() {
            return this.state;
        }

    }

    public static class ListIntegrationResponseBodyPageInfo extends TeaModel {
        // The information about each alert integration.
        @NameInMap("Integrations")
        public java.util.List<ListIntegrationResponseBodyPageInfoIntegrations> integrations;

        // The page number of the returned page.
        @NameInMap("Page")
        public Long page;

        // The number of alert integrations returned per page.
        @NameInMap("Size")
        public Long size;

        // The total number of alert integrations.
        @NameInMap("Total")
        public Long total;

        public static ListIntegrationResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationResponseBodyPageInfo self = new ListIntegrationResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListIntegrationResponseBodyPageInfo setIntegrations(java.util.List<ListIntegrationResponseBodyPageInfoIntegrations> integrations) {
            this.integrations = integrations;
            return this;
        }
        public java.util.List<ListIntegrationResponseBodyPageInfoIntegrations> getIntegrations() {
            return this.integrations;
        }

        public ListIntegrationResponseBodyPageInfo setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListIntegrationResponseBodyPageInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListIntegrationResponseBodyPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
