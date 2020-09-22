// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DeleteClusterNodeQuery extends TeaModel {
    @NameInMap("force")
    public String force;

    @NameInMap("releaseInstance")
    public String releaseInstance;

    public static DeleteClusterNodeQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodeQuery self = new DeleteClusterNodeQuery();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodeQuery setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public DeleteClusterNodeQuery setReleaseInstance(String releaseInstance) {
        this.releaseInstance = releaseInstance;
        return this;
    }
    public String getReleaseInstance() {
        return this.releaseInstance;
    }

}
