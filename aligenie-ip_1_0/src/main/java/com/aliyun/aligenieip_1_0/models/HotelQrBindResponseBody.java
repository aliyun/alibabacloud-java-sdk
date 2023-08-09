// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class HotelQrBindResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public HotelQrBindResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static HotelQrBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelQrBindResponseBody self = new HotelQrBindResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelQrBindResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelQrBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelQrBindResponseBody setResult(HotelQrBindResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public HotelQrBindResponseBodyResult getResult() {
        return this.result;
    }

    public HotelQrBindResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class HotelQrBindResponseBodyResultOpenDeviceInfo extends TeaModel {
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

        public static HotelQrBindResponseBodyResultOpenDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelQrBindResponseBodyResultOpenDeviceInfo self = new HotelQrBindResponseBodyResultOpenDeviceInfo();
            return TeaModel.build(map, self);
        }

        public HotelQrBindResponseBodyResultOpenDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public HotelQrBindResponseBodyResultOpenDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public HotelQrBindResponseBodyResultOpenDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public HotelQrBindResponseBodyResultOpenDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public HotelQrBindResponseBodyResultOpenDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class HotelQrBindResponseBodyResultOpenUserInfo extends TeaModel {
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

        public static HotelQrBindResponseBodyResultOpenUserInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelQrBindResponseBodyResultOpenUserInfo self = new HotelQrBindResponseBodyResultOpenUserInfo();
            return TeaModel.build(map, self);
        }

        public HotelQrBindResponseBodyResultOpenUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public HotelQrBindResponseBodyResultOpenUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public HotelQrBindResponseBodyResultOpenUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public HotelQrBindResponseBodyResultOpenUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public HotelQrBindResponseBodyResultOpenUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class HotelQrBindResponseBodyResult extends TeaModel {
        @NameInMap("OpenDeviceInfo")
        public HotelQrBindResponseBodyResultOpenDeviceInfo openDeviceInfo;

        @NameInMap("OpenUserInfo")
        public HotelQrBindResponseBodyResultOpenUserInfo openUserInfo;

        public static HotelQrBindResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            HotelQrBindResponseBodyResult self = new HotelQrBindResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public HotelQrBindResponseBodyResult setOpenDeviceInfo(HotelQrBindResponseBodyResultOpenDeviceInfo openDeviceInfo) {
            this.openDeviceInfo = openDeviceInfo;
            return this;
        }
        public HotelQrBindResponseBodyResultOpenDeviceInfo getOpenDeviceInfo() {
            return this.openDeviceInfo;
        }

        public HotelQrBindResponseBodyResult setOpenUserInfo(HotelQrBindResponseBodyResultOpenUserInfo openUserInfo) {
            this.openUserInfo = openUserInfo;
            return this;
        }
        public HotelQrBindResponseBodyResultOpenUserInfo getOpenUserInfo() {
            return this.openUserInfo;
        }

    }

}
