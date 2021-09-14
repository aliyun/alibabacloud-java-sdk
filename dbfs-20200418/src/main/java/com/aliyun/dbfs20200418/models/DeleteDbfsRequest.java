// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteDbfsRequest extends TeaModel {
    @NameInMap("FsId")
    public String fsId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDbfsRequest self = new DeleteDbfsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public DeleteDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
