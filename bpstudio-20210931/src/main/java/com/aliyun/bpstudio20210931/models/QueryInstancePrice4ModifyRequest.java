// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstancePrice4ModifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>002XWH7MXB8MJRU0</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Configuration")
    public java.util.Map<String, ?> configuration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf66k9143r2ch*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryInstancePrice4ModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstancePrice4ModifyRequest self = new QueryInstancePrice4ModifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstancePrice4ModifyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryInstancePrice4ModifyRequest setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public QueryInstancePrice4ModifyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
