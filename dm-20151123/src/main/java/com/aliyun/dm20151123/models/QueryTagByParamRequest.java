// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTagByParamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1aTag</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryTagByParamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagByParamRequest self = new QueryTagByParamRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagByParamRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryTagByParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTagByParamRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryTagByParamRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTagByParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTagByParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
