// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceQuotaRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>配额类型，QuotaEnum</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>userMaxNumber</p>
     */
    @NameInMap("QuotaKey")
    public String quotaKey;

    public static GetInstanceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceQuotaRequest self = new GetInstanceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceQuotaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceQuotaRequest setQuotaKey(String quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }
    public String getQuotaKey() {
        return this.quotaKey;
    }

}
