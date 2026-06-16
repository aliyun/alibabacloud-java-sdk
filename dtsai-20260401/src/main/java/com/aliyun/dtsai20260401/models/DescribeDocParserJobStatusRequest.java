// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDocParserJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobStatusRequest self = new DescribeDocParserJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDocParserJobStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
