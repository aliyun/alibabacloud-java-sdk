// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartSessionClusterRequest extends TeaModel {
    /**
     * <p>The queue name.</p>
     * 
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("queueName")
    public String queueName;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sc-xxxxxxxxxxx</p>
     */
    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static StartSessionClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSessionClusterRequest self = new StartSessionClusterRequest();
        return TeaModel.build(map, self);
    }

    public StartSessionClusterRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public StartSessionClusterRequest setSessionClusterId(String sessionClusterId) {
        this.sessionClusterId = sessionClusterId;
        return this;
    }
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    public StartSessionClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
