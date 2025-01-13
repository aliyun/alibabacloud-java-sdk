// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetHotelContactByNumberResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetHotelContactByNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByNumberResponseBody self = new GetHotelContactByNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelContactByNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelContactByNumberResponseBody setResult(GetHotelContactByNumberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetHotelContactByNumberResponseBodyResult getResult() {
        return this.result;
    }

    public GetHotelContactByNumberResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetHotelContactByNumberResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1649316479098</p>
         */
        @NameInMap("ExpireAt")
        public String expireAt;

        /**
         * <strong>example:</strong>
         * <p>a7***83</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        /**
         * <strong>example:</strong>
         * <p>xxx.icon</p>
         */
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2E57***D45F9</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetHotelContactByNumberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactByNumberResponseBodyResult self = new GetHotelContactByNumberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelContactByNumberResponseBodyResult setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public GetHotelContactByNumberResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetHotelContactByNumberResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetHotelContactByNumberResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHotelContactByNumberResponseBodyResult setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetHotelContactByNumberResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetHotelContactByNumberResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHotelContactByNumberResponseBodyResult setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
