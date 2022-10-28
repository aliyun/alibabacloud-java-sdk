// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionResponseBody extends TeaModel {
    @NameInMap("PermissionCode")
    public String permissionCode;

    @NameInMap("PermissionRules")
    public java.util.List<GetPermissionResponseBodyPermissionRules> permissionRules;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionResponseBody self = new GetPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPermissionResponseBody setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
        return this;
    }
    public String getPermissionCode() {
        return this.permissionCode;
    }

    public GetPermissionResponseBody setPermissionRules(java.util.List<GetPermissionResponseBodyPermissionRules> permissionRules) {
        this.permissionRules = permissionRules;
        return this;
    }
    public java.util.List<GetPermissionResponseBodyPermissionRules> getPermissionRules() {
        return this.permissionRules;
    }

    public GetPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPermissionResponseBodyPermissionRules extends TeaModel {
        @NameInMap("Accessibility")
        public String accessibility;

        @NameInMap("EntityAccessType")
        public String entityAccessType;

        public static GetPermissionResponseBodyPermissionRules build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionResponseBodyPermissionRules self = new GetPermissionResponseBodyPermissionRules();
            return TeaModel.build(map, self);
        }

        public GetPermissionResponseBodyPermissionRules setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public GetPermissionResponseBodyPermissionRules setEntityAccessType(String entityAccessType) {
            this.entityAccessType = entityAccessType;
            return this;
        }
        public String getEntityAccessType() {
            return this.entityAccessType;
        }

    }

}
