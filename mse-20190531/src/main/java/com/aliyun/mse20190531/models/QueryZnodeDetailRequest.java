// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryZnodeDetailRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Path")
    public String path;

    @NameInMap("RequestPars")
    public String requestPars;

    public static QueryZnodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryZnodeDetailRequest self = new QueryZnodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryZnodeDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryZnodeDetailRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public QueryZnodeDetailRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
