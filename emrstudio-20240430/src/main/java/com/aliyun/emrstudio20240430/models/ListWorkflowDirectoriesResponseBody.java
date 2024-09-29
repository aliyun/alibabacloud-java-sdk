// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListWorkflowDirectoriesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListWorkflowDirectoriesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListWorkflowDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowDirectoriesResponseBody self = new ListWorkflowDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowDirectoriesResponseBody setData(java.util.List<ListWorkflowDirectoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkflowDirectoriesResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkflowDirectoriesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowDirectoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkflowDirectoriesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wd-y98v7non5dx****</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <strong>example:</strong>
         * <p>目录名称。</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>wd-y98v7non5dx****</p>
         */
        @NameInMap("parentDirectoryId")
        public String parentDirectoryId;

        /**
         * <strong>example:</strong>
         * <p>p-v7n28j0m4ol****</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>w-lxyy60mpgpg****</p>
         */
        @NameInMap("workflowId")
        public String workflowId;

        public static ListWorkflowDirectoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowDirectoriesResponseBodyData self = new ListWorkflowDirectoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowDirectoriesResponseBodyData setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListWorkflowDirectoriesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowDirectoriesResponseBodyData setParentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public String getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public ListWorkflowDirectoriesResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListWorkflowDirectoriesResponseBodyData setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
