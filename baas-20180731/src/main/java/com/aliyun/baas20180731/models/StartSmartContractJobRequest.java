// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class StartSmartContractJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("SourceOpt")
    public String sourceOpt;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static StartSmartContractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSmartContractJobRequest self = new StartSmartContractJobRequest();
        return TeaModel.build(map, self);
    }

    public StartSmartContractJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StartSmartContractJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public StartSmartContractJobRequest setSourceOpt(String sourceOpt) {
        this.sourceOpt = sourceOpt;
        return this;
    }
    public String getSourceOpt() {
        return this.sourceOpt;
    }

    public StartSmartContractJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
