// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobResultRequest extends TeaModel {
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

    public static DescribeDocParserJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobResultRequest self = new DescribeDocParserJobResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeDocParserJobResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
