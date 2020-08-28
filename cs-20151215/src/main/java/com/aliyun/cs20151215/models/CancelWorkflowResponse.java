// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CancelWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelWorkflowResponse self = new CancelWorkflowResponse();
        return TeaModel.build(map, self);
    }

}
