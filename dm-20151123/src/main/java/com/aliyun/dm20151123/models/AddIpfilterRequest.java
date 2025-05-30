// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class AddIpfilterRequest extends TeaModel {
    /**
     * <p>IP Address/IP Range/IP Segment</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.xxx
     * xxx.xxx.xxx.xxx-xxx.xxx.xxx.xxx
     * xxx.xxx.xxx.xxx/xxx</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddIpfilterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpfilterRequest self = new AddIpfilterRequest();
        return TeaModel.build(map, self);
    }

    public AddIpfilterRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AddIpfilterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddIpfilterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddIpfilterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
