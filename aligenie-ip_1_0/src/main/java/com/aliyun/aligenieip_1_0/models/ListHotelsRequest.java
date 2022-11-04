// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelsRequest extends TeaModel {
    @NameInMap("Page")
    public ListHotelsRequestPage page;

    @NameInMap("Status")
    public Integer status;

    public static ListHotelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelsRequest self = new ListHotelsRequest();
        return TeaModel.build(map, self);
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
