// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ReleaseExpiredInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw-y3gpqq705****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseExpiredInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseExpiredInstanceRequest self = new ReleaseExpiredInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseExpiredInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
