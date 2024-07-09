// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStartCdnDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchStartCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStartCdnDomainRequest self = new BatchStartCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchStartCdnDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchStartCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchStartCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
