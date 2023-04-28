// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosServiceRequest extends TeaModel {
    /**
     * <p>system error</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>systemError</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static DeleteNacosServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosServiceRequest self = new DeleteNacosServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosServiceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosServiceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteNacosServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosServiceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeleteNacosServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
