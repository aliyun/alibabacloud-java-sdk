// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCreateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123122</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-20</p>
     */
    @NameInMap("check_in")
    public String checkIn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-20</p>
     */
    @NameInMap("check_out")
    public String checkOut;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("contract_email")
    public String contractEmail;

    @NameInMap("contract_name")
    public String contractName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19281772123</p>
     */
    @NameInMap("contract_phone")
    public String contractPhone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("corp_pay_price")
    public Long corpPayPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("extra")
    public String extra;

    @NameInMap("invoice_info")
    public String invoiceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>671570615157</p>
     */
    @NameInMap("item_id")
    public Long itemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fb5e1abf33924b6c912bd6d80deec0eb-1</p>
     */
    @NameInMap("itinerary_no")
    public String itineraryNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("occupant_info_list")
    public String occupantInfoListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("person_pay_price")
    public Long personPayPrice;

    @NameInMap("promotion_info")
    public String promotionInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1399417428510</p>
     */
    @NameInMap("rate_plan_id")
    public Long ratePlanId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>187211</p>
     */
    @NameInMap("room_id")
    public Long roomId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("room_num")
    public Integer roomNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2088441675613762</p>
     */
    @NameInMap("seller_id")
    public Long sellerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2198781</p>
     */
    @NameInMap("shid")
    public Long shid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_order_price")
    public Long totalOrderPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nonUltron_1673575241156_d91ea8ad16735752359161037bf6cf_c54d3768312a4b249b719f126377bf82</p>
     */
    @NameInMap("validate_res_key")
    public String validateResKey;

    public static HotelOrderCreateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCreateShrinkRequest self = new HotelOrderCreateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderCreateShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderCreateShrinkRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelOrderCreateShrinkRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelOrderCreateShrinkRequest setContractEmail(String contractEmail) {
        this.contractEmail = contractEmail;
        return this;
    }
    public String getContractEmail() {
        return this.contractEmail;
    }

    public HotelOrderCreateShrinkRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public HotelOrderCreateShrinkRequest setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
        return this;
    }
    public String getContractPhone() {
        return this.contractPhone;
    }

    public HotelOrderCreateShrinkRequest setCorpPayPrice(Long corpPayPrice) {
        this.corpPayPrice = corpPayPrice;
        return this;
    }
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    public HotelOrderCreateShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public HotelOrderCreateShrinkRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public HotelOrderCreateShrinkRequest setInvoiceInfoShrink(String invoiceInfoShrink) {
        this.invoiceInfoShrink = invoiceInfoShrink;
        return this;
    }
    public String getInvoiceInfoShrink() {
        return this.invoiceInfoShrink;
    }

    public HotelOrderCreateShrinkRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public HotelOrderCreateShrinkRequest setItineraryNo(String itineraryNo) {
        this.itineraryNo = itineraryNo;
        return this;
    }
    public String getItineraryNo() {
        return this.itineraryNo;
    }

    public HotelOrderCreateShrinkRequest setOccupantInfoListShrink(String occupantInfoListShrink) {
        this.occupantInfoListShrink = occupantInfoListShrink;
        return this;
    }
    public String getOccupantInfoListShrink() {
        return this.occupantInfoListShrink;
    }

    public HotelOrderCreateShrinkRequest setPersonPayPrice(Long personPayPrice) {
        this.personPayPrice = personPayPrice;
        return this;
    }
    public Long getPersonPayPrice() {
        return this.personPayPrice;
    }

    public HotelOrderCreateShrinkRequest setPromotionInfoShrink(String promotionInfoShrink) {
        this.promotionInfoShrink = promotionInfoShrink;
        return this;
    }
    public String getPromotionInfoShrink() {
        return this.promotionInfoShrink;
    }

    public HotelOrderCreateShrinkRequest setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
        return this;
    }
    public Long getRatePlanId() {
        return this.ratePlanId;
    }

    public HotelOrderCreateShrinkRequest setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }
    public Long getRoomId() {
        return this.roomId;
    }

    public HotelOrderCreateShrinkRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public HotelOrderCreateShrinkRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public HotelOrderCreateShrinkRequest setShid(Long shid) {
        this.shid = shid;
        return this;
    }
    public Long getShid() {
        return this.shid;
    }

    public HotelOrderCreateShrinkRequest setTotalOrderPrice(Long totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
        return this;
    }
    public Long getTotalOrderPrice() {
        return this.totalOrderPrice;
    }

    public HotelOrderCreateShrinkRequest setValidateResKey(String validateResKey) {
        this.validateResKey = validateResKey;
        return this;
    }
    public String getValidateResKey() {
        return this.validateResKey;
    }

}
