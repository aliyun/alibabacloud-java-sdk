// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveInputResponseBody extends TeaModel {
    /**
     * <p>The input information.</p>
     */
    @NameInMap("Input")
    public GetMediaLiveInputResponseBodyInput input;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaLiveInputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveInputResponseBody self = new GetMediaLiveInputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveInputResponseBody setInput(GetMediaLiveInputResponseBodyInput input) {
        this.input = input;
        return this;
    }
    public GetMediaLiveInputResponseBodyInput getInput() {
        return this.input;
    }

    public GetMediaLiveInputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaLiveInputResponseBodyInputInputInfos extends TeaModel {
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

        public static GetMediaLiveInputResponseBodyInputInputInfos build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveInputResponseBodyInputInputInfos self = new GetMediaLiveInputResponseBodyInputInputInfos();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveInputResponseBodyInputInputInfos setDestHost(String destHost) {
            this.destHost = destHost;
            return this;
        }
        public String getDestHost() {
            return this.destHost;
        }

        public GetMediaLiveInputResponseBodyInputInputInfos setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetMediaLiveInputResponseBodyInputInputInfos setFlowOutputName(String flowOutputName) {
            this.flowOutputName = flowOutputName;
            return this;
        }
        public String getFlowOutputName() {
            return this.flowOutputName;
        }

        public GetMediaLiveInputResponseBodyInputInputInfos setMonitorUrl(String monitorUrl) {
            this.monitorUrl = monitorUrl;
            return this;
        }
        public String getMonitorUrl() {
            return this.monitorUrl;
        }

        public GetMediaLiveInputResponseBodyInputInputInfos setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public GetMediaLiveInputResponseBodyInputInputInfos setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class GetMediaLiveInputResponseBodyInput extends TeaModel {
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
        public java.util.List<GetMediaLiveInputResponseBodyInputInputInfos> inputInfos;

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

        public static GetMediaLiveInputResponseBodyInput build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveInputResponseBodyInput self = new GetMediaLiveInputResponseBodyInput();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveInputResponseBodyInput setChannelIds(java.util.List<String> channelIds) {
            this.channelIds = channelIds;
            return this;
        }
        public java.util.List<String> getChannelIds() {
            return this.channelIds;
        }

        public GetMediaLiveInputResponseBodyInput setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaLiveInputResponseBodyInput setInputId(String inputId) {
            this.inputId = inputId;
            return this;
        }
        public String getInputId() {
            return this.inputId;
        }

        public GetMediaLiveInputResponseBodyInput setInputInfos(java.util.List<GetMediaLiveInputResponseBodyInputInputInfos> inputInfos) {
            this.inputInfos = inputInfos;
            return this;
        }
        public java.util.List<GetMediaLiveInputResponseBodyInputInputInfos> getInputInfos() {
            return this.inputInfos;
        }

        public GetMediaLiveInputResponseBodyInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaLiveInputResponseBodyInput setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public GetMediaLiveInputResponseBodyInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
