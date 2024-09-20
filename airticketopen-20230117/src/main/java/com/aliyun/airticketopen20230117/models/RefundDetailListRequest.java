// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>49884*****950</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_index")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1677229002000</p>
     */
    @NameInMap("refund_create_begin_time")
    public Long refundCreateBeginTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1677229005000</p>
     */
    @NameInMap("refund_create_end_time")
    public Long refundCreateEndTime;

    public static RefundDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundDetailListRequest self = new RefundDetailListRequest();
        return TeaModel.build(map, self);
    }

    public RefundDetailListRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public RefundDetailListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public RefundDetailListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public RefundDetailListRequest setRefundCreateBeginTime(Long refundCreateBeginTime) {
        this.refundCreateBeginTime = refundCreateBeginTime;
        return this;
    }
    public Long getRefundCreateBeginTime() {
        return this.refundCreateBeginTime;
    }

    public RefundDetailListRequest setRefundCreateEndTime(Long refundCreateEndTime) {
        this.refundCreateEndTime = refundCreateEndTime;
        return this;
    }
    public Long getRefundCreateEndTime() {
        return this.refundCreateEndTime;
    }

}
