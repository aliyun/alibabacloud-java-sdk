// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListGlobalPermissionsResponseBody extends TeaModel {
    // Permissions
    @NameInMap("Permissions")
    public java.util.List<ListGlobalPermissionsResponseBodyPermissions> permissions;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListGlobalPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalPermissionsResponseBody self = new ListGlobalPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGlobalPermissionsResponseBody setPermissions(java.util.List<ListGlobalPermissionsResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<ListGlobalPermissionsResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public ListGlobalPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGlobalPermissionsResponseBodyPermissionsPermissionRules extends TeaModel {
        // 待鉴权实例的可见性 PUBLIC表示当前工作空间所有人都可以访问 PRIVATE表示只有Owner可以访问
        @NameInMap("Accessibility")
        public String accessibility;

        // 存取类型 CREATOR 代表能看自已创建的 OTHERS 代表可以看别人创建的 ALL代表所有
        @NameInMap("EntityAccessType")
        public String entityAccessType;

        public static ListGlobalPermissionsResponseBodyPermissionsPermissionRules build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalPermissionsResponseBodyPermissionsPermissionRules self = new ListGlobalPermissionsResponseBodyPermissionsPermissionRules();
            return TeaModel.build(map, self);
        }

        public ListGlobalPermissionsResponseBodyPermissionsPermissionRules setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListGlobalPermissionsResponseBodyPermissionsPermissionRules setEntityAccessType(String entityAccessType) {
            this.entityAccessType = entityAccessType;
            return this;
        }
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

    }

    public static class ListGlobalPermissionsResponseBodyPermissions extends TeaModel {
        // PermissionCode
        @NameInMap("PermissionCode")
        public String permissionCode;

        // PermissionRules
        @NameInMap("PermissionRules")
        public java.util.List<ListGlobalPermissionsResponseBodyPermissionsPermissionRules> permissionRules;

        public static ListGlobalPermissionsResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalPermissionsResponseBodyPermissions self = new ListGlobalPermissionsResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public ListGlobalPermissionsResponseBodyPermissions setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public ListGlobalPermissionsResponseBodyPermissions setPermissionRules(java.util.List<ListGlobalPermissionsResponseBodyPermissionsPermissionRules> permissionRules) {
            this.permissionRules = permissionRules;
            return this;
        }
        public java.util.List<ListGlobalPermissionsResponseBodyPermissionsPermissionRules> getPermissionRules() {
            return this.permissionRules;
        }

    }

}
