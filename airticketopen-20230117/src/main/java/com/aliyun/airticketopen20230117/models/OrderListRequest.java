// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderListRequest extends TeaModel {
    /**
     * <p>latest booking time (timestamp)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-02 11:20:00</p>
     */
    @NameInMap("book_time_end")
    public Long bookTimeEnd;

    /**
     * <p>earliest book time(timestamp)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-01 11:20:00</p>
     */
    @NameInMap("book_time_start")
    public Long bookTimeStart;

    /**
     * <p>pagination query parameters, from which page to start querying</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_index")
    public Integer pageIndex;

    /**
     * <p>pagination query parameters, how many orders to return</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>which order status will be query</p>
     * <p>1: order reservation in process</p>
     * <p>2: order reservation successful</p>
     * <p>3: order paid</p>
     * <p>4: order successful</p>
     * <p>5: order closed</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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
