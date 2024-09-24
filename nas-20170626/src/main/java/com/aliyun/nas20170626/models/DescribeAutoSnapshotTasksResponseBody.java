// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotTasksResponseBody extends TeaModel {
    /**
     * <p>The queried automatic snapshot tasks.</p>
     */
    @NameInMap("AutoSnapshotTasks")
    public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks autoSnapshotTasks;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of automatic snapshot tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAutoSnapshotTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotTasksResponseBody self = new DescribeAutoSnapshotTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotTasksResponseBody setAutoSnapshotTasks(DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks autoSnapshotTasks) {
        this.autoSnapshotTasks = autoSnapshotTasks;
        return this;
    }
    public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasks getAutoSnapshotTasks() {
        return this.autoSnapshotTasks;
    }

    public DescribeAutoSnapshotTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoSnapshotTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-extreme-233e6****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-233e6****</p>
         */
        @NameInMap("SourceFileSystemId")
        public String sourceFileSystemId;

        public static DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask self = new DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeAutoSnapshotTasksResponseBodyAutoSnapshotTasksAutoSnapshotTask setSourceFileSystemId(String sourceFileSystemId) {
            this.sourceFileSystemId = sourceFileSystemId;
            return this;
        }
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
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
