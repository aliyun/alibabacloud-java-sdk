// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>173</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("registryModules")
    public java.util.List<ListRegistryModulesResponseBodyRegistryModules> registryModules;

    /**
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
        @NameInMap("acl")
        public String acl;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("downloads")
        public Integer downloads;

        @NameInMap("moduleName")
        public String moduleName;

        @NameInMap("namespaceName")
        public String namespaceName;

        @NameInMap("provider")
        public String provider;

        @NameInMap("sharedAccounts")
        public java.util.List<Long> sharedAccounts;

        @NameInMap("source")
        public String source;

        @NameInMap("sourceUrl")
        public String sourceUrl;

        @NameInMap("type")
        public String type;

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
