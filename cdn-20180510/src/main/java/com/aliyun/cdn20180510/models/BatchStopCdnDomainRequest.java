// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStopCdnDomainRequest extends TeaModel {
    /**
     * <p>*   After an accelerated domain name is disabled, Alibaba Cloud CDN retains its information and reroutes all the requests that are destined for the accelerated domain name to the origin.</p>
     * <p>*   If you need to temporarily disable CDN acceleration for a domain name, we recommend that you call the StopDomain operation.</p>
     * <p>*   You can call this operation up to 30 times per second per account.</p>
     * <p>*   You can specify up to 50 domain names in each request.</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchStopCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopCdnDomainRequest self = new BatchStopCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchStopCdnDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchStopCdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchStopCdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
