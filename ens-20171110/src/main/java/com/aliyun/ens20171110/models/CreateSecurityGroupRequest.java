// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static CreateSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupRequest self = new CreateSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateSecurityGroupRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

}
