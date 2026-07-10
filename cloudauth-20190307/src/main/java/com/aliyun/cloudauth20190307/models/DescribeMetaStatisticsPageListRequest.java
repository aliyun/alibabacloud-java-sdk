// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsPageListRequest extends TeaModel {
    /**
     * <p>Product API:</p>
     * <ul>
     * <li><strong>ID_CARD_2_META</strong>: ID Card Two-Element Verification</li>
     * <li><strong>ID_PERIOD</strong>: ID Card Validity Verification Period</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile Online Duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile Online Status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: Mobile Number Three-Element Verification (Simple)</li>
     * <li><strong>MOBILE_3_META</strong>: Mobile Number Three-Element Verification (Detailed)</li>
     * <li><strong>MOBILE_2_META</strong>: Mobile Number Two-Element Verification</li>
     * <li><strong>BANK_CARD_N_META</strong>: Bank Card Verification (Detailed)</li>
     * <li><strong>MOBILE_DETECT</strong>: Number Detection</li>
     * <li><strong>VEHICLE_N_META</strong>: Vehicle Element Verification (Enhanced)</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: Vehicle Five-Element Information Recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle Information Recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle Insurance Date Query</li>
     * <li><strong>VEHICLE_CHECK</strong>: Vehicle Element Verification</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PERIOD</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <p>Current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Query end time. Unix timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1737561599999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Number of data entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Query start time. The timestamp is in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760112000000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeMetaStatisticsPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsPageListRequest self = new DescribeMetaStatisticsPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsPageListRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public DescribeMetaStatisticsPageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMetaStatisticsPageListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeMetaStatisticsPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaStatisticsPageListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
