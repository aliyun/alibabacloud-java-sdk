// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartTimedResetOperateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static StartTimedResetOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTimedResetOperateRequest self = new StartTimedResetOperateRequest();
        return TeaModel.build(map, self);
    }

    public StartTimedResetOperateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartTimedResetOperateRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
