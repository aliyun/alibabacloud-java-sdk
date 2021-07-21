// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class OperateResourceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static OperateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateResourceResponseBody self = new OperateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateResourceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
