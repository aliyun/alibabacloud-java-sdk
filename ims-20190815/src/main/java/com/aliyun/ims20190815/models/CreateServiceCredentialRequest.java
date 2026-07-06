// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateServiceCredentialRequest extends TeaModel {
    /**
     * <p>The expiration time of the service credential, in days.
     * Valid values: 1 to 36600.
     * If this parameter is not specified, the service credential is permanently valid.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("CredentialAgeDays")
    public Integer credentialAgeDays;

    /**
     * <p>The service credential name.
     * The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourServiceCredentialName</p>
     */
    @NameInMap("ServiceCredentialName")
    public String serviceCredentialName;

    /**
     * <p>The Alibaba Cloud service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.aliyuncs.com</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The logon name of the RAM user.
     * If this parameter is left empty, a service credential is created for the current user by default.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static CreateServiceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCredentialRequest self = new CreateServiceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceCredentialRequest setCredentialAgeDays(Integer credentialAgeDays) {
        this.credentialAgeDays = credentialAgeDays;
        return this;
    }
    public Integer getCredentialAgeDays() {
        return this.credentialAgeDays;
    }

    public CreateServiceCredentialRequest setServiceCredentialName(String serviceCredentialName) {
        this.serviceCredentialName = serviceCredentialName;
        return this;
    }
    public String getServiceCredentialName() {
        return this.serviceCredentialName;
    }

    public CreateServiceCredentialRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateServiceCredentialRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
