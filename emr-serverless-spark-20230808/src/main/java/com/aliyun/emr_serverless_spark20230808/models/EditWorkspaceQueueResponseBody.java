// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class EditWorkspaceQueueResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EditWorkspaceQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditWorkspaceQueueResponseBody self = new EditWorkspaceQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public EditWorkspaceQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
