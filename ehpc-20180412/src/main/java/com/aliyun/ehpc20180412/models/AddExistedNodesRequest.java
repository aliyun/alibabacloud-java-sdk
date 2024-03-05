// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddExistedNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the image that is specified for the compute nodes. The image must meet the following requirements:</p>
     * <br>
     * <p>*   The operating system that is specified for the image must be the same as that of the existing cluster nodes. For example, if the operating system of the cluster nodes is CentOS, you can select only a CentOS image.</p>
     * <br>
     * <p>>  If you add nodes to a hybrid cloud cluster that supports multiple operating systems, you can select a Windows Server image or a CentOS image when the operating system of the cluster nodes is Windows.</p>
     * <br>
     * <p>*   The major version of the image specified for the compute nodes that you want to add must be the same as that of the image of the cluster. For example, if the version of the cluster image is CentOS 7.x, the version of the image specified for the compute nodes must be CentOS 7.x.</p>
     * <br>
     * <p>You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image ID.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the images. Valid values:</p>
     * <br>
     * <p>*   system: public image.</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
     * <br>
     * <p>Default value: system.</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The information about the node that you want to add.</p>
     */
    @NameInMap("Instance")
    public java.util.List<AddExistedNodesRequestInstance> instance;

    /**
     * <p>The queue in the cluster to which the node is to be added.</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    public static AddExistedNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddExistedNodesRequest self = new AddExistedNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddExistedNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddExistedNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddExistedNodesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public AddExistedNodesRequest setInstance(java.util.List<AddExistedNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<AddExistedNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public AddExistedNodesRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public static class AddExistedNodesRequestInstance extends TeaModel {
        /**
         * <p>The Nth node ID. N starts from 1. Valid values: 1 to 100.</p>
         */
        @NameInMap("Id")
        public String id;

        public static AddExistedNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            AddExistedNodesRequestInstance self = new AddExistedNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public AddExistedNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
