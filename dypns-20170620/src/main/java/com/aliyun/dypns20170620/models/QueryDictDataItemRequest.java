// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryDictDataItemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClassifyItemCode")
    public String classifyItemCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryDictDataItemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDictDataItemRequest self = new QueryDictDataItemRequest();
        return TeaModel.build(map, self);
    }

    public QueryDictDataItemRequest setClassifyItemCode(String classifyItemCode) {
        this.classifyItemCode = classifyItemCode;
        return this;
    }
    public String getClassifyItemCode() {
        return this.classifyItemCode;
    }

    public QueryDictDataItemRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryDictDataItemRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryDictDataItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
