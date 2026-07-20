// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryV2Request extends TeaModel {
    @NameInMap("approve_id")
    public java.util.List<String> approveId;

    @NameInMap("booker_id")
    public java.util.List<String> bookerId;

    @NameInMap("depart_id")
    public java.util.List<String> departId;

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
    public java.util.List<String> supplier;

    @NameInMap("thirdpart_approve_id")
    public java.util.List<String> thirdpartApproveId;

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

    public static FlightOrderListQueryV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryV2Request self = new FlightOrderListQueryV2Request();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryV2Request setApproveId(java.util.List<String> approveId) {
        this.approveId = approveId;
        return this;
    }
    public java.util.List<String> getApproveId() {
        return this.approveId;
    }

    public FlightOrderListQueryV2Request setBookerId(java.util.List<String> bookerId) {
        this.bookerId = bookerId;
        return this;
    }
    public java.util.List<String> getBookerId() {
        return this.bookerId;
    }

    public FlightOrderListQueryV2Request setDepartId(java.util.List<String> departId) {
        this.departId = departId;
        return this;
    }
    public java.util.List<String> getDepartId() {
        return this.departId;
    }

    public FlightOrderListQueryV2Request setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public FlightOrderListQueryV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FlightOrderListQueryV2Request setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public FlightOrderListQueryV2Request setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public FlightOrderListQueryV2Request setSupplier(java.util.List<String> supplier) {
        this.supplier = supplier;
        return this;
    }
    public java.util.List<String> getSupplier() {
        return this.supplier;
    }

    public FlightOrderListQueryV2Request setThirdpartApproveId(java.util.List<String> thirdpartApproveId) {
        this.thirdpartApproveId = thirdpartApproveId;
        return this;
    }
    public java.util.List<String> getThirdpartApproveId() {
        return this.thirdpartApproveId;
    }

    public FlightOrderListQueryV2Request setUpdateEndDate(String updateEndDate) {
        this.updateEndDate = updateEndDate;
        return this;
    }
    public String getUpdateEndDate() {
        return this.updateEndDate;
    }

    public FlightOrderListQueryV2Request setUpdateStartDate(String updateStartDate) {
        this.updateStartDate = updateStartDate;
        return this;
    }
    public String getUpdateStartDate() {
        return this.updateStartDate;
    }

}
