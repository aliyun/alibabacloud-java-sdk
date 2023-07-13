// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomControlDevicesShrinkRequest extends TeaModel {
    @NameInMap("EnableInfraredDeviceImport")
    public String enableInfraredDeviceImport;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("LocationDevices")
    public String locationDevicesShrink;

    @NameInMap("RoomNo")
    public String roomNo;

    public static ImportRoomControlDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRoomControlDevicesShrinkRequest self = new ImportRoomControlDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportRoomControlDevicesShrinkRequest setEnableInfraredDeviceImport(String enableInfraredDeviceImport) {
        this.enableInfraredDeviceImport = enableInfraredDeviceImport;
        return this;
    }
    public String getEnableInfraredDeviceImport() {
        return this.enableInfraredDeviceImport;
    }

    public ImportRoomControlDevicesShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ImportRoomControlDevicesShrinkRequest setLocationDevicesShrink(String locationDevicesShrink) {
        this.locationDevicesShrink = locationDevicesShrink;
        return this;
    }
    public String getLocationDevicesShrink() {
        return this.locationDevicesShrink;
    }

    public ImportRoomControlDevicesShrinkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

}
