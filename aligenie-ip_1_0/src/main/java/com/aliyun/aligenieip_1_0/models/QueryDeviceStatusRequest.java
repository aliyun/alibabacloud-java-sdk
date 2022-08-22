// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryDeviceStatusRequest extends TeaModel {
    @NameInMap("Payload")
    public QueryDeviceStatusRequestPayload payload;

    @NameInMap("UserInfo")
    public QueryDeviceStatusRequestUserInfo userInfo;

    public static QueryDeviceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatusRequest self = new QueryDeviceStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatusRequest setPayload(QueryDeviceStatusRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public QueryDeviceStatusRequestPayload getPayload() {
        return this.payload;
    }

    public QueryDeviceStatusRequest setUserInfo(QueryDeviceStatusRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public QueryDeviceStatusRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class QueryDeviceStatusRequestPayloadLocationDevices extends TeaModel {
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("Location")
        public String location;

        public static QueryDeviceStatusRequestPayloadLocationDevices build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatusRequestPayloadLocationDevices self = new QueryDeviceStatusRequestPayloadLocationDevices();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatusRequestPayloadLocationDevices setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public QueryDeviceStatusRequestPayloadLocationDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceStatusRequestPayloadLocationDevices setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class QueryDeviceStatusRequestPayload extends TeaModel {
        @NameInMap("LocationDevices")
        public java.util.List<QueryDeviceStatusRequestPayloadLocationDevices> locationDevices;

        @NameInMap("Properties")
        public java.util.Map<String, String> properties;

        public static QueryDeviceStatusRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatusRequestPayload self = new QueryDeviceStatusRequestPayload();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatusRequestPayload setLocationDevices(java.util.List<QueryDeviceStatusRequestPayloadLocationDevices> locationDevices) {
            this.locationDevices = locationDevices;
            return this;
        }
        public java.util.List<QueryDeviceStatusRequestPayloadLocationDevices> getLocationDevices() {
            return this.locationDevices;
        }

        public QueryDeviceStatusRequestPayload setProperties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

    }

    public static class QueryDeviceStatusRequestUserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static QueryDeviceStatusRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatusRequestUserInfo self = new QueryDeviceStatusRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatusRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryDeviceStatusRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryDeviceStatusRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDeviceStatusRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryDeviceStatusRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
