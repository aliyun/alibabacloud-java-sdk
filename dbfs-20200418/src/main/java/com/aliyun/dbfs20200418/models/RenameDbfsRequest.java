// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class RenameDbfsRequest extends TeaModel {
    @NameInMap("FsName")
    public String fsName;

    @NameInMap("FsId")
    public String fsId;

    @NameInMap("RegionId")
    public String regionId;

    public static RenameDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameDbfsRequest self = new RenameDbfsRequest();
        return TeaModel.build(map, self);
    }

    public RenameDbfsRequest setFsName(String fsName) {
        this.fsName = fsName;
        return this;
    }
    public String getFsName() {
        return this.fsName;
    }

    public RenameDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public RenameDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
