// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetServiceCredentialRequest extends TeaModel {
    /**
     * <p>The service credential ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SC****************</p>
     */
    @NameInMap("ServiceCredentialId")
    public String serviceCredentialId;

    /**
     * <p>The logon name of the Resource Access Management (RAM) user.
     * If not specified, the service credential of the current caller identity that invokes this operation is retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetServiceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceCredentialRequest self = new GetServiceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceCredentialRequest setServiceCredentialId(String serviceCredentialId) {
        this.serviceCredentialId = serviceCredentialId;
        return this;
    }
    public String getServiceCredentialId() {
        return this.serviceCredentialId;
    }

    public GetServiceCredentialRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
