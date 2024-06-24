// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingFlightListShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BJS</p>
     */
    @NameInMap("arr_city")
    public String arrCity;

    /**
     * <strong>example:</strong>
     * <p>HGH</p>
     */
    @NameInMap("dep_city")
    public String depCity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000-00-00 00:00:00</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    @NameInMap("traveler_info_list")
    public String travelerInfoListShrink;

    public static TicketChangingFlightListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingFlightListShrinkRequest self = new TicketChangingFlightListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingFlightListShrinkRequest setArrCity(String arrCity) {
        this.arrCity = arrCity;
        return this;
    }
    public String getArrCity() {
        return this.arrCity;
    }

    public TicketChangingFlightListShrinkRequest setDepCity(String depCity) {
        this.depCity = depCity;
        return this;
    }
    public String getDepCity() {
        return this.depCity;
    }

    public TicketChangingFlightListShrinkRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public TicketChangingFlightListShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingFlightListShrinkRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public TicketChangingFlightListShrinkRequest setTravelerInfoListShrink(String travelerInfoListShrink) {
        this.travelerInfoListShrink = travelerInfoListShrink;
        return this;
    }
    public String getTravelerInfoListShrink() {
        return this.travelerInfoListShrink;
    }

}
