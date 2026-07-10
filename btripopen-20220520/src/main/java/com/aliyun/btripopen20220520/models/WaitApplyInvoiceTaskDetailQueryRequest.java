// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class WaitApplyInvoiceTaskDetailQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bill_date")
    public String billDate;

    public static WaitApplyInvoiceTaskDetailQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        WaitApplyInvoiceTaskDetailQueryRequest self = new WaitApplyInvoiceTaskDetailQueryRequest();
        return TeaModel.build(map, self);
    }

    public WaitApplyInvoiceTaskDetailQueryRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

}
