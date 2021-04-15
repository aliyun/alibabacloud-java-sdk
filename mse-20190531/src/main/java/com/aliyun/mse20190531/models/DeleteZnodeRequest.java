// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Path")
    public String path;

    public static DeleteZnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteZnodeRequest self = new DeleteZnodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteZnodeRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public DeleteZnodeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteZnodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
