// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSceneCategoryRequest extends TeaModel {
    /**
     * <p>hotelId</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Type")
    public String type;

    public static ListSceneCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSceneCategoryRequest self = new ListSceneCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListSceneCategoryRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListSceneCategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
