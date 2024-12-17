// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryV2ShrinkRequest extends TeaModel {
    @NameInMap("approve_id")
    public String approveIdShrink;

    @NameInMap("booker_id")
    public String bookerIdShrink;

    @NameInMap("depart_id")
    public String departIdShrink;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("end_date")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_Size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CAESBgoEIgIIABgAIhkKFwMSAAAAMUw4ZGViODFlYmM3MYzM4</p>
     */
    @NameInMap("scroll_id")
    public String scrollId;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("start_date")
    public String startDate;

    @NameInMap("supplier")
    public String supplierShrink;

    @NameInMap("thirdpart_approve_id")
    public String thirdpartApproveIdShrink;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("update_end_date")
    public String updateEndDate;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01 00:00:00</p>
     */
    @NameInMap("update_start_date")
    public String updateStartDate;

    public static FlightOrderListQueryV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryV2ShrinkRequest self = new FlightOrderListQueryV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryV2ShrinkRequest setApproveIdShrink(String approveIdShrink) {
        this.approveIdShrink = approveIdShrink;
        return this;
    }
    public String getApproveIdShrink() {
        return this.approveIdShrink;
    }

    public FlightOrderListQueryV2ShrinkRequest setBookerIdShrink(String bookerIdShrink) {
        this.bookerIdShrink = bookerIdShrink;
        return this;
    }
    public String getBookerIdShrink() {
        return this.bookerIdShrink;
    }

    public FlightOrderListQueryV2ShrinkRequest setDepartIdShrink(String departIdShrink) {
        this.departIdShrink = departIdShrink;
        return this;
    }
    public String getDepartIdShrink() {
        return this.departIdShrink;
    }

    public FlightOrderListQueryV2ShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public FlightOrderListQueryV2ShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FlightOrderListQueryV2ShrinkRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public FlightOrderListQueryV2ShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public FlightOrderListQueryV2ShrinkRequest setSupplierShrink(String supplierShrink) {
        this.supplierShrink = supplierShrink;
        return this;
    }
    public String getSupplierShrink() {
        return this.supplierShrink;
    }

    public FlightOrderListQueryV2ShrinkRequest setThirdpartApproveIdShrink(String thirdpartApproveIdShrink) {
        this.thirdpartApproveIdShrink = thirdpartApproveIdShrink;
        return this;
    }
    public String getThirdpartApproveIdShrink() {
        return this.thirdpartApproveIdShrink;
    }

    public FlightOrderListQueryV2ShrinkRequest setUpdateEndDate(String updateEndDate) {
        this.updateEndDate = updateEndDate;
        return this;
    }
    public String getUpdateEndDate() {
        return this.updateEndDate;
    }

    public FlightOrderListQueryV2ShrinkRequest setUpdateStartDate(String updateStartDate) {
        this.updateStartDate = updateStartDate;
        return this;
    }
    public String getUpdateStartDate() {
        return this.updateStartDate;
    }

}
