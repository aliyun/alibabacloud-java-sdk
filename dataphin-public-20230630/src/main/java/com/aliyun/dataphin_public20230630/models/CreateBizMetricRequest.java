// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateBizMetricCommand")
    public CreateBizMetricRequestCreateBizMetricCommand createBizMetricCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateBizMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizMetricRequest self = new CreateBizMetricRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizMetricRequest setCreateBizMetricCommand(CreateBizMetricRequestCreateBizMetricCommand createBizMetricCommand) {
        this.createBizMetricCommand = createBizMetricCommand;
        return this;
    }
    public CreateBizMetricRequestCreateBizMetricCommand getCreateBizMetricCommand() {
        return this.createBizMetricCommand;
    }

    public CreateBizMetricRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateBizMetricRequestCreateBizMetricCommandCustomAttribute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CustomAttributeCode</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateBizMetricRequestCreateBizMetricCommandCustomAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateBizMetricRequestCreateBizMetricCommandCustomAttribute self = new CreateBizMetricRequestCreateBizMetricCommandCustomAttribute();
            return TeaModel.build(map, self);
        }

        public CreateBizMetricRequestCreateBizMetricCommandCustomAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateBizMetricRequestCreateBizMetricCommandCustomAttribute setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics extends TeaModel {
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

        public static CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics self = new CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics();
            return TeaModel.build(map, self);
        }

        public CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class CreateBizMetricRequestCreateBizMetricCommandViewScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PART_USERS_CAN_VIEW</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("UserGroupNames")
        public java.util.List<String> userGroupNames;

        @NameInMap("UserNames")
        public java.util.List<String> userNames;

        public static CreateBizMetricRequestCreateBizMetricCommandViewScope build(java.util.Map<String, ?> map) throws Exception {
            CreateBizMetricRequestCreateBizMetricCommandViewScope self = new CreateBizMetricRequestCreateBizMetricCommandViewScope();
            return TeaModel.build(map, self);
        }

        public CreateBizMetricRequestCreateBizMetricCommandViewScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public CreateBizMetricRequestCreateBizMetricCommandViewScope setUserGroupNames(java.util.List<String> userGroupNames) {
            this.userGroupNames = userGroupNames;
            return this;
        }
        public java.util.List<String> getUserGroupNames() {
            return this.userGroupNames;
        }

        public CreateBizMetricRequestCreateBizMetricCommandViewScope setUserNames(java.util.List<String> userNames) {
            this.userNames = userNames;
            return this;
        }
        public java.util.List<String> getUserNames() {
            return this.userNames;
        }

    }

    public static class CreateBizMetricRequestCreateBizMetricCommand extends TeaModel {
        @NameInMap("AssociatedTechMetricFullNames")
        public java.util.List<String> associatedTechMetricFullNames;

        /**
         * <strong>example:</strong>
         * <p>SuperAdmin</p>
         */
        @NameInMap("BizOwnerName")
        public String bizOwnerName;

        @NameInMap("CatalogIds")
        public java.util.List<Long> catalogIds;

        @NameInMap("CustomAttribute")
        public java.util.List<CreateBizMetricRequestCreateBizMetricCommandCustomAttribute> customAttribute;

        /**
         * <strong>example:</strong>
         * <p>MetricDesc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>MetricDisplayName</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

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
         * <p>[Metric1]+[Metric2]</p>
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
         * <p>This parameter is required.</p>
         * 
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
        public java.util.List<CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics> relatedBizMetrics;

        @NameInMap("ViewScope")
        public CreateBizMetricRequestCreateBizMetricCommandViewScope viewScope;

        public static CreateBizMetricRequestCreateBizMetricCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBizMetricRequestCreateBizMetricCommand self = new CreateBizMetricRequestCreateBizMetricCommand();
            return TeaModel.build(map, self);
        }

        public CreateBizMetricRequestCreateBizMetricCommand setAssociatedTechMetricFullNames(java.util.List<String> associatedTechMetricFullNames) {
            this.associatedTechMetricFullNames = associatedTechMetricFullNames;
            return this;
        }
        public java.util.List<String> getAssociatedTechMetricFullNames() {
            return this.associatedTechMetricFullNames;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setBizOwnerName(String bizOwnerName) {
            this.bizOwnerName = bizOwnerName;
            return this;
        }
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setCatalogIds(java.util.List<Long> catalogIds) {
            this.catalogIds = catalogIds;
            return this;
        }
        public java.util.List<Long> getCatalogIds() {
            return this.catalogIds;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setCustomAttribute(java.util.List<CreateBizMetricRequestCreateBizMetricCommandCustomAttribute> customAttribute) {
            this.customAttribute = customAttribute;
            return this;
        }
        public java.util.List<CreateBizMetricRequestCreateBizMetricCommandCustomAttribute> getCustomAttribute() {
            return this.customAttribute;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setMetricDefinition(String metricDefinition) {
            this.metricDefinition = metricDefinition;
            return this;
        }
        public String getMetricDefinition() {
            return this.metricDefinition;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setMetricRelationDiagramExpression(String metricRelationDiagramExpression) {
            this.metricRelationDiagramExpression = metricRelationDiagramExpression;
            return this;
        }
        public String getMetricRelationDiagramExpression() {
            return this.metricRelationDiagramExpression;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setMetricRelationDiagramSwitchOpen(Boolean metricRelationDiagramSwitchOpen) {
            this.metricRelationDiagramSwitchOpen = metricRelationDiagramSwitchOpen;
            return this;
        }
        public Boolean getMetricRelationDiagramSwitchOpen() {
            return this.metricRelationDiagramSwitchOpen;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setOperateInstructionContent(String operateInstructionContent) {
            this.operateInstructionContent = operateInstructionContent;
            return this;
        }
        public String getOperateInstructionContent() {
            return this.operateInstructionContent;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setOperateInstructionEnabled(Boolean operateInstructionEnabled) {
            this.operateInstructionEnabled = operateInstructionEnabled;
            return this;
        }
        public Boolean getOperateInstructionEnabled() {
            return this.operateInstructionEnabled;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setRelatedBizMetrics(java.util.List<CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics> relatedBizMetrics) {
            this.relatedBizMetrics = relatedBizMetrics;
            return this;
        }
        public java.util.List<CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics> getRelatedBizMetrics() {
            return this.relatedBizMetrics;
        }

        public CreateBizMetricRequestCreateBizMetricCommand setViewScope(CreateBizMetricRequestCreateBizMetricCommandViewScope viewScope) {
            this.viewScope = viewScope;
            return this;
        }
        public CreateBizMetricRequestCreateBizMetricCommandViewScope getViewScope() {
            return this.viewScope;
        }

    }

}
