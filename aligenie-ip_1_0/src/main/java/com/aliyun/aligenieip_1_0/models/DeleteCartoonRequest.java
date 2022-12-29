// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteCartoonRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    public static DeleteCartoonRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCartoonRequest self = new DeleteCartoonRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCartoonRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
