// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddExistedNodesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("Instance")
    public java.util.List<AddExistedNodesRequestInstance> instance;

    @NameInMap("JobQueue")
    public String jobQueue;

    public static AddExistedNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddExistedNodesRequest self = new AddExistedNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddExistedNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
