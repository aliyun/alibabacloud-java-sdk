// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRequest extends TeaModel {
    /**
     * <p>A client token that ensures the idempotence of the request. The client must generate a unique token for each request. The token must consist of only ASCII characters and be no more than 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The external unique identifier of the cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("CloudAccountExternalId")
    public String cloudAccountExternalId;

    /**
     * <p>The name of the cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_accout_xxxx</p>
     */
    @NameInMap("CloudAccountName")
    public String cloudAccountName;

    /**
     * <p>The name of the identity provider.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas-eiam-oidc-provider</p>
     */
    @NameInMap("CloudAccountProviderName")
    public String cloudAccountProviderName;

    /**
     * <p>The site of the cloud account. Valid values:</p>
     * <ul>
     * <li><p>global: international site</p>
     * </li>
     * <li><p>china_mainland: China mainland site</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>china_mainland</p>
     */
    @NameInMap("CloudAccountSite")
    public String cloudAccountSite;

    /**
     * <p>The type of the cloud account. Valid value:</p>
     * <ul>
     * <li>alibaba_cloud: Alibaba Cloud</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba_cloud(Alibaba Cloud)</p>
     */
    @NameInMap("CloudAccountVendorType")
    public String cloudAccountVendorType;

    /**
     * <p>The description of the cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_accout_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCloudAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountRequest self = new CreateCloudAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudAccountRequest setCloudAccountExternalId(String cloudAccountExternalId) {
        this.cloudAccountExternalId = cloudAccountExternalId;
        return this;
    }
    public String getCloudAccountExternalId() {
        return this.cloudAccountExternalId;
    }

    public CreateCloudAccountRequest setCloudAccountName(String cloudAccountName) {
        this.cloudAccountName = cloudAccountName;
        return this;
    }
    public String getCloudAccountName() {
        return this.cloudAccountName;
    }

    public CreateCloudAccountRequest setCloudAccountProviderName(String cloudAccountProviderName) {
        this.cloudAccountProviderName = cloudAccountProviderName;
        return this;
    }
    public String getCloudAccountProviderName() {
        return this.cloudAccountProviderName;
    }

    public CreateCloudAccountRequest setCloudAccountSite(String cloudAccountSite) {
        this.cloudAccountSite = cloudAccountSite;
        return this;
    }
    public String getCloudAccountSite() {
        return this.cloudAccountSite;
    }

    public CreateCloudAccountRequest setCloudAccountVendorType(String cloudAccountVendorType) {
        this.cloudAccountVendorType = cloudAccountVendorType;
        return this;
    }
    public String getCloudAccountVendorType() {
        return this.cloudAccountVendorType;
    }

    public CreateCloudAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
