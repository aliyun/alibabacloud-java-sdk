// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverByParamRequest extends TeaModel {
    /**
     * <p>Keyword, defaults to all information if not specified</p>
     * 
     * <strong>example:</strong>
     * <p>mesh-notification</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Number of items per page, default: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Delivery result. If not filled, it represents all statuses. Values:</p>
     * <ul>
     * <li>0: Success</li>
     * <li>2: Invalid address</li>
     * <li>3: Spam</li>
     * <li>4: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static QueryReceiverByParamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverByParamRequest self = new QueryReceiverByParamRequest();
        return TeaModel.build(map, self);
    }

    public QueryReceiverByParamRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryReceiverByParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryReceiverByParamRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryReceiverByParamRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryReceiverByParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryReceiverByParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryReceiverByParamRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
