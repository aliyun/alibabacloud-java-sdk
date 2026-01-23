// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardRelationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardRelationsRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateStandardRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardRelationsRequest self = new CreateStandardRelationsRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardRelationsRequest setCreateCommand(CreateStandardRelationsRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardRelationsRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardRelationsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateStandardRelationsRequestCreateCommandStandardRefList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        public static CreateStandardRelationsRequestCreateCommandStandardRefList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRelationsRequestCreateCommandStandardRefList self = new CreateStandardRelationsRequestCreateCommandStandardRefList();
            return TeaModel.build(map, self);
        }

        public CreateStandardRelationsRequestCreateCommandStandardRefList setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

    }

    public static class CreateStandardRelationsRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATIVE</p>
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

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardRefList")
        public java.util.List<CreateStandardRelationsRequestCreateCommandStandardRefList> standardRefList;

        public static CreateStandardRelationsRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRelationsRequestCreateCommand self = new CreateStandardRelationsRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardRelationsRequestCreateCommand setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public CreateStandardRelationsRequestCreateCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public CreateStandardRelationsRequestCreateCommand setStandardRefList(java.util.List<CreateStandardRelationsRequestCreateCommandStandardRefList> standardRefList) {
            this.standardRefList = standardRefList;
            return this;
        }
        public java.util.List<CreateStandardRelationsRequestCreateCommandStandardRefList> getStandardRefList() {
            return this.standardRefList;
        }

    }

}
