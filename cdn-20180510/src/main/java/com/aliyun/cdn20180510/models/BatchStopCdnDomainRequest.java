// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStopCdnDomainRequest extends TeaModel {
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
