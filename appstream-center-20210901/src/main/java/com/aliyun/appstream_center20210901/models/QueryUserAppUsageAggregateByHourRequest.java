// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserAppUsageAggregateByHourRequest extends TeaModel {
    /**
     * <p>The app instance group ID, which is used to filter data for a specified app instance group. If this parameter is not provided, data is not filtered by app instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The business region ID, which is used to filter application usage data. If this parameter is not provided, data is not filtered by business region. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The end date of the statistics. Format: yyyyMMdd. If this parameter is not provided, it defaults to yesterday. The date cannot be earlier than StartDate or 90 days before the call date. The query range includes this date. The date is interpreted as a calendar date in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>20260907</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The region ID for OpenAPI access, which is used for request authentication and routing. To filter business data by region, use BizRegionId.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start date of the statistics. Format: yyyyMMdd. If this parameter is not provided, it defaults to yesterday. The date cannot be earlier than 90 days before the call date. The query range includes this date. The date is interpreted as a calendar date in the Asia/Shanghai (UTC+8) time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>20260901</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The ID of the end user to be queried. This parameter must be explicitly provided. If it is not provided, no matching records are usually returned.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryUserAppUsageAggregateByHourRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAppUsageAggregateByHourRequest self = new QueryUserAppUsageAggregateByHourRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserAppUsageAggregateByHourRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public QueryUserAppUsageAggregateByHourRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public QueryUserAppUsageAggregateByHourRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryUserAppUsageAggregateByHourRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryUserAppUsageAggregateByHourRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryUserAppUsageAggregateByHourRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
