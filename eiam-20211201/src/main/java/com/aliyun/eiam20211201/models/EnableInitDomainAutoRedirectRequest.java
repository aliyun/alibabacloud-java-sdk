// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableInitDomainAutoRedirectRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableInitDomainAutoRedirectRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInitDomainAutoRedirectRequest self = new EnableInitDomainAutoRedirectRequest();
        return TeaModel.build(map, self);
    }

    public EnableInitDomainAutoRedirectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
