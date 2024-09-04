// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetDailyBillRequest extends TeaModel {
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
     * <p>BillType. Value Range:</br></p>
     * <ul>
     * <li>DailyOrder(Deprecated)</li>
     * <li>DailyBill (Deprecated)</li>
     * <li>DailyInstanceBill (Deprecated)</li>
     * <li>DailyInstanceBillV2</li>
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
