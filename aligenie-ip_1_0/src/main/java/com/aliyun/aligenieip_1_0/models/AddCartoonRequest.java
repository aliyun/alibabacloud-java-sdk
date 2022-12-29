// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCartoonRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("StartVideoMd5")
    public String startVideoMd5;

    @NameInMap("StartVideoUrl")
    public String startVideoUrl;

    public static AddCartoonRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCartoonRequest self = new AddCartoonRequest();
        return TeaModel.build(map, self);
    }

    public AddCartoonRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddCartoonRequest setStartVideoMd5(String startVideoMd5) {
        this.startVideoMd5 = startVideoMd5;
        return this;
    }
    public String getStartVideoMd5() {
        return this.startVideoMd5;
    }

    public AddCartoonRequest setStartVideoUrl(String startVideoUrl) {
        this.startVideoUrl = startVideoUrl;
        return this;
    }
    public String getStartVideoUrl() {
        return this.startVideoUrl;
    }

}
