// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ReleaseInstance")
    public Boolean releaseInstance;

    @NameInMap("Instance")
    public java.util.List<DeleteNodesRequestInstance> instance;

    public static DeleteNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodesRequest self = new DeleteNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodesRequest setReleaseInstance(Boolean releaseInstance) {
        this.releaseInstance = releaseInstance;
        return this;
    }
    public Boolean getReleaseInstance() {
        return this.releaseInstance;
    }

    public DeleteNodesRequest setInstance(java.util.List<DeleteNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<DeleteNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public static class DeleteNodesRequestInstance extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DeleteNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            DeleteNodesRequestInstance self = new DeleteNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public DeleteNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
