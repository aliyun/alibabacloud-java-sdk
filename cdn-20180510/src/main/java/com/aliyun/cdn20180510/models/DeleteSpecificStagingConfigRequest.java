// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificStagingConfigRequest extends TeaModel {
    /**
     * <p>The configuration IDs. Separate configuration IDs with commas (,). For more information about ConfigId, see <a href="https://help.aliyun.com/document_detail/388994.html">Usage notes on ConfigId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2317</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The accelerated domain name. You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteSpecificStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificStagingConfigRequest self = new DeleteSpecificStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificStagingConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteSpecificStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteSpecificStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSpecificStagingConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
