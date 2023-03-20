// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsInvoiceScanQueryRequest extends TeaModel {
    @NameInMap("bill_date")
    public String billDate;

    @NameInMap("bill_id")
    public Long billId;

    @NameInMap("invoice_sub_task_id")
    public Long invoiceSubTaskId;

    @NameInMap("page_no")
    public Integer pageNo;

    @NameInMap("page_size")
    public Integer pageSize;

    public static InsInvoiceScanQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        InsInvoiceScanQueryRequest self = new InsInvoiceScanQueryRequest();
        return TeaModel.build(map, self);
    }

    public InsInvoiceScanQueryRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public InsInvoiceScanQueryRequest setBillId(Long billId) {
        this.billId = billId;
        return this;
    }
    public Long getBillId() {
        return this.billId;
    }

    public InsInvoiceScanQueryRequest setInvoiceSubTaskId(Long invoiceSubTaskId) {
        this.invoiceSubTaskId = invoiceSubTaskId;
        return this;
    }
    public Long getInvoiceSubTaskId() {
        return this.invoiceSubTaskId;
    }

    public InsInvoiceScanQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public InsInvoiceScanQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
