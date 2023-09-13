// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableDomainProxyTokenRequest extends TeaModel {
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

    public static EnableDomainProxyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDomainProxyTokenRequest self = new EnableDomainProxyTokenRequest();
        return TeaModel.build(map, self);
    }

    public EnableDomainProxyTokenRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public EnableDomainProxyTokenRequest setDomainProxyTokenId(String domainProxyTokenId) {
        this.domainProxyTokenId = domainProxyTokenId;
        return this;
    }
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    public EnableDomainProxyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
