// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryCarbonTrackShrinkRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FilterRDAccount")
    public Integer filterRDAccount;

    @NameInMap("Group")
    public String group;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TopNum")
    public Integer topNum;

    @NameInMap("Uids")
    public String uidsShrink;

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

}
