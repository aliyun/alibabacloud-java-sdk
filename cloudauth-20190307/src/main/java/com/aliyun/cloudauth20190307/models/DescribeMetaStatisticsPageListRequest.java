// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsPageListRequest extends TeaModel {
    /**
     * <p>The product API. Valid values:</p>
     * <ul>
     * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification</li>
     * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition)</li>
     * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition)</li>
     * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification</li>
     * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition)</li>
     * <li><strong>MOBILE_DETECT</strong>: phone number detection </li>
     * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition)</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
     * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PERIOD</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1737561599999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query. The timestamp is in milliseconds.</p>
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
