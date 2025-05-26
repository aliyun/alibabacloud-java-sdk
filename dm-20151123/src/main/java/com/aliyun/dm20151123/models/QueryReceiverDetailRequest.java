// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverDetailRequest extends TeaModel {
    /**
     * <p>Recipient address, length 0-50</p>
     * 
     * <strong>example:</strong>
     * <p>b***@example.net</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>Starting position for the next item, default: 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextStart")
    public String nextStart;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Number of items per page, default: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Recipient list ID (returned when creating a recipient list using the CreateReceiver API).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1235</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryReceiverDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverDetailRequest self = new QueryReceiverDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryReceiverDetailRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryReceiverDetailRequest setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public QueryReceiverDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryReceiverDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryReceiverDetailRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public QueryReceiverDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryReceiverDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
