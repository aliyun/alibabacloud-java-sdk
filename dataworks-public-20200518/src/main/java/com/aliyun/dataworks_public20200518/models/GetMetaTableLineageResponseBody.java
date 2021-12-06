// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTableLineageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public GetMetaTableLineageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableLineageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableLineageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableLineageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableLineageResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableName")
        public String tableName;

        public static GetMetaTableLineageResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseBodyDataDataEntityList self = new GetMetaTableLineageResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableLineageResponseBodyDataDataEntityList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
