// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeFlowlogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("FlowLogs")
    public java.util.List<DescribeFlowlogsResponseBodyFlowLogs> flowLogs;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("Success")
    public String success;

    public static DescribeFlowlogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowlogsResponseBody self = new DescribeFlowlogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowlogsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeFlowlogsResponseBody setFlowLogs(java.util.List<DescribeFlowlogsResponseBodyFlowLogs> flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }
    public java.util.List<DescribeFlowlogsResponseBodyFlowLogs> getFlowLogs() {
        return this.flowLogs;
    }

    public DescribeFlowlogsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowlogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowlogsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowlogsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeFlowlogsResponseBodyFlowLogs extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FlowLogName")
        public String flowLogName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("LogStoreName")
        public String logStoreName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FlowLogId")
        public String flowLogId;

        public static DescribeFlowlogsResponseBodyFlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowlogsResponseBodyFlowLogs self = new DescribeFlowlogsResponseBodyFlowLogs();
            return TeaModel.build(map, self);
        }

        public DescribeFlowlogsResponseBodyFlowLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setFlowLogName(String flowLogName) {
            this.flowLogName = flowLogName;
            return this;
        }
        public String getFlowLogName() {
            return this.flowLogName;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFlowlogsResponseBodyFlowLogs setFlowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public String getFlowLogId() {
            return this.flowLogId;
        }

    }

}
