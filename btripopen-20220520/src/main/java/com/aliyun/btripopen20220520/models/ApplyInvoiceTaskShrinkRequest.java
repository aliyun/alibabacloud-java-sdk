// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyInvoiceTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-01</p>
     */
    @NameInMap("bill_date")
    public String billDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("invoice_task_list")
    public String invoiceTaskListShrink;

    public static ApplyInvoiceTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceTaskShrinkRequest self = new ApplyInvoiceTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceTaskShrinkRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public ApplyInvoiceTaskShrinkRequest setInvoiceTaskListShrink(String invoiceTaskListShrink) {
        this.invoiceTaskListShrink = invoiceTaskListShrink;
        return this;
    }
    public String getInvoiceTaskListShrink() {
        return this.invoiceTaskListShrink;
    }

}
