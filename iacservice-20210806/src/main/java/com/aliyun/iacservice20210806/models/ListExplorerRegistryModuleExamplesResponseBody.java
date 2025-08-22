// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModuleExamplesResponseBody extends TeaModel {
    @NameInMap("explorerRegistryModuleExamples")
    public java.util.List<ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples> explorerRegistryModuleExamples;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>VSjwD+sJ8OZJ8fNjV89AZs7o2AdSD25ZQLeWZ8REjXA=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>BA8F6459-EED6-556B-8130-D150A3866E56</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListExplorerRegistryModuleExamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModuleExamplesResponseBody self = new ListExplorerRegistryModuleExamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModuleExamplesResponseBody setExplorerRegistryModuleExamples(java.util.List<ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples> explorerRegistryModuleExamples) {
        this.explorerRegistryModuleExamples = explorerRegistryModuleExamples;
        return this;
    }
    public java.util.List<ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples> getExplorerRegistryModuleExamples() {
        return this.explorerRegistryModuleExamples;
    }

    public ListExplorerRegistryModuleExamplesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerRegistryModuleExamplesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExplorerRegistryModuleExamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExplorerRegistryModuleExamplesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>201-use-case-create-actiontrail-trail</p>
         */
        @NameInMap("exampleName")
        public String exampleName;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("examplePath")
        public String examplePath;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("exampleSchema")
        public java.util.Map<String, ?> exampleSchema;

        /**
         * <strong>example:</strong>
         * <p>iactestname1</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>1.11.0</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        @NameInMap("namespaceName")
        public String namespaceName;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        public static ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples build(java.util.Map<String, ?> map) throws Exception {
            ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples self = new ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples();
            return TeaModel.build(map, self);
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setExampleName(String exampleName) {
            this.exampleName = exampleName;
            return this;
        }
        public String getExampleName() {
            return this.exampleName;
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setExamplePath(String examplePath) {
            this.examplePath = examplePath;
            return this;
        }
        public String getExamplePath() {
            return this.examplePath;
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setExampleSchema(java.util.Map<String, ?> exampleSchema) {
            this.exampleSchema = exampleSchema;
            return this;
        }
        public java.util.Map<String, ?> getExampleSchema() {
            return this.exampleSchema;
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListExplorerRegistryModuleExamplesResponseBodyExplorerRegistryModuleExamples setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
