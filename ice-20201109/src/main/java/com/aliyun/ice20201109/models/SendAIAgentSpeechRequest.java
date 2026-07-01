// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentSpeechRequest extends TeaModel {
    /**
     * <p>Specifies whether the broadcast can interrupt the ongoing speech. Default value: true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInterrupt")
    public Boolean enableInterrupt;

    /**
     * <p>Agent instance ID.</p>
     * <blockquote>
     * <p>The InstanceId is the unique ID returned after successfully starting an agent instance. For details about starting an agent instance, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The text content to be played back. The supported input format varies based on the Type parameter. The length cannot exceed 1024 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello, welcome to our service.</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>Input type. Valid values:</p>
     * <ul>
     * <li><p>Text: Input is plain text.</p>
     * </li>
     * <li><p>AudioUrl: Input is an audio URL.</p>
     * </li>
     * </ul>
     * <p>Default value: Text.</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("Type")
    public String type;

    public static SendAIAgentSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentSpeechRequest self = new SendAIAgentSpeechRequest();
        return TeaModel.build(map, self);
    }

    public SendAIAgentSpeechRequest setEnableInterrupt(Boolean enableInterrupt) {
        this.enableInterrupt = enableInterrupt;
        return this;
    }
    public Boolean getEnableInterrupt() {
        return this.enableInterrupt;
    }

    public SendAIAgentSpeechRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendAIAgentSpeechRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SendAIAgentSpeechRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
