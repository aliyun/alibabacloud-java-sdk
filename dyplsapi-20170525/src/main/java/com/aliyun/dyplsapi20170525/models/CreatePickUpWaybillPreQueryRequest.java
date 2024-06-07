// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryRequest extends TeaModel {
    /**
     * <p>The consignee information.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeInfo")
    public CreatePickUpWaybillPreQueryRequestConsigneeInfo consigneeInfo;

    /**
     * <p>The code of the courier company. If no courier company is specified, the system allocates a courier company.</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>The identifier of the external channel source. It cannot contain underscores.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderChannels")
    public String orderChannels;

    /**
     * <p>The order number of the access system.</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    /**
     * <p>The estimated weight. Unit: gram.</p>
     * <br>
     * <p>>  If you need to query the estimated price, this parameter is required.</p>
     */
    @NameInMap("PreWeight")
    public String preWeight;

    /**
     * <p>The sender information.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The detailed address of the consignee.</p>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <p>The district where the consignee is located.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The city where the consignee is located.</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The province where the consignee is located.</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>The street where the consignee is located.</p>
         */
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
        /**
         * <p>The address of the consignee.</p>
         */
        @NameInMap("AddressInfo")
        public CreatePickUpWaybillPreQueryRequestConsigneeInfoAddressInfo addressInfo;

        /**
         * <p>The mobile phone number of the consignee.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The name of the consignee.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
        /**
         * <p>The detailed address of the sender.</p>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <p>The district where the sender is located.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The city where the sender is located.</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The province where the sender is located.</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>The street where the sender is located.</p>
         */
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
        /**
         * <p>The address of the sender.</p>
         */
        @NameInMap("AddressInfo")
        public CreatePickUpWaybillPreQueryRequestSenderInfoAddressInfo addressInfo;

        /**
         * <p>The mobile phone number of the sender.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The name of the sender.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
