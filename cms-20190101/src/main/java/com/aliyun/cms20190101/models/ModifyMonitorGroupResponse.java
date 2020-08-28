// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupResponse extends TeaModel {
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

    public static ModifyMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupResponse self = new ModifyMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

}
