// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryCarbonTrackRequest extends TeaModel {
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
    public java.util.List<String> uids;

    @NameInMap("UseCode")
    public Integer useCode;

    public static QueryCarbonTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarbonTrackRequest self = new QueryCarbonTrackRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarbonTrackRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryCarbonTrackRequest setFilterRDAccount(Integer filterRDAccount) {
        this.filterRDAccount = filterRDAccount;
        return this;
    }
    public Integer getFilterRDAccount() {
        return this.filterRDAccount;
    }

    public QueryCarbonTrackRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryCarbonTrackRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryCarbonTrackRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public QueryCarbonTrackRequest setUids(java.util.List<String> uids) {
        this.uids = uids;
        return this;
    }
    public java.util.List<String> getUids() {
        return this.uids;
    }

    public QueryCarbonTrackRequest setUseCode(Integer useCode) {
        this.useCode = useCode;
        return this;
    }
    public Integer getUseCode() {
        return this.useCode;
    }

}
