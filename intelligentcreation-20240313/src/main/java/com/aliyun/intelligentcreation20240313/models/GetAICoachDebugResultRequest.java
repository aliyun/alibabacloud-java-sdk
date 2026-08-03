// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachDebugResultRequest extends TeaModel {
    @NameInMap("dataId")
    public String dataId;

    @NameInMap("dataType")
    public String dataType;

    @NameInMap("scriptDebugId")
    public String scriptDebugId;

    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    @NameInMap("scriptSnapshotId")
    public String scriptSnapshotId;

    @NameInMap("taskId")
    public String taskId;

    public static GetAICoachDebugResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachDebugResultRequest self = new GetAICoachDebugResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachDebugResultRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetAICoachDebugResultRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetAICoachDebugResultRequest setScriptDebugId(String scriptDebugId) {
        this.scriptDebugId = scriptDebugId;
        return this;
    }
    public String getScriptDebugId() {
        return this.scriptDebugId;
    }

    public GetAICoachDebugResultRequest setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public GetAICoachDebugResultRequest setScriptSnapshotId(String scriptSnapshotId) {
        this.scriptSnapshotId = scriptSnapshotId;
        return this;
    }
    public String getScriptSnapshotId() {
        return this.scriptSnapshotId;
    }

    public GetAICoachDebugResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
