// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryAppInstanceGroupReportListRequest extends TeaModel {
    /**
     * <p>The filter condition for the app instance group ID, which matches the exact ID. If this parameter is not specified, the results are not filtered by ID. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The filter condition for the app instance group name, which supports inclusion matching. If this parameter is not specified, the results are not filtered by name.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D workstation</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The ID of the business region to which the app instance group belongs. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the ID. If this parameter is not specified, the results are not filtered by business region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The end date of the statistics. Format: <code>yyyyMMdd</code>. This parameter must be specified in pairs with <code>StartDate</code> and cannot be earlier than the start date. The string itself does not carry a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>20260930</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The ID of the end user, which is used to filter app instance groups based on the current valid authorization relationship. Before the call, make sure that the user has at least one valid authorization. If no valid authorization exists, the current version does not narrow down the results based on this parameter. If this parameter is not specified, the results are not filtered by user.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number to query. Specify a value starting from <code>1</code>. If this parameter is not specified, the service processes the request as the first page, but the response may return <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 200. The current operation does not have an additional upper limit for a single page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID for OpenAPI access, which is used for request authentication and routing. To filter business data by region, use <code>BizRegionId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start date of the statistics. Format: <code>yyyyMMdd</code>. This parameter must be specified in pairs with <code>EndDate</code>, and the interval includes the start and end dates. The string itself does not carry a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>20260901</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The statistical date for a single day. Format: <code>yyyyMMdd</code>. If this parameter is specified along with <code>StartDate</code> and <code>EndDate</code>, the results must meet both the single-day and interval conditions. The string itself does not carry a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>20260901</p>
     */
    @NameInMap("StatDate")
    public String statDate;

    /**
     * <p>The list of app instance group statuses. Multiple values have an OR relationship. Unrecognized values do not participate in filtering. If all values are unrecognized, the results are not filtered by status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>DEPLOYING</code>: Deploying.</li>
     * <li><code>DEPLOYED</code>: Deployed but not published.</li>
     * <li><code>PUBLISHED</code>: Published and available to provide services based on the current configurations.</li>
     * <li><code>STOPPING</code>: Stopping.</li>
     * <li><code>STOPPED</code>: Stopped.</li>
     * <li><code>MAINTAINING</code>: Maintaining.</li>
     * <li><code>FAILED</code>: Deployment or running failed.</li>
     * <li><code>MAINTAIN_FAILED</code>: Maintenance failed.</li>
     * <li><code>DELETING</code>: Deleting.</li>
     * <li><code>DELETED</code>: Deleted.</li>
     * </ul>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    public static QueryAppInstanceGroupReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInstanceGroupReportListRequest self = new QueryAppInstanceGroupReportListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppInstanceGroupReportListRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public QueryAppInstanceGroupReportListRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public QueryAppInstanceGroupReportListRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public QueryAppInstanceGroupReportListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryAppInstanceGroupReportListRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public QueryAppInstanceGroupReportListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryAppInstanceGroupReportListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAppInstanceGroupReportListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryAppInstanceGroupReportListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryAppInstanceGroupReportListRequest setStatDate(String statDate) {
        this.statDate = statDate;
        return this;
    }
    public String getStatDate() {
        return this.statDate;
    }

    public QueryAppInstanceGroupReportListRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
