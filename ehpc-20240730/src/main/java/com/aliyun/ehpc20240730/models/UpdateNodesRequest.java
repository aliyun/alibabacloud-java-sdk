// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateNodesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about the compute nodes that you want to update.</p>
     */
    @NameInMap("Instances")
    public java.util.List<UpdateNodesRequestInstances> instances;

    public static UpdateNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodesRequest self = new UpdateNodesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateNodesRequest setInstances(java.util.List<UpdateNodesRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UpdateNodesRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UpdateNodesRequestInstances extends TeaModel {
        /**
         * <p>The instance ID of the compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1bzqq1ddeemuddn****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Specifies whether to enable deletion protection for the compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepAlive")
        public Boolean keepAlive;

        public static UpdateNodesRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodesRequestInstances self = new UpdateNodesRequestInstances();
            return TeaModel.build(map, self);
        }

        public UpdateNodesRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateNodesRequestInstances setKeepAlive(Boolean keepAlive) {
            this.keepAlive = keepAlive;
            return this;
        }
        public Boolean getKeepAlive() {
            return this.keepAlive;
        }

    }

}
