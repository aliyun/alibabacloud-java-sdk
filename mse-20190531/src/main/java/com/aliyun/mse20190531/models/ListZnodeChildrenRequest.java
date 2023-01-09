// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZnodeChildrenRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // The path of the node.
    @NameInMap("Path")
    public String path;

    public static ListZnodeChildrenRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZnodeChildrenRequest self = new ListZnodeChildrenRequest();
        return TeaModel.build(map, self);
    }

    public ListZnodeChildrenRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListZnodeChildrenRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListZnodeChildrenRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
