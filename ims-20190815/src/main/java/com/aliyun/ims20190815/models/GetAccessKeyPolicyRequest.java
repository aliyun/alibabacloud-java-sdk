// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyPolicyRequest extends TeaModel {
    /**
     * <p>The access key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The logon name of the RAM user. </p>
     * <p>If this parameter is left empty, the network access restriction policy of the specified access key for the current user is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetAccessKeyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyPolicyRequest self = new GetAccessKeyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyPolicyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public GetAccessKeyPolicyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
