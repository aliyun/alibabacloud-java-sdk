// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateBasicInfoQARequest extends TeaModel {
    @NameInMap("CheckInTime")
    public String checkInTime;

    @NameInMap("CheckOutTime")
    public String checkOutTime;

    @NameInMap("HotelAddress")
    public String hotelAddress;

    @NameInMap("HotelId")
    public String hotelId;

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

    public static UpdateBasicInfoQARequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicInfoQARequest self = new UpdateBasicInfoQARequest();
        return TeaModel.build(map, self);
    }

    public UpdateBasicInfoQARequest setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
        return this;
    }
    public String getCheckInTime() {
        return this.checkInTime;
    }

    public UpdateBasicInfoQARequest setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
        return this;
    }
    public String getCheckOutTime() {
        return this.checkOutTime;
    }

    public UpdateBasicInfoQARequest setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        return this;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public UpdateBasicInfoQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateBasicInfoQARequest setHotelIntroduction(String hotelIntroduction) {
        this.hotelIntroduction = hotelIntroduction;
        return this;
    }
    public String getHotelIntroduction() {
        return this.hotelIntroduction;
    }

    public UpdateBasicInfoQARequest setHotelMember(String hotelMember) {
        this.hotelMember = hotelMember;
        return this;
    }
    public String getHotelMember() {
        return this.hotelMember;
    }

    public UpdateBasicInfoQARequest setHotelService(String hotelService) {
        this.hotelService = hotelService;
        return this;
    }
    public String getHotelService() {
        return this.hotelService;
    }

    public UpdateBasicInfoQARequest setParkingExpenses(String parkingExpenses) {
        this.parkingExpenses = parkingExpenses;
        return this;
    }
    public String getParkingExpenses() {
        return this.parkingExpenses;
    }

    public UpdateBasicInfoQARequest setParkingPosition(String parkingPosition) {
        this.parkingPosition = parkingPosition;
        return this;
    }
    public String getParkingPosition() {
        return this.parkingPosition;
    }

    public UpdateBasicInfoQARequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateBasicInfoQARequest setWifiName(String wifiName) {
        this.wifiName = wifiName;
        return this;
    }
    public String getWifiName() {
        return this.wifiName;
    }

    public UpdateBasicInfoQARequest setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
        return this;
    }
    public String getWifiPassword() {
        return this.wifiPassword;
    }

}
