// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponseBody extends TeaModel {
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("Input")
    public String input;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("Output")
    public String output;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("State")
    public String state;

    @NameInMap("UserData")
    public String userData;

    public static QueryIProductionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobResponseBody self = new QueryIProductionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public QueryIProductionJobResponseBody setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public QueryIProductionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryIProductionJobResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public QueryIProductionJobResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public QueryIProductionJobResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public QueryIProductionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIProductionJobResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryIProductionJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryIProductionJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
