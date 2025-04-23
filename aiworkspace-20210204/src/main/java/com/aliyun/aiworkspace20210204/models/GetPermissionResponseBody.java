// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionResponseBody extends TeaModel {
    /**
     * <p>The permission name, which is unique in a region. For more information about permissions, see <a href="https://help.aliyun.com/document_detail/2840449.html">Appendix: Roles and permissions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PaiDLC:ListJobs</p>
     */
    @NameInMap("PermissionCode")
    public String permissionCode;

    /**
     * <p>The permission rules.</p>
     */
    @NameInMap("PermissionRules")
    public java.util.List<GetPermissionResponseBodyPermissionRules> permissionRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
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
        /**
         * <p>The accessibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members can access the workspace.</li>
         * <li>PRIVATE: Only the creator can access the workspace.</li>
         * <li>ANY: All users can access the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Accessibility")
        public String accessibility;

        /**
         * <p>The access type. If you set Accessibility to PUBLIC, all users can access the workspace. This parameter is invalid. If you set Accessibility to PRIVATE, the value of this parameter can be:</p>
         * <ul>
         * <li>PRIVATE: Only the creator can access the workspace.</li>
         * <li>ANY: All users can access the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATOR</p>
         */
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
