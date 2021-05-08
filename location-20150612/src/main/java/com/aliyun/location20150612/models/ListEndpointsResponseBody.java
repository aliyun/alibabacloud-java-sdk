// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class ListEndpointsResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndpointList")
    public ListEndpointsResponseBodyEndpointList endpointList;

    public static ListEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsResponseBody self = new ListEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEndpointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEndpointsResponseBody setEndpointList(ListEndpointsResponseBodyEndpointList endpointList) {
        this.endpointList = endpointList;
        return this;
    }
    public ListEndpointsResponseBodyEndpointList getEndpointList() {
        return this.endpointList;
    }

    public static class ListEndpointsResponseBodyEndpointListItemEndpointProtocols extends TeaModel {
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        public static ListEndpointsResponseBodyEndpointListItemEndpointProtocols build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsResponseBodyEndpointListItemEndpointProtocols self = new ListEndpointsResponseBodyEndpointListItemEndpointProtocols();
            return TeaModel.build(map, self);
        }

        public ListEndpointsResponseBodyEndpointListItemEndpointProtocols setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

    public static class ListEndpointsResponseBodyEndpointListItemEndpoint extends TeaModel {
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
        public ListEndpointsResponseBodyEndpointListItemEndpointProtocols protocols;

        public static ListEndpointsResponseBodyEndpointListItemEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsResponseBodyEndpointListItemEndpoint self = new ListEndpointsResponseBodyEndpointListItemEndpoint();
            return TeaModel.build(map, self);
        }

        public ListEndpointsResponseBodyEndpointListItemEndpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEndpointsResponseBodyEndpointListItemEndpoint setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListEndpointsResponseBodyEndpointListItemEndpoint setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListEndpointsResponseBodyEndpointListItemEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListEndpointsResponseBodyEndpointListItemEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListEndpointsResponseBodyEndpointListItemEndpoint setProtocols(ListEndpointsResponseBodyEndpointListItemEndpointProtocols protocols) {
            this.protocols = protocols;
            return this;
        }
        public ListEndpointsResponseBodyEndpointListItemEndpointProtocols getProtocols() {
            return this.protocols;
        }

    }

    public static class ListEndpointsResponseBodyEndpointList extends TeaModel {
        @NameInMap("ItemEndpoint")
        public java.util.List<ListEndpointsResponseBodyEndpointListItemEndpoint> itemEndpoint;

        public static ListEndpointsResponseBodyEndpointList build(java.util.Map<String, ?> map) throws Exception {
            ListEndpointsResponseBodyEndpointList self = new ListEndpointsResponseBodyEndpointList();
            return TeaModel.build(map, self);
        }

        public ListEndpointsResponseBodyEndpointList setItemEndpoint(java.util.List<ListEndpointsResponseBodyEndpointListItemEndpoint> itemEndpoint) {
            this.itemEndpoint = itemEndpoint;
            return this;
        }
        public java.util.List<ListEndpointsResponseBodyEndpointListItemEndpoint> getItemEndpoint() {
            return this.itemEndpoint;
        }

    }

}
