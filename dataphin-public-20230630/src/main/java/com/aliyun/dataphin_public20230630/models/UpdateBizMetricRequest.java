// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizMetricRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update request.</p>
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

    public UpdateBizMetricRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
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
         * <p>The code of the custom attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomAttributeCode</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The attribute values. 1. For custom input and drop-down single-select attributes, only the first attribute value in the list is read. 2. For drop-down multi-select attributes, all attribute values in the list are read. 3. For hyperlink attributes, the first attribute value in the list is read as the display text, and the second attribute value is read as the redirect link.</p>
         */
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
         * <p>The name of the business metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The relationship type. Valid values:</p>
         * <ul>
         * <li>POSITIVE: Positive correlation.</li>
         * <li>NEGATIVE: Negative correlation.</li>
         * <li>OTHER: Other.</li>
         * </ul>
         * 
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
         * <p>The visibility scope type. Valid values:</p>
         * <ul>
         * <li>ALL_USERS_CAN_VIEW: Visible to all users.</li>
         * <li>PART_USERS_CAN_VIEW: Visible to specific users.</li>
         * <li>PART_USERS_CAN_NOT_VIEW: Invisible to specific users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_USERS_CAN_VIEW</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The user group names. This parameter is read only when the visibility scope of the asset is set to Visible to specific users or Invisible to specific users.</p>
         */
        @NameInMap("UserGroupNames")
        public java.util.List<String> userGroupNames;

        /**
         * <p>The usernames of individual accounts. This parameter is valid only when the visibility scope of the asset is set to Visible to specific users or Invisible to specific users.</p>
         */
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
        /**
         * <p>The associated technical metrics. Enter the technical metric in the &quot;Full table name.Metric name&quot; format, where the &quot;Full table name&quot; is equal to &quot;Asset source.Table name&quot;. A technical metric can be associated with only one business metric and cannot be repeatedly associated.</p>
         */
        @NameInMap("AssociatedTechMetricFullNames")
        public java.util.List<String> associatedTechMetricFullNames;

        /**
         * <p>The business owner. Enter the username of the owner\&quot;s account.</p>
         * 
         * <strong>example:</strong>
         * <p>SuperAdmin</p>
         */
        @NameInMap("BizOwnerName")
        public String bizOwnerName;

        /**
         * <p>The IDs of the parent folders.</p>
         */
        @NameInMap("CatalogIds")
        public java.util.List<Long> catalogIds;

        /**
         * <p>The custom attributes. Enter the attribute code and attribute value separately.</p>
         */
        @NameInMap("CustomAttribute")
        public java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandCustomAttribute> customAttribute;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric Desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric1_DisplayName</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The asset labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The metric definition. To reference other business metrics, enclose the metric names in half-width square brackets [].</p>
         * 
         * <strong>example:</strong>
         * <p>[Metric2]+[Metric3]</p>
         */
        @NameInMap("MetricDefinition")
        public String metricDefinition;

        /**
         * <p>The expression for the metric relationship diagram. This parameter is read only when the metric relationship diagram is enabled. You can only enter a calculation expression composed of metric names selected from the related business metrics. The supported operators are +, -, *, /, (), %, and ∑. Each metric name must be enclosed in half-width square brackets []. If no operator is specified between two metrics, the system automatically adds padding as a placeholder. If the metric relational expression is not configured, a shutdown of the metric relationship diagram switch is automatically triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>[Metric1]+[Metric2]</p>
         */
        @NameInMap("MetricRelationDiagramExpression")
        public String metricRelationDiagramExpression;

        /**
         * <p>Specifies whether to enable the metric relationship diagram. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.
         * This switch can be enabled only when at least one related business metric exists. Otherwise, it is automatically disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetricRelationDiagramSwitchOpen")
        public Boolean metricRelationDiagramSwitchOpen;

        /**
         * <p>The name of the business metric to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The new name. Specify this parameter when you need to modify the metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric1_new</p>
         */
        @NameInMap("NewName")
        public String newName;

        /**
         * <p>The content of the usage instructions. Only text format is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>content test</p>
         */
        @NameInMap("OperateInstructionContent")
        public String operateInstructionContent;

        /**
         * <p>Specifies whether to enable the usage instructions. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OperateInstructionEnabled")
        public Boolean operateInstructionEnabled;

        /**
         * <p>The related business metrics.</p>
         */
        @NameInMap("RelatedBizMetrics")
        public java.util.List<UpdateBizMetricRequestUpdateBizMetricCommandRelatedBizMetrics> relatedBizMetrics;

        /**
         * <p>The visibility scope.</p>
         */
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
