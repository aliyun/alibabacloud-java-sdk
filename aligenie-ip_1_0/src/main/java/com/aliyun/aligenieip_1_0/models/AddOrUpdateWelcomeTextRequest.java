// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateWelcomeTextRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ailabsaicloudservice.alicdn.com/tmp/a.wav">http://ailabsaicloudservice.alicdn.com/tmp/a.wav</a></p>
     */
    @NameInMap("MusicUrl")
    public String musicUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WelcomeText")
    public String welcomeText;

    public static AddOrUpdateWelcomeTextRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateWelcomeTextRequest self = new AddOrUpdateWelcomeTextRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateWelcomeTextRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateWelcomeTextRequest setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
        return this;
    }
    public String getMusicUrl() {
        return this.musicUrl;
    }

    public AddOrUpdateWelcomeTextRequest setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
        return this;
    }
    public String getWelcomeText() {
        return this.welcomeText;
    }

}
