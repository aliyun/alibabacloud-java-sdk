// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListNodeIOResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListNodeIOResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeIOResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIOResponseBody self = new ListNodeIOResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeIOResponseBody setData(java.util.List<ListNodeIOResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeIOResponseBodyData> getData() {
        return this.data;
    }

    public ListNodeIOResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeIOResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("TableName")
        public String tableName;

        public static ListNodeIOResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeIOResponseBodyData self = new ListNodeIOResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodeIOResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListNodeIOResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodeIOResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
