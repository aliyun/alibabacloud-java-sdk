// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static BatchRobotSmartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRobotSmartCallResponse self = new BatchRobotSmartCallResponse();
        return TeaModel.build(map, self);
    }

}
