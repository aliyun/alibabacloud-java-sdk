// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAllDepartmentRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAllDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllDepartmentRequest self = new GetAllDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public GetAllDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
