// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardRelationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteStandardRelationsRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteStandardRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardRelationsRequest self = new DeleteStandardRelationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardRelationsRequest setDeleteCommand(DeleteStandardRelationsRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteStandardRelationsRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteStandardRelationsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteStandardRelationsRequestDeleteCommandStandardRefList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        public static DeleteStandardRelationsRequestDeleteCommandStandardRefList build(java.util.Map<String, ?> map) throws Exception {
            DeleteStandardRelationsRequestDeleteCommandStandardRefList self = new DeleteStandardRelationsRequestDeleteCommandStandardRefList();
            return TeaModel.build(map, self);
        }

        public DeleteStandardRelationsRequestDeleteCommandStandardRefList setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

    }

    public static class DeleteStandardRelationsRequestDeleteCommand extends TeaModel {
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
        public java.util.List<DeleteStandardRelationsRequestDeleteCommandStandardRefList> standardRefList;

        public static DeleteStandardRelationsRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteStandardRelationsRequestDeleteCommand self = new DeleteStandardRelationsRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteStandardRelationsRequestDeleteCommand setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public DeleteStandardRelationsRequestDeleteCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public DeleteStandardRelationsRequestDeleteCommand setStandardRefList(java.util.List<DeleteStandardRelationsRequestDeleteCommandStandardRefList> standardRefList) {
            this.standardRefList = standardRefList;
            return this;
        }
        public java.util.List<DeleteStandardRelationsRequestDeleteCommandStandardRefList> getStandardRefList() {
            return this.standardRefList;
        }

    }

}
