// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachedEcsInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbfs-nUy1tb********BQ4X8Gpw</p>
     */
    @NameInMap("FsId")
    public String fsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListDbfsAttachedEcsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachedEcsInstancesRequest self = new ListDbfsAttachedEcsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachedEcsInstancesRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public ListDbfsAttachedEcsInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
