// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckResourcePermissionRequest extends TeaModel {
    /**
     * <p>The user resource permission check command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public CheckResourcePermissionRequestCheckCommand checkCommand;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public CheckResourcePermissionRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CheckResourcePermissionRequestCheckCommandResourceList extends TeaModel {
        /**
         * <p>The resource ID.</p>
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
         * <p>The operation type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>The resources.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<CheckResourcePermissionRequestCheckCommandResourceList> resourceList;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>PHYSICAL_TABLE: Physical table.</li>
         * <li>PHYSICAL_FIELD: Physical table field.</li>
         * <li>LOGICAL_TABLE: Logical fact table.</li>
         * <li>LOGICAL_FIELD: Logical fact table field.</li>
         * <li>LABEL_TABLE: Logical label table.</li>
         * <li>LABEL_FIELD: Logical label table field.</li>
         * <li>DATASOURCE: Data source.</li>
         * <li>GLOBAL_PARAM: Global parameter.</li>
         * <li>REALTIME_LOGICAL_TABLE: Real-time metadata table.</li>
         * <li>REALTIME_LOGICAL_FIELD: Real-time metadata table field.</li>
         * <li>REALTIME_MIRROR_TABLE: Mirror table.</li>
         * <li>REALTIME_MIRROR_FIELD: Real-time mirror table field.</li>
         * <li>FUNCTION: Function.</li>
         * <li>FEATURE: Feature permission.</li>
         * <li>PHYSICAL_VIEW: Physical view.</li>
         * <li>LOGICAL_VIEW: Logical view.</li>
         * <li>QD_SERVICE_FEATURE: Service label.</li>
         * <li>QD_ADVANCED_FEATURE: Advanced label.</li>
         * <li>QD_CLUSTER: Group.</li>
         * <li>QD_EVENT: Event.</li>
         * <li>QD_OFFLINE_SERVICE: Offline label service task.</li>
         * <li>PHYSICAL_MATERIALIZED_VIEW: Materialized view.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The user ID.</p>
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
