// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetDailyBillRequest extends TeaModel {
    /**
     * <p>The type of the bill owner. Valid values:</p>
     * <p>1: reseller partner account </p>
     * <p>2: reseller customer account</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BillOwner")
    public String billOwner;

    /**
     * <p>The bill type. Valid values:</p>
     * <ul>
     * <li><p>DailyOrder (deprecated)</p>
     * </li>
     * <li><p>DailyBill (deprecated)</p>
     * </li>
     * <li><p>DailyInstanceBill (deprecated) </p>
     * </li>
     * <li><p>DailyInstanceBillV2</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DailyInstanceBillV2</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>Billing date. Format YYYY-MM-DD</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-24</p>
     */
    @NameInMap("Date")
    public String date;

    public static GetDailyBillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyBillRequest self = new GetDailyBillRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyBillRequest setBillOwner(String billOwner) {
        this.billOwner = billOwner;
        return this;
    }
    public String getBillOwner() {
        return this.billOwner;
    }

    public GetDailyBillRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public GetDailyBillRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
