// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteIpControlRequest extends TeaModel {
    /**
     * <p>The ID of the ACL. The ID is unique.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteIpControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpControlRequest self = new DeleteIpControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpControlRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public DeleteIpControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
