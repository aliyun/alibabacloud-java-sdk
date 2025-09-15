// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillSplitGetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20240101</p>
     */
    @NameInMap("bill_batch")
    public String billBatch;

    /**
     * <strong>example:</strong>
     * <p>202401</p>
     */
    @NameInMap("bill_month")
    public String billMonth;

    @NameInMap("bill_split_key_list")
    public java.util.List<String> billSplitKeyList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>by_invoice_third_part_id</p>
     */
    @NameInMap("bill_split_mode")
    public String billSplitMode;

    public static MonthBillSplitGetRequest build(java.util.Map<String, ?> map) throws Exception {
        MonthBillSplitGetRequest self = new MonthBillSplitGetRequest();
        return TeaModel.build(map, self);
    }

    public MonthBillSplitGetRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public MonthBillSplitGetRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public MonthBillSplitGetRequest setBillSplitKeyList(java.util.List<String> billSplitKeyList) {
        this.billSplitKeyList = billSplitKeyList;
        return this;
    }
    public java.util.List<String> getBillSplitKeyList() {
        return this.billSplitKeyList;
    }

    public MonthBillSplitGetRequest setBillSplitMode(String billSplitMode) {
        this.billSplitMode = billSplitMode;
        return this;
    }
    public String getBillSplitMode() {
        return this.billSplitMode;
    }

}
