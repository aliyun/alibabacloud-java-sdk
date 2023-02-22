// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillConfirmRequest extends TeaModel {
    @NameInMap("mail_bill_date")
    public Integer mailBillDate;

    @NameInMap("user_id")
    public String userId;

    public static MonthBillConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        MonthBillConfirmRequest self = new MonthBillConfirmRequest();
        return TeaModel.build(map, self);
    }

    public MonthBillConfirmRequest setMailBillDate(Integer mailBillDate) {
        this.mailBillDate = mailBillDate;
        return this;
    }
    public Integer getMailBillDate() {
        return this.mailBillDate;
    }

    public MonthBillConfirmRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
