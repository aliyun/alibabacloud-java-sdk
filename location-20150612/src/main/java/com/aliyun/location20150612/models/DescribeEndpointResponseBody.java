// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeEndpointResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("SerivceCode")
    public String serivceCode;

    @NameInMap("Id")
    public String id;

    @NameInMap("Protocols")
    public DescribeEndpointResponseBodyProtocols protocols;

    public static DescribeEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointResponseBody self = new DescribeEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeEndpointResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeEndpointResponseBody setSerivceCode(String serivceCode) {
        this.serivceCode = serivceCode;
        return this;
    }
    public String getSerivceCode() {
        return this.serivceCode;
    }

    public DescribeEndpointResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeEndpointResponseBody setProtocols(DescribeEndpointResponseBodyProtocols protocols) {
        this.protocols = protocols;
        return this;
    }
    public DescribeEndpointResponseBodyProtocols getProtocols() {
        return this.protocols;
    }

    public static class DescribeEndpointResponseBodyProtocols extends TeaModel {
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        public static DescribeEndpointResponseBodyProtocols build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointResponseBodyProtocols self = new DescribeEndpointResponseBodyProtocols();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointResponseBodyProtocols setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

}
