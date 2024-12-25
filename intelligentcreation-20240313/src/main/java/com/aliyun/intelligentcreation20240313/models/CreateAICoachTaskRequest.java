// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>541E7123-2E8A-5BA2-AC38-665650C84129</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    @NameInMap("studentId")
    public String studentId;

    public static CreateAICoachTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskRequest self = new CreateAICoachTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAICoachTaskRequest setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public CreateAICoachTaskRequest setStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }
    public String getStudentId() {
        return this.studentId;
    }

}
