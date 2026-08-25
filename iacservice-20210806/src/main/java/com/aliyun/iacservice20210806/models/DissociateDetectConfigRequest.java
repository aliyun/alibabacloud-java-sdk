// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateDetectConfigRequest extends TeaModel {
    /**
     * <p>The ID of the drift detection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-xxxx</p>
     */
    @NameInMap("detectConfigId")
    public String detectConfigId;

    /**
     * <p>The ID of the association target. The value is a StackId or TaskId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stack-xxxx</p>
     */
    @NameInMap("targetId")
    public String targetId;

    /**
     * <p>The type of the association target. Valid values:</p>
     * <ul>
     * <li>Task: orchestration task.</li>
     * <li>Stack: resource stack.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Stack</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static DissociateDetectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateDetectConfigRequest self = new DissociateDetectConfigRequest();
        return TeaModel.build(map, self);
    }

    public DissociateDetectConfigRequest setDetectConfigId(String detectConfigId) {
        this.detectConfigId = detectConfigId;
        return this;
    }
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    public DissociateDetectConfigRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public DissociateDetectConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
