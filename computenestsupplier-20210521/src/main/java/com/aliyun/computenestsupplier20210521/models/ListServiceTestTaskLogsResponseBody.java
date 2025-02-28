// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestTaskLogsResponseBody extends TeaModel {
    /**
     * <p>The number of items to return per page when paginating results. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDEE055B-D5F4-5B92-8F21-999D408F1214</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service test task logs.</p>
     */
    @NameInMap("TaskLogs")
    public java.util.List<ListServiceTestTaskLogsResponseBodyTaskLogs> taskLogs;

    public static ListServiceTestTaskLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestTaskLogsResponseBody self = new ListServiceTestTaskLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceTestTaskLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTestTaskLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTestTaskLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceTestTaskLogsResponseBody setTaskLogs(java.util.List<ListServiceTestTaskLogsResponseBodyTaskLogs> taskLogs) {
        this.taskLogs = taskLogs;
        return this;
    }
    public java.util.List<ListServiceTestTaskLogsResponseBodyTaskLogs> getTaskLogs() {
        return this.taskLogs;
    }

    public static class ListServiceTestTaskLogsResponseBodyTaskLogs extends TeaModel {
        /**
         * <p>The log content.</p>
         * 
         * <strong>example:</strong>
         * <p>log content</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The UTC timestamp when the response is returned.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-12T20:00:09Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static ListServiceTestTaskLogsResponseBodyTaskLogs build(java.util.Map<String, ?> map) throws Exception {
            ListServiceTestTaskLogsResponseBodyTaskLogs self = new ListServiceTestTaskLogsResponseBodyTaskLogs();
            return TeaModel.build(map, self);
        }

        public ListServiceTestTaskLogsResponseBodyTaskLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListServiceTestTaskLogsResponseBodyTaskLogs setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
