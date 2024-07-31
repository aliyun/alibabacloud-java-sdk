// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetDataSourceMetaResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The reason why the metadata of the data source fails to be obtained. If the metadata of the data source is obtained, no value is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>read datasource time out</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The returned metadata of the data source. The returned metadata is in the JSON format.</p>
         * <p><code>{&quot;dbTables&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;schema&quot;:[{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table1&quot;,&quot;tableName&quot;:&quot;table1&quot;}]},{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table2&quot;,&quot;tableName&quot;:&quot;table2&quot;}]}]}]}</code></p>
         * <p>Parameter description:</p>
         * <ul>
         * <li>dbName: the name of the database in which the data source resides.</li>
         * <li>schema: the schema of the database.</li>
         * <li>enable: indicates whether the database is available. The valid values are true and false. The value true indicates that the database is available. The value false indicates that the database is unavailable.</li>
         * <li>tableName: the name of the table in the database.</li>
         * <li>tableInfos: the information about the table in the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dbTables&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;schema&quot;:[{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table1&quot;,&quot;tableName&quot;:&quot;table1&quot;}]},{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table2&quot;,&quot;tableName&quot;:&quot;table2&quot;}]}]}]}</p>
         */
        @NameInMap("Meta")
        public String meta;

        /**
         * <p>Indicates whether the metadata of the data source is obtained. Valid values:</p>
         * <ul>
         * <li>success: The metadata of the data source is obtained.</li>
         * <li>fail: The metadata of the data source failed to be obtained. You can troubleshoot issues based on the Message parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
