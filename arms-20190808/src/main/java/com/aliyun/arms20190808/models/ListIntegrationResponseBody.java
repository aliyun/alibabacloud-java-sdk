// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationResponseBody extends TeaModel {
    // 分页信息
    @NameInMap("PageInfo")
    public ListIntegrationResponseBodyPageInfo pageInfo;

    // Id of the request
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

    public static class ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail extends TeaModel {
        // 是否设置恢复告警事件
        @NameInMap("AutoRecover")
        public Boolean autoRecover;

        // 集成描述
        @NameInMap("Description")
        public String description;

        // 去重得字段
        @NameInMap("DuplicateKey")
        public String duplicateKey;

        @NameInMap("ExtendedFieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules;

        @NameInMap("FieldRedefineRules")
        public java.util.List<java.util.Map<String, ?>> fieldRedefineRules;

        // 恢复时间
        @NameInMap("RecoverTime")
        public Long recoverTime;

        @NameInMap("Stat")
        public java.util.List<Long> stat;

        public static ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail self = new ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail();
            return TeaModel.build(map, self);
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setAutoRecover(Boolean autoRecover) {
            this.autoRecover = autoRecover;
            return this;
        }
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setDuplicateKey(String duplicateKey) {
            this.duplicateKey = duplicateKey;
            return this;
        }
        public String getDuplicateKey() {
            return this.duplicateKey;
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setExtendedFieldRedefineRules(java.util.List<java.util.Map<String, ?>> extendedFieldRedefineRules) {
            this.extendedFieldRedefineRules = extendedFieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendedFieldRedefineRules() {
            return this.extendedFieldRedefineRules;
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setFieldRedefineRules(java.util.List<java.util.Map<String, ?>> fieldRedefineRules) {
            this.fieldRedefineRules = fieldRedefineRules;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFieldRedefineRules() {
            return this.fieldRedefineRules;
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setRecoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail setStat(java.util.List<Long> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<Long> getStat() {
            return this.stat;
        }

    }

    public static class ListIntegrationResponseBodyPageInfoIintegrations extends TeaModel {
        // 接口配置url
        @NameInMap("ApiEndpoint")
        public String apiEndpoint;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 集成详情对象信息
        @NameInMap("IntegrationDetail")
        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail integrationDetail;

        // 集成ID
        @NameInMap("IntegrationId")
        public Long integrationId;

        // 集成名称
        @NameInMap("IntegrationName")
        public String integrationName;

        // 集成产品类型，CLOUD_MONITOR，LOG_SERVICE
        @NameInMap("IntegrationProductType")
        public String integrationProductType;

        // 就绪
        @NameInMap("Liveness")
        public String liveness;

        // 接口配置token
        @NameInMap("ShortToken")
        public String shortToken;

        // 是否启用，true/false
        @NameInMap("State")
        public Boolean state;

        public static ListIntegrationResponseBodyPageInfoIintegrations build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationResponseBodyPageInfoIintegrations self = new ListIntegrationResponseBodyPageInfoIintegrations();
            return TeaModel.build(map, self);
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }
        public String getApiEndpoint() {
            return this.apiEndpoint;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setIntegrationDetail(ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail integrationDetail) {
            this.integrationDetail = integrationDetail;
            return this;
        }
        public ListIntegrationResponseBodyPageInfoIintegrationsIntegrationDetail getIntegrationDetail() {
            return this.integrationDetail;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setIntegrationProductType(String integrationProductType) {
            this.integrationProductType = integrationProductType;
            return this;
        }
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setShortToken(String shortToken) {
            this.shortToken = shortToken;
            return this;
        }
        public String getShortToken() {
            return this.shortToken;
        }

        public ListIntegrationResponseBodyPageInfoIintegrations setState(Boolean state) {
            this.state = state;
            return this;
        }
        public Boolean getState() {
            return this.state;
        }

    }

    public static class ListIntegrationResponseBodyPageInfo extends TeaModel {
        @NameInMap("Iintegrations")
        public java.util.List<ListIntegrationResponseBodyPageInfoIintegrations> iintegrations;

        // 页数
        @NameInMap("Page")
        public Long page;

        // 条数
        @NameInMap("Size")
        public Long size;

        // 总数
        @NameInMap("Total")
        public Long total;

        public static ListIntegrationResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationResponseBodyPageInfo self = new ListIntegrationResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListIntegrationResponseBodyPageInfo setIintegrations(java.util.List<ListIntegrationResponseBodyPageInfoIintegrations> iintegrations) {
            this.iintegrations = iintegrations;
            return this;
        }
        public java.util.List<ListIntegrationResponseBodyPageInfoIintegrations> getIintegrations() {
            return this.iintegrations;
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
