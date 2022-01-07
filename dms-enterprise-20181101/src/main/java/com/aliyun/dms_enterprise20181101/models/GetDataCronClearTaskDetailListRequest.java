// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearTaskDetailListRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Tid")
    public Long tid;

    public static GetDataCronClearTaskDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCronClearTaskDetailListRequest self = new GetDataCronClearTaskDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCronClearTaskDetailListRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCronClearTaskDetailListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetDataCronClearTaskDetailListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDataCronClearTaskDetailListRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
