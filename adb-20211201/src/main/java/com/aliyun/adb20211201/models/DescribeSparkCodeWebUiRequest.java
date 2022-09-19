// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeWebUiRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSparkCodeWebUiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeWebUiRequest self = new DescribeSparkCodeWebUiRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeWebUiRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkCodeWebUiRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DescribeSparkCodeWebUiRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
