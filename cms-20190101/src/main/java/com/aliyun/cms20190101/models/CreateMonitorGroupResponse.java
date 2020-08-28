// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupResponse extends TeaModel {
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

    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    public static CreateMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupResponse self = new CreateMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

}
