// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceLogsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("ServiceInstancesLogs")
    public java.util.List<ListServiceInstanceLogsResponseBodyServiceInstancesLogs> serviceInstancesLogs;

    public static ListServiceInstanceLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceLogsResponseBody self = new ListServiceInstanceLogsResponseBody();
        return TeaModel.build(map, self);
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

    public ListServiceInstanceLogsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceLogsResponseBody setServiceInstancesLogs(java.util.List<ListServiceInstanceLogsResponseBodyServiceInstancesLogs> serviceInstancesLogs) {
        this.serviceInstancesLogs = serviceInstancesLogs;
        return this;
    }
    public java.util.List<ListServiceInstanceLogsResponseBodyServiceInstancesLogs> getServiceInstancesLogs() {
        return this.serviceInstancesLogs;
    }

    public static class ListServiceInstanceLogsResponseBodyServiceInstancesLogs extends TeaModel {
        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("Content")
        public String content;

        public static ListServiceInstanceLogsResponseBodyServiceInstancesLogs build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceLogsResponseBodyServiceInstancesLogs self = new ListServiceInstanceLogsResponseBodyServiceInstancesLogs();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListServiceInstanceLogsResponseBodyServiceInstancesLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
