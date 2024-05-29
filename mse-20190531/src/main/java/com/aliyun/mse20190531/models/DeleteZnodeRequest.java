// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeRequest extends TeaModel {
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

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
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
