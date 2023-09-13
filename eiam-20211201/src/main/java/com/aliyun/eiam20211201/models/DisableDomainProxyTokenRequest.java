// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableDomainProxyTokenRequest extends TeaModel {
    /**
     * <p>域名ID。</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>域名代理Token ID。</p>
     */
    @NameInMap("DomainProxyTokenId")
    public String domainProxyTokenId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableDomainProxyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDomainProxyTokenRequest self = new DisableDomainProxyTokenRequest();
        return TeaModel.build(map, self);
    }

    public DisableDomainProxyTokenRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DisableDomainProxyTokenRequest setDomainProxyTokenId(String domainProxyTokenId) {
        this.domainProxyTokenId = domainProxyTokenId;
        return this;
    }
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    public DisableDomainProxyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
