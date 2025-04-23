// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetJobLogResponseBody extends TeaModel {
    /**
     * <p>The content of the error logs. The content is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>c2xlZXAgMzA=</p>
     */
    @NameInMap("ErrorLog")
    public String errorLog;

    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>1.scheduler****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The content of the output logs. The content is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>c2xlZXAgMzA=</p>
     */
    @NameInMap("OutputLog")
    public String outputLog;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogResponseBody self = new GetJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobLogResponseBody setErrorLog(String errorLog) {
        this.errorLog = errorLog;
        return this;
    }
    public String getErrorLog() {
        return this.errorLog;
    }

    public GetJobLogResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobLogResponseBody setOutputLog(String outputLog) {
        this.outputLog = outputLog;
        return this;
    }
    public String getOutputLog() {
        return this.outputLog;
    }

    public GetJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
