// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateZnodeRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // The data of the node.
    @NameInMap("Data")
    public String data;

    // The path of the node.
    @NameInMap("Path")
    public String path;

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    public static UpdateZnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZnodeRequest self = new UpdateZnodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZnodeRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateZnodeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateZnodeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateZnodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateZnodeRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
