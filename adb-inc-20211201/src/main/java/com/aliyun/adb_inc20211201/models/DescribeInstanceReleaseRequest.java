// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeInstanceReleaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("InsType")
    public String insType;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeInstanceReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceReleaseRequest self = new DescribeInstanceReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceReleaseRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public DescribeInstanceReleaseRequest setInsType(String insType) {
        this.insType = insType;
        return this;
    }
    public String getInsType() {
        return this.insType;
    }

    public DescribeInstanceReleaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
