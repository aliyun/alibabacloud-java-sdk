// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelsRequest extends TeaModel {
    @NameInMap("HotelRequest")
    public ListHotelsRequestHotelRequest hotelRequest;

    @NameInMap("Page")
    public ListHotelsRequestPage page;

    @NameInMap("Status")
    public Integer status;

    public static ListHotelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelsRequest self = new ListHotelsRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelsRequest setHotelRequest(ListHotelsRequestHotelRequest hotelRequest) {
        this.hotelRequest = hotelRequest;
        return this;
    }
    public ListHotelsRequestHotelRequest getHotelRequest() {
        return this.hotelRequest;
    }

    public ListHotelsRequest setPage(ListHotelsRequestPage page) {
        this.page = page;
        return this;
    }
    public ListHotelsRequestPage getPage() {
        return this.page;
    }

    public ListHotelsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class ListHotelsRequestHotelRequest extends TeaModel {
        @NameInMap("HotelId")
        public String hotelId;

        public static ListHotelsRequestHotelRequest build(java.util.Map<String, ?> map) throws Exception {
            ListHotelsRequestHotelRequest self = new ListHotelsRequestHotelRequest();
            return TeaModel.build(map, self);
        }

        public ListHotelsRequestHotelRequest setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

    }

    public static class ListHotelsRequestPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListHotelsRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelsRequestPage self = new ListHotelsRequestPage();
            return TeaModel.build(map, self);
        }

        public ListHotelsRequestPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelsRequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
