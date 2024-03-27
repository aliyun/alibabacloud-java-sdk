// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryCarbonTrackShrinkRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format. Example: 2023-02-01 23:59:59.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Whether to count the carbon emission details of multiple accounts. You can pass it in after opening the multi-account management. The default value and 0 is No and 1 is Yes.</p>
     */
    @NameInMap("FilterRDAccount")
    public Integer filterRDAccount;

    /**
     * <p>The statistical dimension. A value of productCode specifies that statistics are collected based on cloud service. A value of region specifies that statistics are collected based on region. A value of subUid specifies that statistics are collected based on Resource Access Management (RAM) user. If you do not specify this parameter, statistics are collected based on Alibaba Cloud account.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format. Example: 2023-01-01 00:00:00.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>After sorting in reverse order according to the data value of the return value, only the first TopNum data will be returned. If no data is passed, all data will be returned by default.</p>
     */
    @NameInMap("TopNum")
    public Integer topNum;

    /**
     * <p>The list of Alibaba Cloud account IDs whose data needs to be queried.(used after enabling multi-account management).</p>
     */
    @NameInMap("Uids")
    public String uidsShrink;

    /**
     * <p>Whether the return result uses code as the identifier(0 meas not used and 1 means used). If not passed, the default code is used.</p>
     * <br>
     * <p>For example, when the return result is to summarize carbon emissions according to the cloud product dimension, the identifier of ECS is "ecs" when 0 is passed, and "Elastic Compute Service" when 1 is passed.</p>
     */
    @NameInMap("UseCode")
    public Integer useCode;

    public static QueryCarbonTrackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarbonTrackShrinkRequest self = new QueryCarbonTrackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarbonTrackShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryCarbonTrackShrinkRequest setFilterRDAccount(Integer filterRDAccount) {
        this.filterRDAccount = filterRDAccount;
        return this;
    }
    public Integer getFilterRDAccount() {
        return this.filterRDAccount;
    }

    public QueryCarbonTrackShrinkRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryCarbonTrackShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryCarbonTrackShrinkRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public QueryCarbonTrackShrinkRequest setUidsShrink(String uidsShrink) {
        this.uidsShrink = uidsShrink;
        return this;
    }
    public String getUidsShrink() {
        return this.uidsShrink;
    }

    public QueryCarbonTrackShrinkRequest setUseCode(Integer useCode) {
        this.useCode = useCode;
        return this;
    }
    public Integer getUseCode() {
        return this.useCode;
    }

}
