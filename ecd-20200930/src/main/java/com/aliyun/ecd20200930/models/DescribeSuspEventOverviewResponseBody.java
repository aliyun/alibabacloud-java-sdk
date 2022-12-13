// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventOverviewResponseBody extends TeaModel {
    // The total number of alerts at the remind level.
    @NameInMap("RemindCount")
    public Integer remindCount;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of alerts at the serious level.
    @NameInMap("SeriousCount")
    public Integer seriousCount;

    // The total number of alerts at the suspicious level.
    @NameInMap("SuspiciousCount")
    public Integer suspiciousCount;

    public static DescribeSuspEventOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventOverviewResponseBody self = new DescribeSuspEventOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventOverviewResponseBody setRemindCount(Integer remindCount) {
        this.remindCount = remindCount;
        return this;
    }
    public Integer getRemindCount() {
        return this.remindCount;
    }

    public DescribeSuspEventOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventOverviewResponseBody setSeriousCount(Integer seriousCount) {
        this.seriousCount = seriousCount;
        return this;
    }
    public Integer getSeriousCount() {
        return this.seriousCount;
    }

    public DescribeSuspEventOverviewResponseBody setSuspiciousCount(Integer suspiciousCount) {
        this.suspiciousCount = suspiciousCount;
        return this;
    }
    public Integer getSuspiciousCount() {
        return this.suspiciousCount;
    }

}
