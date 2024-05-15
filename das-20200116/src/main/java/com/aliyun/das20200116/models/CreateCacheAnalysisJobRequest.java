// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisJobRequest extends TeaModel {
    /**
     * <p>The ID of the backup file. You can call the [DescribeBackups](https://help.aliyun.com/document_detail/61081.html) operation to query the ID.</p>
     * <br>
     * <p>*   If you need to specify multiple backup file IDs, separate them with commas (,). For example, you can set this parameter to `12345,67890`.</p>
     * <p>*   If you do not specify this parameter, the system automatically backs up the task and performs cache analysis on the backup file.</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The ID of the ApsaraDB for Redis instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data node on the instance. You can specify this parameter to query the monitoring information about the specified node.</p>
     * <br>
     * <p>>  If you specify the BackupSetId parameter, the system ignores the NodeId parameter. You can call the [DescribeLogicInstanceTopology](https://help.aliyun.com/document_detail/94665.html) operation to query the node ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The delimiters used to identify the prefixes of keys. You do not need to specify this parameter if one or more of the following default delimiters are used: `: ; , _ - + @ = | #`</p>
     */
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
