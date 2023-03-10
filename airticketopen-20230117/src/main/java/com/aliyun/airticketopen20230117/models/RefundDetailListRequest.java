// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailListRequest extends TeaModel {
    @NameInMap("order_num")
    public Long orderNum;

    @NameInMap("page_index")
    public Integer pageIndex;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("refund_create_begin_time")
    public Long refundCreateBeginTime;

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
