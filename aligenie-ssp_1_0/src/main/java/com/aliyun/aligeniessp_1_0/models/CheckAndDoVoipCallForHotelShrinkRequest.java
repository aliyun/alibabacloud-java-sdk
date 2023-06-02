// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAndDoVoipCallForHotelShrinkRequest extends TeaModel {
    @NameInMap("BizData")
    public String bizData;

    @NameInMap("CalleeNick")
    public String calleeNick;

    @NameInMap("CalleePhoneNum")
    public String calleePhoneNum;

    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static CheckAndDoVoipCallForHotelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAndDoVoipCallForHotelShrinkRequest self = new CheckAndDoVoipCallForHotelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckAndDoVoipCallForHotelShrinkRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public CheckAndDoVoipCallForHotelShrinkRequest setCalleeNick(String calleeNick) {
        this.calleeNick = calleeNick;
        return this;
    }
    public String getCalleeNick() {
        return this.calleeNick;
    }

    public CheckAndDoVoipCallForHotelShrinkRequest setCalleePhoneNum(String calleePhoneNum) {
        this.calleePhoneNum = calleePhoneNum;
        return this;
    }
    public String getCalleePhoneNum() {
        return this.calleePhoneNum;
    }

    public CheckAndDoVoipCallForHotelShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public CheckAndDoVoipCallForHotelShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
