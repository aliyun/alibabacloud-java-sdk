// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricManagementChaincodesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricManagementChaincodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricManagementChaincodesRequest self = new DescribeFabricManagementChaincodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricManagementChaincodesRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeFabricManagementChaincodesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
