// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssInfoV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("aliUid")
    public Long aliUid;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeOssInfoV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssInfoV2Request self = new DescribeOssInfoV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeOssInfoV2Request setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeOssInfoV2Request setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeOssInfoV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
