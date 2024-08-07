// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainDomainProxyTokenRequest extends TeaModel {
    /**
     * <p>域名ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dm_examplexxxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>域名代理Token ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pt_examplexxxx</p>
     */
    @NameInMap("DomainProxyTokenId")
    public String domainProxyTokenId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ObtainDomainProxyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainDomainProxyTokenRequest self = new ObtainDomainProxyTokenRequest();
        return TeaModel.build(map, self);
    }

    public ObtainDomainProxyTokenRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ObtainDomainProxyTokenRequest setDomainProxyTokenId(String domainProxyTokenId) {
        this.domainProxyTokenId = domainProxyTokenId;
        return this;
    }
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    public ObtainDomainProxyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
