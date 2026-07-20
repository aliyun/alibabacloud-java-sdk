// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthPreBillGetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20251201</p>
     */
    @NameInMap("bill_batch")
    public String billBatch;

    /**
     * <strong>example:</strong>
     * <p>202207</p>
     */
    @NameInMap("bill_month")
    public String billMonth;

    public static MonthPreBillGetRequest build(java.util.Map<String, ?> map) throws Exception {
        MonthPreBillGetRequest self = new MonthPreBillGetRequest();
        return TeaModel.build(map, self);
    }

    public MonthPreBillGetRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public MonthPreBillGetRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

}
