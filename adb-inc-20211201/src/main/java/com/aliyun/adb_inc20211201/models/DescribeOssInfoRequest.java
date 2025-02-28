// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeOssInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssInfoRequest self = new DescribeOssInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeOssInfoRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public DescribeOssInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
