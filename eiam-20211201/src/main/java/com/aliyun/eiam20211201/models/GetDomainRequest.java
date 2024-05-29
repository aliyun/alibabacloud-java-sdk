// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainRequest extends TeaModel {
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

    public static GetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainRequest self = new GetDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
