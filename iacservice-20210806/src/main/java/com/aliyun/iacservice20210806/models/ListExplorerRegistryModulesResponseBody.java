// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModulesResponseBody extends TeaModel {
    @NameInMap("explorerRegistryModules")
    public java.util.List<ListExplorerRegistryModulesResponseBodyExplorerRegistryModules> explorerRegistryModules;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>DxEkv+3w0EDAQgcRFBp8Ep4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1A662F56-CA76-55F6-869D-7F26293B8E67</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>170</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListExplorerRegistryModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModulesResponseBody self = new ListExplorerRegistryModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModulesResponseBody setExplorerRegistryModules(java.util.List<ListExplorerRegistryModulesResponseBodyExplorerRegistryModules> explorerRegistryModules) {
        this.explorerRegistryModules = explorerRegistryModules;
        return this;
    }
    public java.util.List<ListExplorerRegistryModulesResponseBodyExplorerRegistryModules> getExplorerRegistryModules() {
        return this.explorerRegistryModules;
    }

    public ListExplorerRegistryModulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerRegistryModulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExplorerRegistryModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExplorerRegistryModulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExplorerRegistryModulesResponseBodyExplorerRegistryModules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("downloads")
        public Long downloads;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <strong>example:</strong>
         * <p>terraform-alicloud-modules/mongodb</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        /**
         * <strong>example:</strong>
         * <p>terraform-alicloud-modules/mongodb/alicloud</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("status")
        public String status;

        public static ListExplorerRegistryModulesResponseBodyExplorerRegistryModules build(java.util.Map<String, ?> map) throws Exception {
            ListExplorerRegistryModulesResponseBodyExplorerRegistryModules self = new ListExplorerRegistryModulesResponseBodyExplorerRegistryModules();
            return TeaModel.build(map, self);
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setDownloads(Long downloads) {
            this.downloads = downloads;
            return this;
        }
        public Long getDownloads() {
            return this.downloads;
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListExplorerRegistryModulesResponseBodyExplorerRegistryModules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
