// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelServiceCategoryRequest extends TeaModel {
    @NameInMap("Payload")
    public ListHotelServiceCategoryRequestPayload payload;

    public static ListHotelServiceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelServiceCategoryRequest self = new ListHotelServiceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelServiceCategoryRequest setPayload(ListHotelServiceCategoryRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListHotelServiceCategoryRequestPayload getPayload() {
        return this.payload;
    }

    public static class ListHotelServiceCategoryRequestPayload extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static ListHotelServiceCategoryRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListHotelServiceCategoryRequestPayload self = new ListHotelServiceCategoryRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListHotelServiceCategoryRequestPayload setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
