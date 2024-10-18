// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetJobLogResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1.manager</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error output log that is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>aG9zdG5hbWU=</p>
     */
    @NameInMap("StderrLog")
    public String stderrLog;

    /**
     * <p>The size of the error output file.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StderrLogSize")
    public String stderrLogSize;

    /**
     * <p>The standard output log that is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>aG9zdG5hbWU=</p>
     */
    @NameInMap("StdoutLog")
    public String stdoutLog;

    /**
     * <p>The size of the standard output file.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("StdoutLogSize")
    public String stdoutLogSize;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogResponseBody self = new GetJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobLogResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobLogResponseBody setStderrLog(String stderrLog) {
        this.stderrLog = stderrLog;
        return this;
    }
    public String getStderrLog() {
        return this.stderrLog;
    }

    public GetJobLogResponseBody setStderrLogSize(String stderrLogSize) {
        this.stderrLogSize = stderrLogSize;
        return this;
    }
    public String getStderrLogSize() {
        return this.stderrLogSize;
    }

    public GetJobLogResponseBody setStdoutLog(String stdoutLog) {
        this.stdoutLog = stdoutLog;
        return this;
    }
    public String getStdoutLog() {
        return this.stdoutLog;
    }

    public GetJobLogResponseBody setStdoutLogSize(String stdoutLogSize) {
        this.stdoutLogSize = stdoutLogSize;
        return this;
    }
    public String getStdoutLogSize() {
        return this.stdoutLogSize;
    }

    public GetJobLogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
