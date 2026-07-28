// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModuleVersionsResponseBody extends TeaModel {
    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The list of template versions.</p>
     */
    @NameInMap("moduleVersions")
    public java.util.List<ListRegistryModuleVersionsResponseBodyModuleVersions> moduleVersions;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>IbuvZ8iOH447bhHWDavGTOMijI2Jep7c=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8606B880-3485-54E2-89E1-43361C468C85</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRegistryModuleVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryModuleVersionsResponseBody self = new ListRegistryModuleVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegistryModuleVersionsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListRegistryModuleVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegistryModuleVersionsResponseBody setModuleVersions(java.util.List<ListRegistryModuleVersionsResponseBodyModuleVersions> moduleVersions) {
        this.moduleVersions = moduleVersions;
        return this;
    }
    public java.util.List<ListRegistryModuleVersionsResponseBodyModuleVersions> getModuleVersions() {
        return this.moduleVersions;
    }

    public ListRegistryModuleVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegistryModuleVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegistryModuleVersionsResponseBodyModuleVersions extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-28 11:15:57</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The template name.</p>
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
         * <p>The provider type. Valid values:</p>
         * <ul>
         * <li>alicloud: Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alicloud</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The template source, in the format of namespaceName/ModuleName.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace/RegistryModule-test0e</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The source URL of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("sourceUrl")
        public String sourceUrl;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListRegistryModuleVersionsResponseBodyModuleVersions build(java.util.Map<String, ?> map) throws Exception {
            ListRegistryModuleVersionsResponseBodyModuleVersions self = new ListRegistryModuleVersionsResponseBodyModuleVersions();
            return TeaModel.build(map, self);
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public ListRegistryModuleVersionsResponseBodyModuleVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
