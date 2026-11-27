// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteQualityRuleRequest extends TeaModel {
    /**
     * <p>The ID of the quality check rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5369</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRuleRequest self = new DeleteQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteQualityRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
