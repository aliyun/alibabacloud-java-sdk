// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneBookItemRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>updateHotelSceneBookReq</p>
     */
    @NameInMap("UpdateHotelSceneBookReq")
    public UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq updateHotelSceneBookReq;

    public static UpdateHotelSceneBookItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneBookItemRequest self = new UpdateHotelSceneBookItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneBookItemRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelSceneBookItemRequest setUpdateHotelSceneBookReq(UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq updateHotelSceneBookReq) {
        this.updateHotelSceneBookReq = updateHotelSceneBookReq;
        return this;
    }
    public UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq getUpdateHotelSceneBookReq() {
        return this.updateHotelSceneBookReq;
    }

    public static class UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq extends TeaModel {
        /**
         * <p>icon</p>
         */
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public Long price;

        public static UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq self = new UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq();
            return TeaModel.build(map, self);
        }

        public UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHotelSceneBookItemRequestUpdateHotelSceneBookReq setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

    }

}
