// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizMetricRequest extends TeaModel {
    /**
     * <p>The creation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateBizMetricCommand")
    public CreateBizMetricRequestCreateBizMetricCommand createBizMetricCommand;

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

    public CreateBizMetricRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateBizMetricRequestCreateBizMetricCommandCustomAttribute extends TeaModel {
        /**
         * <p>The code of the custom attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomAttributeCode</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The list of attribute values. Rules: 1. For custom input and drop-down single-select attributes, only the first attribute value in the list is read. 2. For drop-down multi-select attributes, all attribute values in the list are read. 3. For hyperlink attributes, the first attribute value in the list is read as the display text, and the second attribute value is read as the redirect URL.</p>
         */
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
         * <p>The metric name.</p>
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
         * <p>The visibility scope type. Valid values:</p>
         * <ul>
         * <li>ALL_USERS_CAN_VIEW: Visible to all users.</li>
         * <li>PART_USERS_CAN_VIEW: Visible to specific users.</li>
         * <li>PART_USERS_CAN_NOT_VIEW: Invisible to specific users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PART_USERS_CAN_VIEW</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The names of the user groups. This information is read only when the visibility scope of the asset is set to Visible to specific users or Invisible to specific users.</p>
         */
        @NameInMap("UserGroupNames")
        public java.util.List<String> userGroupNames;

        /**
         * <p>The usernames of individual accounts. This parameter is valid only when the visibility scope of the asset is set to Visible to specific users or Invisible to specific users.</p>
         */
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
        /**
         * <p>The list of full names of associated technical metrics. Enter the technical metric in the format of &quot;Full table name.Metric name&quot;, where &quot;Full table name&quot; is equal to &quot;Asset source.Table name&quot;. A technical metric can be associated with only one business metric and cannot be associated repeatedly.</p>
         */
        @NameInMap("AssociatedTechMetricFullNames")
        public java.util.List<String> associatedTechMetricFullNames;

        /**
         * <p>The name of the business owner. Enter the username of the owner\&quot;s account.</p>
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
         * <p>The custom attributes.</p>
         */
        @NameInMap("CustomAttribute")
        public java.util.List<CreateBizMetricRequestCreateBizMetricCommandCustomAttribute> customAttribute;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>MetricDesc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>MetricDisplayName</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The asset labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The metric definition. To reference other business metrics, enclose the metric names in half-width square brackets [ ].</p>
         * 
         * <strong>example:</strong>
         * <p>[Metric1]+[Metric2]</p>
         */
        @NameInMap("MetricDefinition")
        public String metricDefinition;

        /**
         * <p>The expression for the metric relationship diagram. This information is read only when the metric relationship diagram is enabled. You can only enter a calculation expression composed of metric names selected from the related business metrics. The supported operators are +, -, *, /, (), %, and ∑. Each metric name must be enclosed in half-width square brackets [ ]. If no operator is specified between two metrics, the system automatically adds padding as a placeholder. If the metric relational expression is not configured, the metric relationship diagram switch is automatically set to shutdown.</p>
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
         * <p>The name of the business metric. The name must be unique within the tenant. Only English letters, digits, and specific special characters (-_/\·#$^&amp;*()%+=) are supported. Maximum length: 256 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The content of the operation instructions. Only text format is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("OperateInstructionContent")
        public String operateInstructionContent;

        /**
         * <p>Specifies whether to enable operation instructions. Valid values:</p>
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
         * <p>The list of related business metrics. Enter the names of the related business metrics and their relationships.</p>
         */
        @NameInMap("RelatedBizMetrics")
        public java.util.List<CreateBizMetricRequestCreateBizMetricCommandRelatedBizMetrics> relatedBizMetrics;

        /**
         * <p>The visibility scope.</p>
         */
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
