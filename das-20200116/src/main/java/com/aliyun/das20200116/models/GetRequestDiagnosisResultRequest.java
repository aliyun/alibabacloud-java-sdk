// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("NodeId")
    public String nodeId;

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

}
