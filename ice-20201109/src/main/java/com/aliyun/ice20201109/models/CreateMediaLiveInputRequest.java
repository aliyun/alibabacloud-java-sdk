// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputRequest extends TeaModel {
    /**
     * <p>The input settings. An input can have up to two sources: primary and backup sources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputSettings")
    public java.util.List<CreateMediaLiveInputRequestInputSettings> inputSettings;

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

    /**
     * <p>The input type. Valid values: RTMP_PUSH, RTMP_PULL, SRT_PUSH, and SRT_PULL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RTMP_PUSH</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateMediaLiveInputRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputRequest self = new CreateMediaLiveInputRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputRequest setInputSettings(java.util.List<CreateMediaLiveInputRequestInputSettings> inputSettings) {
        this.inputSettings = inputSettings;
        return this;
    }
    public java.util.List<CreateMediaLiveInputRequestInputSettings> getInputSettings() {
        return this.inputSettings;
    }

    public CreateMediaLiveInputRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMediaLiveInputRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateMediaLiveInputRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMediaLiveInputRequestInputSettings extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowOutputName")
        public String flowOutputName;

        /**
         * <p>The source URL where the stream is pulled from. This parameter is required for PULL inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://domain/app/stream</p>
         */
        @NameInMap("SourceUrl")
        public String sourceUrl;

        /**
         * <p>The name of the pushed stream. This parameter is required for PUSH inputs. It can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>mystream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static CreateMediaLiveInputRequestInputSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaLiveInputRequestInputSettings self = new CreateMediaLiveInputRequestInputSettings();
            return TeaModel.build(map, self);
        }

        public CreateMediaLiveInputRequestInputSettings setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public CreateMediaLiveInputRequestInputSettings setFlowOutputName(String flowOutputName) {
            this.flowOutputName = flowOutputName;
            return this;
        }
        public String getFlowOutputName() {
            return this.flowOutputName;
        }

        public CreateMediaLiveInputRequestInputSettings setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public CreateMediaLiveInputRequestInputSettings setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
