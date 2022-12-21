// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckDBRequest extends TeaModel {
    // The ID of the ticket for the data change.
    @NameInMap("OrderId")
    public Long orderId;

    // The number of the page to return.
    // 
    // Valid values: an integer that is greater than 0.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the ID of the tenant.
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
