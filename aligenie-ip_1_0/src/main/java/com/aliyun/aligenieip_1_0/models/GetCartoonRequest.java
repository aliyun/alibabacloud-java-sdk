// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetCartoonRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>520a0c0***5eb</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    public static GetCartoonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCartoonRequest self = new GetCartoonRequest();
        return TeaModel.build(map, self);
    }

    public GetCartoonRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
