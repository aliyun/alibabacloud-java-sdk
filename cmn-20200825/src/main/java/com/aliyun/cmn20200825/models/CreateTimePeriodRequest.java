// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateTimePeriodRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // cron表达式
    @NameInMap("Expression")
    public String expression;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 描述
    @NameInMap("TimePeriodDescription")
    public String timePeriodDescription;

    // 时间段名称
    @NameInMap("TimePeriodName")
    public String timePeriodName;

    public static CreateTimePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTimePeriodRequest self = new CreateTimePeriodRequest();
        return TeaModel.build(map, self);
    }

    public CreateTimePeriodRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTimePeriodRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateTimePeriodRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTimePeriodRequest setTimePeriodDescription(String timePeriodDescription) {
        this.timePeriodDescription = timePeriodDescription;
        return this;
    }
    public String getTimePeriodDescription() {
        return this.timePeriodDescription;
    }

    public CreateTimePeriodRequest setTimePeriodName(String timePeriodName) {
        this.timePeriodName = timePeriodName;
        return this;
    }
    public String getTimePeriodName() {
        return this.timePeriodName;
    }

}
