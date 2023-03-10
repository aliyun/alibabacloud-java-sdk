// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BookShrinkRequest extends TeaModel {
    @NameInMap("contact")
    public String contactShrink;

    @NameInMap("out_order_num")
    public String outOrderNum;

    @NameInMap("passenger_ancillary_purchase_map_list")
    public String passengerAncillaryPurchaseMapListShrink;

    @NameInMap("passenger_list")
    public String passengerListShrink;

    /**
     * <p>solution_id</p>
     */
    @NameInMap("solution_id")
    public String solutionId;

    public static BookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BookShrinkRequest self = new BookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BookShrinkRequest setContactShrink(String contactShrink) {
        this.contactShrink = contactShrink;
        return this;
    }
    public String getContactShrink() {
        return this.contactShrink;
    }

    public BookShrinkRequest setOutOrderNum(String outOrderNum) {
        this.outOrderNum = outOrderNum;
        return this;
    }
    public String getOutOrderNum() {
        return this.outOrderNum;
    }

    public BookShrinkRequest setPassengerAncillaryPurchaseMapListShrink(String passengerAncillaryPurchaseMapListShrink) {
        this.passengerAncillaryPurchaseMapListShrink = passengerAncillaryPurchaseMapListShrink;
        return this;
    }
    public String getPassengerAncillaryPurchaseMapListShrink() {
        return this.passengerAncillaryPurchaseMapListShrink;
    }

    public BookShrinkRequest setPassengerListShrink(String passengerListShrink) {
        this.passengerListShrink = passengerListShrink;
        return this;
    }
    public String getPassengerListShrink() {
        return this.passengerListShrink;
    }

    public BookShrinkRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
