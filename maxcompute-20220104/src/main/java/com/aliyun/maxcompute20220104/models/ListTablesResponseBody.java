// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListTablesResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setData(ListTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTablesResponseBodyData getData() {
        return this.data;
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTablesResponseBodyDataTables extends TeaModel {
        @NameInMap("creationTime")
        public Long creationTime;

        @NameInMap("name")
        public String name;

        @NameInMap("owner")
        public String owner;

        @NameInMap("schema")
        public String schema;

        @NameInMap("type")
        public String type;

        public static ListTablesResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyDataTables self = new ListTablesResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyDataTables setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListTablesResponseBodyDataTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyDataTables setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTablesResponseBodyDataTables setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListTablesResponseBodyDataTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTablesResponseBodyData extends TeaModel {
        @NameInMap("marker")
        public String marker;

        @NameInMap("maxItem")
        public Integer maxItem;

        @NameInMap("tables")
        public java.util.List<ListTablesResponseBodyDataTables> tables;

        public static ListTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyData self = new ListTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListTablesResponseBodyData setMaxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Integer getMaxItem() {
            return this.maxItem;
        }

        public ListTablesResponseBodyData setTables(java.util.List<ListTablesResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListTablesResponseBodyDataTables> getTables() {
            return this.tables;
        }

    }

}
