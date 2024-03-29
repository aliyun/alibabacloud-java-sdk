// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DialExRequest extends TeaModel {
    @NameInMap("AnswerMode")
    public Integer answerMode;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("RoutPoint")
    public String routPoint;

    public static DialExRequest build(java.util.Map<String, ?> map) throws Exception {
        DialExRequest self = new DialExRequest();
        return TeaModel.build(map, self);
    }

    public DialExRequest setAnswerMode(Integer answerMode) {
        this.answerMode = answerMode;
        return this;
    }
    public Integer getAnswerMode() {
        return this.answerMode;
    }

    public DialExRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public DialExRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public DialExRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DialExRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public DialExRequest setRoutPoint(String routPoint) {
        this.routPoint = routPoint;
        return this;
    }
    public String getRoutPoint() {
        return this.routPoint;
    }

}
