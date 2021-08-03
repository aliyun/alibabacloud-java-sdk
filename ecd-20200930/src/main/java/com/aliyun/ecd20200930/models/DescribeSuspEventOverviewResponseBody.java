// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventOverviewResponseBody extends TeaModel {
    @NameInMap("SuspiciousCount")
    public Integer suspiciousCount;

    @NameInMap("RemindCount")
    public Integer remindCount;

    @NameInMap("SeriousCount")
    public Integer seriousCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSuspEventOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventOverviewResponseBody self = new DescribeSuspEventOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventOverviewResponseBody setSuspiciousCount(Integer suspiciousCount) {
        this.suspiciousCount = suspiciousCount;
        return this;
    }
    public Integer getSuspiciousCount() {
        return this.suspiciousCount;
    }

    public DescribeSuspEventOverviewResponseBody setRemindCount(Integer remindCount) {
        this.remindCount = remindCount;
        return this;
    }
    public Integer getRemindCount() {
        return this.remindCount;
    }

    public DescribeSuspEventOverviewResponseBody setSeriousCount(Integer seriousCount) {
        this.seriousCount = seriousCount;
        return this;
    }
    public Integer getSeriousCount() {
        return this.seriousCount;
    }

    public DescribeSuspEventOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
