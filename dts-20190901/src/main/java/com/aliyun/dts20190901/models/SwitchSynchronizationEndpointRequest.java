// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class SwitchSynchronizationEndpointRequest extends TeaModel {
    @NameInMap("Endpoint")
    public SwitchSynchronizationEndpointRequestEndpoint endpoint;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static SwitchSynchronizationEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSynchronizationEndpointRequest self = new SwitchSynchronizationEndpointRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSynchronizationEndpointRequest setEndpoint(SwitchSynchronizationEndpointRequestEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public SwitchSynchronizationEndpointRequestEndpoint getEndpoint() {
        return this.endpoint;
    }

    public SwitchSynchronizationEndpointRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SwitchSynchronizationEndpointRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public SwitchSynchronizationEndpointRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static class SwitchSynchronizationEndpointRequestEndpoint extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public String port;

        @NameInMap("Type")
        public String type;

        public static SwitchSynchronizationEndpointRequestEndpoint build(java.util.Map<String, ?> map) throws Exception {
            SwitchSynchronizationEndpointRequestEndpoint self = new SwitchSynchronizationEndpointRequestEndpoint();
            return TeaModel.build(map, self);
        }

        public SwitchSynchronizationEndpointRequestEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public SwitchSynchronizationEndpointRequestEndpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
