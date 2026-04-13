// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateDetectConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-xxxx</p>
     */
    @NameInMap("detectConfigId")
    public String detectConfigId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stack-xxxxx</p>
     */
    @NameInMap("targetId")
    public String targetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Stack</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static AssociateDetectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateDetectConfigRequest self = new AssociateDetectConfigRequest();
        return TeaModel.build(map, self);
    }

    public AssociateDetectConfigRequest setDetectConfigId(String detectConfigId) {
        this.detectConfigId = detectConfigId;
        return this;
    }
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    public AssociateDetectConfigRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public AssociateDetectConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
