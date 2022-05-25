// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryRequest extends TeaModel {
    @NameInMap("ConsigneeInfo")
    public CreatePickUpWaybillPreQueryRequestConsigneeInfo consigneeInfo;

    @NameInMap("CpCode")
    public String cpCode;

    @NameInMap("OrderChannels")
    public String orderChannels;

    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    @NameInMap("PreWeight")
    public String preWeight;

    @NameInMap("SenderInfo")
    public CreatePickUpWaybillPreQueryRequestSenderInfo senderInfo;

    public static CreatePickUpWaybillPreQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillPreQueryRequest self = new CreatePickUpWaybillPreQueryRequest();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillPreQueryRequest setConsigneeInfo(CreatePickUpWaybillPreQueryRequestConsigneeInfo consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
        return this;
    }
    public CreatePickUpWaybillPreQueryRequestConsigneeInfo getConsigneeInfo() {
        return this.consigneeInfo;
    }

    public CreatePickUpWaybillPreQueryRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public CreatePickUpWaybillPreQueryRequest setOrderChannels(String orderChannels) {
        this.orderChannels = orderChannels;
        return this;
    }
    public String getOrderChannels() {
        return this.orderChannels;
    }

    public CreatePickUpWaybillPreQueryRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public CreatePickUpWaybillPreQueryRequest setPreWeight(String preWeight) {
        this.preWeight = preWeight;
        return this;
    }
    public String getPreWeight() {
        return this.preWeight;
    }

    public CreatePickUpWaybillPreQueryRequest setSenderInfo(CreatePickUpWaybillPreQueryRequestSenderInfo senderInfo) {
        this.senderInfo = senderInfo;
        return this;
    }
    public CreatePickUpWaybillPreQueryRequestSenderInfo getSenderInfo() {
        return this.senderInfo;
    }

    public static class CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo extends TeaModel {
        @NameInMap("AddressDetail")
        public String addressDetail;

        @NameInMap("AreaName")
        public String areaName;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("ProvinceName")
        public String provinceName;

        @NameInMap("TownName")
        public String townName;

        public static CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo self = new CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo setTownName(String townName) {
            this.townName = townName;
            return this;
        }
        public String getTownName() {
            return this.townName;
        }

    }

    public static class CreatePickUpWaybillPreQueryRequestConsigneeInfo extends TeaModel {
        @NameInMap("AddressInfo")
        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo addressInfo;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Name")
        public String name;

        public static CreatePickUpWaybillPreQueryRequestConsigneeInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryRequestConsigneeInfo self = new CreatePickUpWaybillPreQueryRequestConsigneeInfo();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfo setAddressInfo(CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo addressInfo) {
            this.addressInfo = addressInfo;
            return this;
        }
        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo getAddressInfo() {
            return this.addressInfo;
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CreatePickUpWaybillPreQueryRequestConsigneeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo extends TeaModel {
        @NameInMap("AddressDetail")
        public String addressDetail;

        @NameInMap("AreaName")
        public String areaName;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("ProvinceName")
        public String provinceName;

        @NameInMap("TownName")
        public String townName;

        public static CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo self = new CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo setTownName(String townName) {
            this.townName = townName;
            return this;
        }
        public String getTownName() {
            return this.townName;
        }

    }

    public static class CreatePickUpWaybillPreQueryRequestSenderInfo extends TeaModel {
        @NameInMap("AddressInfo")
        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo addressInfo;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Name")
        public String name;

        public static CreatePickUpWaybillPreQueryRequestSenderInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillPreQueryRequestSenderInfo self = new CreatePickUpWaybillPreQueryRequestSenderInfo();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfo setAddressInfo(CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo addressInfo) {
            this.addressInfo = addressInfo;
            return this;
        }
        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo getAddressInfo() {
            return this.addressInfo;
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CreatePickUpWaybillPreQueryRequestSenderInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
