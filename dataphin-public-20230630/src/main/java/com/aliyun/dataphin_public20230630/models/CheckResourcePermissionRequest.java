// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckResourcePermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public CheckResourcePermissionRequestCheckCommand checkCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CheckResourcePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourcePermissionRequest self = new CheckResourcePermissionRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourcePermissionRequest setCheckCommand(CheckResourcePermissionRequestCheckCommand checkCommand) {
        this.checkCommand = checkCommand;
        return this;
    }
    public CheckResourcePermissionRequestCheckCommand getCheckCommand() {
        return this.checkCommand;
    }

    public CheckResourcePermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CheckResourcePermissionRequestCheckCommandResourceList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hadoop.300000806.data_distill.behavior_gameinfor_01</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static CheckResourcePermissionRequestCheckCommandResourceList build(java.util.Map<String, ?> map) throws Exception {
            CheckResourcePermissionRequestCheckCommandResourceList self = new CheckResourcePermissionRequestCheckCommandResourceList();
            return TeaModel.build(map, self);
        }

        public CheckResourcePermissionRequestCheckCommandResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class CheckResourcePermissionRequestCheckCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<CheckResourcePermissionRequestCheckCommandResourceList> resourceList;

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
         * <p>323231</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CheckResourcePermissionRequestCheckCommand build(java.util.Map<String, ?> map) throws Exception {
            CheckResourcePermissionRequestCheckCommand self = new CheckResourcePermissionRequestCheckCommand();
            return TeaModel.build(map, self);
        }

        public CheckResourcePermissionRequestCheckCommand setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public CheckResourcePermissionRequestCheckCommand setResourceList(java.util.List<CheckResourcePermissionRequestCheckCommandResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<CheckResourcePermissionRequestCheckCommandResourceList> getResourceList() {
            return this.resourceList;
        }

        public CheckResourcePermissionRequestCheckCommand setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public CheckResourcePermissionRequestCheckCommand setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
