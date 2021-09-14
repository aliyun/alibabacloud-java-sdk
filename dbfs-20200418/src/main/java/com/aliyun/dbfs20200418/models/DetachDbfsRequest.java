// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DetachDbfsRequest extends TeaModel {
    @NameInMap("FsId")
    public String fsId;

    @NameInMap("ECSInstanceId")
    public String ECSInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DetachDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDbfsRequest self = new DetachDbfsRequest();
        return TeaModel.build(map, self);
    }

    public DetachDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public DetachDbfsRequest setECSInstanceId(String ECSInstanceId) {
        this.ECSInstanceId = ECSInstanceId;
        return this;
    }
    public String getECSInstanceId() {
        return this.ECSInstanceId;
    }

    public DetachDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
