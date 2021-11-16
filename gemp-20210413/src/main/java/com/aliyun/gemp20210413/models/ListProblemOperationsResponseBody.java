// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemOperationsResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListProblemOperationsResponseBodyData> data;

    // 页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 行
    @NameInMap("pageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 总数
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
        // 升级    PROBLEM_UPGRADE      撤销     PROBLEM_REVOKE      恢复     PROBLEM_RESTORE       复盘     PROBLEM_IN_REVIEW       完结     PROBLEM_REOPENED       取消     PROBLEM_CANCEL       更新故障通告     PROBLEM_UPDATE_NOTIFY       添加故障小计     PROBLEM_ADD_SUBTOTAL       更新故障     PROBLEM_UPDATE
        @NameInMap("action")
        public String action;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 描述
        @NameInMap("description")
        public String description;

        // 故障Id
        @NameInMap("problemId")
        public Long problemId;

        // 故障名称
        @NameInMap("problemName")
        public String problemName;

        // 故障编号
        @NameInMap("problemNumber")
        public String problemNumber;

        // 服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 快照数据
        @NameInMap("snapshotData")
        public String snapshotData;

        // 动态标题
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
