// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCreateShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("accept_no_seat")
    public String acceptNoSeat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("book_train_infos")
    public String bookTrainInfosShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12344321</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("btrip_user_name")
    public String btripUserName;

    @NameInMap("business_info")
    public String businessInfoShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_info")
    public String contactInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("force_match")
    public String forceMatch;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_pay_now")
    public Boolean isPayNow;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_open_info_s")
    public String passengerOpenInfoSShrink;

    public static TrainOrderCreateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCreateShrinkRequest self = new TrainOrderCreateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderCreateShrinkRequest setAcceptNoSeat(String acceptNoSeat) {
        this.acceptNoSeat = acceptNoSeat;
        return this;
    }
    public String getAcceptNoSeat() {
        return this.acceptNoSeat;
    }

    public TrainOrderCreateShrinkRequest setBookTrainInfosShrink(String bookTrainInfosShrink) {
        this.bookTrainInfosShrink = bookTrainInfosShrink;
        return this;
    }
    public String getBookTrainInfosShrink() {
        return this.bookTrainInfosShrink;
    }

    public TrainOrderCreateShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public TrainOrderCreateShrinkRequest setBtripUserName(String btripUserName) {
        this.btripUserName = btripUserName;
        return this;
    }
    public String getBtripUserName() {
        return this.btripUserName;
    }

    public TrainOrderCreateShrinkRequest setBusinessInfoShrink(String businessInfoShrink) {
        this.businessInfoShrink = businessInfoShrink;
        return this;
    }
    public String getBusinessInfoShrink() {
        return this.businessInfoShrink;
    }

    public TrainOrderCreateShrinkRequest setContactInfoShrink(String contactInfoShrink) {
        this.contactInfoShrink = contactInfoShrink;
        return this;
    }
    public String getContactInfoShrink() {
        return this.contactInfoShrink;
    }

    public TrainOrderCreateShrinkRequest setForceMatch(String forceMatch) {
        this.forceMatch = forceMatch;
        return this;
    }
    public String getForceMatch() {
        return this.forceMatch;
    }

    public TrainOrderCreateShrinkRequest setIsPayNow(Boolean isPayNow) {
        this.isPayNow = isPayNow;
        return this;
    }
    public Boolean getIsPayNow() {
        return this.isPayNow;
    }

    public TrainOrderCreateShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public TrainOrderCreateShrinkRequest setPassengerOpenInfoSShrink(String passengerOpenInfoSShrink) {
        this.passengerOpenInfoSShrink = passengerOpenInfoSShrink;
        return this;
    }
    public String getPassengerOpenInfoSShrink() {
        return this.passengerOpenInfoSShrink;
    }

}
