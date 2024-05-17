// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopClustersInSameNetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeHadoopClustersInSameNetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopClustersInSameNetRequest self = new DescribeHadoopClustersInSameNetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopClustersInSameNetRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeHadoopClustersInSameNetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
