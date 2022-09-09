// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteParameterSetResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteParameterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterSetResponseBody self = new DeleteParameterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteParameterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
