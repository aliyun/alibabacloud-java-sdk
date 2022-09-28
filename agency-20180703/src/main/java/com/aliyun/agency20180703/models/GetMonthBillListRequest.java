// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetMonthBillListRequest extends TeaModel {
    @NameInMap("MonthBillTime")
    public String monthBillTime;

    @NameInMap("MonthBillType")
    public String monthBillType;

    @NameInMap("MonthUserType")
    public String monthUserType;

    @NameInMap("Uid")
    public Long uid;

    public static GetMonthBillListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonthBillListRequest self = new GetMonthBillListRequest();
        return TeaModel.build(map, self);
    }

    public GetMonthBillListRequest setMonthBillTime(String monthBillTime) {
        this.monthBillTime = monthBillTime;
        return this;
    }
    public String getMonthBillTime() {
        return this.monthBillTime;
    }

    public GetMonthBillListRequest setMonthBillType(String monthBillType) {
        this.monthBillType = monthBillType;
        return this;
    }
    public String getMonthBillType() {
        return this.monthBillType;
    }

    public GetMonthBillListRequest setMonthUserType(String monthUserType) {
        this.monthUserType = monthUserType;
        return this;
    }
    public String getMonthUserType() {
        return this.monthUserType;
    }

    public GetMonthBillListRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
