// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyItemLimitRuleResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Model")
    @Validation(required = true)
    public Boolean model;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyItemLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyItemLimitRuleResponse self = new ModifyItemLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyItemLimitRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyItemLimitRuleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyItemLimitRuleResponse setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public ModifyItemLimitRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
