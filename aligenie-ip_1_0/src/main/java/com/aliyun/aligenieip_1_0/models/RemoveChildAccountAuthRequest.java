// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RemoveChildAccountAuthRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ChildAccountName")
    public String childAccountName;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static RemoveChildAccountAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveChildAccountAuthRequest self = new RemoveChildAccountAuthRequest();
        return TeaModel.build(map, self);
    }

    public RemoveChildAccountAuthRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RemoveChildAccountAuthRequest setChildAccountName(String childAccountName) {
        this.childAccountName = childAccountName;
        return this;
    }
    public String getChildAccountName() {
        return this.childAccountName;
    }

    public RemoveChildAccountAuthRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public RemoveChildAccountAuthRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
