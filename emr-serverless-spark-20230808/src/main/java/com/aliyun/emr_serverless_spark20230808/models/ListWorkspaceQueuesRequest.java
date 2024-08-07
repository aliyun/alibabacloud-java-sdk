// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspaceQueuesRequest extends TeaModel {
    /**
     * <p>The environment type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>dev</li>
     * <li>production</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("environment")
    public String environment;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListWorkspaceQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceQueuesRequest self = new ListWorkspaceQueuesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceQueuesRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListWorkspaceQueuesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
