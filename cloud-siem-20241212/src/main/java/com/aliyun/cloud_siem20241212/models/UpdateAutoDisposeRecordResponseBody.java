// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAutoDisposeRecordResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAutoDisposeRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoDisposeRecordResponseBody self = new UpdateAutoDisposeRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoDisposeRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
