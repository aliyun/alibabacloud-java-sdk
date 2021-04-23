// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteStudioLayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStudioLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStudioLayoutResponseBody self = new DeleteStudioLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStudioLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
