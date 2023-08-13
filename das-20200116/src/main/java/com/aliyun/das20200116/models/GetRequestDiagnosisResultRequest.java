// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique ID of the diagnostics task. You can call the [CreateRequestDiagnosis](~~341609~~) operation to query the diagnostics task ID.</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  You must specify the node ID if your database instance is a PolarDB for MySQL cluster, a PolarDB for PostgreSQL (compatible with Oracle) instance, or an ApsaraDB for MongoDB database.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The source of the task.</p>
     * <br>
     * <p>>  This parameter is required if you call this operation in the DAS console. You do not need to specify this parameter when you call this operation.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The SQL template ID.</p>
     * <br>
     * <p>>  This parameter is required if you call this operation in the DAS console. You do not need to specify this parameter when you call this operation.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    public static GetRequestDiagnosisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisResultRequest self = new GetRequestDiagnosisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRequestDiagnosisResultRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public GetRequestDiagnosisResultRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetRequestDiagnosisResultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetRequestDiagnosisResultRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

}
