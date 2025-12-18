// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SyncDepartmentRequest extends TeaModel {
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
    @NameInMap("SyncDepartmentCommand")
    public SyncDepartmentRequestSyncDepartmentCommand syncDepartmentCommand;

    public static SyncDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDepartmentRequest self = new SyncDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public SyncDepartmentRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SyncDepartmentRequest setSyncDepartmentCommand(SyncDepartmentRequestSyncDepartmentCommand syncDepartmentCommand) {
        this.syncDepartmentCommand = syncDepartmentCommand;
        return this;
    }
    public SyncDepartmentRequestSyncDepartmentCommand getSyncDepartmentCommand() {
        return this.syncDepartmentCommand;
    }

    public static class SyncDepartmentRequestSyncDepartmentCommandDepartmentList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("DepartmentId")
        public String departmentId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>研发中心</p>
         */
        @NameInMap("DepartmentName")
        public String departmentName;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("ParentDepartmentId")
        public String parentDepartmentId;

        public static SyncDepartmentRequestSyncDepartmentCommandDepartmentList build(java.util.Map<String, ?> map) throws Exception {
            SyncDepartmentRequestSyncDepartmentCommandDepartmentList self = new SyncDepartmentRequestSyncDepartmentCommandDepartmentList();
            return TeaModel.build(map, self);
        }

        public SyncDepartmentRequestSyncDepartmentCommandDepartmentList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public SyncDepartmentRequestSyncDepartmentCommandDepartmentList setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public SyncDepartmentRequestSyncDepartmentCommandDepartmentList setParentDepartmentId(String parentDepartmentId) {
            this.parentDepartmentId = parentDepartmentId;
            return this;
        }
        public String getParentDepartmentId() {
            return this.parentDepartmentId;
        }

    }

    public static class SyncDepartmentRequestSyncDepartmentCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DepartmentList")
        public java.util.List<SyncDepartmentRequestSyncDepartmentCommandDepartmentList> departmentList;

        public static SyncDepartmentRequestSyncDepartmentCommand build(java.util.Map<String, ?> map) throws Exception {
            SyncDepartmentRequestSyncDepartmentCommand self = new SyncDepartmentRequestSyncDepartmentCommand();
            return TeaModel.build(map, self);
        }

        public SyncDepartmentRequestSyncDepartmentCommand setDepartmentList(java.util.List<SyncDepartmentRequestSyncDepartmentCommandDepartmentList> departmentList) {
            this.departmentList = departmentList;
            return this;
        }
        public java.util.List<SyncDepartmentRequestSyncDepartmentCommandDepartmentList> getDepartmentList() {
            return this.departmentList;
        }

    }

}
