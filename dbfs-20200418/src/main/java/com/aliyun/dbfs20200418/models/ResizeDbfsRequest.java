// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResizeDbfsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FsId")
    public String fsId;

    @NameInMap("NewSizeG")
    public Integer newSizeG;

    public static ResizeDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDbfsRequest self = new ResizeDbfsRequest();
        return TeaModel.build(map, self);
    }

    public ResizeDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public ResizeDbfsRequest setNewSizeG(Integer newSizeG) {
        this.newSizeG = newSizeG;
        return this;
    }
    public Integer getNewSizeG() {
        return this.newSizeG;
    }

}
