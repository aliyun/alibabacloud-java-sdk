// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeletePortRequest extends TeaModel {
    @NameInMap("BackendPort")
    public String backendPort;

    @NameInMap("FrontendPort")
    public String frontendPort;

    @NameInMap("FrontendProtocol")
    public String frontendProtocol;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    public static DeletePortRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePortRequest self = new DeletePortRequest();
        return TeaModel.build(map, self);
    }

    public DeletePortRequest setBackendPort(String backendPort) {
        this.backendPort = backendPort;
        return this;
    }
    public String getBackendPort() {
        return this.backendPort;
    }

    public DeletePortRequest setFrontendPort(String frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public String getFrontendPort() {
        return this.frontendPort;
    }

    public DeletePortRequest setFrontendProtocol(String frontendProtocol) {
        this.frontendProtocol = frontendProtocol;
        return this;
    }
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    public DeletePortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeletePortRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

}
