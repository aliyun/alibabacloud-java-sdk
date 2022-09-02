// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListIntegrationResponseBodyPageInfo pageInfo;

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
        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        @NameInMap("Description")
        public String description;

        @NameInMap("DuplicateKey")
        public String duplicateKey;

        @NameInMap("ExtendedFieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules;

        @NameInMap("FieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> fieldRedefineRules;

        @NameInMap("InitiativeRecoverField")
        public String initiativeRecoverField;

        @NameInMap("InitiativeRecoverValue")
        public String initiativeRecoverValue;

        @NameInMap("RecoverTime")
        public Long recoverTime;

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
        @NameInMap("ApiEndpoint")
        public String apiEndpoint;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IntegrationDetail")
        public ListIntegrationResponseBodyPageInfoIntegrationsIntegrationDetail integrationDetail;

        @NameInMap("IntegrationId")
        public Long integrationId;

        @NameInMap("IntegrationName")
        public String integrationName;

        @NameInMap("IntegrationProductType")
        public String integrationProductType;

        @NameInMap("Liveness")
        public String liveness;

        @NameInMap("ShortToken")
        public String shortToken;

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
        @NameInMap("Integrations")
        public java.util.List<ListIntegrationResponseBodyPageInfoIntegrations> integrations;

        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

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
