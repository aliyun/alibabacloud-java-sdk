// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateZnodeRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Path")
    public String path;

    @NameInMap("Data")
    public String data;

    public static UpdateZnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZnodeRequest self = new UpdateZnodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZnodeRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public UpdateZnodeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateZnodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateZnodeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
