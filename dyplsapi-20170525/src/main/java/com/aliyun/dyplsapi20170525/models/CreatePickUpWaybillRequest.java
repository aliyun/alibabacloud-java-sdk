// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillRequest extends TeaModel {
    @NameInMap("ConsigneeAddress")
    public CreatePickUpWaybillRequestConsigneeAddress consigneeAddress;

    @NameInMap("ConsigneeMobile")
    public String consigneeMobile;

    @NameInMap("ConsigneeName")
    public String consigneeName;

    @NameInMap("ConsigneePhone")
    public String consigneePhone;

    @NameInMap("CpCode")
    public String cpCode;

    @NameInMap("GoodsInfos")
    public java.util.List<CreatePickUpWaybillRequestGoodsInfos> goodsInfos;

    @NameInMap("OrderChannels")
    public String orderChannels;

    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SendAddress")
    public CreatePickUpWaybillRequestSendAddress sendAddress;

    @NameInMap("SendMobile")
    public String sendMobile;

    @NameInMap("SendName")
    public String sendName;

    @NameInMap("SendPhone")
    public String sendPhone;

    public static CreatePickUpWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillRequest self = new CreatePickUpWaybillRequest();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillRequest setConsigneeAddress(CreatePickUpWaybillRequestConsigneeAddress consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
        return this;
    }
    public CreatePickUpWaybillRequestConsigneeAddress getConsigneeAddress() {
        return this.consigneeAddress;
    }

    public CreatePickUpWaybillRequest setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
        return this;
    }
    public String getConsigneeMobile() {
        return this.consigneeMobile;
    }

    public CreatePickUpWaybillRequest setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
        return this;
    }
    public String getConsigneeName() {
        return this.consigneeName;
    }

    public CreatePickUpWaybillRequest setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
        return this;
    }
    public String getConsigneePhone() {
        return this.consigneePhone;
    }

    public CreatePickUpWaybillRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public CreatePickUpWaybillRequest setGoodsInfos(java.util.List<CreatePickUpWaybillRequestGoodsInfos> goodsInfos) {
        this.goodsInfos = goodsInfos;
        return this;
    }
    public java.util.List<CreatePickUpWaybillRequestGoodsInfos> getGoodsInfos() {
        return this.goodsInfos;
    }

    public CreatePickUpWaybillRequest setOrderChannels(String orderChannels) {
        this.orderChannels = orderChannels;
        return this;
    }
    public String getOrderChannels() {
        return this.orderChannels;
    }

    public CreatePickUpWaybillRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public CreatePickUpWaybillRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePickUpWaybillRequest setSendAddress(CreatePickUpWaybillRequestSendAddress sendAddress) {
        this.sendAddress = sendAddress;
        return this;
    }
    public CreatePickUpWaybillRequestSendAddress getSendAddress() {
        return this.sendAddress;
    }

    public CreatePickUpWaybillRequest setSendMobile(String sendMobile) {
        this.sendMobile = sendMobile;
        return this;
    }
    public String getSendMobile() {
        return this.sendMobile;
    }

    public CreatePickUpWaybillRequest setSendName(String sendName) {
        this.sendName = sendName;
        return this;
    }
    public String getSendName() {
        return this.sendName;
    }

    public CreatePickUpWaybillRequest setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
        return this;
    }
    public String getSendPhone() {
        return this.sendPhone;
    }

    public static class CreatePickUpWaybillRequestConsigneeAddress extends TeaModel {
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

        public static CreatePickUpWaybillRequestConsigneeAddress build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillRequestConsigneeAddress self = new CreatePickUpWaybillRequestConsigneeAddress();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillRequestConsigneeAddress setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public CreatePickUpWaybillRequestConsigneeAddress setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public CreatePickUpWaybillRequestConsigneeAddress setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public CreatePickUpWaybillRequestConsigneeAddress setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public CreatePickUpWaybillRequestConsigneeAddress setTownName(String townName) {
            this.townName = townName;
            return this;
        }
        public String getTownName() {
            return this.townName;
        }

    }

    public static class CreatePickUpWaybillRequestGoodsInfos extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Quantity")
        public String quantity;

        @NameInMap("Weight")
        public String weight;

        public static CreatePickUpWaybillRequestGoodsInfos build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillRequestGoodsInfos self = new CreatePickUpWaybillRequestGoodsInfos();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillRequestGoodsInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePickUpWaybillRequestGoodsInfos setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public CreatePickUpWaybillRequestGoodsInfos setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class CreatePickUpWaybillRequestSendAddress extends TeaModel {
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

        public static CreatePickUpWaybillRequestSendAddress build(java.util.Map<String, ?> map) throws Exception {
            CreatePickUpWaybillRequestSendAddress self = new CreatePickUpWaybillRequestSendAddress();
            return TeaModel.build(map, self);
        }

        public CreatePickUpWaybillRequestSendAddress setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }
        public String getAddressDetail() {
            return this.addressDetail;
        }

        public CreatePickUpWaybillRequestSendAddress setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public CreatePickUpWaybillRequestSendAddress setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public CreatePickUpWaybillRequestSendAddress setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public CreatePickUpWaybillRequestSendAddress setTownName(String townName) {
            this.townName = townName;
            return this;
        }
        public String getTownName() {
            return this.townName;
        }

    }

}
