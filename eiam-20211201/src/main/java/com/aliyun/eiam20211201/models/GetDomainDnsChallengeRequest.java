// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainDnsChallengeRequest extends TeaModel {
    /**
     * <p>域名。</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDomainDnsChallengeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainDnsChallengeRequest self = new GetDomainDnsChallengeRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainDnsChallengeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetDomainDnsChallengeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
