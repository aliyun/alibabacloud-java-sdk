// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BookShrinkRequest extends TeaModel {
    /**
     * <p>contact information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact")
    public String contactShrink;

    /**
     * <p>external order number(buyer customization)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x091-2023-0220-j-0001</p>
     */
    @NameInMap("out_order_num")
    public String outOrderNum;

    /**
     * <p>passenger-ancillary purchase relationship</p>
     */
    @NameInMap("passenger_ancillary_purchase_map_list")
    public String passengerAncillaryPurchaseMapListShrink;

    /**
     * <p>passenger list</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public String passengerListShrink;

    /**
     * <p>solution_id returned by Enrich</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
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
