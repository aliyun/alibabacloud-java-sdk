// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>云账号唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("CloudAccountExternalId")
    public String cloudAccountExternalId;

    /**
     * <p>云账号名称</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_accout_xxxx</p>
     */
    @NameInMap("CloudAccountName")
    public String cloudAccountName;

    /**
     * <p>云账号提供商名称</p>
     * 
     * <strong>example:</strong>
     * <p>idaas-eiam-oidc-provider</p>
     */
    @NameInMap("CloudAccountProviderName")
    public String cloudAccountProviderName;

    /**
     * <p>云账号类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CloudAccountVendorType")
    public String cloudAccountVendorType;

    /**
     * <p>云账号描述</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_accout_description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
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
