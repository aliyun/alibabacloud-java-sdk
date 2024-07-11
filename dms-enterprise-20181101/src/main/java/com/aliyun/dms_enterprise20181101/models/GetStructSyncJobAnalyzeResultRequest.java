// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobAnalyzeResultRequest extends TeaModel {
    /**
     * <p>The type of the comparison. Valid values:</p>
     * <ul>
     * <li><strong>CREATE_TABLE</strong>: compares the created tables.</li>
     * <li><strong>ALTER_TABLE</strong>: compares the modified tables.</li>
     * <li><strong>EQUAL_TABLE</strong>: compares the identical tables.</li>
     * <li><strong>PASS_TABLE</strong>: compares the tables that are skipped during schema synchronization.</li>
     * <li><strong>NOT_COMPARE</strong>: does not compare tables.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATE_TABLE</p>
     */
    @NameInMap("CompareType")
    public String compareType;

    /**
     * <p>The ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1342355</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
