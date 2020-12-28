// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddSecurityGroupRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityGroupRequest self = new AddSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddSecurityGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AddSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
