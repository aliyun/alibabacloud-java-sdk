// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class DepartmentRoleCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>member</p>
     */
    @NameInMap("roleCode")
    public String roleCode;

    public static DepartmentRoleCmd build(java.util.Map<String, ?> map) throws Exception {
        DepartmentRoleCmd self = new DepartmentRoleCmd();
        return TeaModel.build(map, self);
    }

    public DepartmentRoleCmd setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public DepartmentRoleCmd setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

}
