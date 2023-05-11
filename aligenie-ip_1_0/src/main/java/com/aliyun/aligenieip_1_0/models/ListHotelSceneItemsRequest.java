// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemsRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>ListHotelSceneReq</p>
     */
    @NameInMap("ListHotelSceneReq")
    public ListHotelSceneItemsRequestListHotelSceneReq listHotelSceneReq;

    public static ListHotelSceneItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemsRequest self = new ListHotelSceneItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemsRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListHotelSceneItemsRequest setListHotelSceneReq(ListHotelSceneItemsRequestListHotelSceneReq listHotelSceneReq) {
        this.listHotelSceneReq = listHotelSceneReq;
        return this;
    }
    public ListHotelSceneItemsRequestListHotelSceneReq getListHotelSceneReq() {
        return this.listHotelSceneReq;
    }

    public static class ListHotelSceneItemsRequestListHotelSceneReqPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListHotelSceneItemsRequestListHotelSceneReqPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemsRequestListHotelSceneReqPage self = new ListHotelSceneItemsRequestListHotelSceneReqPage();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemsRequestListHotelSceneReqPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelSceneItemsRequestListHotelSceneReqPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListHotelSceneItemsRequestListHotelSceneReq extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Keywords")
        public String keywords;

        @NameInMap("Page")
        public ListHotelSceneItemsRequestListHotelSceneReqPage page;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ListHotelSceneItemsRequestListHotelSceneReq build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemsRequestListHotelSceneReq self = new ListHotelSceneItemsRequestListHotelSceneReq();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemsRequestListHotelSceneReq setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListHotelSceneItemsRequestListHotelSceneReq setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public ListHotelSceneItemsRequestListHotelSceneReq setPage(ListHotelSceneItemsRequestListHotelSceneReqPage page) {
            this.page = page;
            return this;
        }
        public ListHotelSceneItemsRequestListHotelSceneReqPage getPage() {
            return this.page;
        }

        public ListHotelSceneItemsRequestListHotelSceneReq setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHotelSceneItemsRequestListHotelSceneReq setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
