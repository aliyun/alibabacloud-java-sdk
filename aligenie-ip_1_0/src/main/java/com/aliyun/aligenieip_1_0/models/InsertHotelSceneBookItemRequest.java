// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InsertHotelSceneBookItemRequest extends TeaModel {
    /**
     * <p>addHotelSceneItemReq</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddHotelSceneItemReq")
    public InsertHotelSceneBookItemRequestAddHotelSceneItemReq addHotelSceneItemReq;

    /**
     * <p>hotelID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png">https://ailabs.alibabausercontent.com/platform/28d7a91e3c05db3855725fc39e0387e7/welcome_audios/aa918294b6ca3aa115c51135bf9b80cb/l9f996sq.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>This parameter is required.</p>
         * 
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FOOD</p>
         */
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
