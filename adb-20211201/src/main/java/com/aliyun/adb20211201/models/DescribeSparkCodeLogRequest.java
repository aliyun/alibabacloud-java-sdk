// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeLogRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSparkCodeLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeLogRequest self = new DescribeSparkCodeLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeLogRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkCodeLogRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DescribeSparkCodeLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
