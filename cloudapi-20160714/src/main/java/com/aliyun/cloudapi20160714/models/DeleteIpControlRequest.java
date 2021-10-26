// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteIpControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("IpControlId")
    public String ipControlId;

    public static DeleteIpControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpControlRequest self = new DeleteIpControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteIpControlRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

}
