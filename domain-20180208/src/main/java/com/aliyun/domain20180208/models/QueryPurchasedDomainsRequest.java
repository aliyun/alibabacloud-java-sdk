// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryPurchasedDomainsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndOperationTime")
    public String endOperationTime;

    @NameInMap("OpTimeOrder")
    public Boolean opTimeOrder;

    @NameInMap("OperationStatus")
    public Integer operationStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public Integer productType;

    @NameInMap("StartOperationTime")
    public String startOperationTime;

    @NameInMap("UpdateTimeOrder")
    public Boolean updateTimeOrder;

    public static QueryPurchasedDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPurchasedDomainsRequest self = new QueryPurchasedDomainsRequest();
        return TeaModel.build(map, self);
    }

    public QueryPurchasedDomainsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryPurchasedDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryPurchasedDomainsRequest setEndOperationTime(String endOperationTime) {
        this.endOperationTime = endOperationTime;
        return this;
    }
    public String getEndOperationTime() {
        return this.endOperationTime;
    }

    public QueryPurchasedDomainsRequest setOpTimeOrder(Boolean opTimeOrder) {
        this.opTimeOrder = opTimeOrder;
        return this;
    }
    public Boolean getOpTimeOrder() {
        return this.opTimeOrder;
    }

    public QueryPurchasedDomainsRequest setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public Integer getOperationStatus() {
        return this.operationStatus;
    }

    public QueryPurchasedDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPurchasedDomainsRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

    public QueryPurchasedDomainsRequest setStartOperationTime(String startOperationTime) {
        this.startOperationTime = startOperationTime;
        return this;
    }
    public String getStartOperationTime() {
        return this.startOperationTime;
    }

    public QueryPurchasedDomainsRequest setUpdateTimeOrder(Boolean updateTimeOrder) {
        this.updateTimeOrder = updateTimeOrder;
        return this;
    }
    public Boolean getUpdateTimeOrder() {
        return this.updateTimeOrder;
    }

}
