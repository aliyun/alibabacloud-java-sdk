// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetJobLogRequest extends TeaModel {
    /**
     * <p>The maximum size of logs that you can read in a single request.</p>
     * <br>
     * <p>Unit: bits</p>
     * <br>
     * <p>Default value: 1024</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("ExecHost")
    public String execHost;

    /**
     * <p>The position where logs start to be read.</p>
     * <br>
     * <p>Unit: bits</p>
     * <br>
     * <p>Default value: 0</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The content of the output logs. The content is encoded in Base64.</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>The ID of the job.</p>
     */
    @NameInMap("Size")
    public Integer size;

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

    public GetJobLogRequest setExecHost(String execHost) {
        this.execHost = execHost;
        return this;
    }
    public String getExecHost() {
        return this.execHost;
    }

    public GetJobLogRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobLogRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetJobLogRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
