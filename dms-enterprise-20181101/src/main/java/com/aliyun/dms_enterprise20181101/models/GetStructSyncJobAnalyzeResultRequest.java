// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobAnalyzeResultRequest extends TeaModel {
    @NameInMap("CompareType")
    public String compareType;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Tid")
    public Long tid;

    public static GetStructSyncJobAnalyzeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobAnalyzeResultRequest self = new GetStructSyncJobAnalyzeResultRequest();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobAnalyzeResultRequest setCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }
    public String getCompareType() {
        return this.compareType;
    }

    public GetStructSyncJobAnalyzeResultRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetStructSyncJobAnalyzeResultRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetStructSyncJobAnalyzeResultRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetStructSyncJobAnalyzeResultRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
