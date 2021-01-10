// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterVideoResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCasterVideoResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterVideoResourceResponseBody self = new DeleteCasterVideoResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterVideoResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
