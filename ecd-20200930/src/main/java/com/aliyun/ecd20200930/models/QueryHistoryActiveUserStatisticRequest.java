// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryActiveUserStatisticRequest extends TeaModel {
    /**
     * <p>The business channel type code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The end date of the query. The date is in the yyyy-MM-dd format. The maximum value is yesterday (N-1 data).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-31</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The workspace ID. If specified, only active users within the specified workspace are counted.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-467671****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The start date of the query. The date is in the yyyy-MM-dd format. The value cannot be earlier than 6 months ago or later than EndDate.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The user group ID. If specified, only active users within the specified user group are counted.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-12345678</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static QueryHistoryActiveUserStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryActiveUserStatisticRequest self = new QueryHistoryActiveUserStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryHistoryActiveUserStatisticRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public QueryHistoryActiveUserStatisticRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryHistoryActiveUserStatisticRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public QueryHistoryActiveUserStatisticRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryHistoryActiveUserStatisticRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryHistoryActiveUserStatisticRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
