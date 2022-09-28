// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetMonthlyBillRequest extends TeaModel {
    @NameInMap("BillOwner")
    public String billOwner;

    @NameInMap("BillType")
    public String billType;

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
