// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainDnsChallengeRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dm_examplexxxx</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
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
