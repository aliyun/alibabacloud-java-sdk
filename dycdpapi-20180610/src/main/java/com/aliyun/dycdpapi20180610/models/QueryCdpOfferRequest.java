// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOfferRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("Province")
    public String province;

    public static QueryCdpOfferRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOfferRequest self = new QueryCdpOfferRequest();
        return TeaModel.build(map, self);
    }

    public QueryCdpOfferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCdpOfferRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCdpOfferRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCdpOfferRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public QueryCdpOfferRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public QueryCdpOfferRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
