// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteJobTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplatesResponseBody self = new DeleteJobTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
