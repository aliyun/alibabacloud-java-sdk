// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyItemLimitRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public Boolean model;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyItemLimitRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyItemLimitRuleResponseBody self = new ModifyItemLimitRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyItemLimitRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyItemLimitRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyItemLimitRuleResponseBody setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public ModifyItemLimitRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
