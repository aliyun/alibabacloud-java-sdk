// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetConfigNumListRequest extends TeaModel {
    // 账号名称
    @NameInMap("AccountName")
    public String accountName;

    // 部门ID
    @NameInMap("DepartmentId")
    public Long departmentId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetConfigNumListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigNumListRequest self = new GetConfigNumListRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigNumListRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetConfigNumListRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public GetConfigNumListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
