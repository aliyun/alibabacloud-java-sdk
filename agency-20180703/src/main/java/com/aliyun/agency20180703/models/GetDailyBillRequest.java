// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetDailyBillRequest extends TeaModel {
    @NameInMap("BillOwner")
    public String billOwner;

    @NameInMap("BillType")
    public String billType;

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
