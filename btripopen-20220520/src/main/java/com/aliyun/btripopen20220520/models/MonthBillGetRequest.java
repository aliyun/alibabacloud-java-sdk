// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillGetRequest extends TeaModel {
    @NameInMap("bill_batch")
    public String billBatch;

    /**
     * <strong>example:</strong>
     * <p>202207</p>
     */
    @NameInMap("bill_month")
    public String billMonth;

    public static MonthBillGetRequest build(java.util.Map<String, ?> map) throws Exception {
        MonthBillGetRequest self = new MonthBillGetRequest();
        return TeaModel.build(map, self);
    }

    public MonthBillGetRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public MonthBillGetRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

}
