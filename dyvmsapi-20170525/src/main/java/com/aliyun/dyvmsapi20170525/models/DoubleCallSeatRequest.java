// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DoubleCallSeatRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CallerShowNumber")
    public String callerShowNumber;

    @NameInMap("CallerNumber")
    public String callerNumber;

    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("AsrFlag")
    public Boolean asrFlag;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("AsrModelId")
    public String asrModelId;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("CallType")
    public String callType;

    @NameInMap("RecordPoint")
    public Integer recordPoint;

    @NameInMap("VoiceCode")
    public String voiceCode;

    public static DoubleCallSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        DoubleCallSeatRequest self = new DoubleCallSeatRequest();
        return TeaModel.build(map, self);
    }

    public DoubleCallSeatRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DoubleCallSeatRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DoubleCallSeatRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DoubleCallSeatRequest setCallerShowNumber(String callerShowNumber) {
        this.callerShowNumber = callerShowNumber;
        return this;
    }
    public String getCallerShowNumber() {
        return this.callerShowNumber;
    }

    public DoubleCallSeatRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public DoubleCallSeatRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public DoubleCallSeatRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public DoubleCallSeatRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public DoubleCallSeatRequest setAsrFlag(Boolean asrFlag) {
        this.asrFlag = asrFlag;
        return this;
    }
    public Boolean getAsrFlag() {
        return this.asrFlag;
    }

    public DoubleCallSeatRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public DoubleCallSeatRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public DoubleCallSeatRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public DoubleCallSeatRequest setCallType(String callType) {
        this.callType = callType;
        return this;
    }
    public String getCallType() {
        return this.callType;
    }

    public DoubleCallSeatRequest setRecordPoint(Integer recordPoint) {
        this.recordPoint = recordPoint;
        return this;
    }
    public Integer getRecordPoint() {
        return this.recordPoint;
    }

    public DoubleCallSeatRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

}
