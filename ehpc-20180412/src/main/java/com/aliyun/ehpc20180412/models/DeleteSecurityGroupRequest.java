// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static DeleteSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupRequest self = new DeleteSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
