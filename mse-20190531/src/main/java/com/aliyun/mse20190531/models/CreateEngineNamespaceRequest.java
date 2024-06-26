// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateEngineNamespaceRequest extends TeaModel {
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
     * <p>mse-98s****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The description of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>Development environment</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The custom ID of the namespace. If you do not specify this parameter, the automatically generated Universally Unique Identifier (UUID) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>f4fa5b81-2f26-4900-833a-7516b315ebb2</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The display name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of services that can run in the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ServiceCount")
    public Integer serviceCount;

    public static CreateEngineNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineNamespaceRequest self = new CreateEngineNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEngineNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateEngineNamespaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateEngineNamespaceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateEngineNamespaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateEngineNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEngineNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEngineNamespaceRequest setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Integer getServiceCount() {
        return this.serviceCount;
    }

}
