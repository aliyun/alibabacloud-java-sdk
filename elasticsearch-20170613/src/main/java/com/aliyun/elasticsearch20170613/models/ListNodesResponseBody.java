// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The header of the response.</p>
     */
    @NameInMap("Headers")
    public ListNodesResponseBodyHeaders headers;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1FD7642-7C40-4FF2-9C0F-21F1A1746F70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The type of the IP address. Valid values:</p>
         * <ul>
         * <li>public: public IP address</li>
         * <li>private: private IP address</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>xyz</p>
         */
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
        /**
         * <p>The status of the shipper on the ECS instance. Valid values:</p>
         * <ul>
         * <li>heartOk: The heartbeat is normal.</li>
         * <li>heartLost: The heartbeat is abnormal.</li>
         * <li>uninstalled: The shipper is not installed.</li>
         * <li>failed: The shipper fails to be installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>heartOk</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>Indicates whether the Cloud Assistant client is installed. Valid values:</p>
         * <ul>
         * <li>true: installed</li>
         * <li>false: not installed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cloudAssistantStatus")
        public String cloudAssistantStatus;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13y63575oypr****</p>
         */
        @NameInMap("ecsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The name of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_beat</p>
         */
        @NameInMap("ecsInstanceName")
        public String ecsInstanceName;

        /**
         * <p>The IP addresses of the ECS instance.</p>
         */
        @NameInMap("ipAddress")
        public java.util.List<ListNodesResponseBodyResultIpAddress> ipAddress;

        /**
         * <p>The operating system type of the ECS instance. Valid values:</p>
         * <ul>
         * <li>windows: Windows Server</li>
         * <li>linux: Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("osType")
        public String osType;

        /**
         * <p>The status of the ECS instance. Valid values:</p>
         * <ul>
         * <li>running: The instance is running.</li>
         * <li>starting: The instance is being started.</li>
         * <li>stopping: The instance is being stopped.</li>
         * <li>stopped: The instance is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags of the ECS instance.</p>
         */
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
