// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public Integer jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteStreamingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingJobRequest self = new DeleteStreamingJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingJobRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteStreamingJobRequest setJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }
    public Integer getJobId() {
        return this.jobId;
    }

    public DeleteStreamingJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
