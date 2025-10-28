// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterMemberRequest extends TeaModel {
    /**
     * <p>The ID of the cluster into which you want to import ECS instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3e3f77b-462e-<strong><strong>-</strong></strong>-bec8727a4dc8</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The ID of the ECS instance that you want to import into the cluster. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze7s2v0b789k60p****</p>
     */
    @NameInMap("instanceIds")
    public String instanceIds;

    /**
     * <p>The logon password of the ECS instance that you want to import into the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YourPassword</p>
     */
    @NameInMap("password")
    public String password;

    public static InsertClusterMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterMemberRequest self = new InsertClusterMemberRequest();
        return TeaModel.build(map, self);
    }

    public InsertClusterMemberRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertClusterMemberRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public InsertClusterMemberRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
