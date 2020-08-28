// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("AutoSnapshotTasks")
    @Validation(required = true)
    public DescribeAutoSnapshotTasksResponseAutoSnapshotTasks autoSnapshotTasks;

    public static DescribeAutoSnapshotTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotTasksResponse self = new DescribeAutoSnapshotTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoSnapshotTasksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoSnapshotTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotTasksResponse setAutoSnapshotTasks(DescribeAutoSnapshotTasksResponseAutoSnapshotTasks autoSnapshotTasks) {
        this.autoSnapshotTasks = autoSnapshotTasks;
        return this;
    }
    public DescribeAutoSnapshotTasksResponseAutoSnapshotTasks getAutoSnapshotTasks() {
        return this.autoSnapshotTasks;
    }

    public static class DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask extends TeaModel {
        @NameInMap("SourceFileSystemId")
        @Validation(required = true)
        public String sourceFileSystemId;

        @NameInMap("AutoSnapshotPolicyId")
        @Validation(required = true)
        public String autoSnapshotPolicyId;

        public static DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask self = new DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask setSourceFileSystemId(String sourceFileSystemId) {
            this.sourceFileSystemId = sourceFileSystemId;
            return this;
        }
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
        }

        public DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

    }

    public static class DescribeAutoSnapshotTasksResponseAutoSnapshotTasks extends TeaModel {
        @NameInMap("AutoSnapshotTask")
        @Validation(required = true)
        public java.util.List<DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask> autoSnapshotTask;

        public static DescribeAutoSnapshotTasksResponseAutoSnapshotTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotTasksResponseAutoSnapshotTasks self = new DescribeAutoSnapshotTasksResponseAutoSnapshotTasks();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotTasksResponseAutoSnapshotTasks setAutoSnapshotTask(java.util.List<DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask> autoSnapshotTask) {
            this.autoSnapshotTask = autoSnapshotTask;
            return this;
        }
        public java.util.List<DescribeAutoSnapshotTasksResponseAutoSnapshotTasksAutoSnapshotTask> getAutoSnapshotTask() {
            return this.autoSnapshotTask;
        }

    }

}
