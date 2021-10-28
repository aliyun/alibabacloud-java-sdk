// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangUpDoubleCallRequest extends TeaModel {
    // 会话ID
    @NameInMap("Acid")
    public String acid;

    // 实例ID
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
