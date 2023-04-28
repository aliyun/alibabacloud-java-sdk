// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosInstanceRequest extends TeaModel {
    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static DeleteNacosInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosInstanceRequest self = new DeleteNacosInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosInstanceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosInstanceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DeleteNacosInstanceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public DeleteNacosInstanceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteNacosInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DeleteNacosInstanceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeleteNacosInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DeleteNacosInstanceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
