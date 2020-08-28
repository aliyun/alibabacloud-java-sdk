// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static PutMonitorGroupDynamicRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMonitorGroupDynamicRuleResponse self = new PutMonitorGroupDynamicRuleResponse();
        return TeaModel.build(map, self);
    }

}
