// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserUsageReportRequest extends TeaModel {
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
     * <p>The filter condition for the user connection status. The value is not case-sensitive. An unrecognized value is equivalent to not filtering by connection status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Connected: At least one currently connected session exists.</li>
     * <li>Disconnected: The session binding is retained, but no currently connected session exists.</li>
     * <li>Unbound: No session binding exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connected</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The end time of the statistics. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The value cannot be earlier than StartDate. The server converts the time to the <code>yyyyMMdd</code> format and calculates statistics based on a closed interval of natural days. The hours, minutes, and seconds are not involved in day-level filtering. The time span cannot exceed 60 months. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-02 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The page number. We recommend that you explicitly specify a value starting from <code>1</code>. If you do not specify this parameter, the server processes the request as the first page, but the response may return <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 200. If the value is greater than 1,500, it is processed as 1,500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. <strong>Required</strong>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud App.</li>
     * <li>CloudBrowser: Cloud Browser.</li>
     * <li>WuyingServer: Enterprise Edition workstation.</li>
     * <li>WuyingWorkstation: Personal Edition container workstation.</li>
     * <li>WuyingWorkstationTeam: Team Edition container workstation.</li>
     * <li>WuyingWorkstationBusiness: Dedicated Edition container workstation.</li>
     * <li>AndroidCloud: Cloud Phone.</li>
     * <li>AIAgent: AgentBay (AI agent).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time of the statistics. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The server converts the time to the <code>yyyyMMdd</code> format and calculates statistics based on a closed interval of natural days. The hours, minutes, and seconds are not involved in day-level filtering. The time span cannot exceed 60 months. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The ID of the end user, which is used to precisely filter users. If you do not specify this parameter, data is not filtered by user.</p>
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
