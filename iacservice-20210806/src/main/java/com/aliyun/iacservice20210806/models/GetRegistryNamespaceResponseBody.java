// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRegistryNamespaceResponseBody extends TeaModel {
    @NameInMap("namespace")
    public GetRegistryNamespaceResponseBodyNamespace namespace;

    /**
     * <strong>example:</strong>
     * <p>26684763-5BAB-58C8-BA4F-9D622AB7AD14</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRegistryNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryNamespaceResponseBody self = new GetRegistryNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegistryNamespaceResponseBody setNamespace(GetRegistryNamespaceResponseBodyNamespace namespace) {
        this.namespace = namespace;
        return this;
    }
    public GetRegistryNamespaceResponseBodyNamespace getNamespace() {
        return this.namespace;
    }

    public GetRegistryNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRegistryNamespaceResponseBodyNamespace extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <strong>example:</strong>
         * <p>2025-03-20T02:18:29Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("maintainer")
        public String maintainer;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("modules")
        public Integer modules;

        /**
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        @NameInMap("sharedAccounts")
        public java.util.List<Long> sharedAccounts;

        /**
         * <strong>example:</strong>
         * <p>share</p>
         */
        @NameInMap("type")
        public String type;

        public static GetRegistryNamespaceResponseBodyNamespace build(java.util.Map<String, ?> map) throws Exception {
            GetRegistryNamespaceResponseBodyNamespace self = new GetRegistryNamespaceResponseBodyNamespace();
            return TeaModel.build(map, self);
        }

        public GetRegistryNamespaceResponseBodyNamespace setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public GetRegistryNamespaceResponseBodyNamespace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRegistryNamespaceResponseBodyNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRegistryNamespaceResponseBodyNamespace setMaintainer(String maintainer) {
            this.maintainer = maintainer;
            return this;
        }
        public String getMaintainer() {
            return this.maintainer;
        }

        public GetRegistryNamespaceResponseBodyNamespace setModules(Integer modules) {
            this.modules = modules;
            return this;
        }
        public Integer getModules() {
            return this.modules;
        }

        public GetRegistryNamespaceResponseBodyNamespace setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public GetRegistryNamespaceResponseBodyNamespace setSharedAccounts(java.util.List<Long> sharedAccounts) {
            this.sharedAccounts = sharedAccounts;
            return this;
        }
        public java.util.List<Long> getSharedAccounts() {
            return this.sharedAccounts;
        }

        public GetRegistryNamespaceResponseBodyNamespace setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
