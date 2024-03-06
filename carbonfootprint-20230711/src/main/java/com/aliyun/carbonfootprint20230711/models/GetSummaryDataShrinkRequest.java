// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class GetSummaryDataShrinkRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Group")
    public String group;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Uids")
    public String uidsShrink;

    public static GetSummaryDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryDataShrinkRequest self = new GetSummaryDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetSummaryDataShrinkRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetSummaryDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetSummaryDataShrinkRequest setUidsShrink(String uidsShrink) {
        this.uidsShrink = uidsShrink;
        return this;
    }
    public String getUidsShrink() {
        return this.uidsShrink;
    }

}
