// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelSceneBookItemRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    public static DeleteHotelSceneBookItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelSceneBookItemRequest self = new DeleteHotelSceneBookItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHotelSceneBookItemRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public DeleteHotelSceneBookItemRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteHotelSceneBookItemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
