// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableInitDomainAutoRedirectRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableInitDomainAutoRedirectRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInitDomainAutoRedirectRequest self = new DisableInitDomainAutoRedirectRequest();
        return TeaModel.build(map, self);
    }

    public DisableInitDomainAutoRedirectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
