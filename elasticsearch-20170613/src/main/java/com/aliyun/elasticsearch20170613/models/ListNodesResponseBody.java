// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListNodesResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListNodesResponseBodyResult> result;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setHeaders(ListNodesResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListNodesResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setResult(java.util.List<ListNodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListNodesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListNodesResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListNodesResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyHeaders self = new ListNodesResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListNodesResponseBodyResultIpAddress extends TeaModel {
        @NameInMap("host")
        public String host;

        @NameInMap("ipType")
        public String ipType;

        public static ListNodesResponseBodyResultIpAddress build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyResultIpAddress self = new ListNodesResponseBodyResultIpAddress();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyResultIpAddress setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListNodesResponseBodyResultIpAddress setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

    }

    public static class ListNodesResponseBodyResultTags extends TeaModel {
        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValue")
        public String tagValue;

        public static ListNodesResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyResultTags self = new ListNodesResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListNodesResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListNodesResponseBodyResult extends TeaModel {
        @NameInMap("agentStatus")
        public String agentStatus;

        @NameInMap("cloudAssistantStatus")
        public String cloudAssistantStatus;

        @NameInMap("ecsInstanceId")
        public String ecsInstanceId;

        @NameInMap("ecsInstanceName")
        public String ecsInstanceName;

        @NameInMap("ipAddress")
        public java.util.List<ListNodesResponseBodyResultIpAddress> ipAddress;

        @NameInMap("osType")
        public String osType;

        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListNodesResponseBodyResultTags> tags;

        public static ListNodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyResult self = new ListNodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyResult setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListNodesResponseBodyResult setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public ListNodesResponseBodyResult setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListNodesResponseBodyResult setEcsInstanceName(String ecsInstanceName) {
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        public ListNodesResponseBodyResult setIpAddress(java.util.List<ListNodesResponseBodyResultIpAddress> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<ListNodesResponseBodyResultIpAddress> getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesResponseBodyResult setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListNodesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesResponseBodyResult setTags(java.util.List<ListNodesResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListNodesResponseBodyResultTags> getTags() {
            return this.tags;
        }

    }

}
