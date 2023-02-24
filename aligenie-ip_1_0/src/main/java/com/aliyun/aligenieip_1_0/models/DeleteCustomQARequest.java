// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteCustomQARequest extends TeaModel {
    @NameInMap("CustomQAIds")
    public java.util.List<String> customQAIds;

    @NameInMap("HotelId")
    public String hotelId;

    public static DeleteCustomQARequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomQARequest self = new DeleteCustomQARequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomQARequest setCustomQAIds(java.util.List<String> customQAIds) {
        this.customQAIds = customQAIds;
        return this;
    }
    public java.util.List<String> getCustomQAIds() {
        return this.customQAIds;
    }

    public DeleteCustomQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
