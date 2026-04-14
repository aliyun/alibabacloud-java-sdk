// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTaskByParamRequest extends TeaModel {
    /**
     * <p>Keyword, defaults to all information</p>
     * 
     * <strong>example:</strong>
     * <p>mesh-notification-788717</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Current page number, default is 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size, default is 10</p>
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
     * <p>Status, defaults to all statuses</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static QueryTaskByParamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskByParamRequest self = new QueryTaskByParamRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskByParamRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryTaskByParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTaskByParamRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryTaskByParamRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskByParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTaskByParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTaskByParamRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
