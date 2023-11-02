// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeJobStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubmitId")
    public String submitId;

    public static DescribeJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobStatusRequest self = new DescribeJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeJobStatusRequest setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

}
