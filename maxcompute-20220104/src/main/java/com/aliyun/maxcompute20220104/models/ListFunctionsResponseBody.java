// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListFunctionsResponseBodyData data;

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
        @NameInMap("class")
        public String _class;

        @NameInMap("creationTime")
        public Long creationTime;

        @NameInMap("name")
        public String name;

        @NameInMap("owner")
        public String owner;

        @NameInMap("resources")
        public String resources;

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
        @NameInMap("functions")
        public java.util.List<ListFunctionsResponseBodyDataFunctions> functions;

        @NameInMap("marker")
        public String marker;

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
