// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeVerifySchemeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SchemeCode")
    public String schemeCode;

    @NameInMap("CustomerId")
    public Long customerId;

    public static DescribeVerifySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySchemeRequest self = new DescribeVerifySchemeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySchemeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVerifySchemeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVerifySchemeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVerifySchemeRequest setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
        return this;
    }
    public String getSchemeCode() {
        return this.schemeCode;
    }

    public DescribeVerifySchemeRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

}
