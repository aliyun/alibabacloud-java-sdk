// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckSQLRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **ListDataCorrectPreCheckSQL**.</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The key that is used to query the details of optimization suggestions. You can call the [GetSQLReviewOptimizeDetail](~~265977~~) operation to query the details of optimization suggestions based on the key.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDataCorrectPreCheckSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCorrectPreCheckSQLRequest self = new ListDataCorrectPreCheckSQLRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCorrectPreCheckSQLRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListDataCorrectPreCheckSQLRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListDataCorrectPreCheckSQLRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataCorrectPreCheckSQLRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataCorrectPreCheckSQLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
