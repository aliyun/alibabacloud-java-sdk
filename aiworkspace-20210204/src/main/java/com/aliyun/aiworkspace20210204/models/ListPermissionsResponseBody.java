// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListPermissionsResponseBody extends TeaModel {
    /**
     * <p>The permissions.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<ListPermissionsResponseBodyPermissions> permissions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-B******8174039A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of permissions that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsResponseBody self = new ListPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionsResponseBody setPermissions(java.util.List<ListPermissionsResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<ListPermissionsResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public ListPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPermissionsResponseBodyPermissionsPermissionRules extends TeaModel {
        /**
         * <p>The accessibility of the permission rule. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members in the workspace can access the permission rule.</li>
         * <li>PRIVATE: Only the creator can access the permission rule.</li>
         * <li>ANY: All users can access the permission rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>The type of access. If you set Accessibility to PUBLIC, all users can access the workspace. This parameter is invalid. If you set Accessibility to PRIVATE, the permissions are determined based on the value of EntityAccessType. The value of EntityAccessType can be:</p>
         * <ul>
         * <li>CREATOR: Only the creator can access the workspace.</li>
         * <li>ANY: All users can access the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATOR</p>
         */
        @NameInMap("EntityAccessType")
        public String entityAccessType;

        public static ListPermissionsResponseBodyPermissionsPermissionRules build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionsResponseBodyPermissionsPermissionRules self = new ListPermissionsResponseBodyPermissionsPermissionRules();
            return TeaModel.build(map, self);
        }

        public ListPermissionsResponseBodyPermissionsPermissionRules setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListPermissionsResponseBodyPermissionsPermissionRules setEntityAccessType(String entityAccessType) {
            this.entityAccessType = entityAccessType;
            return this;
        }
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

    }

    public static class ListPermissionsResponseBodyPermissions extends TeaModel {
        /**
         * <p>The permission name, which is unique in a region. For more information about permissions, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>. The example value PaiDLC:GetTensorboard indicates the permission to view details about a TensorBoard job on the Deep Learning Containers (DLC) page.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiDLC:GetTensorboard</p>
         */
        @NameInMap("PermissionCode")
        public String permissionCode;

        /**
         * <p>The permission rules.</p>
         */
        @NameInMap("PermissionRules")
        public java.util.List<ListPermissionsResponseBodyPermissionsPermissionRules> permissionRules;

        public static ListPermissionsResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionsResponseBodyPermissions self = new ListPermissionsResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public ListPermissionsResponseBodyPermissions setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public ListPermissionsResponseBodyPermissions setPermissionRules(java.util.List<ListPermissionsResponseBodyPermissionsPermissionRules> permissionRules) {
            this.permissionRules = permissionRules;
            return this;
        }
        public java.util.List<ListPermissionsResponseBodyPermissionsPermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

    }

}
