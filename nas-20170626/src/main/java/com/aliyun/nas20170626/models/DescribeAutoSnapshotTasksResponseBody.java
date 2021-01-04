// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotTasksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("AutoSnapshotTasks")
    public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks autoSnapshotTasks;

    public static DescribeAutoSnapshotTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotTasksResponseBody self = new DescribeAutoSnapshotTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoSnapshotTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoSnapshotTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotTasksResponseBody setAutoSnapshotTasks(DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks autoSnapshotTasks) {
        this.autoSnapshotTasks = autoSnapshotTasks;
        return this;
    }
    public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks getAutoSnapshotTasks() {
        return this.autoSnapshotTasks;
    }

    public static class DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask extends TeaModel {
        @NameInMap("SourceFileSystemId")
        public String sourceFileSystemId;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        public static DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask self = new DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask setSourceFileSystemId(String sourceFileSystemId) {
            this.sourceFileSystemId = sourceFileSystemId;
            return this;
        }
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
        }

        public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

    }

    public static class DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks extends TeaModel {
        @NameInMap("AutoSnapshotTask")
        public java.util.List<DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask> autoSnapshotTask;

        public static DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks self = new DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks setAutoSnapshotTask(java.util.List<DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask> autoSnapshotTask) {
            this.autoSnapshotTask = autoSnapshotTask;
            return this;
        }
        public java.util.List<DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask> getAutoSnapshotTask() {
            return this.autoSnapshotTask;
        }

    }

}
