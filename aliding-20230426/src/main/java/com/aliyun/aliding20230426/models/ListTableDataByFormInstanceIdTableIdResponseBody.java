// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTableDataByFormInstanceIdTableIdResponseBody extends TeaModel {
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

    public static ListTableDataByFormInstanceIdTableIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableDataByFormInstanceIdTableIdResponseBody self = new ListTableDataByFormInstanceIdTableIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableDataByFormInstanceIdTableIdResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListTableDataByFormInstanceIdTableIdResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTableDataByFormInstanceIdTableIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableDataByFormInstanceIdTableIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTableDataByFormInstanceIdTableIdResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListTableDataByFormInstanceIdTableIdResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
