// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventOverviewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SeriousCount")
    @Validation(required = true)
    public Integer seriousCount;

    @NameInMap("SuspiciousCount")
    @Validation(required = true)
    public Integer suspiciousCount;

    @NameInMap("RemindCount")
    @Validation(required = true)
    public Integer remindCount;

    public static DescribeSuspEventOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventOverviewResponse self = new DescribeSuspEventOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventOverviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventOverviewResponse setSeriousCount(Integer seriousCount) {
        this.seriousCount = seriousCount;
        return this;
    }
    public Integer getSeriousCount() {
        return this.seriousCount;
    }

    public DescribeSuspEventOverviewResponse setSuspiciousCount(Integer suspiciousCount) {
        this.suspiciousCount = suspiciousCount;
        return this;
    }
    public Integer getSuspiciousCount() {
        return this.suspiciousCount;
    }

    public DescribeSuspEventOverviewResponse setRemindCount(Integer remindCount) {
        this.remindCount = remindCount;
        return this;
    }
    public Integer getRemindCount() {
        return this.remindCount;
    }

}
