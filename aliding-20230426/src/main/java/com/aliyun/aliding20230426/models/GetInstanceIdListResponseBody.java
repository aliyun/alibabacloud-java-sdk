// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceIdListResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<String> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetInstanceIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdListResponseBody self = new GetInstanceIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdListResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetInstanceIdListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetInstanceIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceIdListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetInstanceIdListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetInstanceIdListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
