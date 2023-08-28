// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushWelcomeRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("WelcomeMusicUrl")
    public String welcomeMusicUrl;

    @NameInMap("WelcomeText")
    public String welcomeText;

    public static PushWelcomeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushWelcomeRequest self = new PushWelcomeRequest();
        return TeaModel.build(map, self);
    }

    public PushWelcomeRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public PushWelcomeRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public PushWelcomeRequest setWelcomeMusicUrl(String welcomeMusicUrl) {
        this.welcomeMusicUrl = welcomeMusicUrl;
        return this;
    }
    public String getWelcomeMusicUrl() {
        return this.welcomeMusicUrl;
    }

    public PushWelcomeRequest setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
        return this;
    }
    public String getWelcomeText() {
        return this.welcomeText;
    }

}
