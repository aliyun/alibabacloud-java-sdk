// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateZnodeRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-09k1q11****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The data of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The path of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>/zookeeper</p>
     */
    @NameInMap("Path")
    public String path;

    public static CreateZnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateZnodeRequest self = new CreateZnodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateZnodeRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateZnodeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateZnodeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateZnodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
