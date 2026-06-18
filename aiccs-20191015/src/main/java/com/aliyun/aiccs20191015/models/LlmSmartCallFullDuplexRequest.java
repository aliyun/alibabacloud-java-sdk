// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallFullDuplexRequest extends TeaModel {
    /**
     * <p><strong>ApplicationCode</strong><br>The application code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app123</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p><strong>CalledNumber</strong><br>The phone number that receives the intelligent outbound call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p><strong>CallerNumber</strong><br>The calling number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0987654321</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p><strong>OutId</strong><br>The external ID. The value must be 1 to 15 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>out123</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p><strong>SessionTimeout</strong><br>The maximum call duration. The call is automatically ended when the specified duration is exceeded. Unit: seconds. Maximum value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p><strong>StartWordParam</strong><br>The opening greeting variable. Format: JSON. Specify the variable name and parameter, for example, <code>{&quot;custom&quot;:&quot;XXX&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;tailnumber\&quot;:\&quot;7898\&quot;,\&quot;platformOrder\&quot;:\&quot;\&quot;,\&quot;signatory\&quot;:\&quot;客户\&quot;}</p>
     */
    @NameInMap("StartWordParam")
    public java.util.Map<String, ?> startWordParam;

    /**
     * <p>The voice speed. Valid values: 0 to 100. If this parameter is not specified, the value configured in the application is used.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>The voice code from the personalized voice interface. If this parameter is not specified, the value configured in the application is used.</p>
     * 
     * <strong>example:</strong>
     * <p>V745A7CED</p>
     */
    @NameInMap("TtsVoiceCode")
    public String ttsVoiceCode;

    /**
     * <p>The volume. Valid values: -200 to 200. If this parameter is not specified, the value configured in the application is used.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    public static LlmSmartCallFullDuplexRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallFullDuplexRequest self = new LlmSmartCallFullDuplexRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallFullDuplexRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallFullDuplexRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallFullDuplexRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallFullDuplexRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallFullDuplexRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public LlmSmartCallFullDuplexRequest setStartWordParam(java.util.Map<String, ?> startWordParam) {
        this.startWordParam = startWordParam;
        return this;
    }
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    public LlmSmartCallFullDuplexRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public LlmSmartCallFullDuplexRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public LlmSmartCallFullDuplexRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

}
