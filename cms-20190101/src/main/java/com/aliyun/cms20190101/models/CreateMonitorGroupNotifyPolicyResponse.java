// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Integer result;

    public static CreateMonitorGroupNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupNotifyPolicyResponse self = new CreateMonitorGroupNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

}
