// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetMonthlyBillRequest extends TeaModel {
    /**
     * <p>Bill Owner type. Value Range:</br></p>
     * <p>1: Master account</br></p>
     * <p>2: Sub account</br></p>
     */
    @NameInMap("BillOwner")
    public String billOwner;

    /**
     * <p>Value Range:</p>
     * <br>
     * <p>- MonthlyInvoice</p>
     * <p>- MonthRefundInvoice</p>
     * <p>- MonthlySummary</p>
     * <p>- MonthlyInstanceAddAdjustBill </p>
     * <p>- MonthlyInstanceRefundBill</p>
     * <p>- MonthlyAddAdjustInvoce</p>
     * <p>- MonthlyRefundAdjustInvoce </p>
     * <p>- MonthlyInstanceConsumeV2 </p>
     * <p>- MarginReportV2</p>
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
