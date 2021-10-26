// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CheckInstanceSupportStageNameRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CheckInstanceSupportStageNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceSupportStageNameRequest self = new CheckInstanceSupportStageNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceSupportStageNameRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CheckInstanceSupportStageNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
