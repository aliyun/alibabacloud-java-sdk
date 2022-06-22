// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPermanentTopologyResourcessRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Product")
    public String product;

    @NameInMap("QueryParamValue")
    public String queryParamValue;

    @NameInMap("RegionId")
    public String regionId;

    public static ListPermanentTopologyResourcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermanentTopologyResourcessRequest self = new ListPermanentTopologyResourcessRequest();
        return TeaModel.build(map, self);
    }

    public ListPermanentTopologyResourcessRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPermanentTopologyResourcessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPermanentTopologyResourcessRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListPermanentTopologyResourcessRequest setQueryParamValue(String queryParamValue) {
        this.queryParamValue = queryParamValue;
        return this;
    }
    public String getQueryParamValue() {
        return this.queryParamValue;
    }

    public ListPermanentTopologyResourcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
