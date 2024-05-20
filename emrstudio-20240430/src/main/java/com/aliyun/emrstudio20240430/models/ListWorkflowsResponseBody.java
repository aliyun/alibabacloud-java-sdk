// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListWorkflowsResponseBodyData> data;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("parentDirectoryId")
        public String parentDirectoryId;

        @NameInMap("updateTime")
        public String updateTime;

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
