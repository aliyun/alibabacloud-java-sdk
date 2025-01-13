// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>SCREENSAVER</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    public static DeleteHotelSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelSettingRequest self = new DeleteHotelSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHotelSettingRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public DeleteHotelSettingRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

}
