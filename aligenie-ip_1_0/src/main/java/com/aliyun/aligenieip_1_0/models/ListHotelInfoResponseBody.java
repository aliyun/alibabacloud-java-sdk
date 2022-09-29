// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelInfoResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListHotelInfoResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListHotelInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelInfoResponseBody self = new ListHotelInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelInfoResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public ListHotelInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelInfoResponseBody setResult(java.util.List<ListHotelInfoResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListHotelInfoResponseBodyResult> getResult() {
        return this.result;
    }

    public ListHotelInfoResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class ListHotelInfoResponseBodyResultAuthAccount extends TeaModel {
        @NameInMap("UserName")
        public String userName;

        public static ListHotelInfoResponseBodyResultAuthAccount build(java.util.Map<String, ?> map) throws Exception {
            ListHotelInfoResponseBodyResultAuthAccount self = new ListHotelInfoResponseBodyResultAuthAccount();
            return TeaModel.build(map, self);
        }

        public ListHotelInfoResponseBodyResultAuthAccount setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListHotelInfoResponseBodyResult extends TeaModel {
        @NameInMap("AuthAccount")
        public java.util.List<ListHotelInfoResponseBodyResultAuthAccount> authAccount;

        @NameInMap("HotelAddress")
        public String hotelAddress;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("HotelName")
        public String hotelName;

        public static ListHotelInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelInfoResponseBodyResult self = new ListHotelInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelInfoResponseBodyResult setAuthAccount(java.util.List<ListHotelInfoResponseBodyResultAuthAccount> authAccount) {
            this.authAccount = authAccount;
            return this;
        }
        public java.util.List<ListHotelInfoResponseBodyResultAuthAccount> getAuthAccount() {
            return this.authAccount;
        }

        public ListHotelInfoResponseBodyResult setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public ListHotelInfoResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public ListHotelInfoResponseBodyResult setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

    }

}
