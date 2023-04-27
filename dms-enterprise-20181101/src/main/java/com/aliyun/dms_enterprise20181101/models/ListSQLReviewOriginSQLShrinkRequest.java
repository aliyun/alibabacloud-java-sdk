// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the file.</p>
     */
    @NameInMap("OrderActionDetail")
    public String orderActionDetailShrink;

    /**
     * <p>The information about the parsed SQL statements.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The optimization suggestion for the SQL statement. Valid values:</p>
     * <br>
     * <p>*   **MUST_IMPROVE**: The SQL statement must be improved.</p>
     * <p>*   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.</p>
     * <p>*   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.</p>
     * <p>*   **USE_DMS_TOOLKIT**: We recommend that you change schemas without locking tables.</p>
     * <p>*   **USE_DMS_DML_UNLOCK**: We recommend that you change data without locking tables.</p>
     * <p>*   **TABLE_INDEX_SUGGEST**: We recommend that you use SQL statements that use indexes.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListSQLReviewOriginSQLShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLShrinkRequest self = new ListSQLReviewOriginSQLShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLShrinkRequest setOrderActionDetailShrink(String orderActionDetailShrink) {
        this.orderActionDetailShrink = orderActionDetailShrink;
        return this;
    }
    public String getOrderActionDetailShrink() {
        return this.orderActionDetailShrink;
    }

    public ListSQLReviewOriginSQLShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListSQLReviewOriginSQLShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
