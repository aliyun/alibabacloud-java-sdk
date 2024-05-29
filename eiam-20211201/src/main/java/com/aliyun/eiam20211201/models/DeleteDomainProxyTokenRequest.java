// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteDomainProxyTokenRequest extends TeaModel {
    /**
     * <p>域名ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>域名代理Token ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainProxyTokenId")
    public String domainProxyTokenId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDomainProxyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainProxyTokenRequest self = new DeleteDomainProxyTokenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainProxyTokenRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DeleteDomainProxyTokenRequest setDomainProxyTokenId(String domainProxyTokenId) {
        this.domainProxyTokenId = domainProxyTokenId;
        return this;
    }
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    public DeleteDomainProxyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
