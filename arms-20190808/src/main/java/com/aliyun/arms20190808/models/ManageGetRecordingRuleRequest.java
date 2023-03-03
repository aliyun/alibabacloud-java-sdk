// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageGetRecordingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("QueryUserId")
    public String queryUserId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ManageGetRecordingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageGetRecordingRuleRequest self = new ManageGetRecordingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ManageGetRecordingRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ManageGetRecordingRuleRequest setQueryUserId(String queryUserId) {
        this.queryUserId = queryUserId;
        return this;
    }
    public String getQueryUserId() {
        return this.queryUserId;
    }

    public ManageGetRecordingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
