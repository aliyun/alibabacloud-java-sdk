// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Endpoints")
    public DescribeEndpointsResponseBodyEndpoints endpoints;

    public static DescribeEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsResponseBody self = new DescribeEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointsResponseBody setEndpoints(DescribeEndpointsResponseBodyEndpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public DescribeEndpointsResponseBodyEndpoints getEndpoints() {
        return this.endpoints;
    }

    public static class DescribeEndpointsResponseBodyEndpointsEndpointProtocols extends TeaModel {
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        public static DescribeEndpointsResponseBodyEndpointsEndpointProtocols build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyEndpointsEndpointProtocols self = new DescribeEndpointsResponseBodyEndpointsEndpointProtocols();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyEndpointsEndpointProtocols setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

    public static class DescribeEndpointsResponseBodyEndpointsEndpoint extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("SerivceCode")
        public String serivceCode;

        @NameInMap("Id")
        public String id;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Protocols")
        public DescribeEndpointsResponseBodyEndpointsEndpointProtocols protocols;

        public static DescribeEndpointsResponseBodyEndpointsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyEndpointsEndpoint self = new DescribeEndpointsResponseBodyEndpointsEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyEndpointsEndpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEndpointsResponseBodyEndpointsEndpoint setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeEndpointsResponseBodyEndpointsEndpoint setSerivceCode(String serivceCode) {
            this.serivceCode = serivceCode;
            return this;
        }
        public String getSerivceCode() {
            return this.serivceCode;
        }

        public DescribeEndpointsResponseBodyEndpointsEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEndpointsResponseBodyEndpointsEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeEndpointsResponseBodyEndpointsEndpoint setProtocols(DescribeEndpointsResponseBodyEndpointsEndpointProtocols protocols) {
            this.protocols = protocols;
            return this;
        }
        public DescribeEndpointsResponseBodyEndpointsEndpointProtocols getProtocols() {
            return this.protocols;
        }

    }

    public static class DescribeEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("Endpoint")
        public java.util.List<DescribeEndpointsResponseBodyEndpointsEndpoint> endpoint;

        public static DescribeEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyEndpoints self = new DescribeEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyEndpoints setEndpoint(java.util.List<DescribeEndpointsResponseBodyEndpointsEndpoint> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public java.util.List<DescribeEndpointsResponseBodyEndpointsEndpoint> getEndpoint() {
            return this.endpoint;
        }

    }

}
