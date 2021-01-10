// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeAccountSummaryResponseBody extends TeaModel {
    @NameInMap("InstanceCount")
    public Long instanceCount;

    @NameInMap("OnlineInstanceCount")
    public Long onlineInstanceCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InvocationCount")
    public Long invocationCount;

    @NameInMap("DailyInvocationErrorCount")
    public Long dailyInvocationErrorCount;

    public static DescribeAccountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountSummaryResponseBody self = new DescribeAccountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountSummaryResponseBody setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public DescribeAccountSummaryResponseBody setOnlineInstanceCount(Long onlineInstanceCount) {
        this.onlineInstanceCount = onlineInstanceCount;
        return this;
    }
    public Long getOnlineInstanceCount() {
        return this.onlineInstanceCount;
    }

    public DescribeAccountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountSummaryResponseBody setInvocationCount(Long invocationCount) {
        this.invocationCount = invocationCount;
        return this;
    }
    public Long getInvocationCount() {
        return this.invocationCount;
    }

    public DescribeAccountSummaryResponseBody setDailyInvocationErrorCount(Long dailyInvocationErrorCount) {
        this.dailyInvocationErrorCount = dailyInvocationErrorCount;
        return this;
    }
    public Long getDailyInvocationErrorCount() {
        return this.dailyInvocationErrorCount;
    }

}
