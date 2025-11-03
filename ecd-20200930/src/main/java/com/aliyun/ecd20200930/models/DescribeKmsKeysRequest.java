// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysRequest extends TeaModel {
    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKmsKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysRequest self = new DescribeKmsKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
