// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterMemberRequest extends TeaModel {
    /**
     * <p>The ID of the cluster into which you want to import ECS instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The ID of the ECS instance that you want to import into the cluster. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("instanceIds")
    public String instanceIds;

    /**
     * <p>The logon password of the ECS instance that you want to import into the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
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
