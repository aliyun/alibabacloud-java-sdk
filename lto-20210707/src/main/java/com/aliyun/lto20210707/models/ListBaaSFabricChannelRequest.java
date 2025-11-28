// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaaSFabricConsortiumId")
    public String baaSFabricConsortiumId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListBaaSFabricChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricChannelRequest self = new ListBaaSFabricChannelRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricChannelRequest setBaaSFabricConsortiumId(String baaSFabricConsortiumId) {
        this.baaSFabricConsortiumId = baaSFabricConsortiumId;
        return this;
    }
    public String getBaaSFabricConsortiumId() {
        return this.baaSFabricConsortiumId;
    }

    public ListBaaSFabricChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
