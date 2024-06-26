// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeEndorsePolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodeName")
    public String chaincodeName;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricChaincodeEndorsePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeEndorsePolicyRequest self = new DescribeFabricChaincodeEndorsePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeEndorsePolicyRequest setChaincodeName(String chaincodeName) {
        this.chaincodeName = chaincodeName;
        return this;
    }
    public String getChaincodeName() {
        return this.chaincodeName;
    }

    public DescribeFabricChaincodeEndorsePolicyRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeFabricChaincodeEndorsePolicyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
