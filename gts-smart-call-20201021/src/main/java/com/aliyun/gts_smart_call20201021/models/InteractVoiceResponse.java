// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_smart_call20201021.models;

import com.aliyun.tea.*;

public class InteractVoiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CallId")
    @Validation(required = true)
    public String callId;

    @NameInMap("Action")
    @Validation(required = true)
    public String action;

    @NameInMap("ActionBreak")
    @Validation(required = true)
    public Boolean actionBreak;

    @NameInMap("ActionCode")
    @Validation(required = true)
    public String actionCode;

    @NameInMap("ActionCodeBreak")
    @Validation(required = true)
    public Boolean actionCodeBreak;

    @NameInMap("MuteTime")
    @Validation(required = true)
    public Integer muteTime;

    @NameInMap("DynamicId")
    @Validation(required = true)
    public String dynamicId;

    @NameInMap("ActionCodeParam")
    @Validation(required = true)
    public String actionCodeParam;

    @NameInMap("Number")
    @Validation(required = true)
    public String number;

    @NameInMap("ActionCodeTimeBreak")
    @Validation(required = true)
    public Integer actionCodeTimeBreak;

    @NameInMap("DtmfNoninOvertime")
    @Validation(required = true)
    public Integer dtmfNoninOvertime;

    @NameInMap("DtmfMaxNumbers")
    @Validation(required = true)
    public Integer dtmfMaxNumbers;

    @NameInMap("DtmfEndCharacter")
    @Validation(required = true)
    public String dtmfEndCharacter;

    @NameInMap("TransferPlayfile")
    @Validation(required = true)
    public String transferPlayfile;

    @NameInMap("IsMonitor")
    @Validation(required = true)
    public Boolean isMonitor;

    @NameInMap("CcName")
    @Validation(required = true)
    public String ccName;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("SessionTimeout")
    @Validation(required = true)
    public String sessionTimeout;

    @NameInMap("TtsVolume")
    @Validation(required = true)
    public String ttsVolume;

    public static InteractVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InteractVoiceResponse self = new InteractVoiceResponse();
        return TeaModel.build(map, self);
    }

    public InteractVoiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InteractVoiceResponse setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public InteractVoiceResponse setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public InteractVoiceResponse setActionBreak(Boolean actionBreak) {
        this.actionBreak = actionBreak;
        return this;
    }
    public Boolean getActionBreak() {
        return this.actionBreak;
    }

    public InteractVoiceResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public InteractVoiceResponse setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public InteractVoiceResponse setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public InteractVoiceResponse setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
        return this;
    }
    public String getDynamicId() {
        return this.dynamicId;
    }

    public InteractVoiceResponse setActionCodeParam(String actionCodeParam) {
        this.actionCodeParam = actionCodeParam;
        return this;
    }
    public String getActionCodeParam() {
        return this.actionCodeParam;
    }

    public InteractVoiceResponse setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public InteractVoiceResponse setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public InteractVoiceResponse setDtmfNoninOvertime(Integer dtmfNoninOvertime) {
        this.dtmfNoninOvertime = dtmfNoninOvertime;
        return this;
    }
    public Integer getDtmfNoninOvertime() {
        return this.dtmfNoninOvertime;
    }

    public InteractVoiceResponse setDtmfMaxNumbers(Integer dtmfMaxNumbers) {
        this.dtmfMaxNumbers = dtmfMaxNumbers;
        return this;
    }
    public Integer getDtmfMaxNumbers() {
        return this.dtmfMaxNumbers;
    }

    public InteractVoiceResponse setDtmfEndCharacter(String dtmfEndCharacter) {
        this.dtmfEndCharacter = dtmfEndCharacter;
        return this;
    }
    public String getDtmfEndCharacter() {
        return this.dtmfEndCharacter;
    }

    public InteractVoiceResponse setTransferPlayfile(String transferPlayfile) {
        this.transferPlayfile = transferPlayfile;
        return this;
    }
    public String getTransferPlayfile() {
        return this.transferPlayfile;
    }

    public InteractVoiceResponse setIsMonitor(Boolean isMonitor) {
        this.isMonitor = isMonitor;
        return this;
    }
    public Boolean getIsMonitor() {
        return this.isMonitor;
    }

    public InteractVoiceResponse setCcName(String ccName) {
        this.ccName = ccName;
        return this;
    }
    public String getCcName() {
        return this.ccName;
    }

    public InteractVoiceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InteractVoiceResponse setSessionTimeout(String sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public String getSessionTimeout() {
        return this.sessionTimeout;
    }

    public InteractVoiceResponse setTtsVolume(String ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public String getTtsVolume() {
        return this.ttsVolume;
    }

}
