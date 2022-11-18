// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionBillDetailRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("BillPeriod")
    public String billPeriod;

    @NameInMap("BillStatus")
    public String billStatus;

    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributionMallName")
    public String distributionMallName;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryDistributionBillDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionBillDetailRequest self = new QueryDistributionBillDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionBillDetailRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public QueryDistributionBillDetailRequest setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public QueryDistributionBillDetailRequest setBillStatus(String billStatus) {
        this.billStatus = billStatus;
        return this;
    }
    public String getBillStatus() {
        return this.billStatus;
    }

    public QueryDistributionBillDetailRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryDistributionBillDetailRequest setDistributionMallName(String distributionMallName) {
        this.distributionMallName = distributionMallName;
        return this;
    }
    public String getDistributionMallName() {
        return this.distributionMallName;
    }

    public QueryDistributionBillDetailRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryDistributionBillDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributionBillDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionBillDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
