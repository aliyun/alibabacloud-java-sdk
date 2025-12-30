// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizMetricByNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBizMetricByNameResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBizMetricByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizMetricByNameResponseBody self = new GetBizMetricByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizMetricByNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBizMetricByNameResponseBody setData(GetBizMetricByNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBizMetricByNameResponseBodyData getData() {
        return this.data;
    }

    public GetBizMetricByNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBizMetricByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBizMetricByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBizMetricByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBizMetricByNameResponseBodyDataAssociatedTechMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>display name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>guid</p>
         * 
         * <strong>example:</strong>
         * <p>table1.a.b</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>metric3</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM_INDEX</p>
         */
        @NameInMap("SubType")
        public String subType;

        public static GetBizMetricByNameResponseBodyDataAssociatedTechMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameResponseBodyDataAssociatedTechMetrics self = new GetBizMetricByNameResponseBodyDataAssociatedTechMetrics();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameResponseBodyDataAssociatedTechMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizMetricByNameResponseBodyDataAssociatedTechMetrics setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizMetricByNameResponseBodyDataAssociatedTechMetrics setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBizMetricByNameResponseBodyDataAssociatedTechMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizMetricByNameResponseBodyDataAssociatedTechMetrics setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class GetBizMetricByNameResponseBodyDataCatalogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>catalog desc</p>
         */
        @NameInMap("CatalogDesc")
        public String catalogDesc;

        /**
         * <strong>example:</strong>
         * <p>1561740764851842</p>
         */
        @NameInMap("CatalogId")
        public Long catalogId;

        /**
         * <strong>example:</strong>
         * <p>test catalog</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <strong>example:</strong>
         * <p>1561740764851841</p>
         */
        @NameInMap("ParentCatalogId")
        public Long parentCatalogId;

        /**
         * <strong>example:</strong>
         * <p>/catalog1/</p>
         */
        @NameInMap("ParentPath")
        public String parentPath;

        /**
         * <strong>example:</strong>
         * <p>43297700</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <strong>example:</strong>
         * <p>test topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        public static GetBizMetricByNameResponseBodyDataCatalogs build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameResponseBodyDataCatalogs self = new GetBizMetricByNameResponseBodyDataCatalogs();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setCatalogDesc(String catalogDesc) {
            this.catalogDesc = catalogDesc;
            return this;
        }
        public String getCatalogDesc() {
            return this.catalogDesc;
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setCatalogId(Long catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Long getCatalogId() {
            return this.catalogId;
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setParentCatalogId(Long parentCatalogId) {
            this.parentCatalogId = parentCatalogId;
            return this;
        }
        public Long getParentCatalogId() {
            return this.parentCatalogId;
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setParentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public String getParentPath() {
            return this.parentPath;
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetBizMetricByNameResponseBodyDataCatalogs setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetBizMetricByNameResponseBodyDataCustomAttribute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CustomAttributeCode</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetBizMetricByNameResponseBodyDataCustomAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameResponseBodyDataCustomAttribute self = new GetBizMetricByNameResponseBodyDataCustomAttribute();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameResponseBodyDataCustomAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBizMetricByNameResponseBodyDataCustomAttribute setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBizMetricByNameResponseBodyDataRelatedBizMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>display name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>guid</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>Metric2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>POSITIVE</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        public static GetBizMetricByNameResponseBodyDataRelatedBizMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameResponseBodyDataRelatedBizMetrics self = new GetBizMetricByNameResponseBodyDataRelatedBizMetrics();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameResponseBodyDataRelatedBizMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizMetricByNameResponseBodyDataRelatedBizMetrics setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizMetricByNameResponseBodyDataRelatedBizMetrics setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBizMetricByNameResponseBodyDataRelatedBizMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizMetricByNameResponseBodyDataRelatedBizMetrics setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class GetBizMetricByNameResponseBodyDataViewScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PART_USERS_CAN_NOT_VIEW</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("UserGroupNames")
        public java.util.List<String> userGroupNames;

        @NameInMap("UserNames")
        public java.util.List<String> userNames;

        public static GetBizMetricByNameResponseBodyDataViewScope build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameResponseBodyDataViewScope self = new GetBizMetricByNameResponseBodyDataViewScope();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameResponseBodyDataViewScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public GetBizMetricByNameResponseBodyDataViewScope setUserGroupNames(java.util.List<String> userGroupNames) {
            this.userGroupNames = userGroupNames;
            return this;
        }
        public java.util.List<String> getUserGroupNames() {
            return this.userGroupNames;
        }

        public GetBizMetricByNameResponseBodyDataViewScope setUserNames(java.util.List<String> userNames) {
            this.userNames = userNames;
            return this;
        }
        public java.util.List<String> getUserNames() {
            return this.userNames;
        }

    }

    public static class GetBizMetricByNameResponseBodyData extends TeaModel {
        @NameInMap("AssociatedTechMetrics")
        public java.util.List<GetBizMetricByNameResponseBodyDataAssociatedTechMetrics> associatedTechMetrics;

        /**
         * <strong>example:</strong>
         * <p>SuperAdmin</p>
         */
        @NameInMap("BizOwnerName")
        public String bizOwnerName;

        @NameInMap("Catalogs")
        public java.util.List<GetBizMetricByNameResponseBodyDataCatalogs> catalogs;

        @NameInMap("CustomAttribute")
        public java.util.List<GetBizMetricByNameResponseBodyDataCustomAttribute> customAttribute;

        /**
         * <strong>example:</strong>
         * <p>Metric Desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Metric Display Name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>guid</p>
         */
        @NameInMap("Guid")
        public String guid;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <strong>example:</strong>
         * <p>[Metric1]+[Metric2]</p>
         */
        @NameInMap("MetricDefinition")
        public String metricDefinition;

        /**
         * <strong>example:</strong>
         * <p>[Metric2]*10</p>
         */
        @NameInMap("MetricRelationDiagramExpression")
        public String metricRelationDiagramExpression;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetricRelationDiagramSwitchOpen")
        public Boolean metricRelationDiagramSwitchOpen;

        /**
         * <strong>example:</strong>
         * <p>Metric1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("OperateInstructionContent")
        public String operateInstructionContent;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OperateInstructionEnabled")
        public Boolean operateInstructionEnabled;

        @NameInMap("RelatedBizMetrics")
        public java.util.List<GetBizMetricByNameResponseBodyDataRelatedBizMetrics> relatedBizMetrics;

        /**
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("ViewScope")
        public GetBizMetricByNameResponseBodyDataViewScope viewScope;

        public static GetBizMetricByNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameResponseBodyData self = new GetBizMetricByNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameResponseBodyData setAssociatedTechMetrics(java.util.List<GetBizMetricByNameResponseBodyDataAssociatedTechMetrics> associatedTechMetrics) {
            this.associatedTechMetrics = associatedTechMetrics;
            return this;
        }
        public java.util.List<GetBizMetricByNameResponseBodyDataAssociatedTechMetrics> getAssociatedTechMetrics() {
            return this.associatedTechMetrics;
        }

        public GetBizMetricByNameResponseBodyData setBizOwnerName(String bizOwnerName) {
            this.bizOwnerName = bizOwnerName;
            return this;
        }
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        public GetBizMetricByNameResponseBodyData setCatalogs(java.util.List<GetBizMetricByNameResponseBodyDataCatalogs> catalogs) {
            this.catalogs = catalogs;
            return this;
        }
        public java.util.List<GetBizMetricByNameResponseBodyDataCatalogs> getCatalogs() {
            return this.catalogs;
        }

        public GetBizMetricByNameResponseBodyData setCustomAttribute(java.util.List<GetBizMetricByNameResponseBodyDataCustomAttribute> customAttribute) {
            this.customAttribute = customAttribute;
            return this;
        }
        public java.util.List<GetBizMetricByNameResponseBodyDataCustomAttribute> getCustomAttribute() {
            return this.customAttribute;
        }

        public GetBizMetricByNameResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizMetricByNameResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizMetricByNameResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBizMetricByNameResponseBodyData setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetBizMetricByNameResponseBodyData setMetricDefinition(String metricDefinition) {
            this.metricDefinition = metricDefinition;
            return this;
        }
        public String getMetricDefinition() {
            return this.metricDefinition;
        }

        public GetBizMetricByNameResponseBodyData setMetricRelationDiagramExpression(String metricRelationDiagramExpression) {
            this.metricRelationDiagramExpression = metricRelationDiagramExpression;
            return this;
        }
        public String getMetricRelationDiagramExpression() {
            return this.metricRelationDiagramExpression;
        }

        public GetBizMetricByNameResponseBodyData setMetricRelationDiagramSwitchOpen(Boolean metricRelationDiagramSwitchOpen) {
            this.metricRelationDiagramSwitchOpen = metricRelationDiagramSwitchOpen;
            return this;
        }
        public Boolean getMetricRelationDiagramSwitchOpen() {
            return this.metricRelationDiagramSwitchOpen;
        }

        public GetBizMetricByNameResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizMetricByNameResponseBodyData setOperateInstructionContent(String operateInstructionContent) {
            this.operateInstructionContent = operateInstructionContent;
            return this;
        }
        public String getOperateInstructionContent() {
            return this.operateInstructionContent;
        }

        public GetBizMetricByNameResponseBodyData setOperateInstructionEnabled(Boolean operateInstructionEnabled) {
            this.operateInstructionEnabled = operateInstructionEnabled;
            return this;
        }
        public Boolean getOperateInstructionEnabled() {
            return this.operateInstructionEnabled;
        }

        public GetBizMetricByNameResponseBodyData setRelatedBizMetrics(java.util.List<GetBizMetricByNameResponseBodyDataRelatedBizMetrics> relatedBizMetrics) {
            this.relatedBizMetrics = relatedBizMetrics;
            return this;
        }
        public java.util.List<GetBizMetricByNameResponseBodyDataRelatedBizMetrics> getRelatedBizMetrics() {
            return this.relatedBizMetrics;
        }

        public GetBizMetricByNameResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetBizMetricByNameResponseBodyData setViewScope(GetBizMetricByNameResponseBodyDataViewScope viewScope) {
            this.viewScope = viewScope;
            return this;
        }
        public GetBizMetricByNameResponseBodyDataViewScope getViewScope() {
            return this.viewScope;
        }

    }

}
