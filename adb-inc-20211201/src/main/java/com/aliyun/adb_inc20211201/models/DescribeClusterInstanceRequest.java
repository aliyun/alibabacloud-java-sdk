// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("InsType")
    public String insType;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeClusterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInstanceRequest self = new DescribeClusterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInstanceRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public DescribeClusterInstanceRequest setInsType(String insType) {
        this.insType = insType;
        return this;
    }
    public String getInsType() {
        return this.insType;
    }

    public DescribeClusterInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
