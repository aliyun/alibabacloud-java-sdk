// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemLimitRuleResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Model")
    @Validation(required = true)
    public Long model;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RuleId")
    @Validation(required = true)
    public Long ruleId;

    public static AddItemLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddItemLimitRuleResponse self = new AddItemLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddItemLimitRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddItemLimitRuleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddItemLimitRuleResponse setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public AddItemLimitRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddItemLimitRuleResponse setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
