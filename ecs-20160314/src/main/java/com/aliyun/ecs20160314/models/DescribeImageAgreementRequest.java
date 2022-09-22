// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeImageAgreementRequest extends TeaModel {
    @NameInMap("AgreementType")
    public String agreementType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeImageAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageAgreementRequest self = new DescribeImageAgreementRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageAgreementRequest setAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }
    public String getAgreementType() {
        return this.agreementType;
    }

    public DescribeImageAgreementRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageAgreementRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImageAgreementRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
