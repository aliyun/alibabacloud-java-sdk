// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomControlDevicesAndStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73C67***6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static QueryRoomControlDevicesAndStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomControlDevicesAndStatusResponseBody self = new QueryRoomControlDevicesAndStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRoomControlDevicesAndStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRoomControlDevicesAndStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRoomControlDevicesAndStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRoomControlDevicesAndStatusResponseBody setResult(java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryRoomControlDevicesAndStatusResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList extends TeaModel {
        @NameInMap("AliasList")
        public java.util.List<String> aliasList;

        /**
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;powerstate&quot;: &quot;0&quot;
         * }</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <strong>example:</strong>
         * <p>e2</p>
         */
        @NameInMap("ElementCode")
        public String elementCode;

        /**
         * <strong>example:</strong>
         * <p>room</p>
         */
        @NameInMap("Location")
        public String location;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList self = new QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setAliasList(java.util.List<String> aliasList) {
            this.aliasList = aliasList;
            return this;
        }
        public java.util.List<String> getAliasList() {
            return this.aliasList;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setElementCode(String elementCode) {
            this.elementCode = elementCode;
            return this;
        }
        public String getElementCode() {
            return this.elementCode;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt extends TeaModel {
        @NameInMap("SwitchList")
        public java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList> switchList;

        public static QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt self = new QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt setSwitchList(java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList> switchList) {
            this.switchList = switchList;
            return this;
        }
        public java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExtSwitchList> getSwitchList() {
            return this.switchList;
        }

    }

    public static class QueryRoomControlDevicesAndStatusResponseBodyResultDevices extends TeaModel {
        @NameInMap("AliasList")
        public java.util.List<String> aliasList;

        @NameInMap("Brand")
        public String brand;

        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>rcu</p>
         */
        @NameInMap("ConnectType")
        public String connectType;

        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;powerstate&quot;: &quot;1&quot;}</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <strong>example:</strong>
         * <p>3c5d***9ec</p>
         */
        @NameInMap("Dn")
        public String dn;

        /**
         * <strong>example:</strong>
         * <p>9**7</p>
         */
        @NameInMap("InfraredId")
        public String infraredId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InfraredIndex")
        public String infraredIndex;

        /**
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("InfraredVersion")
        public String infraredVersion;

        @NameInMap("MultiKeySwitchExt")
        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt multiKeySwitchExt;

        /**
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>night_light</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <strong>example:</strong>
         * <p>50255129</p>
         */
        @NameInMap("Pk")
        public String pk;

        @NameInMap("Province")
        public String province;

        @NameInMap("ServiceProvider")
        public String serviceProvider;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        public static QueryRoomControlDevicesAndStatusResponseBodyResultDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesAndStatusResponseBodyResultDevices self = new QueryRoomControlDevicesAndStatusResponseBodyResultDevices();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setAliasList(java.util.List<String> aliasList) {
            this.aliasList = aliasList;
            return this;
        }
        public java.util.List<String> getAliasList() {
            return this.aliasList;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setDn(String dn) {
            this.dn = dn;
            return this;
        }
        public String getDn() {
            return this.dn;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setInfraredId(String infraredId) {
            this.infraredId = infraredId;
            return this;
        }
        public String getInfraredId() {
            return this.infraredId;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setInfraredIndex(String infraredIndex) {
            this.infraredIndex = infraredIndex;
            return this;
        }
        public String getInfraredIndex() {
            return this.infraredIndex;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setInfraredVersion(String infraredVersion) {
            this.infraredVersion = infraredVersion;
            return this;
        }
        public String getInfraredVersion() {
            return this.infraredVersion;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setMultiKeySwitchExt(QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt multiKeySwitchExt) {
            this.multiKeySwitchExt = multiKeySwitchExt;
            return this;
        }
        public QueryRoomControlDevicesAndStatusResponseBodyResultDevicesMultiKeySwitchExt getMultiKeySwitchExt() {
            return this.multiKeySwitchExt;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setServiceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }
        public String getServiceProvider() {
            return this.serviceProvider;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResultDevices setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

    }

    public static class QueryRoomControlDevicesAndStatusResponseBodyResult extends TeaModel {
        @NameInMap("Devices")
        public java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResultDevices> devices;

        /**
         * <strong>example:</strong>
         * <p>room</p>
         */
        @NameInMap("Location")
        public String location;

        @NameInMap("LocationName")
        public String locationName;

        /**
         * <strong>example:</strong>
         * <p>1211</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        public static QueryRoomControlDevicesAndStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRoomControlDevicesAndStatusResponseBodyResult self = new QueryRoomControlDevicesAndStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResult setDevices(java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResultDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<QueryRoomControlDevicesAndStatusResponseBodyResultDevices> getDevices() {
            return this.devices;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResult setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResult setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public QueryRoomControlDevicesAndStatusResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

    }

}
