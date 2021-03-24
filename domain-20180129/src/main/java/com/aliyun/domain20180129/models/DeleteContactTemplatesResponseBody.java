// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesResponseBody self = new DeleteContactTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
