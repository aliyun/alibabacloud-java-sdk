// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsJobDetailRequest extends TeaModel {
    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-******</p>
     */
    @NameInMap("ApsJobId")
    public String apsJobId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApsJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsJobDetailRequest self = new DescribeApsJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApsJobDetailRequest setApsJobId(String apsJobId) {
        this.apsJobId = apsJobId;
        return this;
    }
    public String getApsJobId() {
        return this.apsJobId;
    }

    public DescribeApsJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
