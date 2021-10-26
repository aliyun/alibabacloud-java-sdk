// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Instance")
    public java.util.List<StopNodesRequestInstance> instance;

    @NameInMap("Role")
    public String role;

    public static StopNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopNodesRequest self = new StopNodesRequest();
        return TeaModel.build(map, self);
    }

    public StopNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopNodesRequest setInstance(java.util.List<StopNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<StopNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public StopNodesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public static class StopNodesRequestInstance extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static StopNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            StopNodesRequestInstance self = new StopNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public StopNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
