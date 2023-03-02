// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    /**
     * <p>The information returned for the parameters that are asynchronously generated and used to create or update a real-time synchronization node or a synchronization solution in Data Integration.</p>
     */
    @NameInMap("Data")
    public QueryDISyncTaskConfigProcessResultResponseBodyData data;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
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
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the parameters are obtained. Valid values:</p>
         * <br>
         * <p>*   success: indicates that the parameters are obtained.</p>
         * <p>*   fail: indicates that the parameters fail to be obtained. You can view the reason for the failure and troubleshoot the issue based on the reason.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The parameters that are obtained. The parameters are used as the request parameters of the [CreateDISyncTask](~~278725~~) or [UpdateDISyncTask](~~289109~~) operation to create or update a real-time synchronization node or a synchronization solution in Data Integration.</p>
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
