// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Page")
    public ListHotelSceneBookItemsRequestPage page;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

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
