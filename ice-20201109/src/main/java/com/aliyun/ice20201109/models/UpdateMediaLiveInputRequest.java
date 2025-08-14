// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveInputRequest extends TeaModel {
    /**
     * <p>The ID of the input.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("InputId")
    public String inputId;

    /**
     * <p>The input settings. An input can have up to two sources: primary and backup sources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputSettings")
    public java.util.List<UpdateMediaLiveInputRequestInputSettings> inputSettings;

    /**
     * <p>The name of the input. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myinput</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IDs of the security groups to be associated with the input. This parameter is required for PUSH inputs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;G6G4X5T4SZYPSTT5&quot;]</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static UpdateMediaLiveInputRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveInputRequest self = new UpdateMediaLiveInputRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveInputRequest setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }
    public String getInputId() {
        return this.inputId;
    }

    public UpdateMediaLiveInputRequest setInputSettings(java.util.List<UpdateMediaLiveInputRequestInputSettings> inputSettings) {
        this.inputSettings = inputSettings;
        return this;
    }
    public java.util.List<UpdateMediaLiveInputRequestInputSettings> getInputSettings() {
        return this.inputSettings;
    }

    public UpdateMediaLiveInputRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaLiveInputRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static class UpdateMediaLiveInputRequestInputSettings extends TeaModel {
        /**
         * <p>The ID of the flow from MediaConnect. This parameter is required when Type is set to MEDIA_CONNECT.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>81-9693-40dc-bbab-db5e49</strong></strong></strong></p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The output name of the MediaConnect flow. This parameter is required when Type is set to MEDIA_CONNECT.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowOutputName</p>
         */
        @NameInMap("FlowOutputName")
        public String flowOutputName;

        /**
         * <p>The source URL from which the stream is pulled. This parameter is required for PULL inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://domain/app/stream</p>
         */
        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("SrtLatency")
        public Integer srtLatency;

        @NameInMap("SrtMaxBitrate")
        public Integer srtMaxBitrate;

        @NameInMap("SrtPassphrase")
        public String srtPassphrase;

        @NameInMap("SrtPbKeyLen")
        public Integer srtPbKeyLen;

        /**
         * <p>The name of the pushed stream. This parameter is required for PUSH inputs. It can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>mystream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static UpdateMediaLiveInputRequestInputSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveInputRequestInputSettings self = new UpdateMediaLiveInputRequestInputSettings();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveInputRequestInputSettings setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public UpdateMediaLiveInputRequestInputSettings setFlowOutputName(String flowOutputName) {
            this.flowOutputName = flowOutputName;
            return this;
        }
        public String getFlowOutputName() {
            return this.flowOutputName;
        }

        public UpdateMediaLiveInputRequestInputSettings setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public UpdateMediaLiveInputRequestInputSettings setSrtLatency(Integer srtLatency) {
            this.srtLatency = srtLatency;
            return this;
        }
        public Integer getSrtLatency() {
            return this.srtLatency;
        }

        public UpdateMediaLiveInputRequestInputSettings setSrtMaxBitrate(Integer srtMaxBitrate) {
            this.srtMaxBitrate = srtMaxBitrate;
            return this;
        }
        public Integer getSrtMaxBitrate() {
            return this.srtMaxBitrate;
        }

        public UpdateMediaLiveInputRequestInputSettings setSrtPassphrase(String srtPassphrase) {
            this.srtPassphrase = srtPassphrase;
            return this;
        }
        public String getSrtPassphrase() {
            return this.srtPassphrase;
        }

        public UpdateMediaLiveInputRequestInputSettings setSrtPbKeyLen(Integer srtPbKeyLen) {
            this.srtPbKeyLen = srtPbKeyLen;
            return this;
        }
        public Integer getSrtPbKeyLen() {
            return this.srtPbKeyLen;
        }

        public UpdateMediaLiveInputRequestInputSettings setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
