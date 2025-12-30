// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateBizMetricCommand")
    public UpdateBizMetricRequestUpdateBizMetricCommand updateBizMetricCommand;

    public static UpdateBizMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizMetricRequest self = new UpdateBizMetricRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizMetricRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBizMetricRequest setUpdateBizMetricCommand(UpdateBizMetricRequestUpdateBizMetricCommand updateBizMetricCommand) {
        this.updateBizMetricCommand = updateBizMetricCommand;
        return this;
    }
    public UpdateBizMetricRequestUpdateBizMetricCommand getUpdateBizMetricCommand() {
        return this.updateBizMetricCommand;
    }

    public static class UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CustomAttributeCode</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute self = new UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute();
            return TeaModel.build(map, self);
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics extends TeaModel {
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

        public static UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics self = new UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics();
            return TeaModel.build(map, self);
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class UpdateBizMetricRequestUpdateBizMetricCommandViewScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ALL_USERS_CAN_VIEW</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("UserGroupNames")
        public java.util.List<String> userGroupNames;

        @NameInMap("UserNames")
        public java.util.List<String> userNames;

        public static UpdateBizMetricRequestUpdateBizMetricCommandViewScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizMetricRequestUpdateBizMetricCommandViewScope self = new UpdateBizMetricRequestUpdateBizMetricCommandViewScope();
            return TeaModel.build(map, self);
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandViewScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandViewScope setUserGroupNames(java.util.List<String> userGroupNames) {
            this.userGroupNames = userGroupNames;
            return this;
        }
        public java.util.List<String> getUserGroupNames() {
            return this.userGroupNames;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommandViewScope setUserNames(java.util.List<String> userNames) {
            this.userNames = userNames;
            return this;
        }
        public java.util.List<String> getUserNames() {
            return this.userNames;
        }

    }

    public static class UpdateBizMetricRequestUpdateBizMetricCommand extends TeaModel {
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
        public java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute> customAttribute;

        /**
         * <strong>example:</strong>
         * <p>Metric Desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Metric1_DisplayName</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <strong>example:</strong>
         * <p>[Metric2]+[Metric3]</p>
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
         * <p>Metric1_new</p>
         */
        @NameInMap("NewName")
        public String newName;

        /**
         * <strong>example:</strong>
         * <p>content test</p>
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
        public java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics> relatedBizMetrics;

        @NameInMap("ViewScope")
        public UpdateBizMetricRequestUpdateBizMetricCommandViewScope viewScope;

        public static UpdateBizMetricRequestUpdateBizMetricCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizMetricRequestUpdateBizMetricCommand self = new UpdateBizMetricRequestUpdateBizMetricCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setAssociatedTechMetricFullNames(java.util.List<String> associatedTechMetricFullNames) {
            this.associatedTechMetricFullNames = associatedTechMetricFullNames;
            return this;
        }
        public java.util.List<String> getAssociatedTechMetricFullNames() {
            return this.associatedTechMetricFullNames;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setBizOwnerName(String bizOwnerName) {
            this.bizOwnerName = bizOwnerName;
            return this;
        }
        public String getBizOwnerName() {
            return this.bizOwnerName;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setCatalogIds(java.util.List<Long> catalogIds) {
            this.catalogIds = catalogIds;
            return this;
        }
        public java.util.List<Long> getCatalogIds() {
            return this.catalogIds;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setCustomAttribute(java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute> customAttribute) {
            this.customAttribute = customAttribute;
            return this;
        }
        public java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute> getCustomAttribute() {
            return this.customAttribute;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setMetricDefinition(String metricDefinition) {
            this.metricDefinition = metricDefinition;
            return this;
        }
        public String getMetricDefinition() {
            return this.metricDefinition;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setMetricRelationDiagramExpression(String metricRelationDiagramExpression) {
            this.metricRelationDiagramExpression = metricRelationDiagramExpression;
            return this;
        }
        public String getMetricRelationDiagramExpression() {
            return this.metricRelationDiagramExpression;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setMetricRelationDiagramSwitchOpen(Boolean metricRelationDiagramSwitchOpen) {
            this.metricRelationDiagramSwitchOpen = metricRelationDiagramSwitchOpen;
            return this;
        }
        public Boolean getMetricRelationDiagramSwitchOpen() {
            return this.metricRelationDiagramSwitchOpen;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setNewName(String newName) {
            this.newName = newName;
            return this;
        }
        public String getNewName() {
            return this.newName;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setOperateInstructionContent(String operateInstructionContent) {
            this.operateInstructionContent = operateInstructionContent;
            return this;
        }
        public String getOperateInstructionContent() {
            return this.operateInstructionContent;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setOperateInstructionEnabled(Boolean operateInstructionEnabled) {
            this.operateInstructionEnabled = operateInstructionEnabled;
            return this;
        }
        public Boolean getOperateInstructionEnabled() {
            return this.operateInstructionEnabled;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setRelatedBizMetrics(java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics> relatedBizMetrics) {
            this.relatedBizMetrics = relatedBizMetrics;
            return this;
        }
        public java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics> getRelatedBizMetrics() {
            return this.relatedBizMetrics;
        }

        public UpdateBizMetricRequestUpdateBizMetricCommand setViewScope(UpdateBizMetricRequestUpdateBizMetricCommandViewScope viewScope) {
            this.viewScope = viewScope;
            return this;
        }
        public UpdateBizMetricRequestUpdateBizMetricCommandViewScope getViewScope() {
            return this.viewScope;
        }

    }

}
