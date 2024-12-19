// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySupplierItemBillDownloadUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BILL-10000007371****</p>
     */
    @NameInMap("BillId")
    public String billId;

    /**
     * <strong>example:</strong>
     * <p>2022-12</p>
     */
    @NameInMap("BillPeriod")
    public String billPeriod;

    /**
     * <strong>example:</strong>
     * <p>billGenerated</p>
     */
    @NameInMap("BillStatus")
    public String billStatus;

    /**
     * <strong>example:</strong>
     * <p>LMALL20***003</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizName")
    public String bizName;

    /**
     * <strong>example:</strong>
     * <p>1002****</p>
     */
    @NameInMap("LmShopId")
    public Long lmShopId;

    @NameInMap("LmShopName")
    public String lmShopName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
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
