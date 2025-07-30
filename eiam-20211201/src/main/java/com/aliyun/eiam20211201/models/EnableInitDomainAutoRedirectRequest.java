// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableInitDomainAutoRedirectRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
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
