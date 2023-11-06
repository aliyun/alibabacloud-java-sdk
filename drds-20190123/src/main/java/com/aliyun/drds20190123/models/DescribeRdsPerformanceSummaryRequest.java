// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsPerformanceSummaryRequest extends TeaModel {
    /**
     * <p>The ID of a DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RdsInstanceId")
    public java.util.List<String> rdsInstanceId;

    /**
     * <p>The ID of the region where the streaming domain resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRdsPerformanceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsPerformanceSummaryRequest self = new DescribeRdsPerformanceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsPerformanceSummaryRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRdsPerformanceSummaryRequest setRdsInstanceId(java.util.List<String> rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }
    public java.util.List<String> getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    public DescribeRdsPerformanceSummaryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
