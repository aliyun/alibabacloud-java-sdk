// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeleteItemLimitRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public Boolean model;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteItemLimitRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemLimitRuleResponseBody self = new DeleteItemLimitRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteItemLimitRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteItemLimitRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteItemLimitRuleResponseBody setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public DeleteItemLimitRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
