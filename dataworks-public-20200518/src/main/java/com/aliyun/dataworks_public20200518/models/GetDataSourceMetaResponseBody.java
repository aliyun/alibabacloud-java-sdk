// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the metadata of the data source was retrieved. Valid values:</p>
     * <br>
     * <p>*   success: The metadata of the data source was retrieved.</p>
     * <p>*   fail: The metadata of the data source failed to be retrieved. You can troubleshoot issues based on the Message parameter.</p>
     */
    @NameInMap("Data")
    public GetDataSourceMetaResponseBodyData data;

    /**
     * <p>The information about the query operation.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID of the request. You can query logs and troubleshoot issues based on the unique ID.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataSourceMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceMetaResponseBody self = new GetDataSourceMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceMetaResponseBody setData(GetDataSourceMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataSourceMetaResponseBodyData getData() {
        return this.data;
    }

    public GetDataSourceMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSourceMetaResponseBodyData extends TeaModel {
        /**
         * <p>The returned metadata of the data source. The returned metadata is in the JSON format.</p>
         * <br>
         * <p>`{"dbTables":[{"dbName":"testdb","schema":[{"tableInfos":[{"dbName":"testdb","enable":true,"table":"table1","tableName":"table1"}]},{"tableInfos":[{"dbName":"testdb","enable":true,"table":"table2","tableName":"table2"}]}]}]}`</p>
         * <br>
         * <p>Parameter description:</p>
         * <br>
         * <p>*   dbName: the name of the database in which the data source resides.</p>
         * <p>*   schema: the schema of the database.</p>
         * <p>*   enable: indicates whether the database is available. A value of true indicates that the database is available. A value of false indicates that the database is unavailable.</p>
         * <p>*   tableName: the name of the table in the database.</p>
         * <p>*   tableInfos: the information about the table in the database.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Meta")
        public String meta;

        /**
         * <p>The reason why the metadata of the data source failed to be retrieved. If the metadata of the data source was retrieved, this parameter is left empty.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDataSourceMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceMetaResponseBodyData self = new GetDataSourceMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSourceMetaResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDataSourceMetaResponseBodyData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public GetDataSourceMetaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
