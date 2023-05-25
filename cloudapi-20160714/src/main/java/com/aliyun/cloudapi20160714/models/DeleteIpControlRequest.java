// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteIpControlRequest extends TeaModel {
    /**
     * <p>*   This operation is intended for API providers.</p>
     * <p>*   If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.</p>
     * <p>*   If you call this operation on an ACL that does not exist, a success message is returned.</p>
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
