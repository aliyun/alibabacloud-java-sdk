// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetMonthlyBillRequest extends TeaModel {
    /**
     * <p>Bill Owner type.</p>
     * <p> Value range:</p>
     * <p>1: Master account </p>
     * <p>2: Sub account</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BillOwner")
    public String billOwner;

    /**
     * <p>Value Range:</p>
     * <p>MonthlyInvoice</p>
     * <p>MonthRefundInvoice</p>
     * <p>MonthlySummary (Deprecated)</p>
     * <p>MonthlyInstanceAddAdjustBill </p>
     * <p>MonthlyInstanceRefundBill</p>
     * <p>MonthlyAddAdjustInvoce</p>
     * <p>MonthlyRefundAdjustInvoce </p>
     * <p>MonthlyInstanceConsumeV2 </p>
     * <p>MarginReportV2</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MonthlyInvoice</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>Billing Month, Format is YYYY-MM</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11</p>
     */
    @NameInMap("Month")
    public String month;

    public static GetMonthlyBillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonthlyBillRequest self = new GetMonthlyBillRequest();
        return TeaModel.build(map, self);
    }

    public GetMonthlyBillRequest setBillOwner(String billOwner) {
        this.billOwner = billOwner;
        return this;
    }
    public String getBillOwner() {
        return this.billOwner;
    }

    public GetMonthlyBillRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public GetMonthlyBillRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

}
