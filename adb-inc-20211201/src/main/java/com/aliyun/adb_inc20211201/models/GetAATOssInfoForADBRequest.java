// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetAATOssInfoForADBRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("PolarDBInstanceId")
    public String polarDBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAATOssInfoForADBRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAATOssInfoForADBRequest self = new GetAATOssInfoForADBRequest();
        return TeaModel.build(map, self);
    }

    public GetAATOssInfoForADBRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAATOssInfoForADBRequest setPolarDBInstanceId(String polarDBInstanceId) {
        this.polarDBInstanceId = polarDBInstanceId;
        return this;
    }
    public String getPolarDBInstanceId() {
        return this.polarDBInstanceId;
    }

    public GetAATOssInfoForADBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
