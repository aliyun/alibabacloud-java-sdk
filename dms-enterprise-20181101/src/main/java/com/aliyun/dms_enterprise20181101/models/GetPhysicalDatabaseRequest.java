// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

    public static GetPhysicalDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalDatabaseRequest self = new GetPhysicalDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetPhysicalDatabaseRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public GetPhysicalDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPhysicalDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
