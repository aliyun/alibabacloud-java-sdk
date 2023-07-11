// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisJobRequest extends TeaModel {
    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Separators")
    public String separators;

    public static CreateCacheAnalysisJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheAnalysisJobRequest self = new CreateCacheAnalysisJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateCacheAnalysisJobRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateCacheAnalysisJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCacheAnalysisJobRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateCacheAnalysisJobRequest setSeparators(String separators) {
        this.separators = separators;
        return this;
    }
    public String getSeparators() {
        return this.separators;
    }

}
