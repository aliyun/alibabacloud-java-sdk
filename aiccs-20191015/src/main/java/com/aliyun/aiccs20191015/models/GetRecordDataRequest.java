// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordDataRequest extends TeaModel {
    /**
     * <p>Session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001067****</p>
     */
    @NameInMap("Acid")
    public String acid;

    /**
     * <p>Instance ID.</p>
     * <p>Log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> and view the instance ID in <strong>Instance Management</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecordDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordDataRequest self = new GetRecordDataRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordDataRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public GetRecordDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
