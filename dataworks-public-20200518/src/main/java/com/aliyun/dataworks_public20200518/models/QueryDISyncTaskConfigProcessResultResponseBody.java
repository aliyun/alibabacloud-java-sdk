// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the parameters are obtained. Valid values:</p>
     * <br>
     * <p>*   success: indicates that the parameters are obtained.</p>
     * <p>*   fail: indicates that the parameters fail to be obtained. You can view the reason for the failure and troubleshoot the issue based on the reason.</p>
     */
    @NameInMap("Data")
    public QueryDISyncTaskConfigProcessResultResponseBodyData data;

    /**
     * <p>The information returned for the parameters that are asynchronously generated and used to create or update a real-time synchronization node or a synchronization solution in Data Integration.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
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
         * <p>The parameters that are obtained. The parameters are used as the request parameters of the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) or [UpdateDISyncTask](https://help.aliyun.com/document_detail/289109.html) operation to create or update a real-time synchronization node or a synchronization solution in Data Integration.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the parameters fail to be obtained. If the parameters are obtained, the value null is returned.</p>
         */
        @NameInMap("Status")
        public String status;

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
