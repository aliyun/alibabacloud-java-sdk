// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RevokeResourcePermissionRequest extends TeaModel {
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
    @NameInMap("RevokeCommand")
    public RevokeResourcePermissionRequestRevokeCommand revokeCommand;

    public static RevokeResourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourcePermissionRequest self = new RevokeResourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeResourcePermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RevokeResourcePermissionRequest setRevokeCommand(RevokeResourcePermissionRequestRevokeCommand revokeCommand) {
        this.revokeCommand = revokeCommand;
        return this;
    }
    public RevokeResourcePermissionRequestRevokeCommand getRevokeCommand() {
        return this.revokeCommand;
    }

    public static class RevokeResourcePermissionRequestRevokeCommandResourceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>odps.300002102.beginner_test.amin_table</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static RevokeResourcePermissionRequestRevokeCommandResourceList build(java.util.Map<String, ?> map) throws Exception {
            RevokeResourcePermissionRequestRevokeCommandResourceList self = new RevokeResourcePermissionRequestRevokeCommandResourceList();
            return TeaModel.build(map, self);
        }

        public RevokeResourcePermissionRequestRevokeCommandResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class RevokeResourcePermissionRequestRevokeCommand extends TeaModel {
        @NameInMap("OperateList")
        public java.util.List<String> operateList;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<RevokeResourcePermissionRequestRevokeCommandResourceList> resourceList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13131</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RevokeResourcePermissionRequestRevokeCommand build(java.util.Map<String, ?> map) throws Exception {
            RevokeResourcePermissionRequestRevokeCommand self = new RevokeResourcePermissionRequestRevokeCommand();
            return TeaModel.build(map, self);
        }

        public RevokeResourcePermissionRequestRevokeCommand setOperateList(java.util.List<String> operateList) {
            this.operateList = operateList;
            return this;
        }
        public java.util.List<String> getOperateList() {
            return this.operateList;
        }

        public RevokeResourcePermissionRequestRevokeCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public RevokeResourcePermissionRequestRevokeCommand setResourceList(java.util.List<RevokeResourcePermissionRequestRevokeCommandResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<RevokeResourcePermissionRequestRevokeCommandResourceList> getResourceList() {
            return this.resourceList;
        }

        public RevokeResourcePermissionRequestRevokeCommand setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public RevokeResourcePermissionRequestRevokeCommand setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
