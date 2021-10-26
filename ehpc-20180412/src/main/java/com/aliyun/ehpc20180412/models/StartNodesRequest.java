// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Instance")
    public java.util.List<StartNodesRequestInstance> instance;

    @NameInMap("Role")
    public String role;

    public static StartNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNodesRequest self = new StartNodesRequest();
        return TeaModel.build(map, self);
    }

    public StartNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StartNodesRequest setInstance(java.util.List<StartNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<StartNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public StartNodesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public static class StartNodesRequestInstance extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static StartNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            StartNodesRequestInstance self = new StartNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public StartNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
