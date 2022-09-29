// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomControlDevicesRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("LocationDevices")
    public java.util.List<ImportRoomControlDevicesRequestLocationDevices> locationDevices;

    @NameInMap("RoomNo")
    public String roomNo;

    public static ImportRoomControlDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRoomControlDevicesRequest self = new ImportRoomControlDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ImportRoomControlDevicesRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ImportRoomControlDevicesRequest setLocationDevices(java.util.List<ImportRoomControlDevicesRequestLocationDevices> locationDevices) {
        this.locationDevices = locationDevices;
        return this;
    }
    public java.util.List<ImportRoomControlDevicesRequestLocationDevices> getLocationDevices() {
        return this.locationDevices;
    }

    public ImportRoomControlDevicesRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public static class ImportRoomControlDevicesRequestLocationDevicesDevices extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        public static ImportRoomControlDevicesRequestLocationDevicesDevices build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomControlDevicesRequestLocationDevicesDevices self = new ImportRoomControlDevicesRequestLocationDevicesDevices();
            return TeaModel.build(map, self);
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class ImportRoomControlDevicesRequestLocationDevices extends TeaModel {
        @NameInMap("Devices")
        public java.util.List<ImportRoomControlDevicesRequestLocationDevicesDevices> devices;

        @NameInMap("Location")
        public String location;

        @NameInMap("LocationName")
        public String locationName;

        public static ImportRoomControlDevicesRequestLocationDevices build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomControlDevicesRequestLocationDevices self = new ImportRoomControlDevicesRequestLocationDevices();
            return TeaModel.build(map, self);
        }

        public ImportRoomControlDevicesRequestLocationDevices setDevices(java.util.List<ImportRoomControlDevicesRequestLocationDevicesDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<ImportRoomControlDevicesRequestLocationDevicesDevices> getDevices() {
            return this.devices;
        }

        public ImportRoomControlDevicesRequestLocationDevices setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ImportRoomControlDevicesRequestLocationDevices setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

    }

}
