// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetHotelContactsResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetHotelContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactsResponseBody self = new GetHotelContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelContactsResponseBody setResult(java.util.List<GetHotelContactsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetHotelContactsResponseBodyResult> getResult() {
        return this.result;
    }

    public GetHotelContactsResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetHotelContactsResponseBodyResult extends TeaModel {
        @NameInMap("ExpireAt")
        public String expireAt;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("Icon")
        public String icon;

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

        public static GetHotelContactsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactsResponseBodyResult self = new GetHotelContactsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelContactsResponseBodyResult setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public GetHotelContactsResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetHotelContactsResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetHotelContactsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHotelContactsResponseBodyResult setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetHotelContactsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetHotelContactsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHotelContactsResponseBodyResult setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
