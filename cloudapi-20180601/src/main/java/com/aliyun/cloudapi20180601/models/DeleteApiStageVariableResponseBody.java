// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DeleteApiStageVariableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiStageVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiStageVariableResponseBody self = new DeleteApiStageVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiStageVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
