// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100****2077</p>
     */
    @NameInMap("Acid")
    public String acid;

    /**
     * <p>The AICCS instance ID. You can obtain the ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineMessageLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogRequest self = new GetHotlineMessageLogRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public GetHotlineMessageLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
