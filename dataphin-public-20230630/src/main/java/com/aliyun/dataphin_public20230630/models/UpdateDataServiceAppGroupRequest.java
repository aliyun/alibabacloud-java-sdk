// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataServiceAppGroupRequest extends TeaModel {
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
    @NameInMap("UpdateCommand")
    public UpdateDataServiceAppGroupRequestUpdateCommand updateCommand;

    public static UpdateDataServiceAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceAppGroupRequest self = new UpdateDataServiceAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceAppGroupRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataServiceAppGroupRequest setUpdateCommand(UpdateDataServiceAppGroupRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataServiceAppGroupRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataServiceAppGroupRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>默认应用分组</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static UpdateDataServiceAppGroupRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataServiceAppGroupRequestUpdateCommand self = new UpdateDataServiceAppGroupRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataServiceAppGroupRequestUpdateCommand setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public UpdateDataServiceAppGroupRequestUpdateCommand setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
