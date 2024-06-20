// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-channelx-1l1hmckuu****</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    public static DescribeFabricChannelMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelMembersRequest self = new DescribeFabricChannelMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelMembersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
