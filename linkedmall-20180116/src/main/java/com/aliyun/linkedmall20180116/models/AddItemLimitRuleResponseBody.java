// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemLimitRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Code")
    public String code;

    public static AddItemLimitRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddItemLimitRuleResponseBody self = new AddItemLimitRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddItemLimitRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddItemLimitRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddItemLimitRuleResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public AddItemLimitRuleResponseBody setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public AddItemLimitRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
