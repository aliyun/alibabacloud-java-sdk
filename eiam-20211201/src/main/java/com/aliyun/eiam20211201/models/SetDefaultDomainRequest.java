// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetDefaultDomainRequest extends TeaModel {
    /**
     * <p>域名ID。</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SetDefaultDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultDomainRequest self = new SetDefaultDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public SetDefaultDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
