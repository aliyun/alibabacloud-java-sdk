// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeOutputRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSparkCodeOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeOutputRequest self = new DescribeSparkCodeOutputRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeOutputRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkCodeOutputRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DescribeSparkCodeOutputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
