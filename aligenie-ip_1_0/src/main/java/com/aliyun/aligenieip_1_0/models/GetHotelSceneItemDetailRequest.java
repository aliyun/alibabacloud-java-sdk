// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSceneItemDetailRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>10336</p>
     */
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
