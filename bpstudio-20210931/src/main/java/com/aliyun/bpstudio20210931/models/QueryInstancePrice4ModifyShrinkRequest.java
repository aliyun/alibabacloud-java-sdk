// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstancePrice4ModifyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>002XWH7MXB8MJRU0</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Configuration")
    public String configurationShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf66k9143r2ch*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryInstancePrice4ModifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstancePrice4ModifyShrinkRequest self = new QueryInstancePrice4ModifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstancePrice4ModifyShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryInstancePrice4ModifyShrinkRequest setConfigurationShrink(String configurationShrink) {
        this.configurationShrink = configurationShrink;
        return this;
    }
    public String getConfigurationShrink() {
        return this.configurationShrink;
    }

    public QueryInstancePrice4ModifyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
