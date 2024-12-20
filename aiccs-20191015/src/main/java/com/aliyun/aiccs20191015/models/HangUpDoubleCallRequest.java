// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangUpDoubleCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>68255155****</p>
     */
    @NameInMap("Acid")
    public String acid;

    /**
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static HangUpDoubleCallRequest build(java.util.Map<String, ?> map) throws Exception {
        HangUpDoubleCallRequest self = new HangUpDoubleCallRequest();
        return TeaModel.build(map, self);
    }

    public HangUpDoubleCallRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public HangUpDoubleCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
