// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModulesResponseBody extends TeaModel {
    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>173</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. A value of null indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>iRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of Registry modules.</p>
     */
    @NameInMap("registryModules")
    public java.util.List<ListRegistryModulesResponseBodyRegistryModules> registryModules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D25216A9-C0F7-5A3A-A7E4-2B3D4F3A355D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRegistryModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryModulesResponseBody self = new ListRegistryModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegistryModulesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListRegistryModulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegistryModulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegistryModulesResponseBody setRegistryModules(java.util.List<ListRegistryModulesResponseBodyRegistryModules> registryModules) {
        this.registryModules = registryModules;
        return this;
    }
    public java.util.List<ListRegistryModulesResponseBodyRegistryModules> getRegistryModules() {
        return this.registryModules;
    }

    public ListRegistryModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegistryModulesResponseBodyRegistryModules extends TeaModel {
        /**
         * <p>The permission. private: private.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>The creation time in the format of YYYY-MM-DD HH:mm:ss. The returned value does not include a time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10 16:16:04</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the Registry module.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("downloads")
        public Integer downloads;

        /**
         * <p>The name of the Registry module.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>NamespaceName</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        /**
         * <p>The provider type. alicloud: Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The list of accounts with which the Registry module is shared.</p>
         */
        @NameInMap("sharedAccounts")
        public java.util.List<Long> sharedAccounts;

        /**
         * <p>The module source.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaceName/ModuleName</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The module source URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("sourceUrl")
        public String sourceUrl;

        /**
         * <p>The templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListRegistryModulesResponseBodyRegistryModules build(java.util.Map<String, ?> map) throws Exception {
            ListRegistryModulesResponseBodyRegistryModules self = new ListRegistryModulesResponseBodyRegistryModules();
            return TeaModel.build(map, self);
        }

        public ListRegistryModulesResponseBodyRegistryModules setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public ListRegistryModulesResponseBodyRegistryModules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRegistryModulesResponseBodyRegistryModules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRegistryModulesResponseBodyRegistryModules setDownloads(Integer downloads) {
            this.downloads = downloads;
            return this;
        }
        public Integer getDownloads() {
            return this.downloads;
        }

        public ListRegistryModulesResponseBodyRegistryModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListRegistryModulesResponseBodyRegistryModules setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListRegistryModulesResponseBodyRegistryModules setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListRegistryModulesResponseBodyRegistryModules setSharedAccounts(java.util.List<Long> sharedAccounts) {
            this.sharedAccounts = sharedAccounts;
            return this;
        }
        public java.util.List<Long> getSharedAccounts() {
            return this.sharedAccounts;
        }

        public ListRegistryModulesResponseBodyRegistryModules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRegistryModulesResponseBodyRegistryModules setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public ListRegistryModulesResponseBodyRegistryModules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRegistryModulesResponseBodyRegistryModules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
