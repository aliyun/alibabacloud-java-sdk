// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomControlDevicesRequest extends TeaModel {
    @NameInMap("EnableInfraredDeviceImport")
    public String enableInfraredDeviceImport;

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

    public ImportRoomControlDevicesRequest setEnableInfraredDeviceImport(String enableInfraredDeviceImport) {
        this.enableInfraredDeviceImport = enableInfraredDeviceImport;
        return this;
    }
    public String getEnableInfraredDeviceImport() {
        return this.enableInfraredDeviceImport;
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
        @NameInMap("Brand")
        public String brand;

        @NameInMap("City")
        public String city;

        @NameInMap("ConnectType")
        public String connectType;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("InfraredId")
        public String infraredId;

        @NameInMap("InfraredIndex")
        public String infraredIndex;

        @NameInMap("InfraredVersion")
        public String infraredVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        @NameInMap("ServiceProvider")
        public String serviceProvider;

        public static ImportRoomControlDevicesRequestLocationDevicesDevices build(java.util.Map<String, ?> map) throws Exception {
            ImportRoomControlDevicesRequestLocationDevicesDevices self = new ImportRoomControlDevicesRequestLocationDevicesDevices();
            return TeaModel.build(map, self);
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setInfraredId(String infraredId) {
            this.infraredId = infraredId;
            return this;
        }
        public String getInfraredId() {
            return this.infraredId;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setInfraredIndex(String infraredIndex) {
            this.infraredIndex = infraredIndex;
            return this;
        }
        public String getInfraredIndex() {
            return this.infraredIndex;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setInfraredVersion(String infraredVersion) {
            this.infraredVersion = infraredVersion;
            return this;
        }
        public String getInfraredVersion() {
            return this.infraredVersion;
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

        public ImportRoomControlDevicesRequestLocationDevicesDevices setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ImportRoomControlDevicesRequestLocationDevicesDevices setServiceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }
        public String getServiceProvider() {
            return this.serviceProvider;
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
