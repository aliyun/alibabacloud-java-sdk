// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryOrderedNumberListRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("Month")
    public String month;

    @NameInMap("Number")
    public String number;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Province")
    public String province;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UsageId")
    public Long usageId;

    public static QueryOrderedNumberListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderedNumberListRequest self = new QueryOrderedNumberListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderedNumberListRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryOrderedNumberListRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryOrderedNumberListRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public QueryOrderedNumberListRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public QueryOrderedNumberListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryOrderedNumberListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryOrderedNumberListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderedNumberListRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryOrderedNumberListRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryOrderedNumberListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryOrderedNumberListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryOrderedNumberListRequest setUsageId(Long usageId) {
        this.usageId = usageId;
        return this;
    }
    public Long getUsageId() {
        return this.usageId;
    }

}
