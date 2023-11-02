// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestHistogramRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomizeRuleTestHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleTestHistogramRequest self = new DescribeCustomizeRuleTestHistogramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleTestHistogramRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeCustomizeRuleTestHistogramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
