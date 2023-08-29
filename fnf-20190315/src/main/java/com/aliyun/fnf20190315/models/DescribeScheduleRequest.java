// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeScheduleRequest extends TeaModel {
    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleName")
    public String scheduleName;

    public static DescribeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleRequest self = new DescribeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribeScheduleRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
