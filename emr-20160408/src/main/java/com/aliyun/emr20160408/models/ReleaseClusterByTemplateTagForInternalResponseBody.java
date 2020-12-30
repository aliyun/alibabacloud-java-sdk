// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ReleaseClusterByTemplateTagForInternalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseClusterByTemplateTagForInternalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterByTemplateTagForInternalResponseBody self = new ReleaseClusterByTemplateTagForInternalResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterByTemplateTagForInternalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
