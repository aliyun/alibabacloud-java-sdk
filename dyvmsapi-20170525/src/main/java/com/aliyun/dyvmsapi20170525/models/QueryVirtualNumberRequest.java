// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The service name. Default value: **dyvms**.</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The route type. Valid values:</p>
     * <br>
     * <p>*   **0**: number location first.</p>
     * <p>*   **1**: random.</p>
     */
    @NameInMap("RouteType")
    public Integer routeType;

    public static QueryVirtualNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVirtualNumberRequest self = new QueryVirtualNumberRequest();
        return TeaModel.build(map, self);
    }

    public QueryVirtualNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryVirtualNumberRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryVirtualNumberRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryVirtualNumberRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryVirtualNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryVirtualNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryVirtualNumberRequest setRouteType(Integer routeType) {
        this.routeType = routeType;
        return this;
    }
    public Integer getRouteType() {
        return this.routeType;
    }

}
