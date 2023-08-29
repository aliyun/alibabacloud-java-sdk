// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowRequest self = new DeleteFlowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteFlowRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
