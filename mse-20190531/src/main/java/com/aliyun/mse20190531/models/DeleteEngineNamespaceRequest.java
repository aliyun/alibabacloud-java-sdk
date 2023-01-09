// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteEngineNamespaceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The ID of the namespace.
    @NameInMap("Id")
    public String id;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteEngineNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEngineNamespaceRequest self = new DeleteEngineNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEngineNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteEngineNamespaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteEngineNamespaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteEngineNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
