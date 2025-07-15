// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSpecificStagingConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration that you want to delete. If you want to specify multiple IDs, separate them with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/297374.html">DescribeLiveDomainStagingConfig</a> operation to obtain the configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6295</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The accelerated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>developer.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteLiveSpecificStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSpecificStagingConfigRequest self = new DeleteLiveSpecificStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSpecificStagingConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteLiveSpecificStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveSpecificStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveSpecificStagingConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
