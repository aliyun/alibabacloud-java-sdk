// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Namespaces")
    public java.util.List<ListNamespacesResponseBodyNamespaces> namespaces;

    public static ListNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponseBody self = new ListNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespacesResponseBody setNamespaces(java.util.List<ListNamespacesResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListNamespacesResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public static class ListNamespacesResponseBodyNamespaces extends TeaModel {
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("AuthType")
        public Integer authType;

        public static ListNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyNamespaces self = new ListNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyNamespaces setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListNamespacesResponseBodyNamespaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNamespacesResponseBodyNamespaces setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListNamespacesResponseBodyNamespaces setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListNamespacesResponseBodyNamespaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNamespacesResponseBodyNamespaces setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListNamespacesResponseBodyNamespaces setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListNamespacesResponseBodyNamespaces setAuthType(Integer authType) {
            this.authType = authType;
            return this;
        }
        public Integer getAuthType() {
            return this.authType;
        }

    }

}
