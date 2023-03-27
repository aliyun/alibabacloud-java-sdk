// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListMenuDataRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("Country")
    public String country;

    @NameInMap("CreateRequestId")
    public String createRequestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductContainerId")
    public String productContainerId;

    public static ListMenuDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMenuDataRequest self = new ListMenuDataRequest();
        return TeaModel.build(map, self);
    }

    public ListMenuDataRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public ListMenuDataRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ListMenuDataRequest setCreateRequestId(String createRequestId) {
        this.createRequestId = createRequestId;
        return this;
    }
    public String getCreateRequestId() {
        return this.createRequestId;
    }

    public ListMenuDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMenuDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMenuDataRequest setProductContainerId(String productContainerId) {
        this.productContainerId = productContainerId;
        return this;
    }
    public String getProductContainerId() {
        return this.productContainerId;
    }

}
