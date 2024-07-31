// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    /**
     * <p>The information returned for the parameters that are asynchronously generated and used to create or update a real-time synchronization task in Data Integration.</p>
     */
    @NameInMap("Data")
    public QueryDISyncTaskConfigProcessResultResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
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

    public static QueryDISyncTaskConfigProcessResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDISyncTaskConfigProcessResultResponseBody self = new QueryDISyncTaskConfigProcessResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDISyncTaskConfigProcessResultResponseBody setData(QueryDISyncTaskConfigProcessResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDISyncTaskConfigProcessResultResponseBodyData getData() {
        return this.data;
    }

    public QueryDISyncTaskConfigProcessResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDISyncTaskConfigProcessResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDISyncTaskConfigProcessResultResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the parameters fail to be obtained. If the parameters are obtained, the value null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>fileId:[100] is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the parameters are obtained. Valid values:</p>
         * <ul>
         * <li>success: The parameters are obtained.</li>
         * <li>fail: The parameters fail to be obtained. You can view the reason for the failure and troubleshoot the issue based on the reason.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The parameters that are obtained. The parameters are used as the request parameters of the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> or <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to create or update a real-time synchronization task in Data Integration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;extend&quot;:{&quot;mode&quot;:&quot;migration_holo&quot;,&quot;resourceGroup&quot;:&quot;280749&quot;,&quot;name&quot;:&quot;h&quot;},&quot;type&quot;:&quot;job&quot;,&quot;steps&quot;:[{&quot;stepType&quot;:&quot;mysql&quot;,&quot;parameter&quot;:{&quot;connection&quot;:[{&quot;datasourceType&quot;:&quot;mysql&quot;,&quot;datasource&quot;:&quot;mm&quot;,&quot;selectedTables&quot;:[{&quot;schema&quot;:[{&quot;tableInfos&quot;:[{&quot;enable&quot;:true,&quot;table&quot;:&quot;m_v1&quot;,&quot;tableName&quot;:&quot;m_v1&quot;}]}],&quot;dbName&quot;:&quot;m&quot;}]}]},&quot;name&quot;:&quot;reader&quot;,&quot;category&quot;:&quot;reader&quot;},{&quot;stepType&quot;:&quot;holo&quot;,&quot;parameter&quot;:{&quot;datasource&quot;:&quot;h&quot;,&quot;tableMappingRule&quot;:{&quot;datasource&quot;:[{&quot;tableRule&quot;:[{&quot;srcTable&quot;:&quot;m_v1&quot;,&quot;mergeIntoCycleType&quot;:&quot;DEFAULT&quot;,&quot;hourDeltaEnable&quot;:false,&quot;dstTable&quot;:&quot;m.m_v1&quot;,&quot;dayDeltaEnable&quot;:false,&quot;primaryKeyInfo&quot;:{&quot;column&quot;:[&quot;id&quot;],&quot;type&quot;:&quot;pk&quot;},&quot;dstCreateTableInfo&quot;:{&quot;indexType&quot;:&quot;m_v1&quot;,&quot;dataColumn&quot;:[{&quot;columnSize&quot;:0,&quot;name&quot;:&quot;id&quot;,&quot;index&quot;:0,&quot;comment&quot;:&quot;&quot;,&quot;newDigit&quot;:0,&quot;type&quot;:&quot;int8&quot;,&quot;digit&quot;:0,&quot;primaryKey&quot;:true}],&quot;schemaName&quot;:&quot;m&quot;,&quot;tableName&quot;:&quot;m_v1&quot;},&quot;srcDbName&quot;:&quot;m&quot;],&quot;srcDatasourceName&quot;:&quot;mm&quot;}],&quot;totalTableMapping&quot;:1},&quot;writeMode&quot;:&quot;replay&quot;},&quot;name&quot;:&quot;writer&quot;,&quot;category&quot;:&quot;writer&quot;}],&quot;version&quot;:&quot;2.0&quot;,&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;reader&quot;,&quot;to&quot;:&quot;writer&quot;}]}}</p>
         */
        @NameInMap("TaskContent")
        public String taskContent;

        public static QueryDISyncTaskConfigProcessResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDISyncTaskConfigProcessResultResponseBodyData self = new QueryDISyncTaskConfigProcessResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDISyncTaskConfigProcessResultResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDISyncTaskConfigProcessResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDISyncTaskConfigProcessResultResponseBodyData setTaskContent(String taskContent) {
            this.taskContent = taskContent;
            return this;
        }
        public String getTaskContent() {
            return this.taskContent;
        }

    }

}
