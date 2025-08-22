// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryNamespacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>53</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("namespaces")
    public java.util.List<ListRegistryNamespacesResponseBodyNamespaces> namespaces;

    /**
     * <strong>example:</strong>
     * <p>IPTL1Zpr1andEF4lQ3XAYFTgtpI04QQpc5dyKpESXBc=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>5FFB0033-A016-5A9D-9283-C123AAA7F71D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRegistryNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryNamespacesResponseBody self = new ListRegistryNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegistryNamespacesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListRegistryNamespacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegistryNamespacesResponseBody setNamespaces(java.util.List<ListRegistryNamespacesResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListRegistryNamespacesResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public ListRegistryNamespacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegistryNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegistryNamespacesResponseBodyNamespaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <strong>example:</strong>
         * <p>2025-01-15T02:16:58Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>dd</p>
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
         * <p>shared</p>
         */
        @NameInMap("type")
        public String type;

        public static ListRegistryNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListRegistryNamespacesResponseBodyNamespaces self = new ListRegistryNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListRegistryNamespacesResponseBodyNamespaces setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setMaintainer(String maintainer) {
            this.maintainer = maintainer;
            return this;
        }
        public String getMaintainer() {
            return this.maintainer;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setModules(Integer modules) {
            this.modules = modules;
            return this;
        }
        public Integer getModules() {
            return this.modules;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setSharedAccounts(java.util.List<Long> sharedAccounts) {
            this.sharedAccounts = sharedAccounts;
            return this;
        }
        public java.util.List<Long> getSharedAccounts() {
            return this.sharedAccounts;
        }

        public ListRegistryNamespacesResponseBodyNamespaces setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
