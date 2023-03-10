// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderListRequest extends TeaModel {
    @NameInMap("book_time_end")
    public Long bookTimeEnd;

    @NameInMap("book_time_start")
    public Long bookTimeStart;

    @NameInMap("page_index")
    public Integer pageIndex;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("status")
    public Integer status;

    public static OrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderListRequest self = new OrderListRequest();
        return TeaModel.build(map, self);
    }

    public OrderListRequest setBookTimeEnd(Long bookTimeEnd) {
        this.bookTimeEnd = bookTimeEnd;
        return this;
    }
    public Long getBookTimeEnd() {
        return this.bookTimeEnd;
    }

    public OrderListRequest setBookTimeStart(Long bookTimeStart) {
        this.bookTimeStart = bookTimeStart;
        return this;
    }
    public Long getBookTimeStart() {
        return this.bookTimeStart;
    }

    public OrderListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public OrderListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OrderListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
