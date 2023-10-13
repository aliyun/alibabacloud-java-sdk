// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetMonthlyBillRequest extends TeaModel {
    /**
     * <p>Bill Owner type.</p>
     * <br>
     * <p> Value range:</p>
     * <br>
     * <p>1: Master account </p>
     * <br>
     * <p>2: Sub account</p>
     */
    @NameInMap("BillOwner")
    public String billOwner;

    /**
     * <p>Value Range:</p>
     * <br>
     * <p>MonthlyInvoice</p>
     * <br>
     * <p>MonthRefundInvoice</p>
     * <br>
     * <p>MonthlySummary</p>
     * <br>
     * <p>MonthlyInstanceAddAdjustBill </p>
     * <br>
     * <p>MonthlyInstanceRefundBill</p>
     * <br>
     * <p>MonthlyAddAdjustInvoce</p>
     * <br>
     * <p>MonthlyRefundAdjustInvoce </p>
     * <br>
     * <p>MonthlyInstanceConsumeV2 </p>
     * <br>
     * <p>MarginReportV2</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>Billing Month, Format is YYYY-MM</p>
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
