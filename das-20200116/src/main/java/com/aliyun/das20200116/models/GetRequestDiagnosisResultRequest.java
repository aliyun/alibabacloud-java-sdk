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

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("__context")
    public String context;

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

    public GetRequestDiagnosisResultRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetRequestDiagnosisResultRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
