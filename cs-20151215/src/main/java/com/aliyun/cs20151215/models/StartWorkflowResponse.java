// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StartWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static StartWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowResponse self = new StartWorkflowResponse();
        return TeaModel.build(map, self);
    }

}
