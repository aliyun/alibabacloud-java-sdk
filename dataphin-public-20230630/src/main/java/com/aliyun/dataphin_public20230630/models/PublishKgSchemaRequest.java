// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishKgSchemaRequest extends TeaModel {
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
     * <p>The publish command and its details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishCommand")
    public PublishKgSchemaRequestPublishCommand publishCommand;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PublishKgSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishKgSchemaRequest self = new PublishKgSchemaRequest();
        return TeaModel.build(map, self);
    }

    public PublishKgSchemaRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PublishKgSchemaRequest setPublishCommand(PublishKgSchemaRequestPublishCommand publishCommand) {
        this.publishCommand = publishCommand;
        return this;
    }
    public PublishKgSchemaRequestPublishCommand getPublishCommand() {
        return this.publishCommand;
    }

    public PublishKgSchemaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy extends TeaModel {
        /**
         * <p>The default value to backfill for the property.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The property code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("PropertyCode")
        public String propertyCode;

        public static PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy build(java.util.Map<String, ?> map) throws Exception {
            PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy self = new PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy();
            return TeaModel.build(map, self);
        }

        public PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy setPropertyCode(String propertyCode) {
            this.propertyCode = propertyCode;
            return this;
        }
        public String getPropertyCode() {
            return this.propertyCode;
        }

    }

    public static class PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies extends TeaModel {
        /**
         * <p>The backfill property default value policy. This parameter takes effect only when PolicyType is set to BackFillDefault.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("BackFillDefaultValuePolicy")
        public PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy backFillDefaultValuePolicy;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li>BackFillDefault: backfills default values when a property changes from optional to required.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BackFillDefault</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The type to which the policy applies. Valid values:</p>
         * <ul>
         * <li>ENTITY: applies to entity types.</li>
         * <li>RELATION: applies to relation types.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTITY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The code of the entity type or relation type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Product</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        public static PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies build(java.util.Map<String, ?> map) throws Exception {
            PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies self = new PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies();
            return TeaModel.build(map, self);
        }

        public PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies setBackFillDefaultValuePolicy(PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy backFillDefaultValuePolicy) {
            this.backFillDefaultValuePolicy = backFillDefaultValuePolicy;
            return this;
        }
        public PublishKgSchemaRequestPublishCommandDataAdjustmentPoliciesBackFillDefaultValuePolicy getBackFillDefaultValuePolicy() {
            return this.backFillDefaultValuePolicy;
        }

        public PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

    }

    public static class PublishKgSchemaRequestPublishCommand extends TeaModel {
        /**
         * <p>The data adjustment policies.</p>
         */
        @NameInMap("DataAdjustmentPolicies")
        public java.util.List<PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies> dataAdjustmentPolicies;

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static PublishKgSchemaRequestPublishCommand build(java.util.Map<String, ?> map) throws Exception {
            PublishKgSchemaRequestPublishCommand self = new PublishKgSchemaRequestPublishCommand();
            return TeaModel.build(map, self);
        }

        public PublishKgSchemaRequestPublishCommand setDataAdjustmentPolicies(java.util.List<PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies> dataAdjustmentPolicies) {
            this.dataAdjustmentPolicies = dataAdjustmentPolicies;
            return this;
        }
        public java.util.List<PublishKgSchemaRequestPublishCommandDataAdjustmentPolicies> getDataAdjustmentPolicies() {
            return this.dataAdjustmentPolicies;
        }

        public PublishKgSchemaRequestPublishCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
