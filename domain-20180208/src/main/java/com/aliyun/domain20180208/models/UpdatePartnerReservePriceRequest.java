// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class UpdatePartnerReservePriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BiddingId")
    public Integer biddingId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartnerType")
    public String partnerType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReservePrice")
    public Double reservePrice;

    public static UpdatePartnerReservePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartnerReservePriceRequest self = new UpdatePartnerReservePriceRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePartnerReservePriceRequest setBiddingId(Integer biddingId) {
        this.biddingId = biddingId;
        return this;
    }
    public Integer getBiddingId() {
        return this.biddingId;
    }

    public UpdatePartnerReservePriceRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdatePartnerReservePriceRequest setPartnerType(String partnerType) {
        this.partnerType = partnerType;
        return this;
    }
    public String getPartnerType() {
        return this.partnerType;
    }

    public UpdatePartnerReservePriceRequest setReservePrice(Double reservePrice) {
        this.reservePrice = reservePrice;
        return this;
    }
    public Double getReservePrice() {
        return this.reservePrice;
    }

}
