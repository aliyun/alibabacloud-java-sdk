// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSceneItemDetailRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("Name")
    public String name;

    public static GetHotelSceneItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSceneItemDetailRequest self = new GetHotelSceneItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelSceneItemDetailRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public GetHotelSceneItemDetailRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public GetHotelSceneItemDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
