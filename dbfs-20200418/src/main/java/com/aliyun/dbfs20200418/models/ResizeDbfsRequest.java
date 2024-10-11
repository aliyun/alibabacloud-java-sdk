// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResizeDbfsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbfs-GOrr********Yd0VLOyBpg</p>
     */
    @NameInMap("FsId")
    public String fsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("NewSizeG")
    public Integer newSizeG;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResizeDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDbfsRequest self = new ResizeDbfsRequest();
        return TeaModel.build(map, self);
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

    public ResizeDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
