// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateServiceCredentialRequest extends TeaModel {
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
     * <p>The name of the service credential. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). Specify at least one of Status and ServiceCredentialName.</p>
     * 
     * <strong>example:</strong>
     * <p>yourServiceCredentialName</p>
     */
    @NameInMap("ServiceCredentialName")
    public String serviceCredentialName;

    /**
     * <p>The status of the service credential. Valid values:</p>
     * <ul>
     * <li>Active</li>
     * <li>Inactive</li>
     * </ul>
     * <p>Specify at least one of Status and ServiceCredentialName.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The logon name of the Resource Access Management (RAM) user. If this parameter is not specified, the service credential of the identity that invokes this operation is modified.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UpdateServiceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceCredentialRequest self = new UpdateServiceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceCredentialRequest setServiceCredentialId(String serviceCredentialId) {
        this.serviceCredentialId = serviceCredentialId;
        return this;
    }
    public String getServiceCredentialId() {
        return this.serviceCredentialId;
    }

    public UpdateServiceCredentialRequest setServiceCredentialName(String serviceCredentialName) {
        this.serviceCredentialName = serviceCredentialName;
        return this;
    }
    public String getServiceCredentialName() {
        return this.serviceCredentialName;
    }

    public UpdateServiceCredentialRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateServiceCredentialRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
