// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeNodeToolExecutionHistoriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Histories")
    public DescribeNodeToolExecutionHistoriesResponseBodyHistories histories;

    public static DescribeNodeToolExecutionHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeToolExecutionHistoriesResponseBody self = new DescribeNodeToolExecutionHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeToolExecutionHistoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeNodeToolExecutionHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeToolExecutionHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNodeToolExecutionHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNodeToolExecutionHistoriesResponseBody setHistories(DescribeNodeToolExecutionHistoriesResponseBodyHistories histories) {
        this.histories = histories;
        return this;
    }
    public DescribeNodeToolExecutionHistoriesResponseBodyHistories getHistories() {
        return this.histories;
    }

    public static class DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory extends TeaModel {
        @NameInMap("Nodes")
        public String nodes;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("IsEnded")
        public Boolean isEnded;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Command")
        public String command;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        @NameInMap("Arguments")
        public String arguments;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        public static DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory self = new DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory();
            return TeaModel.build(map, self);
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setIsEnded(Boolean isEnded) {
            this.isEnded = isEnded;
            return this;
        }
        public Boolean getIsEnded() {
            return this.isEnded;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

    }

    public static class DescribeNodeToolExecutionHistoriesResponseBodyHistories extends TeaModel {
        @NameInMap("History")
        public java.util.List<DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory> history;

        public static DescribeNodeToolExecutionHistoriesResponseBodyHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeToolExecutionHistoriesResponseBodyHistories self = new DescribeNodeToolExecutionHistoriesResponseBodyHistories();
            return TeaModel.build(map, self);
        }

        public DescribeNodeToolExecutionHistoriesResponseBodyHistories setHistory(java.util.List<DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory> history) {
            this.history = history;
            return this;
        }
        public java.util.List<DescribeNodeToolExecutionHistoriesResponseBodyHistoriesHistory> getHistory() {
            return this.history;
        }

    }

}
