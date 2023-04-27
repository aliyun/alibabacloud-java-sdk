// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckDBRequest extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The operation that you want to perform. Set the value to **ListDataCorrectPreCheckDB**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The information about the databases that are involved in the precheck.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDataCorrectPreCheckDBRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCorrectPreCheckDBRequest self = new ListDataCorrectPreCheckDBRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCorrectPreCheckDBRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListDataCorrectPreCheckDBRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataCorrectPreCheckDBRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataCorrectPreCheckDBRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
