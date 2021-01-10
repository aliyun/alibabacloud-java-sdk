// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckMpServerlessRoleExistsRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    public static CheckMpServerlessRoleExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMpServerlessRoleExistsRequest self = new CheckMpServerlessRoleExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckMpServerlessRoleExistsRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
