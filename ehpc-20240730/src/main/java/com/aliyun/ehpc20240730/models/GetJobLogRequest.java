// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetJobLogRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.manager</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li>stdout: standard output logs.</li>
     * <li>stderr: error output logs.</li>
     * <li>all: all logs.</li>
     * </ul>
     * <p>Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>stdout</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The position where logs start to be read.</p>
     * <p>Unit: bytes.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>The maximum size of logs that you can read in a single request.</p>
     * <p>Unit: bytes.</p>
     * <p>Default value: 10240.</p>
     * 
     * <strong>example:</strong>
     * <p>20480</p>
     */
    @NameInMap("Size")
    public String size;

    public static GetJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogRequest self = new GetJobLogRequest();
        return TeaModel.build(map, self);
    }

    public GetJobLogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetJobLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobLogRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public GetJobLogRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public GetJobLogRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
