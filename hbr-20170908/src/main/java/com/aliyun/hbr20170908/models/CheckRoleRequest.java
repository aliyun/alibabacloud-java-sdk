// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CheckRoleRequest extends TeaModel {
    @NameInMap("CheckRoleType")
    public String checkRoleType;

    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    public static CheckRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRoleRequest self = new CheckRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckRoleRequest setCheckRoleType(String checkRoleType) {
        this.checkRoleType = checkRoleType;
        return this;
    }
    public String getCheckRoleType() {
        return this.checkRoleType;
    }

    public CheckRoleRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CheckRoleRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

}
