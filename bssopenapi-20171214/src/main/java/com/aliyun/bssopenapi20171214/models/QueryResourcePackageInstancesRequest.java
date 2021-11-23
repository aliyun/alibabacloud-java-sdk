// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResourcePackageInstancesRequest extends TeaModel {
    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    @NameInMap("IncludePartner")
    public Boolean includePartner;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    public static QueryResourcePackageInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePackageInstancesRequest self = new QueryResourcePackageInstancesRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourcePackageInstancesRequest setExpiryTimeEnd(String expiryTimeEnd) {
        this.expiryTimeEnd = expiryTimeEnd;
        return this;
    }
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    public QueryResourcePackageInstancesRequest setExpiryTimeStart(String expiryTimeStart) {
        this.expiryTimeStart = expiryTimeStart;
        return this;
    }
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

    public QueryResourcePackageInstancesRequest setIncludePartner(Boolean includePartner) {
        this.includePartner = includePartner;
        return this;
    }
    public Boolean getIncludePartner() {
        return this.includePartner;
    }

    public QueryResourcePackageInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryResourcePackageInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryResourcePackageInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryResourcePackageInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
