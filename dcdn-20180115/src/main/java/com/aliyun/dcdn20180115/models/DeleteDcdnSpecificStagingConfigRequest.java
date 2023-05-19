// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSpecificStagingConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration to be deleted. You can specify multiple configuration IDs and separate them with commas (,).</p>
     * <br>
     * <p>You can call the DescribeDcdnDomainStagingConfig operation to query the environment configuration.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteDcdnSpecificStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSpecificStagingConfigRequest self = new DeleteDcdnSpecificStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSpecificStagingConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteDcdnSpecificStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteDcdnSpecificStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDcdnSpecificStagingConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
