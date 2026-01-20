// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeEndpointsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc-*****-clickhouse</p>
     */
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-xxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsRequest self = new DescribeEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public DescribeEndpointsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
