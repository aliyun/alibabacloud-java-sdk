// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateServiceEndsRequest extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // serviceNodes
    @NameInMap("serviceNodes")
    public java.util.List<UpdateServiceEndsRequestServiceNodes> serviceNodes;

    public static UpdateServiceEndsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEndsRequest self = new UpdateServiceEndsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEndsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateServiceEndsRequest setServiceNodes(java.util.List<UpdateServiceEndsRequestServiceNodes> serviceNodes) {
        this.serviceNodes = serviceNodes;
        return this;
    }
    public java.util.List<UpdateServiceEndsRequestServiceNodes> getServiceNodes() {
        return this.serviceNodes;
    }

    public static class UpdateServiceEndsRequestServiceNodes extends TeaModel {
        // port
        @NameInMap("port")
        public String port;

        // ipAddress
        @NameInMap("ipAddress")
        public String ipAddress;

        // status
        @NameInMap("status")
        public Long status;

        public static UpdateServiceEndsRequestServiceNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndsRequestServiceNodes self = new UpdateServiceEndsRequestServiceNodes();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndsRequestServiceNodes setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateServiceEndsRequestServiceNodes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public UpdateServiceEndsRequestServiceNodes setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
