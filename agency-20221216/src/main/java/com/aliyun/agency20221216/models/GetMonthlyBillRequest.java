// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetMonthlyBillRequest extends TeaModel {
    /**
     * <p>Bill Owner type. Value Range:</br>
     * 1: Master account</br>
     * 2: Sub account</br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BillOwner")
    public String billOwner;

    /**
     * <p>Value Range:</p>
     * <ul>
     * <li>MonthlyInvoice</li>
     * <li>MonthRefundInvoice</li>
     * <li>MonthlySummary (Deprecated)</li>
     * <li>MonthlyInstanceAddAdjustBill </li>
     * <li>MonthlyInstanceRefundBill</li>
     * <li>MonthlyAddAdjustInvoce</li>
     * <li>MonthlyRefundAdjustInvoce </li>
     * <li>MonthlyInstanceConsumeV2 </li>
     * <li>MarginReportV2</li>
     * </ul>
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
