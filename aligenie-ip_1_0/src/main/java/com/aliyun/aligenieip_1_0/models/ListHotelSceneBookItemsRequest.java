// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public ListHotelSceneBookItemsRequestPage page;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FOOD</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListHotelSceneBookItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneBookItemsRequest self = new ListHotelSceneBookItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneBookItemsRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListHotelSceneBookItemsRequest setPage(ListHotelSceneBookItemsRequestPage page) {
        this.page = page;
        return this;
    }
    public ListHotelSceneBookItemsRequestPage getPage() {
        return this.page;
    }

    public ListHotelSceneBookItemsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListHotelSceneBookItemsRequestPage extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListHotelSceneBookItemsRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneBookItemsRequestPage self = new ListHotelSceneBookItemsRequestPage();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneBookItemsRequestPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelSceneBookItemsRequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
