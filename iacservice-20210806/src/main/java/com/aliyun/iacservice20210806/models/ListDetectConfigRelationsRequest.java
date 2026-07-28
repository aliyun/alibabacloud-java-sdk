// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListDetectConfigRelationsRequest extends TeaModel {
    /**
     * <p>Drift detection configuration ID</p>
     * 
     * <strong>example:</strong>
     * <p>dc-xxxx</p>
     */
    @NameInMap("detectConfigId")
    public String detectConfigId;

    /**
     * <p>Target ID to associate. StackId or TaskId</p>
     * 
     * <strong>example:</strong>
     * <p>stack-xxxxx</p>
     */
    @NameInMap("targetId")
    public String targetId;

    /**
     * <p>Type of the association target</p>
     * <ul>
     * <li>Task: orchestration Job  </li>
     * <li>Stack: resource stack</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Stack</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static ListDetectConfigRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectConfigRelationsRequest self = new ListDetectConfigRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectConfigRelationsRequest setDetectConfigId(String detectConfigId) {
        this.detectConfigId = detectConfigId;
        return this;
    }
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    public ListDetectConfigRelationsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListDetectConfigRelationsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
