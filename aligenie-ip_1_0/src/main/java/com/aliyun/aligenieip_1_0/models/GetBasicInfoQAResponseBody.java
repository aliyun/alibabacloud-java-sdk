// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetBasicInfoQAResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetBasicInfoQAResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetBasicInfoQAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoQAResponseBody self = new GetBasicInfoQAResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoQAResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBasicInfoQAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicInfoQAResponseBody setResult(GetBasicInfoQAResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetBasicInfoQAResponseBodyResult getResult() {
        return this.result;
    }

    public GetBasicInfoQAResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetBasicInfoQAResponseBodyResult extends TeaModel {
        @NameInMap("CheckInTime")
        public String checkInTime;

        @NameInMap("CheckOutTime")
        public String checkOutTime;

        @NameInMap("HotelAddress")
        public String hotelAddress;

        @NameInMap("HotelIntroduction")
        public String hotelIntroduction;

        @NameInMap("HotelMember")
        public String hotelMember;

        @NameInMap("HotelService")
        public String hotelService;

        @NameInMap("ParkingExpenses")
        public String parkingExpenses;

        @NameInMap("ParkingPosition")
        public String parkingPosition;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("WifiName")
        public String wifiName;

        @NameInMap("WifiPassword")
        public String wifiPassword;

        public static GetBasicInfoQAResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBasicInfoQAResponseBodyResult self = new GetBasicInfoQAResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBasicInfoQAResponseBodyResult setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public GetBasicInfoQAResponseBodyResult setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public GetBasicInfoQAResponseBodyResult setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public GetBasicInfoQAResponseBodyResult setHotelIntroduction(String hotelIntroduction) {
            this.hotelIntroduction = hotelIntroduction;
            return this;
        }
        public String getHotelIntroduction() {
            return this.hotelIntroduction;
        }

        public GetBasicInfoQAResponseBodyResult setHotelMember(String hotelMember) {
            this.hotelMember = hotelMember;
            return this;
        }
        public String getHotelMember() {
            return this.hotelMember;
        }

        public GetBasicInfoQAResponseBodyResult setHotelService(String hotelService) {
            this.hotelService = hotelService;
            return this;
        }
        public String getHotelService() {
            return this.hotelService;
        }

        public GetBasicInfoQAResponseBodyResult setParkingExpenses(String parkingExpenses) {
            this.parkingExpenses = parkingExpenses;
            return this;
        }
        public String getParkingExpenses() {
            return this.parkingExpenses;
        }

        public GetBasicInfoQAResponseBodyResult setParkingPosition(String parkingPosition) {
            this.parkingPosition = parkingPosition;
            return this;
        }
        public String getParkingPosition() {
            return this.parkingPosition;
        }

        public GetBasicInfoQAResponseBodyResult setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetBasicInfoQAResponseBodyResult setWifiName(String wifiName) {
            this.wifiName = wifiName;
            return this;
        }
        public String getWifiName() {
            return this.wifiName;
        }

        public GetBasicInfoQAResponseBodyResult setWifiPassword(String wifiPassword) {
            this.wifiPassword = wifiPassword;
            return this;
        }
        public String getWifiPassword() {
            return this.wifiPassword;
        }

    }

}
