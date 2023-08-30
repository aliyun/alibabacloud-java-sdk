// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchStartDcdnDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify multiple accelerated domain names and separate them with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchStartDcdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStartDcdnDomainRequest self = new BatchStartDcdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchStartDcdnDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchStartDcdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchStartDcdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
