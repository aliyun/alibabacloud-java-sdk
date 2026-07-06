// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetAccessKeyPolicyRequest extends TeaModel {
    /**
     * <p>The network access restriction policy.</p>
     * <p>A JSON-formatted string. For more information, see the AccessKeyPolicy structure description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Status&quot;:&quot;Inactive&quot;,&quot;Statements&quot;:[{&quot;Value&quot;:&quot;AllowAllVPC&quot;,&quot;Type&quot;:&quot;VPCWhiteList&quot;,&quot;IPList&quot;:[&quot;::/0&quot;,&quot;0.0.0.0/0&quot;]}]}</p>
     */
    @NameInMap("AccessKeyPolicy")
    public String accessKeyPolicy;

    /**
     * <p>The AccessKey ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>The logon name of the RAM user. </p>
     * <p>If this parameter is left empty, the network access restriction policy is set for the specified AccessKey pair of the current user by default.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static SetAccessKeyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccessKeyPolicyRequest self = new SetAccessKeyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetAccessKeyPolicyRequest setAccessKeyPolicy(String accessKeyPolicy) {
        this.accessKeyPolicy = accessKeyPolicy;
        return this;
    }
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    public SetAccessKeyPolicyRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public SetAccessKeyPolicyRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
