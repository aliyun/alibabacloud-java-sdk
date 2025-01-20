// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchCreateAICoachTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7915125A-0D96-5A25-A54B-D3B739A86AFC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    @NameInMap("studentIds")
    public java.util.List<String> studentIds;

    public static BatchCreateAICoachTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateAICoachTaskRequest self = new BatchCreateAICoachTaskRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateAICoachTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateAICoachTaskRequest setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public BatchCreateAICoachTaskRequest setStudentIds(java.util.List<String> studentIds) {
        this.studentIds = studentIds;
        return this;
    }
    public java.util.List<String> getStudentIds() {
        return this.studentIds;
    }

}
