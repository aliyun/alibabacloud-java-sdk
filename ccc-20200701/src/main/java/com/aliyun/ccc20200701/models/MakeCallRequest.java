// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MakeCallRequest extends TeaModel {
    /**
     * <p>Callee number. For internal calls, specify the target agent\&quot;s extension number in this field. For outbound calls, specify the customer\&quot;s phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1318888****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>Caller number. This parameter is invalid for internal calls. For outbound calls, specify an outbound number available to the current agent. Ensure that the number supports outbound calling and that the agent has permission to use it. Permission can be granted in two ways: either by attaching the number to the skill group the agent signed into, or by setting the number as the agent\&quot;s personal outbound number.</p>
     * 
     * <strong>example:</strong>
     * <p>010989****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>Device ID. This field is meaningless and can be filled with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Flash SMS configuration</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;applicationId\&quot;:\&quot;6bd18325-ea7f-4881-8902-4d06283d3b3b\&quot;,\&quot;templateId\&quot;:\&quot;1722217249064\&quot;}</p>
     */
    @NameInMap("FlashSmsVariables")
    public String flashSmsVariables;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The desensitized callee number. If this field is not empty, it indicates that the callee number must be desensitized. The desensitization rule is defined by the customer. You only need to enter the desensitized callee number here. Using a desensitized callee number means that in certain scenarios, you will see the desensitized callee number and cannot view the real callee number.</p>
     * 
     * <strong>example:</strong>
     * <p>131****8888</p>
     */
    @NameInMap("MaskedCallee")
    public String maskedCallee;

    /**
     * <p>Media type. The default value is AUDIO. Other valid values include VIDEO.</p>
     * 
     * <strong>example:</strong>
     * <p>AUDIO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Ingest endpoint data. The customer does not need to concern themselves with this.</p>
     * 
     * <strong>example:</strong>
     * <p>tags</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Timeout. If the call is not answered within the time specified by this parameter, the system automatically hangs up. Valid values range from 30 to 300 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>Agent ID initiating the outbound call. This field is optional. If not specified, the system uses the agent mapped to the current RAM user by default.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static MakeCallRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeCallRequest self = new MakeCallRequest();
        return TeaModel.build(map, self);
    }

    public MakeCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public MakeCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public MakeCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public MakeCallRequest setFlashSmsVariables(String flashSmsVariables) {
        this.flashSmsVariables = flashSmsVariables;
        return this;
    }
    public String getFlashSmsVariables() {
        return this.flashSmsVariables;
    }

    public MakeCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MakeCallRequest setMaskedCallee(String maskedCallee) {
        this.maskedCallee = maskedCallee;
        return this;
    }
    public String getMaskedCallee() {
        return this.maskedCallee;
    }

    public MakeCallRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public MakeCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public MakeCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public MakeCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
