// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class ListEndpointsByIpResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndpointList")
    public ListEndpointsByIpResponseBodyEndpointList endpointList;

    public static ListEndpointsByIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsByIpResponseBody self = new ListEndpointsByIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointsByIpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEndpointsByIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEndpointsByIpResponseBody setEndpointList(ListEndpointsByIpResponseBodyEndpointList endpointList) {
        this.endpointList = endpointList;
        return this;
    }
    public ListEndpointsByIpResponseBodyEndpointList getEndpointList() {
        return this.endpointList;
    }

    public static class ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols extends TeaModel {
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        public static ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols self = new ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols();
            return TeaModel.build(map, self);
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

    public static class ListEndpointsByIpResponseBodyEndpointListItemEndpoint extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Product")
        public String product;

        @NameInMap("Id")
        public String id;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Protocols")
        public ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols protocols;

        public static ListEndpointsByIpResponseBodyEndpointListItemEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsByIpResponseBodyEndpointListItemEndpoint self = new ListEndpointsByIpResponseBodyEndpointListItemEndpoint();
            return TeaModel.build(map, self);
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpoint setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpoint setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEndpointsByIpResponseBodyEndpointListItemEndpoint setProtocols(ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols protocols) {
            this.protocols = protocols;
            return this;
        }
        public ListEndpointsByIpResponseBodyEndpointListItemEndpointProtocols getProtocols() {
            return this.protocols;
        }

    }

    public static class ListEndpointsByIpResponseBodyEndpointList extends TeaModel {
        @NameInMap("ItemEndpoint")
        public java.util.List<ListEndpointsByIpResponseBodyEndpointListItemEndpoint> itemEndpoint;

        public static ListEndpointsByIpResponseBodyEndpointList build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsByIpResponseBodyEndpointList self = new ListEndpointsByIpResponseBodyEndpointList();
            return TeaModel.build(map, self);
        }

        public ListEndpointsByIpResponseBodyEndpointList setItemEndpoint(java.util.List<ListEndpointsByIpResponseBodyEndpointListItemEndpoint> itemEndpoint) {
            this.itemEndpoint = itemEndpoint;
            return this;
        }
        public java.util.List<ListEndpointsByIpResponseBodyEndpointListItemEndpoint> getItemEndpoint() {
            return this.itemEndpoint;
        }

    }

}
