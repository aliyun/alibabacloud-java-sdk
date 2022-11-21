// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetJobLogResponseBody extends TeaModel {
    @NameInMap("ErrorLog")
    public String errorLog;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("OutputLog")
    public String outputLog;

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
