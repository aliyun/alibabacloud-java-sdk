// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupDynamicRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteMonitorGroupDynamicRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupDynamicRuleResponseBody self = new DeleteMonitorGroupDynamicRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupDynamicRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMonitorGroupDynamicRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMonitorGroupDynamicRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteMonitorGroupDynamicRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
