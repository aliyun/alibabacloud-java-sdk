// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationTokensRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>ApplicationToken的类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bearer_token</p>
     */
    @NameInMap("ApplicationTokenType")
    public String applicationTokenType;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListApplicationTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationTokensRequest self = new ListApplicationTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationTokensRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListApplicationTokensRequest setApplicationTokenType(String applicationTokenType) {
        this.applicationTokenType = applicationTokenType;
        return this;
    }
    public String getApplicationTokenType() {
        return this.applicationTokenType;
    }

    public ListApplicationTokensRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
