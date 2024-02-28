// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListFunctionsResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsResponseBody self = new ListFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionsResponseBody setData(ListFunctionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFunctionsResponseBodyData getData() {
        return this.data;
    }

    public ListFunctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFunctionsResponseBodyDataFunctions extends TeaModel {
        /**
         * <p>The class in which the function was defined.</p>
         */
        @NameInMap("class")
        public String _class;

        /**
         * <p>The time when the function was created. Unit: milliseconds.</p>
         */
        @NameInMap("creationTime")
        public Long creationTime;

        /**
         * <p>The display name of the function.</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The name of the function.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the function.</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The name of the resource that was associated with the function.</p>
         */
        @NameInMap("resources")
        public String resources;

        /**
         * <p>The schema of the function.</p>
         */
        @NameInMap("schema")
        public String schema;

        public static ListFunctionsResponseBodyDataFunctions build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyDataFunctions self = new ListFunctionsResponseBodyDataFunctions();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyDataFunctions set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public ListFunctionsResponseBodyDataFunctions setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListFunctionsResponseBodyDataFunctions setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListFunctionsResponseBodyDataFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionsResponseBodyDataFunctions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFunctionsResponseBodyDataFunctions setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public ListFunctionsResponseBodyDataFunctions setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ListFunctionsResponseBodyData extends TeaModel {
        /**
         * <p>The information about each function.</p>
         */
        @NameInMap("functions")
        public java.util.List<ListFunctionsResponseBodyDataFunctions> functions;

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

        public static ListFunctionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyData self = new ListFunctionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyData setFunctions(java.util.List<ListFunctionsResponseBodyDataFunctions> functions) {
            this.functions = functions;
            return this;
        }
        public java.util.List<ListFunctionsResponseBodyDataFunctions> getFunctions() {
            return this.functions;
        }

        public ListFunctionsResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListFunctionsResponseBodyData setMaxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Integer getMaxItem() {
            return this.maxItem;
        }

    }

}
