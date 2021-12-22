// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRequest extends TeaModel {
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Version")
    public String version;

    public static DeleteSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupRequest self = new DeleteSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DeleteSecurityGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
