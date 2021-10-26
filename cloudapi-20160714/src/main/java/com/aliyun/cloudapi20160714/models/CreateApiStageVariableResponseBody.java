// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiStageVariableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiStageVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiStageVariableResponseBody self = new CreateApiStageVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiStageVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
