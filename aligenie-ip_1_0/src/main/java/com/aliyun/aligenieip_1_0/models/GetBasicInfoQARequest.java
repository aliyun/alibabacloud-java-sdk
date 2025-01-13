// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetBasicInfoQARequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7***83</p>
     */
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
