// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModuleVersionsResponseBody extends TeaModel {
    @NameInMap("explorerRegistryModuleVersions")
    public java.util.List<ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions> explorerRegistryModuleVersions;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>oIM6ssGyh00noi5zoDR1hJ4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F2D40488-3F74-568B-87EC-1C04D098DF8B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListExplorerRegistryModuleVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModuleVersionsResponseBody self = new ListExplorerRegistryModuleVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModuleVersionsResponseBody setExplorerRegistryModuleVersions(java.util.List<ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions> explorerRegistryModuleVersions) {
        this.explorerRegistryModuleVersions = explorerRegistryModuleVersions;
        return this;
    }
    public java.util.List<ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions> getExplorerRegistryModuleVersions() {
        return this.explorerRegistryModuleVersions;
    }

    public ListExplorerRegistryModuleVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerRegistryModuleVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExplorerRegistryModuleVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExplorerRegistryModuleVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("moduleDetail")
        public java.util.Map<String, ?> moduleDetail;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("moduleFile")
        public java.util.Map<String, ?> moduleFile;

        /**
         * <strong>example:</strong>
         * <p>eip-slb-ecs-polardb</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>namespace-test</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <strong>example:</strong>
         * <p>test_namespace/RegistryModule-test4</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>1.5.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions build(java.util.Map<String, ?> map) throws Exception {
            ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions self = new ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions();
            return TeaModel.build(map, self);
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setModuleDetail(java.util.Map<String, ?> moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public java.util.Map<String, ?> getModuleDetail() {
            return this.moduleDetail;
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setModuleFile(java.util.Map<String, ?> moduleFile) {
            this.moduleFile = moduleFile;
            return this;
        }
        public java.util.Map<String, ?> getModuleFile() {
            return this.moduleFile;
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListExplorerRegistryModuleVersionsResponseBodyExplorerRegistryModuleVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
