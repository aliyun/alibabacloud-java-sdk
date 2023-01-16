// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingEnquiryRequest extends TeaModel {
    @NameInMap("arr_city")
    public String arrCity;

    @NameInMap("dep_city")
    public String depCity;

    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    @NameInMap("modify_depart_date")
    public String modifyDepartDate;

    @NameInMap("modify_flight_no")
    public String modifyFlightNo;

    @NameInMap("session_id")
    public String sessionId;

    public static TicketChangingEnquiryRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingEnquiryRequest self = new TicketChangingEnquiryRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingEnquiryRequest setArrCity(String arrCity) {
        this.arrCity = arrCity;
        return this;
    }
    public String getArrCity() {
        return this.arrCity;
    }

    public TicketChangingEnquiryRequest setDepCity(String depCity) {
        this.depCity = depCity;
        return this;
    }
    public String getDepCity() {
        return this.depCity;
    }

    public TicketChangingEnquiryRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingEnquiryRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public TicketChangingEnquiryRequest setModifyDepartDate(String modifyDepartDate) {
        this.modifyDepartDate = modifyDepartDate;
        return this;
    }
    public String getModifyDepartDate() {
        return this.modifyDepartDate;
    }

    public TicketChangingEnquiryRequest setModifyFlightNo(String modifyFlightNo) {
        this.modifyFlightNo = modifyFlightNo;
        return this;
    }
    public String getModifyFlightNo() {
        return this.modifyFlightNo;
    }

    public TicketChangingEnquiryRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
