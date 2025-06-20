// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateSessionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-kvw44e6dn04</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The type of the session corresponding to the session package.</p>
     * 
     * <strong>example:</strong>
     * <p>Valid values: Sol (default): based on serial port Assistant: based on cloud assistant</p>
     */
    @NameInMap("SessionType")
    public String sessionType;

    /**
     * <p>The start time. The value is a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1669340937156</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionRequest self = new CreateSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateSessionRequest setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }
    public String getSessionType() {
        return this.sessionType;
    }

    public CreateSessionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
