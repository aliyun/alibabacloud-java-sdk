// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeNodeToolExecutionHistoryResponseBody extends TeaModel {
    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsEnded")
    public Boolean isEnded;

    @NameInMap("Command")
    public String command;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Arguments")
    public String arguments;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Result")
    public String result;

    public static DescribeNodeToolExecutionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeToolExecutionHistoryResponseBody self = new DescribeNodeToolExecutionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeToolExecutionHistoryResponseBody setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setIsEnded(Boolean isEnded) {
        this.isEnded = isEnded;
        return this;
    }
    public Boolean getIsEnded() {
        return this.isEnded;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeNodeToolExecutionHistoryResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
