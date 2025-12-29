// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomControlDevicesShrinkRequest extends TeaModel {
    @NameInMap("EnableInfraredDeviceImport")
    public String enableInfraredDeviceImport;

    @NameInMap("EnableMeshDeviceImport")
    public String enableMeshDeviceImport;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vdgrefds</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocationDevices")
    public String locationDevicesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1211</p>
     */
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

    public ImportRoomControlDevicesShrinkRequest setEnableMeshDeviceImport(String enableMeshDeviceImport) {
        this.enableMeshDeviceImport = enableMeshDeviceImport;
        return this;
    }
    public String getEnableMeshDeviceImport() {
        return this.enableMeshDeviceImport;
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
