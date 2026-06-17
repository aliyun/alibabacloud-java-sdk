// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingJobRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp10g78o9807yv9h3</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JobId")
    public Integer jobId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
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
