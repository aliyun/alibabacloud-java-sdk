// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeRequest extends TeaModel {
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

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    public static DeleteZnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteZnodeRequest self = new DeleteZnodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteZnodeRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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

    public DeleteZnodeRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
