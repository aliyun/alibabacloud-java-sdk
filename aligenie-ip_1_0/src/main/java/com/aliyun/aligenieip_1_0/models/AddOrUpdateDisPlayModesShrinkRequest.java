// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateDisPlayModesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HotelDeviceModeList")
    public String hotelDeviceModeListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7***83</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    public static AddOrUpdateDisPlayModesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateDisPlayModesShrinkRequest self = new AddOrUpdateDisPlayModesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateDisPlayModesShrinkRequest setHotelDeviceModeListShrink(String hotelDeviceModeListShrink) {
        this.hotelDeviceModeListShrink = hotelDeviceModeListShrink;
        return this;
    }
    public String getHotelDeviceModeListShrink() {
        return this.hotelDeviceModeListShrink;
    }

    public AddOrUpdateDisPlayModesShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
