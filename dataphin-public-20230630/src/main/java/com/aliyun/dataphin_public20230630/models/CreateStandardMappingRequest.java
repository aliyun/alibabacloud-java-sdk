// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardMappingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardMappingRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateStandardMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardMappingRequest self = new CreateStandardMappingRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardMappingRequest setCreateCommand(CreateStandardMappingRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardMappingRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardMappingRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateStandardMappingRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AssetGuidList")
        public java.util.List<String> assetGuidList;

        /**
         * <strong>example:</strong>
         * <p>SET_INVALID_TO_VALID</p>
         */
        @NameInMap("InvalidMappingRelationOperationType")
        public String invalidMappingRelationOperationType;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        public static CreateStandardMappingRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardMappingRequestCreateCommand self = new CreateStandardMappingRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardMappingRequestCreateCommand setAssetGuidList(java.util.List<String> assetGuidList) {
            this.assetGuidList = assetGuidList;
            return this;
        }
        public java.util.List<String> getAssetGuidList() {
            return this.assetGuidList;
        }

        public CreateStandardMappingRequestCreateCommand setInvalidMappingRelationOperationType(String invalidMappingRelationOperationType) {
            this.invalidMappingRelationOperationType = invalidMappingRelationOperationType;
            return this;
        }
        public String getInvalidMappingRelationOperationType() {
            return this.invalidMappingRelationOperationType;
        }

        public CreateStandardMappingRequestCreateCommand setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public CreateStandardMappingRequestCreateCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

    }

}
