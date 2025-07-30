// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainDomainProxyTokenRequest extends TeaModel {
    /**
     * <p>The ID of the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dm_examplexxxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The ID of the proxy token of the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pt_examplexxxx</p>
     */
    @NameInMap("DomainProxyTokenId")
    public String domainProxyTokenId;

    /**
     * <p>The instance ID.</p>
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
