// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificConfigRequest extends TeaModel {
    // The configuration IDs. Separate configuration IDs with commas (,). For more information about ConfigId, see [Usage notes on ConfigId](~~388994~~).
    @NameInMap("ConfigId")
    public String configId;

    // The accelerated domain name. You can specify only one domain name.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteSpecificConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificConfigRequest self = new DeleteSpecificConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteSpecificConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteSpecificConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSpecificConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
