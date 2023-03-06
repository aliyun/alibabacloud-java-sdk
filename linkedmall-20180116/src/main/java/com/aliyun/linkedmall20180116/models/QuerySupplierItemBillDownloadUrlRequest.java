// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySupplierItemBillDownloadUrlRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("BillPeriod")
    public String billPeriod;

    @NameInMap("BillStatus")
    public String billStatus;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("LmShopId")
    public Long lmShopId;

    @NameInMap("LmShopName")
    public String lmShopName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QuerySupplierItemBillDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierItemBillDownloadUrlRequest self = new QuerySupplierItemBillDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public QuerySupplierItemBillDownloadUrlRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public QuerySupplierItemBillDownloadUrlRequest setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public QuerySupplierItemBillDownloadUrlRequest setBillStatus(String billStatus) {
        this.billStatus = billStatus;
        return this;
    }
    public String getBillStatus() {
        return this.billStatus;
    }

    public QuerySupplierItemBillDownloadUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QuerySupplierItemBillDownloadUrlRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public QuerySupplierItemBillDownloadUrlRequest setLmShopId(Long lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public Long getLmShopId() {
        return this.lmShopId;
    }

    public QuerySupplierItemBillDownloadUrlRequest setLmShopName(String lmShopName) {
        this.lmShopName = lmShopName;
        return this;
    }
    public String getLmShopName() {
        return this.lmShopName;
    }

    public QuerySupplierItemBillDownloadUrlRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QuerySupplierItemBillDownloadUrlRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
