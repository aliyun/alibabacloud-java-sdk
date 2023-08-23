// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomControlDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryRoomControlDevicesResponseBodyResult> result;

    public static QueryRoomControlDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomControlDevicesResponseBody self = new QueryRoomControlDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRoomControlDevicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRoomControlDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRoomControlDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRoomControlDevicesResponseBody setResult(java.util.List<QueryRoomControlDevicesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryRoomControlDevicesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList extends TeaModel {
        @NameInMap("AliasList")
        public java.util.List<String> aliasList;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("ElementCode")
        public String elementCode;

        @NameInMap("Location")
        public String location;

        public static QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList self = new QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setAliasList(java.util.List<String> aliasList) {
            this.aliasList = aliasList;
            return this;
        }
        public java.util.List<String> getAliasList() {
            return this.aliasList;
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setElementCode(String elementCode) {
            this.elementCode = elementCode;
            return this;
        }
        public String getElementCode() {
            return this.elementCode;
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt extends TeaModel {
        @NameInMap("SwitchList")
        public java.util.List<QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList> switchList;

        public static QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt self = new QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt setSwitchList(java.util.List<QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList> switchList) {
            this.switchList = switchList;
            return this;
        }
        public java.util.List<QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExtSwitchList> getSwitchList() {
            return this.switchList;
        }

    }

    public static class QueryRoomControlDevicesResponseBodyResultDevices extends TeaModel {
        @NameInMap("AliasList")
        public java.util.List<String> aliasList;

        @NameInMap("ConnectType")
        public String connectType;

        @NameInMap("DN")
        public String DN;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("MultiKeySwitchExt")
        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt multiKeySwitchExt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("PK")
        public String PK;

        public static QueryRoomControlDevicesResponseBodyResultDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesResponseBodyResultDevices self = new QueryRoomControlDevicesResponseBodyResultDevices();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setAliasList(java.util.List<String> aliasList) {
            this.aliasList = aliasList;
            return this;
        }
        public java.util.List<String> getAliasList() {
            return this.aliasList;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setDN(String DN) {
            this.DN = DN;
            return this;
        }
        public String getDN() {
            return this.DN;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setMultiKeySwitchExt(QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt multiKeySwitchExt) {
            this.multiKeySwitchExt = multiKeySwitchExt;
            return this;
        }
        public QueryRoomControlDevicesResponseBodyResultDevicesMultiKeySwitchExt getMultiKeySwitchExt() {
            return this.multiKeySwitchExt;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setPK(String PK) {
            this.PK = PK;
            return this;
        }
        public String getPK() {
            return this.PK;
        }

    }

    public static class QueryRoomControlDevicesResponseBodyResult extends TeaModel {
        @NameInMap("Devices")
        public java.util.List<QueryRoomControlDevicesResponseBodyResultDevices> devices;

        @NameInMap("Location")
        public String location;

        @NameInMap("LocationName")
        public String locationName;

        public static QueryRoomControlDevicesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesResponseBodyResult self = new QueryRoomControlDevicesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesResponseBodyResult setDevices(java.util.List<QueryRoomControlDevicesResponseBodyResultDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<QueryRoomControlDevicesResponseBodyResultDevices> getDevices() {
            return this.devices;
        }

        public QueryRoomControlDevicesResponseBodyResult setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryRoomControlDevicesResponseBodyResult setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

    }

}
