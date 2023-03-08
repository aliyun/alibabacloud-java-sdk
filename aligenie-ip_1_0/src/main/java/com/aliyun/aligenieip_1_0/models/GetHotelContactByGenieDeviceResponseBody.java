// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByGenieDeviceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelContactByGenieDeviceResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetHotelContactByGenieDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByGenieDeviceResponseBody self = new GetHotelContactByGenieDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByGenieDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelContactByGenieDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelContactByGenieDeviceResponseBody setResult(GetHotelContactByGenieDeviceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelContactByGenieDeviceResponseBodyResult getResult() {
        return this.result;
    }

    public GetHotelContactByGenieDeviceResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetHotelContactByGenieDeviceResponseBodyResult extends TeaModel {
        @NameInMap("ExpireAt")
        public String expireAt;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        public static GetHotelContactByGenieDeviceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactByGenieDeviceResponseBodyResult self = new GetHotelContactByGenieDeviceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHotelContactByGenieDeviceResponseBodyResult setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
