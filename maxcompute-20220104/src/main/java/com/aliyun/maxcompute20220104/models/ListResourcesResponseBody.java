// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListResourcesResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setData(ListResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourcesResponseBodyDataResources extends TeaModel {
        /**
         * <p>The time when the resource was created.</p>
         */
        @NameInMap("creationTime")
        public Long creationTime;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the resource.</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The schema of the resource.</p>
         */
        @NameInMap("schema")
        public String schema;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("type")
        public String type;

        public static ListResourcesResponseBodyDataResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyDataResources self = new ListResourcesResponseBodyDataResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyDataResources setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListResourcesResponseBodyDataResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyDataResources setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListResourcesResponseBodyDataResources setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListResourcesResponseBodyDataResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcesResponseBodyData extends TeaModel {
        /**
         * <p>Indicates the marker after which the returned list begins.</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         */
        @NameInMap("maxItem")
        public Integer maxItem;

        /**
         * <p>The list of resources.</p>
         */
        @NameInMap("resources")
        public java.util.List<ListResourcesResponseBodyDataResources> resources;

        public static ListResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyData self = new ListResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListResourcesResponseBodyData setMaxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Integer getMaxItem() {
            return this.maxItem;
        }

        public ListResourcesResponseBodyData setResources(java.util.List<ListResourcesResponseBodyDataResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyDataResources> getResources() {
            return this.resources;
        }

    }

}
