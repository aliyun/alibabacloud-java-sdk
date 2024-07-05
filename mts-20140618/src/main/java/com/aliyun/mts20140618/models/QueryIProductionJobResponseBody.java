// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ImageCartoonize</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <strong>example:</strong>
     * <p>oss://example-****.oss-cn-hangzhou.aliyuncs.com/example.mp4</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>88c6ca184c0e432bbf5b665e2a15****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>{mode:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <strong>example:</strong>
     * <p>oss://example-****.oss-cn-hangzhou.aliyuncs.com/iproduction/{source}-{timestamp}-{sequenceId}.srt</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <strong>example:</strong>
     * <p>D127C68E-F1A1-4CE5-A874-8FF724881A12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Code&quot;:&quot;Success&quot;,&quot;Data&quot;:&quot;{\&quot;result\&quot;:[{\&quot;file\&quot;:\&quot;iproduction/test-result.jpg\&quot;},{\&quot;file\&quot;:\&quot;iproduction/test-origin.jpg\&quot;}]}&quot;,&quot;Message&quot;:&quot;Successful.&quot;}</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
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
