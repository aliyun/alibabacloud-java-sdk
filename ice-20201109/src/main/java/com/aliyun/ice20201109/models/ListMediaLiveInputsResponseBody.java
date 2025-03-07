// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveInputsResponseBody extends TeaModel {
    /**
     * <p>The inputs.</p>
     */
    @NameInMap("Inputs")
    public java.util.List<ListMediaLiveInputsResponseBodyInputs> inputs;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMediaLiveInputsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveInputsResponseBody self = new ListMediaLiveInputsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveInputsResponseBody setInputs(java.util.List<ListMediaLiveInputsResponseBodyInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<ListMediaLiveInputsResponseBodyInputs> getInputs() {
        return this.inputs;
    }

    public ListMediaLiveInputsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaLiveInputsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaLiveInputsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaLiveInputsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMediaLiveInputsResponseBodyInputsInputInfos extends TeaModel {
        /**
         * <p>The endpoint that the stream is pushed to. This parameter is returned for PUSH inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://domain/app/stream</p>
         */
        @NameInMap("DestHost")
        public String destHost;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowOutputName")
        public String flowOutputName;

        /**
         * <p>The URL for input monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://domain/app/stream_for_monitor</p>
         */
        @NameInMap("MonitorUrl")
        public String monitorUrl;

        /**
         * <p>The source URL where the stream is pulled from. This parameter is returned for PULL inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://domain/app/stream</p>
         */
        @NameInMap("SourceUrl")
        public String sourceUrl;

        /**
         * <p>The name of the pushed stream. This parameter is returned for PUSH inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>mystream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static ListMediaLiveInputsResponseBodyInputsInputInfos build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveInputsResponseBodyInputsInputInfos self = new ListMediaLiveInputsResponseBodyInputsInputInfos();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveInputsResponseBodyInputsInputInfos setDestHost(String destHost) {
            this.destHost = destHost;
            return this;
        }
        public String getDestHost() {
            return this.destHost;
        }

        public ListMediaLiveInputsResponseBodyInputsInputInfos setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListMediaLiveInputsResponseBodyInputsInputInfos setFlowOutputName(String flowOutputName) {
            this.flowOutputName = flowOutputName;
            return this;
        }
        public String getFlowOutputName() {
            return this.flowOutputName;
        }

        public ListMediaLiveInputsResponseBodyInputsInputInfos setMonitorUrl(String monitorUrl) {
            this.monitorUrl = monitorUrl;
            return this;
        }
        public String getMonitorUrl() {
            return this.monitorUrl;
        }

        public ListMediaLiveInputsResponseBodyInputsInputInfos setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public ListMediaLiveInputsResponseBodyInputsInputInfos setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class ListMediaLiveInputsResponseBodyInputs extends TeaModel {
        /**
         * <p>The IDs of the channels associated with the input.</p>
         */
        @NameInMap("ChannelIds")
        public java.util.List<String> channelIds;

        /**
         * <p>The time when the input was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-03T06:56:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the input.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        @NameInMap("InputId")
        public String inputId;

        /**
         * <p>The input configurations.</p>
         */
        @NameInMap("InputInfos")
        public java.util.List<ListMediaLiveInputsResponseBodyInputsInputInfos> inputInfos;

        /**
         * <p>The name of the input.</p>
         * 
         * <strong>example:</strong>
         * <p>myinput</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The IDs of the security groups associated with the input.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The input type.</p>
         * 
         * <strong>example:</strong>
         * <p>RTMP_PUSH</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListMediaLiveInputsResponseBodyInputs build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveInputsResponseBodyInputs self = new ListMediaLiveInputsResponseBodyInputs();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveInputsResponseBodyInputs setChannelIds(java.util.List<String> channelIds) {
            this.channelIds = channelIds;
            return this;
        }
        public java.util.List<String> getChannelIds() {
            return this.channelIds;
        }

        public ListMediaLiveInputsResponseBodyInputs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaLiveInputsResponseBodyInputs setInputId(String inputId) {
            this.inputId = inputId;
            return this;
        }
        public String getInputId() {
            return this.inputId;
        }

        public ListMediaLiveInputsResponseBodyInputs setInputInfos(java.util.List<ListMediaLiveInputsResponseBodyInputsInputInfos> inputInfos) {
            this.inputInfos = inputInfos;
            return this;
        }
        public java.util.List<ListMediaLiveInputsResponseBodyInputsInputInfos> getInputInfos() {
            return this.inputInfos;
        }

        public ListMediaLiveInputsResponseBodyInputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaLiveInputsResponseBodyInputs setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListMediaLiveInputsResponseBodyInputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
