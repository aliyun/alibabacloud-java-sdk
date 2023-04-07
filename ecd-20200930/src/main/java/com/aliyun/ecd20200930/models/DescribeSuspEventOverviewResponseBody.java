// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventOverviewResponseBody extends TeaModel {
    /**
     * <p>The total number of alerts at the remind level.</p>
     */
    @NameInMap("RemindCount")
    public Integer remindCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of alerts at the serious level.</p>
     */
    @NameInMap("SeriousCount")
    public Integer seriousCount;

    /**
     * <p>The total number of alerts at the suspicious level.</p>
     */
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
