// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetBasicInfoQARequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    public static GetBasicInfoQARequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoQARequest self = new GetBasicInfoQARequest();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
