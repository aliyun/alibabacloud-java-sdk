// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceInstancesLogs")
    public java.util.List<ListServiceInstanceLogsResponseBodyServiceInstancesLogs> serviceInstancesLogs;

    public static ListServiceInstanceLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceLogsResponseBody self = new ListServiceInstanceLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceLogsResponseBody setServiceInstancesLogs(java.util.List<ListServiceInstanceLogsResponseBodyServiceInstancesLogs> serviceInstancesLogs) {
        this.serviceInstancesLogs = serviceInstancesLogs;
        return this;
    }
    public java.util.List<ListServiceInstanceLogsResponseBodyServiceInstancesLogs> getServiceInstancesLogs() {
        return this.serviceInstancesLogs;
    }

    public static class ListServiceInstanceLogsResponseBodyServiceInstancesLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Start creating service instance</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>serviceInstance</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <strong>example:</strong>
         * <p>si-5c6525c0589545c3****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>ROS.Stack</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static ListServiceInstanceLogsResponseBodyServiceInstancesLogs build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceLogsResponseBodyServiceInstancesLogs self = new ListServiceInstanceLogsResponseBodyServiceInstancesLogs();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
