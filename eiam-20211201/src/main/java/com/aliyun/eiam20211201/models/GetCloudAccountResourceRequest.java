// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountResourceRequest extends TeaModel {
    /**
     * <p>The cloud account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012xxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The cloud account resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>car_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("CloudAccountResourceId")
    public String cloudAccountResourceId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCloudAccountResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountResourceRequest self = new GetCloudAccountResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountResourceRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public GetCloudAccountResourceRequest setCloudAccountResourceId(String cloudAccountResourceId) {
        this.cloudAccountResourceId = cloudAccountResourceId;
        return this;
    }
    public String getCloudAccountResourceId() {
        return this.cloudAccountResourceId;
    }

    public GetCloudAccountResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
