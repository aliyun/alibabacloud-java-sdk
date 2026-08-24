// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCacheAnalysisJobRequest extends TeaModel {
    /**
     * <p>The ID of the backup file. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to obtain the backup file ID.</p>
     * <ul>
     * <li>To specify multiple backup file IDs, separate them with commas (,), such as <code>12345,67890</code>.</li>
     * <li>If you do not specify this parameter, the system automatically performs a backup and runs cache analysis on the backup file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The instance ID of the Redis instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp18ff4a195d****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data node in the instance. Specify this parameter to query monitoring information of a specific node.</p>
     * <blockquote>
     * <p>If you specify the BackupSetId parameter, this parameter is ignored. You can call the <a href="https://help.aliyun.com/document_detail/473786.html">DescribeLogicInstanceTopology</a> operation to query node IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-x****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The delimiters used to identify key prefixes. You do not need to specify this parameter if the default delimiters <code>:;,_-+@=|#</code> are used.</p>
     * 
     * <strong>example:</strong>
     * <p>&amp;</p>
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
