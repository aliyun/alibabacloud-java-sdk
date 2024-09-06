// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListWorkflowsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>123abc****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListWorkflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowsResponseBody self = new ListWorkflowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowsResponseBody setData(java.util.List<ListWorkflowsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkflowsResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkflowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListWorkflowsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>workflow description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>workflow_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>wd-3q9jo749ne5****</p>
         */
        @NameInMap("parentDirectoryId")
        public String parentDirectoryId;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>w-3q9jo749ne5****</p>
         */
        @NameInMap("workflowId")
        public String workflowId;

        public static ListWorkflowsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyData self = new ListWorkflowsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkflowsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowsResponseBodyData setParentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public String getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public ListWorkflowsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListWorkflowsResponseBodyData setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
