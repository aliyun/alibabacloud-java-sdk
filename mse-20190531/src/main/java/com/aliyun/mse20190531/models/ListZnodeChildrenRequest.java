// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZnodeChildrenRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The path of the node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
