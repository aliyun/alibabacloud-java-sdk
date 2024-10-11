// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class RenameDbfsRequest extends TeaModel {
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
     * <p>NewDbfsName</p>
     */
    @NameInMap("FsName")
    public String fsName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RenameDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameDbfsRequest self = new RenameDbfsRequest();
        return TeaModel.build(map, self);
    }

    public RenameDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public RenameDbfsRequest setFsName(String fsName) {
        this.fsName = fsName;
        return this;
    }
    public String getFsName() {
        return this.fsName;
    }

    public RenameDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
