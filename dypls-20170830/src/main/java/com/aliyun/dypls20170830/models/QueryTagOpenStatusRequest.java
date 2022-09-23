// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryTagOpenStatusRequest extends TeaModel {
    @NameInMap("AttributeKey")
    public String attributeKey;

    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubAttributeKey")
    public String subAttributeKey;

    public static QueryTagOpenStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagOpenStatusRequest self = new QueryTagOpenStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagOpenStatusRequest setAttributeKey(String attributeKey) {
        this.attributeKey = attributeKey;
        return this;
    }
    public String getAttributeKey() {
        return this.attributeKey;
    }

    public QueryTagOpenStatusRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public QueryTagOpenStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTagOpenStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTagOpenStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTagOpenStatusRequest setSubAttributeKey(String subAttributeKey) {
        this.subAttributeKey = subAttributeKey;
        return this;
    }
    public String getSubAttributeKey() {
        return this.subAttributeKey;
    }

}
