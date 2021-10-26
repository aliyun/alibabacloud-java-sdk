// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRobotTaskRequest extends TeaModel {
    @NameInMap("Caller")
    public String caller;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    @NameInMap("NumberStatusIdent")
    public Boolean numberStatusIdent;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RecallInterval")
    public Integer recallInterval;

    @NameInMap("RecallStateCodes")
    public String recallStateCodes;

    @NameInMap("RecallTimes")
    public Integer recallTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RetryType")
    public Integer retryType;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateRobotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotTaskRequest self = new CreateRobotTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRobotTaskRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public CreateRobotTaskRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateRobotTaskRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public CreateRobotTaskRequest setIsSelfLine(Boolean isSelfLine) {
        this.isSelfLine = isSelfLine;
        return this;
    }
    public Boolean getIsSelfLine() {
        return this.isSelfLine;
    }

    public CreateRobotTaskRequest setNumberStatusIdent(Boolean numberStatusIdent) {
        this.numberStatusIdent = numberStatusIdent;
        return this;
    }
    public Boolean getNumberStatusIdent() {
        return this.numberStatusIdent;
    }

    public CreateRobotTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRobotTaskRequest setRecallInterval(Integer recallInterval) {
        this.recallInterval = recallInterval;
        return this;
    }
    public Integer getRecallInterval() {
        return this.recallInterval;
    }

    public CreateRobotTaskRequest setRecallStateCodes(String recallStateCodes) {
        this.recallStateCodes = recallStateCodes;
        return this;
    }
    public String getRecallStateCodes() {
        return this.recallStateCodes;
    }

    public CreateRobotTaskRequest setRecallTimes(Integer recallTimes) {
        this.recallTimes = recallTimes;
        return this;
    }
    public Integer getRecallTimes() {
        return this.recallTimes;
    }

    public CreateRobotTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRobotTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRobotTaskRequest setRetryType(Integer retryType) {
        this.retryType = retryType;
        return this;
    }
    public Integer getRetryType() {
        return this.retryType;
    }

    public CreateRobotTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
