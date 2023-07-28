// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchStopDcdnDomainRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. If you need to specify multiple accelerated domain names, separate domain names with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchStopDcdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopDcdnDomainRequest self = new BatchStopDcdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public BatchStopDcdnDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchStopDcdnDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchStopDcdnDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
