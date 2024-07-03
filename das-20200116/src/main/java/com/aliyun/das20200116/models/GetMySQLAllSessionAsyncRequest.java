// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetMySQLAllSessionAsyncRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> Only ApsaraDB RDS for MySQL, PolarDB for MySQL, and PolarDB-X 2.0 instances are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> You must specify this parameter for PolarDB for MySQL clusters. If you do not specify a node ID, the session data of the primary node is returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-wz954ryd8f893****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The asynchronous request ID.</p>
     * <blockquote>
     * <p> GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a <strong>request ID</strong>. You need to use the <strong>request ID</strong> to initiate requests until the value of the <strong>isFinish</strong> field in the returned results is <strong>true</strong>, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>async__507044db6c4eadfa2dab9b084e80****</p>
     */
    @NameInMap("ResultId")
    public String resultId;

    public static GetMySQLAllSessionAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMySQLAllSessionAsyncRequest self = new GetMySQLAllSessionAsyncRequest();
        return TeaModel.build(map, self);
    }

    public GetMySQLAllSessionAsyncRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMySQLAllSessionAsyncRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetMySQLAllSessionAsyncRequest setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }
    public String getResultId() {
        return this.resultId;
    }

}
