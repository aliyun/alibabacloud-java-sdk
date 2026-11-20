// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserUsageReportRequest extends TeaModel {
    /**
     * <p>The ID of the app instance group, which is used to filter data for a specified app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If you do not specify this parameter, data is not filtered by app instance group. To skip this filter, omit the parameter. An empty string is different from an omitted parameter and is used as a filter value in the query.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of the business region, which is used to filter report data. You can call the <a href="~~ListRegions~~">ListRegions</a> operation to obtain the ID. To skip this filter, omit the parameter. An empty string is different from an omitted parameter and is used as a filter value in the query.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The filter condition for the user connection status. The value is not case-sensitive. An unrecognized value is equivalent to not filtering by connection status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>Connected</code>: At least one currently connected session exists.</li>
     * <li><code>Disconnected</code>: The session binding is retained, but no currently connected session exists.</li>
     * <li><code>Unbound</code>: No session binding exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connected</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The end time of the statistics. <strong>This parameter is required. You must specify both <code>StartDate</code> and <code>EndDate</code></strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The time is in Beijing time (UTC+8). Specify the time in Beijing time without appending <code>Z</code> or a time zone offset. The operation filters calendar day data based on the provided calendar dates without time zone conversion. The hour, minute, and second parts are not involved in day-level filtering.</p>
     * <p>The interval between the start and end times calculated by full months must not exceed 60 months. Make sure that <code>EndDate</code> is not earlier than <code>StartDate</code>. The current operation does not independently verify the chronological order of the times. A reversed date range may return empty data. Do not rely on parameter errors to identify this situation.</p>
     * <p>If either time parameter is missing, the format is incorrect, or the range exceeds the limit, <code>InvalidParameter.StartDate/EndDate</code> (HTTP status code: 400) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-02 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The page number to query. Specify a value starting from <code>1</code>. If you do not specify this parameter, the service processes the request as the first page, but the response may echo <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Default value: <code>200</code>. If the value is greater than <code>1500</code>, the actual query processes it as <code>1500</code>. Specify a value from 1 to 1,500. The <code>PageSize</code> field in the response returns the echo request value, which does not necessarily mean that this value is adopted or that this number of records is actually returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. <strong>This parameter must be explicitly specified</strong>. The value is not case-sensitive. If this parameter is not provided or an unrecognized type is specified, <code>InvalidParameter.ProductType</code> (HTTP status code: 400) is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudGame</code>: Cloud gaming.</li>
     * <li><code>CloudApp</code>: Wuying Cloud App.</li>
     * <li><code>CloudBrowser</code>: Cloud browser.</li>
     * <li><code>CloudDesktop</code>: Cloud desktop.</li>
     * <li><code>ImageBuilder</code>: Image builder.</li>
     * <li><code>ImageValidate</code>: Image validation.</li>
     * <li><code>AndroidCloud</code>: Cloud phone.</li>
     * <li><code>GpuRender</code>: GPU rendering.</li>
     * <li><code>AndroidGpuRender</code>: Cloud phone GPU rendering.</li>
     * <li><code>WuyingServer</code>: Enterprise workstation.</li>
     * <li><code>GpuProxy</code>: GPU remote rendering proxy.</li>
     * <li><code>GpuCache</code>: GPU remote rendering cache.</li>
     * <li><code>AIAgent</code>: AI agent service.</li>
     * <li><code>HostedDesktop</code>: Hosted computer.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition container workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Business Edition container workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Team Edition container workstation.</li>
     * </ul>
     * <p>The query returns only existing statistical records for the current account within the specified product and time range. Specifying a recognized type does not necessarily mean that report data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the statistics. <strong>This parameter is required. You must specify both <code>StartDate</code> and <code>EndDate</code></strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The time is in Beijing time (UTC+8). Specify the time in Beijing time without appending <code>Z</code> or a time zone offset. The operation filters calendar day data based on the provided calendar dates without time zone conversion. The hour, minute, and second parts are not involved in day-level filtering.</p>
     * <p>The interval between the start and end times calculated by full months must not exceed 60 months. Make sure that <code>EndDate</code> is not earlier than <code>StartDate</code>. The current operation does not independently verify the chronological order of the times. A reversed date range may return empty data. Do not rely on parameter errors to identify this situation.</p>
     * <p>If either time parameter is missing, the format is incorrect, or the range exceeds the limit, <code>InvalidParameter.StartDate/EndDate</code> (HTTP status code: 400) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The ID of the end user, which is used to precisely filter users. If you do not specify this parameter, data is not filtered by user. To skip this filter, omit the parameter. An empty string is different from an omitted parameter and is used as a filter value in the query.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryUserUsageReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserUsageReportRequest self = new QueryUserUsageReportRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserUsageReportRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public QueryUserUsageReportRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public QueryUserUsageReportRequest setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public QueryUserUsageReportRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryUserUsageReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryUserUsageReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryUserUsageReportRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryUserUsageReportRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryUserUsageReportRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
