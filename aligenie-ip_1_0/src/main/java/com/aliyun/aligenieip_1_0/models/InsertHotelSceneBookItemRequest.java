// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InsertHotelSceneBookItemRequest extends TeaModel {
    /**
     * <p>addHotelSceneItemReq</p>
     */
    @NameInMap("AddHotelSceneItemReq")
    public InsertHotelSceneBookItemRequestAddHotelSceneItemReq addHotelSceneItemReq;

    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    public static InsertHotelSceneBookItemRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertHotelSceneBookItemRequest self = new InsertHotelSceneBookItemRequest();
        return TeaModel.build(map, self);
    }

    public InsertHotelSceneBookItemRequest setAddHotelSceneItemReq(InsertHotelSceneBookItemRequestAddHotelSceneItemReq addHotelSceneItemReq) {
        this.addHotelSceneItemReq = addHotelSceneItemReq;
        return this;
    }
    public InsertHotelSceneBookItemRequestAddHotelSceneItemReq getAddHotelSceneItemReq() {
        return this.addHotelSceneItemReq;
    }

    public InsertHotelSceneBookItemRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public static class InsertHotelSceneBookItemRequestAddHotelSceneItemReq extends TeaModel {
        /**
         * <p>icon</p>
         */
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public Long price;

        @NameInMap("Type")
        public String type;

        public static InsertHotelSceneBookItemRequestAddHotelSceneItemReq build(java.util.Map<String, ?> map) throws Exception {
            InsertHotelSceneBookItemRequestAddHotelSceneItemReq self = new InsertHotelSceneBookItemRequestAddHotelSceneItemReq();
            return TeaModel.build(map, self);
        }

        public InsertHotelSceneBookItemRequestAddHotelSceneItemReq setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public InsertHotelSceneBookItemRequestAddHotelSceneItemReq setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InsertHotelSceneBookItemRequestAddHotelSceneItemReq setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public InsertHotelSceneBookItemRequestAddHotelSceneItemReq setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
