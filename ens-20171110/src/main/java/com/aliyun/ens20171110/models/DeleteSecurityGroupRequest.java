// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    public static DeleteSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupRequest self = new DeleteSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DeleteSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
