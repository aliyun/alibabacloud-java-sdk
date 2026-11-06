// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QuerySessionReportDataRequest extends TeaModel {
    /**
     * <p>The ID of the app instance group, which is used to filter data for a specified app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If you do not specify this parameter, data is not filtered by app instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of the business region, which is used to filter report data. You can call the <a href="~~ListRegions~~">ListRegions</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The end time of the statistics. This parameter is required. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The end time cannot be earlier than <code>StartDate</code>. The query span must meet the limit corresponding to <code>StatDateType</code>. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-02 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The page number of the page to query. Specify this parameter starting from <code>1</code>. If you do not specify this parameter, the first page is queried, but the response may return <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 200. If the specified value is greater than 1500, 1500 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. This parameter is optional. If you do not specify this parameter, data is queried based on the Wuying Cloud App caliber.</p>
     * <p>Specify the value in the exact case shown below. Data that does not match the specified value is not returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudApp</code>: Wuying Cloud App.</li>
     * <li><code>CloudBrowser</code>: Cloud Browser.</li>
     * <li><code>WuyingServer</code>: Enterprise Edition workstation.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition Linggou container workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Team Edition Linggou container workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Dedicated Edition Linggou container workstation.</li>
     * <li><code>AndroidCloud</code>: Cloud Phone.</li>
     * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the statistics. This parameter is required. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The <code>1d</code> granularity aggregates data by date, while other granularities aggregate data down to the minute. The query includes both the start and end boundaries. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The statistical granularity. This parameter is required.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>1m</code>: aggregates data by 1 minute. The maximum query span is 1 day.</li>
     * <li><code>30m</code>: aggregates data by 30 minutes. The maximum query span is 1 day.</li>
     * <li><code>6h</code>: aggregates data by 6 hours. The maximum query span is 15 days.</li>
     * <li><code>1d</code>: aggregates data by day. The maximum query span is 180 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("StatDateType")
    public String statDateType;

    public static QuerySessionReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionReportDataRequest self = new QuerySessionReportDataRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionReportDataRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public QuerySessionReportDataRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public QuerySessionReportDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QuerySessionReportDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QuerySessionReportDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySessionReportDataRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QuerySessionReportDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QuerySessionReportDataRequest setStatDateType(String statDateType) {
        this.statDateType = statDateType;
        return this;
    }
    public String getStatDateType() {
        return this.statDateType;
    }

}
