// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListExternalServicesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListExternalServicesResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListExternalServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalServicesResponseBody self = new ListExternalServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListExternalServicesResponseBody setData(ListExternalServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExternalServicesResponseBodyData getData() {
        return this.data;
    }

    public ListExternalServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExternalServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExternalServicesResponseBodyDataItemsServices extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("namespace")
        public String namespace;

        public static ListExternalServicesResponseBodyDataItemsServices build(java.util.Map<String, ?> map) throws Exception {
            ListExternalServicesResponseBodyDataItemsServices self = new ListExternalServicesResponseBodyDataItemsServices();
            return TeaModel.build(map, self);
        }

        public ListExternalServicesResponseBodyDataItemsServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExternalServicesResponseBodyDataItemsServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class ListExternalServicesResponseBodyDataItems extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("namespaceShowName")
        public String namespaceShowName;

        @NameInMap("services")
        public java.util.List<ListExternalServicesResponseBodyDataItemsServices> services;

        public static ListExternalServicesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListExternalServicesResponseBodyDataItems self = new ListExternalServicesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListExternalServicesResponseBodyDataItems setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListExternalServicesResponseBodyDataItems setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public ListExternalServicesResponseBodyDataItems setServices(java.util.List<ListExternalServicesResponseBodyDataItemsServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<ListExternalServicesResponseBodyDataItemsServices> getServices() {
            return this.services;
        }

    }

    public static class ListExternalServicesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListExternalServicesResponseBodyDataItems> items;

        public static ListExternalServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExternalServicesResponseBodyData self = new ListExternalServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExternalServicesResponseBodyData setItems(java.util.List<ListExternalServicesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListExternalServicesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
