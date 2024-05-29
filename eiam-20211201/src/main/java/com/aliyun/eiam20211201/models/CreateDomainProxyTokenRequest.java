// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateDomainProxyTokenRequest extends TeaModel {
    /**
     * <p>域名ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDomainProxyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainProxyTokenRequest self = new CreateDomainProxyTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainProxyTokenRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateDomainProxyTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
