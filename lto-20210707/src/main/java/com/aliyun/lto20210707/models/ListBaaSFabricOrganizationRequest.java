// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricOrganizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaaSFabricChannelId")
    public String baaSFabricChannelId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListBaaSFabricOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricOrganizationRequest self = new ListBaaSFabricOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricOrganizationRequest setBaaSFabricChannelId(String baaSFabricChannelId) {
        this.baaSFabricChannelId = baaSFabricChannelId;
        return this;
    }
    public String getBaaSFabricChannelId() {
        return this.baaSFabricChannelId;
    }

    public ListBaaSFabricOrganizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
