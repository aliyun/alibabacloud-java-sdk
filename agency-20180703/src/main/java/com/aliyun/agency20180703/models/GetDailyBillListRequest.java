// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetDailyBillListRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("BillTime")
    public String billTime;

    @NameInMap("BillType")
    public String billType;

    @NameInMap("UserType")
    public String userType;

    public static GetDailyBillListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyBillListRequest self = new GetDailyBillListRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyBillListRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetDailyBillListRequest setBillTime(String billTime) {
        this.billTime = billTime;
        return this;
    }
    public String getBillTime() {
        return this.billTime;
    }

    public GetDailyBillListRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public GetDailyBillListRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
