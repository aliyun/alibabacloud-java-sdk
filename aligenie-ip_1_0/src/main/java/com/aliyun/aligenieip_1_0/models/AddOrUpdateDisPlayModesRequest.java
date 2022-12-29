// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateDisPlayModesRequest extends TeaModel {
    @NameInMap("HotelDeviceModeList")
    public java.util.List<String> hotelDeviceModeList;

    @NameInMap("HotelId")
    public String hotelId;

    public static AddOrUpdateDisPlayModesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateDisPlayModesRequest self = new AddOrUpdateDisPlayModesRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateDisPlayModesRequest setHotelDeviceModeList(java.util.List<String> hotelDeviceModeList) {
        this.hotelDeviceModeList = hotelDeviceModeList;
        return this;
    }
    public java.util.List<String> getHotelDeviceModeList() {
        return this.hotelDeviceModeList;
    }

    public AddOrUpdateDisPlayModesRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
