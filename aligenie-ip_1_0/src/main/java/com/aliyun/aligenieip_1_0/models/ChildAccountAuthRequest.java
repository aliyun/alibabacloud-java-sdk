// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ChildAccountAuthRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static ChildAccountAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ChildAccountAuthRequest self = new ChildAccountAuthRequest();
        return TeaModel.build(map, self);
    }

    public ChildAccountAuthRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ChildAccountAuthRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ChildAccountAuthRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ChildAccountAuthRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
