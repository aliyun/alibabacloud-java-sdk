// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateClientsRequest extends TeaModel {
    /**
     * <p>The alert settings. Valid value: INHERITED, which indicates that the HBR client sends alert notifications by using the same method configured for the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>INHERITED</p>
     */
    @NameInMap("AlertSetting")
    public String alertSetting;

    /**
     * <p>The installation information of the HBR clients.</p>
     * 
     * <strong>example:</strong>
     * <p>[  {    &quot;instanceId&quot;: &quot;i-bp116lr<strong><strong><strong>te9q2&quot;,    &quot;accessKeyId&quot;: &quot;&quot;,    &quot;accessKeySecret&quot;: &quot;&quot;,    &quot;clusterId&quot;: &quot;cl-000csy09q</strong></strong></strong>9rfz9&quot;,    &quot;sourceTypes&quot;: [      &quot;HANA&quot;    ]  },  {    &quot;instanceId&quot;: &quot;i-bp116lrux******hte9q4&quot;,    &quot;accessKeyId&quot;: &quot;&quot;,    &quot;accessKeySecret&quot;: &quot;&quot;,    &quot;clusterId&quot;: &quot;cl-000csy09q5094vw9rfz9&quot;,    &quot;sourceTypes&quot;: [      &quot;HANA&quot;    ]  }]</p>
     */
    @NameInMap("ClientInfo")
    public String clientInfo;

    /**
     * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>hbrcrossrole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>SELF_ACCOUNT</strong>: Data is backed up within the same Alibaba Cloud account.</li>
     * <li><strong>CROSS_ACCOUNT</strong>: Data is backed up across Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>158975xxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzvx7d3c4kpny</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to transmit data over HTTPS. Valid values:</p>
     * <ul>
     * <li>true: transmits data over HTTPS.</li>
     * <li>false: transmits data over HTTP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseHttps")
    public Boolean useHttps;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0001ufe******kgm</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientsRequest self = new CreateClientsRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientsRequest setAlertSetting(String alertSetting) {
        this.alertSetting = alertSetting;
        return this;
    }
    public String getAlertSetting() {
        return this.alertSetting;
    }

    public CreateClientsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public CreateClientsRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateClientsRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateClientsRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateClientsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClientsRequest setUseHttps(Boolean useHttps) {
        this.useHttps = useHttps;
        return this;
    }
    public Boolean getUseHttps() {
        return this.useHttps;
    }

    public CreateClientsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
