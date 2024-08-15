// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemOperationsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListProblemOperationsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListProblemOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemOperationsResponseBody self = new ListProblemOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemOperationsResponseBody setData(java.util.List<ListProblemOperationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemOperationsResponseBodyData> getData() {
        return this.data;
    }

    public ListProblemOperationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProblemOperationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProblemOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProblemOperationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProblemOperationsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PROBLEM_CANCEL</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>2021-01-23 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("problemId")
        public Long problemId;

        /**
         * <strong>example:</strong>
         * <p>这是一个故障</p>
         */
        @NameInMap("problemName")
        public String problemName;

        /**
         * <strong>example:</strong>
         * <p>P1231231</p>
         */
        @NameInMap("problemNumber")
        public String problemNumber;

        /**
         * <strong>example:</strong>
         * <p>服务名称</p>
         */
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        /**
         * <strong>example:</strong>
         * <p>{“userName”:&quot;小明&quot;}</p>
         */
        @NameInMap("snapshotData")
        public String snapshotData;

        /**
         * <strong>example:</strong>
         * <p>动态标题</p>
         */
        @NameInMap("title")
        public String title;

        public static ListProblemOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemOperationsResponseBodyData self = new ListProblemOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemOperationsResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListProblemOperationsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemOperationsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProblemOperationsResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public ListProblemOperationsResponseBodyData setProblemName(String problemName) {
            this.problemName = problemName;
            return this;
        }
        public String getProblemName() {
            return this.problemName;
        }

        public ListProblemOperationsResponseBodyData setProblemNumber(String problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }
        public String getProblemNumber() {
            return this.problemNumber;
        }

        public ListProblemOperationsResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public ListProblemOperationsResponseBodyData setSnapshotData(String snapshotData) {
            this.snapshotData = snapshotData;
            return this;
        }
        public String getSnapshotData() {
            return this.snapshotData;
        }

        public ListProblemOperationsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
