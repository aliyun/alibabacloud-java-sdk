// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZnodeChildrenRequest extends TeaModel {
    @NameInMap("Path")
    public String path;

    @NameInMap("ClusterId")
    public String clusterId;

    public static ListZnodeChildrenRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZnodeChildrenRequest self = new ListZnodeChildrenRequest();
        return TeaModel.build(map, self);
    }

    public ListZnodeChildrenRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListZnodeChildrenRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
