// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceImageTemplateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceImageTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceImageTemplateResponseBody self = new DeleteFaceImageTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceImageTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
