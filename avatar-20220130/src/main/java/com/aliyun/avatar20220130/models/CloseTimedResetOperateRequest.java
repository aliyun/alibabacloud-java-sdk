// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CloseTimedResetOperateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static CloseTimedResetOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTimedResetOperateRequest self = new CloseTimedResetOperateRequest();
        return TeaModel.build(map, self);
    }

    public CloseTimedResetOperateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloseTimedResetOperateRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
