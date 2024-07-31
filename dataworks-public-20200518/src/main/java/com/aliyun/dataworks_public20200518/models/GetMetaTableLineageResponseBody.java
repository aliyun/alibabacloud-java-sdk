// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableLineageResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetMetaTableLineageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The time when the table was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1638720736000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The unique identifier of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.tt.name</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
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

        public GetMetaTableLineageResponseBodyDataDataEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
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
        /**
         * <p>The information about the table.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTableLineageResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>Indicates whether the next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <p>The logic of paging. If the value true is returned for the HasNext parameter and a value is returned for the NextPrimaryKey parameter in the response of the previous request, you must use the value of the NextPrimaryKey parameter for the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>odps | retail_e_commerce_2 | retail_e_commerce_2 | dws_ec_trd__cate_commodity_gmv_kpy_fy</p>
         */
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
