// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryActiveUserStatisticRequest extends TeaModel {
    /**
     * <p>The business channel type code. Valid values:</p>
     * <ul>
     * <li>1 (default): Enterprise Edition.</li>
     * <li>3: Cloud Office.</li>
     * <li>10: Standard Edition.</li>
     * <li>20: Business Edition.</li>
     * <li>30: Education Business Edition.</li>
     * <li>40: Cloud Phone isolated resources.</li>
     * <li>50: AgentBay.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The end time of the query. The format is the same as StartTime. If the value is later than the current time, it is automatically truncated to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-01T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The workspace ID. If specified, only active users of cloud desktops in this workspace are counted.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-885351****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The aggregation interval for statistics. Valid values:</p>
     * <ul>
     * <li>ONE_MINUTE: 1 minute.</li>
     * <li>TWO_MINUTE: 2 minutes.</li>
     * <li>FIVE_MINUTE (default): 5 minutes.</li>
     * <li>ONE_HOUR: 1 hour.</li>
     * <li>ONE_DAY: 1 day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FIVE_MINUTE</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The start time of the query. The following formats are supported:</p>
     * <ul>
     * <li>UTC format: yyyy-MM-ddTHH:mm:ssZ.</li>
     * <li>Standard format: yyyy-MM-dd HH:mm:ss.</li>
     * </ul>
     * <p>The value cannot be earlier than 6 months before the current time or later than EndTime.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-30T06:32:31Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryActiveUserStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryActiveUserStatisticRequest self = new QueryActiveUserStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryActiveUserStatisticRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public QueryActiveUserStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryActiveUserStatisticRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public QueryActiveUserStatisticRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryActiveUserStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
