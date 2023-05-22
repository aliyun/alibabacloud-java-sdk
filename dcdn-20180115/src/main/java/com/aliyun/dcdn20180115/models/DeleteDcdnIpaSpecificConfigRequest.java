// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnIpaSpecificConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. You can call the [DescribeDcdnDomainConfigs](~~130625~~) operation to query configuration IDs.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteDcdnIpaSpecificConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnIpaSpecificConfigRequest self = new DeleteDcdnIpaSpecificConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnIpaSpecificConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteDcdnIpaSpecificConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteDcdnIpaSpecificConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDcdnIpaSpecificConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
