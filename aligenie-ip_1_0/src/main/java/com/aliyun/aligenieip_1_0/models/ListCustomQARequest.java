// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListCustomQARequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public ListCustomQARequestPage page;

    public static ListCustomQARequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomQARequest self = new ListCustomQARequest();
        return TeaModel.build(map, self);
    }

    public ListCustomQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListCustomQARequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCustomQARequest setPage(ListCustomQARequestPage page) {
        this.page = page;
        return this;
    }
    public ListCustomQARequestPage getPage() {
        return this.page;
    }

    public static class ListCustomQARequestPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListCustomQARequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListCustomQARequestPage self = new ListCustomQARequestPage();
            return TeaModel.build(map, self);
        }

        public ListCustomQARequestPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomQARequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
