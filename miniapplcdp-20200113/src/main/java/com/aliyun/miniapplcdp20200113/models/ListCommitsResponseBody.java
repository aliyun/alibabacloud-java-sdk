// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListCommitsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListCommitsResponseBodyData data;

    public static ListCommitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommitsResponseBody self = new ListCommitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommitsResponseBody setData(ListCommitsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCommitsResponseBodyData getData() {
        return this.data;
    }

    public static class ListCommitsResponseBodyDataItems extends TeaModel {
        @NameInMap("CommitType")
        public String commitType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RollbackToCommitId")
        public String rollbackToCommitId;

        @NameInMap("CommitLog")
        public String commitLog;

        public static ListCommitsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListCommitsResponseBodyDataItems self = new ListCommitsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListCommitsResponseBodyDataItems setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public ListCommitsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListCommitsResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListCommitsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCommitsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCommitsResponseBodyDataItems setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public ListCommitsResponseBodyDataItems setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

    }

    public static class ListCommitsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<ListCommitsResponseBodyDataItems> items;

        public static ListCommitsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCommitsResponseBodyData self = new ListCommitsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCommitsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCommitsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCommitsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListCommitsResponseBodyData setItems(java.util.List<ListCommitsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListCommitsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
