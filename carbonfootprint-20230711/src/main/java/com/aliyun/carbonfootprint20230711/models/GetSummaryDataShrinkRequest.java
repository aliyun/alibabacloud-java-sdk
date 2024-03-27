// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class GetSummaryDataShrinkRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format. Example: 2023-02-01 23:59:59.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>The list of Alibaba Cloud account IDs whose data needs to be queried.(used after enabling multi-account management).</p>
     */
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
