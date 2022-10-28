// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListPermissionsResponseBody extends TeaModel {
    @NameInMap("Permissions")
    public java.util.List<ListPermissionsResponseBodyPermissions> permissions;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Accessibility")
        public String accessibility;

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
        @NameInMap("PermissionCode")
        public String permissionCode;

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
