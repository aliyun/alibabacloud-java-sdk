// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTemplateByParamRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("FromType")
    public Integer fromType;

    /**
     * <p>The keyword of the template name. By default, a paged query is performed for all templates.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is deprecated. It is retained for historical compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static QueryTemplateByParamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateByParamRequest self = new QueryTemplateByParamRequest();
        return TeaModel.build(map, self);
    }

    public QueryTemplateByParamRequest setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }
    public Integer getFromType() {
        return this.fromType;
    }

    public QueryTemplateByParamRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryTemplateByParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTemplateByParamRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryTemplateByParamRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTemplateByParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTemplateByParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTemplateByParamRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
