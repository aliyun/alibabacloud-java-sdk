// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderListRequest extends TeaModel {
    /**
     * <p>The query end time. The value is a 13-digit UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1677229006000</p>
     */
    @NameInMap("book_time_end")
    public Long bookTimeEnd;

    /**
     * <p>The query start time. The value is a 13-digit UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1677229005000</p>
     */
    @NameInMap("book_time_start")
    public Long bookTimeStart;

    /**
     * <p>The page index. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_index")
    public Integer pageIndex;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li>2: order creation succeeded.</li>
     * <li>3: order paid.</li>
     * <li>4: order succeeded.</li>
     * <li>5: order closed.</li>
     * </ul>
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
