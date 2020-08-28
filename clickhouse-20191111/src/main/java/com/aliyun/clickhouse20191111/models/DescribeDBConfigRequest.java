// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBConfigRequest self = new DescribeDBConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
