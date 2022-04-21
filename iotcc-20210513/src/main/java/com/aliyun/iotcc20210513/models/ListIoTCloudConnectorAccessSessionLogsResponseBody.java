// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorAccessSessionLogsResponseBody extends TeaModel {
    @NameInMap("AccessSessionLogs")
    public java.util.List<ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs> accessSessionLogs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIoTCloudConnectorAccessSessionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorAccessSessionLogsResponseBody self = new ListIoTCloudConnectorAccessSessionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorAccessSessionLogsResponseBody setAccessSessionLogs(java.util.List<ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs> accessSessionLogs) {
        this.accessSessionLogs = accessSessionLogs;
        return this;
    }
    public java.util.List<ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs> getAccessSessionLogs() {
        return this.accessSessionLogs;
    }

    public ListIoTCloudConnectorAccessSessionLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorAccessSessionLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorAccessSessionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorAccessSessionLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs extends TeaModel {
        @NameInMap("ClientToServiceFlow")
        public String clientToServiceFlow;

        @NameInMap("DestinationIp")
        public String destinationIp;

        @NameInMap("DestinationPort")
        public String destinationPort;

        @NameInMap("Destinations")
        public java.util.List<String> destinations;

        @NameInMap("ServiceToClientFlow")
        public String serviceToClientFlow;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        public static ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs self = new ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setClientToServiceFlow(String clientToServiceFlow) {
            this.clientToServiceFlow = clientToServiceFlow;
            return this;
        }
        public String getClientToServiceFlow() {
            return this.clientToServiceFlow;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setDestinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<String> getDestinations() {
            return this.destinations;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setServiceToClientFlow(String serviceToClientFlow) {
            this.serviceToClientFlow = serviceToClientFlow;
            return this;
        }
        public String getServiceToClientFlow() {
            return this.serviceToClientFlow;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBodyAccessSessionLogs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
