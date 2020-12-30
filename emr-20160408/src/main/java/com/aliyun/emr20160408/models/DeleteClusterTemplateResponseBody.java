// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteClusterTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClusterTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterTemplateResponseBody self = new DeleteClusterTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
