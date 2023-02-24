// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSettingRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SettingType")
    public String settingType;

    public static GetHotelSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSettingRequest self = new GetHotelSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelSettingRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public GetHotelSettingRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

}
