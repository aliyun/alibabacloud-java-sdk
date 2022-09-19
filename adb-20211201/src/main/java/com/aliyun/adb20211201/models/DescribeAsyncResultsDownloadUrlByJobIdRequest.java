// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncResultsDownloadUrlByJobIdRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAsyncResultsDownloadUrlByJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncResultsDownloadUrlByJobIdRequest self = new DescribeAsyncResultsDownloadUrlByJobIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncResultsDownloadUrlByJobIdRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeAsyncResultsDownloadUrlByJobIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
