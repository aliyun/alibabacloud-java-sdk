// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateServiceQARequest extends TeaModel {
    @NameInMap("Answer")
    public String answer;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ServiceQAId")
    public Long serviceQAId;

    @NameInMap("isActive")
    public Boolean isActive;

    public static UpdateServiceQARequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceQARequest self = new UpdateServiceQARequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceQARequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public UpdateServiceQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateServiceQARequest setServiceQAId(Long serviceQAId) {
        this.serviceQAId = serviceQAId;
        return this;
    }
    public Long getServiceQAId() {
        return this.serviceQAId;
    }

    public UpdateServiceQARequest setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    public Boolean getIsActive() {
        return this.isActive;
    }

}
