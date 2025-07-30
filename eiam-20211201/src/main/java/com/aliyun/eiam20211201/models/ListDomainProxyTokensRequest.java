// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainProxyTokensRequest extends TeaModel {
    /**
     * <p>The domain ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dm_examplexxxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDomainProxyTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainProxyTokensRequest self = new ListDomainProxyTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainProxyTokensRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ListDomainProxyTokensRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
