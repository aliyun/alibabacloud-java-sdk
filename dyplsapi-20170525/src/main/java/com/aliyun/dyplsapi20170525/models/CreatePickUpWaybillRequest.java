// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillRequest extends TeaModel {
    /**
     * <p>The end time of the door-to-door pickup in the appointment. The value of **AppointGotEndTime** is the value of **EndTime** of **AppointTimes** in **CpTimeSelectList** returned by the [CreatePickUpWaybillPreQuery](~~CreatePickUpWaybillPreQuery~~#resultMapping) operation.</p>
     * <br>
     * <p>>  This parameter is required when **BizType** is set to **1**.</p>
     */
    @NameInMap("AppointGotEndTime")
    public String appointGotEndTime;

    /**
     * <p>The start time of the door-to-door pickup in the appointment. The value of **AppointGotStartTime** is the value of **StartTime** of **AppointTimes** in **CpTimeSelectList** returned by the [CreatePickUpWaybillPreQuery](~~CreatePickUpWaybillPreQuery~~#resultMapping) operation.</p>
     * <br>
     * <p>>  This parameter is required when **BizType** is set to **1**.</p>
     */
    @NameInMap("AppointGotStartTime")
    public String appointGotStartTime;

    /**
     * <p>The pickup mode. Valid values:</p>
     * <br>
     * <p>*   **0** (default): real-time order.</p>
     * <p>*   **1**: appointment order.</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The address of the consignee.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeAddress")
    public CreatePickUpWaybillRequestConsigneeAddress consigneeAddress;

    /**
     * <p>The mobile phone number of the consignee.</p>
     * <br>
     * <p>>  Either ConsigneeMobile or ConsigneePhone must be set.</p>
     */
    @NameInMap("ConsigneeMobile")
    public String consigneeMobile;

    /**
     * <p>The name of the consignee.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeName")
    public String consigneeName;

    /**
     * <p>The landline phone number of the consignee.</p>
     * <br>
     * <p>>  Either ConsigneeMobile or ConsigneePhone must be set.</p>
     */
    @NameInMap("ConsigneePhone")
    public String consigneePhone;

    /**
     * <p>The code of the courier company.</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>The items.</p>
     */
    @NameInMap("GoodsInfos")
    public java.util.List<CreatePickUpWaybillRequestGoodsInfos> goodsInfos;

    /**
     * <p>The external channel sources.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderChannels")
    public String orderChannels;

    /**
     * <p>The ID of the external order.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    /**
     * <p>The additional information about the order. The additional information will be printed on the order.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The address of the sender.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendAddress")
    public CreatePickUpWaybillRequestSendAddress sendAddress;

    /**
     * <p>The mobile phone number of the sender.</p>
     * <br>
     * <p>>  Either SendMobile or SendPhone must be set.</p>
     */
    @NameInMap("SendMobile")
    public String sendMobile;

    /**
     * <p>The name of the sender.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendName")
    public String sendName;

    /**
     * <p>The landline phone number of the sender.</p>
     * <br>
     * <p>>  Either SendMobile or SendPhone must be set.</p>
     */
    @NameInMap("SendPhone")
    public String sendPhone;

    public static CreatePickUpWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillRequest self = new CreatePickUpWaybillRequest();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillRequest setAppointGotEndTime(String appointGotEndTime) {
        this.appointGotEndTime = appointGotEndTime;
        return this;
    }
    public String getAppointGotEndTime() {
        return this.appointGotEndTime;
    }

    public CreatePickUpWaybillRequest setAppointGotStartTime(String appointGotStartTime) {
        this.appointGotStartTime = appointGotStartTime;
        return this;
    }
    public String getAppointGotStartTime() {
        return this.appointGotStartTime;
    }

    public CreatePickUpWaybillRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
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
        /**
         * <p>The detailed address of the consignee.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <p>The district where the consignee is located.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The city where the consignee is located.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The province where the consignee is located.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>The street where the consignee is located.</p>
         */
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
        /**
         * <p>The item name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The item quantity.</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <p>The item weight. Unit: gram.</p>
         */
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
        /**
         * <p>The detailed address of the sender.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <p>The district where the sender is located.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The city where the sender is located.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The province where the sender is located.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>The street where the sender is located.</p>
         */
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
