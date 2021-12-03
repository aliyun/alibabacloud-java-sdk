// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeEmptyNumberDetectRequest extends TeaModel {
    @NameInMap("EncryptType")
    public String encryptType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeEmptyNumberDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmptyNumberDetectRequest self = new DescribeEmptyNumberDetectRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEmptyNumberDetectRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public DescribeEmptyNumberDetectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEmptyNumberDetectRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public DescribeEmptyNumberDetectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEmptyNumberDetectRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
