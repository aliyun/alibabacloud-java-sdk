// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClickToDialRequest extends TeaModel {
    @NameInMap("AsrFlag")
    public Boolean asrFlag;

    @NameInMap("AsrModelId")
    public String asrModelId;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    @NameInMap("CallerNumber")
    public String callerNumber;

    @NameInMap("CallerShowNumber")
    public String callerShowNumber;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    public static ClickToDialRequest build(java.util.Map<String, ?> map) throws Exception {
        ClickToDialRequest self = new ClickToDialRequest();
        return TeaModel.build(map, self);
    }

    public ClickToDialRequest setAsrFlag(Boolean asrFlag) {
        this.asrFlag = asrFlag;
        return this;
    }
    public Boolean getAsrFlag() {
        return this.asrFlag;
    }

    public ClickToDialRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public ClickToDialRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ClickToDialRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public ClickToDialRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public ClickToDialRequest setCallerShowNumber(String callerShowNumber) {
        this.callerShowNumber = callerShowNumber;
        return this;
    }
    public String getCallerShowNumber() {
        return this.callerShowNumber;
    }

    public ClickToDialRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ClickToDialRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClickToDialRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public ClickToDialRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClickToDialRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClickToDialRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

}
