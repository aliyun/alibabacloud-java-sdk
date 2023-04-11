// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobAnalyzeResultRequest extends TeaModel {
    /**
     * <p>The type of the comparison. Valid values:</p>
     * <br>
     * <p>*   **CREATE_TABLE**: compares the created tables.</p>
     * <p>*   **ALTER_TABLE**: compares the modified tables.</p>
     * <p>*   **EQUAL_TABLE**: compares the identical tables.</p>
     * <p>*   **PASS_TABLE**: compares the tables that are skipped during schema synchronization.</p>
     * <p>*   **NOT_COMPARE**: does not compare tables.</p>
     */
    @NameInMap("CompareType")
    public String compareType;

    /**
     * <p>The ID of the ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
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
