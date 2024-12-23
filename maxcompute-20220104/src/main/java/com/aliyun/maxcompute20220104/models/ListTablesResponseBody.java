// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListTablesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a06dd4516687375802853481ec9fd</p>
     */
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
        /**
         * <p>The time when the table was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-17T07:07:47Z</p>
         */
        @NameInMap("creationTime")
        public Long creationTime;

        /**
         * <p>The display name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>sale_detail</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>dim_odps</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1887853961230110</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The schema to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("schema")
        public String schema;

        /**
         * <p>The type of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>internal</p>
         */
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

        public ListTablesResponseBodyDataTables setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
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
        /**
         * <p>Indicates the marker after which the returned list begins.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxItem")
        public Integer maxItem;

        /**
         * <p>The information about tables.</p>
         */
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
