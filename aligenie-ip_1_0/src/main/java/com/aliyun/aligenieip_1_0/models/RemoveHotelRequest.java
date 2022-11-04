// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RemoveHotelRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static RemoveHotelRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveHotelRequest self = new RemoveHotelRequest();
        return TeaModel.build(map, self);
    }

    public RemoveHotelRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RemoveHotelRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public RemoveHotelRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
