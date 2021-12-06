// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachedEcsInstancesRequest extends TeaModel {
    @NameInMap("FsId")
    public String fsId;

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
