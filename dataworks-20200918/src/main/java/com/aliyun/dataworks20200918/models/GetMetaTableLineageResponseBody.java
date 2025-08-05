// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTableLineageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaTableLineageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableLineageResponseBody self = new GetMetaTableLineageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableLineageResponseBody setData(GetMetaTableLineageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableLineageResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaTableLineageResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableName")
        public String tableName;

        public static GetMetaTableLineageResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseBodyDataDataEntityList self = new GetMetaTableLineageResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableLineageResponseBodyDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableLineageResponseBodyDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetMetaTableLineageResponseBodyData extends TeaModel {
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTableLineageResponseBodyDataDataEntityList> dataEntityList;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("NextPrimaryKey")
        public String nextPrimaryKey;

        public static GetMetaTableLineageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseBodyData self = new GetMetaTableLineageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableLineageResponseBodyData setDataEntityList(java.util.List<GetMetaTableLineageResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableLineageResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public GetMetaTableLineageResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public GetMetaTableLineageResponseBodyData setNextPrimaryKey(String nextPrimaryKey) {
            this.nextPrimaryKey = nextPrimaryKey;
            return this;
        }
        public String getNextPrimaryKey() {
            return this.nextPrimaryKey;
        }

    }

}
