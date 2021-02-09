// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescirbeWorkflowResponseBody extends TeaModel {
    // 工作流创建时间。
    @NameInMap("create_time")
    public String createTime;

    // 工作流经过时长。
    @NameInMap("duration")
    public String duration;

    // 任务结束时间。
    @NameInMap("finish_time")
    public String finishTime;

    // 输入数据大小。
    @NameInMap("input_data_size")
    public String inputDataSize;

    // 工作流名称。
    @NameInMap("job_name")
    public String jobName;

    // 工作流所在命名空间。
    @NameInMap("job_namespace")
    public String jobNamespace;

    // 输出数据大小。
    @NameInMap("output_data_size")
    public String outputDataSize;

    // 工作流当前状态。
    @NameInMap("status")
    public String status;

    // 碱基对个数。
    @NameInMap("total_bases")
    public String totalBases;

    // Reads个数。
    @NameInMap("total_reads")
    public String totalReads;

    // 用户输入参数。
    @NameInMap("user_input_data")
    public String userInputData;

    public static DescirbeWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescirbeWorkflowResponseBody self = new DescirbeWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescirbeWorkflowResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescirbeWorkflowResponseBody setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public DescirbeWorkflowResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public DescirbeWorkflowResponseBody setInputDataSize(String inputDataSize) {
        this.inputDataSize = inputDataSize;
        return this;
    }
    public String getInputDataSize() {
        return this.inputDataSize;
    }

    public DescirbeWorkflowResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescirbeWorkflowResponseBody setJobNamespace(String jobNamespace) {
        this.jobNamespace = jobNamespace;
        return this;
    }
    public String getJobNamespace() {
        return this.jobNamespace;
    }

    public DescirbeWorkflowResponseBody setOutputDataSize(String outputDataSize) {
        this.outputDataSize = outputDataSize;
        return this;
    }
    public String getOutputDataSize() {
        return this.outputDataSize;
    }

    public DescirbeWorkflowResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescirbeWorkflowResponseBody setTotalBases(String totalBases) {
        this.totalBases = totalBases;
        return this;
    }
    public String getTotalBases() {
        return this.totalBases;
    }

    public DescirbeWorkflowResponseBody setTotalReads(String totalReads) {
        this.totalReads = totalReads;
        return this;
    }
    public String getTotalReads() {
        return this.totalReads;
    }

    public DescirbeWorkflowResponseBody setUserInputData(String userInputData) {
        this.userInputData = userInputData;
        return this;
    }
    public String getUserInputData() {
        return this.userInputData;
    }

}
