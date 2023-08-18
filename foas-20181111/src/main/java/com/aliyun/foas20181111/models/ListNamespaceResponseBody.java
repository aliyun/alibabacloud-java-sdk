// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Namespaces")
    public java.util.List<ListNamespaceResponseBodyNamespaces> namespaces;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceResponseBody self = new ListNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamespaceResponseBody setNamespaces(java.util.List<ListNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public ListNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNamespaceResponseBodyNamespacesRoleBindings extends TeaModel {
        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("Role")
        public String role;

        public static ListNamespaceResponseBodyNamespacesRoleBindings build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceResponseBodyNamespacesRoleBindings self = new ListNamespaceResponseBodyNamespacesRoleBindings();
            return TeaModel.build(map, self);
        }

        public ListNamespaceResponseBodyNamespacesRoleBindings setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public ListNamespaceResponseBodyNamespacesRoleBindings setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ListNamespaceResponseBodyNamespaces extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("LifecyclePhase")
        public String lifecyclePhase;

        @NameInMap("Name")
        public String name;

        @NameInMap("PreviewSessionClusterName")
        public String previewSessionClusterName;

        @NameInMap("RoleBindings")
        public java.util.List<ListNamespaceResponseBodyNamespacesRoleBindings> roleBindings;

        @NameInMap("Workspace")
        public String workspace;

        public static ListNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceResponseBodyNamespaces self = new ListNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListNamespaceResponseBodyNamespaces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNamespaceResponseBodyNamespaces setLifecyclePhase(String lifecyclePhase) {
            this.lifecyclePhase = lifecyclePhase;
            return this;
        }
        public String getLifecyclePhase() {
            return this.lifecyclePhase;
        }

        public ListNamespaceResponseBodyNamespaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNamespaceResponseBodyNamespaces setPreviewSessionClusterName(String previewSessionClusterName) {
            this.previewSessionClusterName = previewSessionClusterName;
            return this;
        }
        public String getPreviewSessionClusterName() {
            return this.previewSessionClusterName;
        }

        public ListNamespaceResponseBodyNamespaces setRoleBindings(java.util.List<ListNamespaceResponseBodyNamespacesRoleBindings> roleBindings) {
            this.roleBindings = roleBindings;
            return this;
        }
        public java.util.List<ListNamespaceResponseBodyNamespacesRoleBindings> getRoleBindings() {
            return this.roleBindings;
        }

        public ListNamespaceResponseBodyNamespaces setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
