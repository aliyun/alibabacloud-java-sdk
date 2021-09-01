// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTableLineageResponseData data;

    public static GetMetaTableLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableLineageResponse self = new GetMetaTableLineageResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableLineageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableLineageResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableLineageResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableLineageResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableLineageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableLineageResponse setData(GetMetaTableLineageResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableLineageResponseData getData() {
        return this.data;
    }

    public static class GetMetaTableLineageResponseDataDataEntityList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        public static GetMetaTableLineageResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseDataDataEntityList self = new GetMetaTableLineageResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableLineageResponseDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableLineageResponseDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

    }

    public static class GetMetaTableLineageResponseData extends TeaModel {
        @NameInMap("HasNext")
        @Validation(required = true)
        public Boolean hasNext;

        @NameInMap("NextPrimaryKey")
        @Validation(required = true)
        public String nextPrimaryKey;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaTableLineageResponseDataDataEntityList> dataEntityList;

        public static GetMetaTableLineageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableLineageResponseData self = new GetMetaTableLineageResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableLineageResponseData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public GetMetaTableLineageResponseData setNextPrimaryKey(String nextPrimaryKey) {
            this.nextPrimaryKey = nextPrimaryKey;
            return this;
        }
        public String getNextPrimaryKey() {
            return this.nextPrimaryKey;
        }

        public GetMetaTableLineageResponseData setDataEntityList(java.util.List<GetMetaTableLineageResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableLineageResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}
