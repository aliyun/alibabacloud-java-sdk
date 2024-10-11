// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantResourcePermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantCommand")
    public GrantResourcePermissionRequestGrantCommand grantCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GrantResourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantResourcePermissionRequest self = new GrantResourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantResourcePermissionRequest setGrantCommand(GrantResourcePermissionRequestGrantCommand grantCommand) {
        this.grantCommand = grantCommand;
        return this;
    }
    public GrantResourcePermissionRequestGrantCommand getGrantCommand() {
        return this.grantCommand;
    }

    public GrantResourcePermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GrantResourcePermissionRequestGrantCommandResourceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hadoop.300000806.data_distill.behavior_gameinfor_01</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static GrantResourcePermissionRequestGrantCommandResourceList build(java.util.Map<String, ?> map) throws Exception {
            GrantResourcePermissionRequestGrantCommandResourceList self = new GrantResourcePermissionRequestGrantCommandResourceList();
            return TeaModel.build(map, self);
        }

        public GrantResourcePermissionRequestGrantCommandResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GrantResourcePermissionRequestGrantCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("EffectiveEnd")
        public String effectiveEnd;

        /**
         * <p>This parameter is required.</p>
         */
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
        public java.util.List<GrantResourcePermissionRequestGrantCommandResourceList> resourceList;

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
         */
        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static GrantResourcePermissionRequestGrantCommand build(java.util.Map<String, ?> map) throws Exception {
            GrantResourcePermissionRequestGrantCommand self = new GrantResourcePermissionRequestGrantCommand();
            return TeaModel.build(map, self);
        }

        public GrantResourcePermissionRequestGrantCommand setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
            return this;
        }
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        public GrantResourcePermissionRequestGrantCommand setOperateList(java.util.List<String> operateList) {
            this.operateList = operateList;
            return this;
        }
        public java.util.List<String> getOperateList() {
            return this.operateList;
        }

        public GrantResourcePermissionRequestGrantCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GrantResourcePermissionRequestGrantCommand setResourceList(java.util.List<GrantResourcePermissionRequestGrantCommandResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GrantResourcePermissionRequestGrantCommandResourceList> getResourceList() {
            return this.resourceList;
        }

        public GrantResourcePermissionRequestGrantCommand setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GrantResourcePermissionRequestGrantCommand setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
