// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetDbfsRequest extends TeaModel {
    @NameInMap("FsId")
    public String fsId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsRequest self = new GetDbfsRequest();
        return TeaModel.build(map, self);
    }

    public GetDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public GetDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
