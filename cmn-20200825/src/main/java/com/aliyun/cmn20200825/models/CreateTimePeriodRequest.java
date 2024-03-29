// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateTimePeriodRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TimePeriodDescription")
    public String timePeriodDescription;

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
