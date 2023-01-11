// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateEngineNamespaceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The description of the cluster.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of active services.</p>
     */
    @NameInMap("ServiceCount")
    public Integer serviceCount;

    public static UpdateEngineNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineNamespaceRequest self = new UpdateEngineNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEngineNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateEngineNamespaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateEngineNamespaceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateEngineNamespaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateEngineNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEngineNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEngineNamespaceRequest setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Integer getServiceCount() {
        return this.serviceCount;
    }

}
