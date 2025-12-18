// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SyncDepartmentUserRequest extends TeaModel {
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
    @NameInMap("SyncDepartmentUserCommand")
    public SyncDepartmentUserRequestSyncDepartmentUserCommand syncDepartmentUserCommand;

    public static SyncDepartmentUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDepartmentUserRequest self = new SyncDepartmentUserRequest();
        return TeaModel.build(map, self);
    }

    public SyncDepartmentUserRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SyncDepartmentUserRequest setSyncDepartmentUserCommand(SyncDepartmentUserRequestSyncDepartmentUserCommand syncDepartmentUserCommand) {
        this.syncDepartmentUserCommand = syncDepartmentUserCommand;
        return this;
    }
    public SyncDepartmentUserRequestSyncDepartmentUserCommand getSyncDepartmentUserCommand() {
        return this.syncDepartmentUserCommand;
    }

    public static class SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping extends TeaModel {
        @NameInMap("DepartmentIdList")
        public java.util.List<String> departmentIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("SourceUserId")
        public String sourceUserId;

        public static SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping build(java.util.Map<String, ?> map) throws Exception {
            SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping self = new SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping();
            return TeaModel.build(map, self);
        }

        public SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping setDepartmentIdList(java.util.List<String> departmentIdList) {
            this.departmentIdList = departmentIdList;
            return this;
        }
        public java.util.List<String> getDepartmentIdList() {
            return this.departmentIdList;
        }

        public SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

    }

    public static class SyncDepartmentUserRequestSyncDepartmentUserCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DeptUserMapping")
        public java.util.List<SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping> deptUserMapping;

        public static SyncDepartmentUserRequestSyncDepartmentUserCommand build(java.util.Map<String, ?> map) throws Exception {
            SyncDepartmentUserRequestSyncDepartmentUserCommand self = new SyncDepartmentUserRequestSyncDepartmentUserCommand();
            return TeaModel.build(map, self);
        }

        public SyncDepartmentUserRequestSyncDepartmentUserCommand setDeptUserMapping(java.util.List<SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping> deptUserMapping) {
            this.deptUserMapping = deptUserMapping;
            return this;
        }
        public java.util.List<SyncDepartmentUserRequestSyncDepartmentUserCommandDeptUserMapping> getDeptUserMapping() {
            return this.deptUserMapping;
        }

    }

}
