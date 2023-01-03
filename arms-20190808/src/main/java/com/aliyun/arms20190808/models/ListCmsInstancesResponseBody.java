// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListCmsInstancesResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("Data")
    public ListCmsInstancesResponseBodyData data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListCmsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCmsInstancesResponseBody self = new ListCmsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCmsInstancesResponseBody setData(ListCmsInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCmsInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListCmsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCmsInstancesResponseBodyDataProducts extends TeaModel {
        // The description of the cloud service.
        @NameInMap("Descr")
        public String descr;

        // The ID of the instance.
        @NameInMap("Id")
        public String id;

        // The name of the instance.
        @NameInMap("Instance")
        public String instance;

        // The name of the cloud service.
        @NameInMap("Name")
        public String name;

        // The code of the cloud service.
        @NameInMap("Prod")
        public String prod;

        // The event source.
        @NameInMap("Source")
        public String source;

        // The status of the integration. Valid values:
        // 
        // *   `true`: The integration was enabled.
        // *   `false`: The integration was disabled.
        @NameInMap("State")
        public String state;

        // The timestamp when the Grafana dashboard was created.
        @NameInMap("Time")
        public String time;

        // The type of the cloud service.
        @NameInMap("Type")
        public String type;

        // The complete URL of the Grafana dashboard.
        @NameInMap("Url")
        public String url;

        public static ListCmsInstancesResponseBodyDataProducts build(java.util.Map<String, ?> map) throws Exception {
            ListCmsInstancesResponseBodyDataProducts self = new ListCmsInstancesResponseBodyDataProducts();
            return TeaModel.build(map, self);
        }

        public ListCmsInstancesResponseBodyDataProducts setDescr(String descr) {
            this.descr = descr;
            return this;
        }
        public String getDescr() {
            return this.descr;
        }

        public ListCmsInstancesResponseBodyDataProducts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCmsInstancesResponseBodyDataProducts setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListCmsInstancesResponseBodyDataProducts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCmsInstancesResponseBodyDataProducts setProd(String prod) {
            this.prod = prod;
            return this;
        }
        public String getProd() {
            return this.prod;
        }

        public ListCmsInstancesResponseBodyDataProducts setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListCmsInstancesResponseBodyDataProducts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCmsInstancesResponseBodyDataProducts setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListCmsInstancesResponseBodyDataProducts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCmsInstancesResponseBodyDataProducts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListCmsInstancesResponseBodyData extends TeaModel {
        // Indicates whether to collect the aliyun tags attached to each cloud service.
        @NameInMap("EnableTag")
        public Boolean enableTag;

        // The struct returned.
        @NameInMap("Products")
        public java.util.List<ListCmsInstancesResponseBodyDataProducts> products;

        public static ListCmsInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCmsInstancesResponseBodyData self = new ListCmsInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCmsInstancesResponseBodyData setEnableTag(Boolean enableTag) {
            this.enableTag = enableTag;
            return this;
        }
        public Boolean getEnableTag() {
            return this.enableTag;
        }

        public ListCmsInstancesResponseBodyData setProducts(java.util.List<ListCmsInstancesResponseBodyDataProducts> products) {
            this.products = products;
            return this;
        }
        public java.util.List<ListCmsInstancesResponseBodyDataProducts> getProducts() {
            return this.products;
        }

    }

}
