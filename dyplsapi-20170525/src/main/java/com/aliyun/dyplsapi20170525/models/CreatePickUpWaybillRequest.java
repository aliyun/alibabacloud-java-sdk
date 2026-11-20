// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillRequest extends TeaModel {
    /**
     * <p>The end time of the scheduled door-to-door pickup, in the YYYY-MM-DD HH:mm:ss format. To obtain the value of <strong>AppointGotEndTime</strong>, obtain the <strong>EndTime</strong> value from <strong>AppointTimes</strong> in the <strong>CpTimeSelectList</strong> response parameter of the <a href="https://api.aliyun.com/document/Dyplsapi/2017-05-25/CreatePickUpWaybillPreQuery">CreatePickUpWaybillPreQuery</a> operation.</p>
     * <blockquote>
     * <p>Required when <strong>bizType</strong> is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 12:00:00</p>
     */
    @NameInMap("AppointGotEndTime")
    public String appointGotEndTime;

    /**
     * <p>The start time of the scheduled door-to-door pickup, in the YYYY-MM-DD HH:mm:ss format. To obtain the value of <strong>AppointGotStartTime</strong>, obtain the <strong>StartTime</strong> value from <strong>AppointTimes</strong> in the <strong>CpTimeSelectList</strong> response parameter of the <a href="https://api.aliyun.com/document/Dyplsapi/2017-05-25/CreatePickUpWaybillPreQuery">CreatePickUpWaybillPreQuery</a> operation.</p>
     * <blockquote>
     * <p>Required when <strong>bizType</strong> is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 10:00:00</p>
     */
    @NameInMap("AppointGotStartTime")
    public String appointGotStartTime;

    /**
     * <p>The delivery mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: real-time order (default)</li>
     * <li><strong>1</strong>: scheduled order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The address of the recipient.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsigneeAddress")
    public CreatePickUpWaybillRequestConsigneeAddress consigneeAddress;

    /**
     * <p>The mobile phone number of the recipient.</p>
     * <blockquote>
     * <p>You must specify either ConsigneeMobile or ConsigneePhone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1580000****</p>
     */
    @NameInMap("ConsigneeMobile")
    public String consigneeMobile;

    /**
     * <p>The name of the recipient.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang XX</p>
     */
    @NameInMap("ConsigneeName")
    public String consigneeName;

    /**
     * <p>The landline phone number of the recipient.</p>
     * <blockquote>
     * <p>You must specify either ConsigneeMobile or ConsigneePhone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0570000****</p>
     */
    @NameInMap("ConsigneePhone")
    public String consigneePhone;

    /**
     * <p>The express delivery company code.</p>
     * 
     * <strong>example:</strong>
     * <p>YTO</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>The list of goods.</p>
     */
    @NameInMap("GoodsInfos")
    public java.util.List<CreatePickUpWaybillRequestGoodsInfos> goodsInfos;

    /**
     * <p>The external channel source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YUN_DIAN_SHANG</p>
     */
    @NameInMap("OrderChannels")
    public String orderChannels;

    /**
     * <p>The external order ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>143234234266****</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    /**
     * <p>The remark. The remark content printed on the waybill.</p>
     * 
     * <strong>example:</strong>
     * <p>Fragile items</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The address of the sender.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendAddress")
    public CreatePickUpWaybillRequestSendAddress sendAddress;

    /**
     * <p>The mobile phone number of the sender.</p>
     * <blockquote>
     * <p>You must specify either SendMobile or SendPhone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1596714****</p>
     */
    @NameInMap("SendMobile")
    public String sendMobile;

    /**
     * <p>The name of the sender.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Wang XX</p>
     */
    @NameInMap("SendName")
    public String sendName;

    /**
     * <p>The landline phone number of the sender.</p>
     * <blockquote>
     * <p>You must specify either SendMobile or SendPhone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>05718845****</p>
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
         * <p>The detailed address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>No. XX, XX Community</p>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <p>The district.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Xihu District</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The city.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The province.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>The street.</p>
         * 
         * <strong>example:</strong>
         * <p>XX Street</p>
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
         * <p>The name of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>Shoes</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <p>The weight. Unit: grams.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
         * <p>The detailed address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>No. XX, XX Community</p>
         */
        @NameInMap("AddressDetail")
        public String addressDetail;

        /**
         * <p>The district.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Weiyang District</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The city.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Xi\&quot;an</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The province.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Shaanxi Province</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        /**
         * <p>The street.</p>
         * 
         * <strong>example:</strong>
         * <p>XX Street</p>
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
