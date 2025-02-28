// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterV5Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("aliUid")
    public Long aliUid;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeDbClusterV5Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterV5Request self = new DescribeDbClusterV5Request();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterV5Request setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDbClusterV5Request setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeDbClusterV5Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
