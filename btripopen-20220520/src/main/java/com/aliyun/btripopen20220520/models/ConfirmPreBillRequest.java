// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ConfirmPreBillRequest extends TeaModel {
    /**
     * <p>The bill batch date in the format of yyyy-MM-dd, such as 2026-06-21.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-21</p>
     */
    @NameInMap("bill_batch")
    public String billBatch;

    public static ConfirmPreBillRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPreBillRequest self = new ConfirmPreBillRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmPreBillRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

}
