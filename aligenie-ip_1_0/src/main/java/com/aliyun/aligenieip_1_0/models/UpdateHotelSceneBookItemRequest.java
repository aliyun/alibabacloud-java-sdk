// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneBookItemRequest extends TeaModel {
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
     * <p>updateHotelSceneBookReq</p>
     * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png">https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>青椒肉丝</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1250</p>
         */
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
