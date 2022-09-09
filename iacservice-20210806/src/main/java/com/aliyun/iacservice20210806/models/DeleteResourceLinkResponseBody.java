// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteResourceLinkResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteResourceLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceLinkResponseBody self = new DeleteResourceLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
