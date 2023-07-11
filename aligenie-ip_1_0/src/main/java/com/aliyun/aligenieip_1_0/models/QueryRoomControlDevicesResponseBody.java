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

    public static class QueryRoomControlDevicesResponseBodyResultDevices extends TeaModel {
        @NameInMap("ConnectType")
        public String connectType;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        public static QueryRoomControlDevicesResponseBodyResultDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesResponseBodyResultDevices self = new QueryRoomControlDevicesResponseBodyResultDevices();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public QueryRoomControlDevicesResponseBodyResultDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
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
