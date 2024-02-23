// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRobotTaskRequest extends TeaModel {
    /**
     * <p>The calling number.</p>
     * <br>
     * <p>You must use the phone numbers that you have purchased and separate multiple numbers with commas (,). You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Real Number Service** > **Real Number Management** to view the numbers you purchased.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>The company name, which must be the same as the **enterprise name** on the qualification management page.</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The ID of the robot or communication script that is used to initiate the call.</p>
     * <br>
     * <p>You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Intelligent Voice Robot** > **Communication Script Management** to view the communication script ID.</p>
     */
    @NameInMap("DialogId")
    public Long dialogId;

    /**
     * <p>Specifies whether to call the self-managed line. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     * <br>
     * <p>> If you set this parameter to **true**, calling numbers are not verified.</p>
     */
    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    /**
     * <p>Specifies whether to enable number status identification. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     * <br>
     * <p>> If you set this parameter to **true**, the reason why a call is not answered is recorded.</p>
     */
    @NameInMap("NumberStatusIdent")
    public Boolean numberStatusIdent;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The redial interval. Unit: minutes. The value must be greater than 1.</p>
     * <br>
     * <p>> The maximum redial interval is 30 minutes.</p>
     */
    @NameInMap("RecallInterval")
    public Integer recallInterval;

    /**
     * <p>The call state in which redial is required. Separate multiple call states with commas (,). Valid values:</p>
     * <br>
     * <p>*   **200010**: The phone of the called party is powered off.</p>
     * <p>*   **200011**: The number of the called party is out of service.</p>
     * <p>*   **200002**: The line is busy.</p>
     * <p>*   **200012**: The call is lost.</p>
     * <p>*   **200005**: The called party cannot be connected.</p>
     * <p>*   **200003**: The called party does not respond to the call.</p>
     */
    @NameInMap("RecallStateCodes")
    public String recallStateCodes;

    /**
     * <p>The number of redial times.</p>
     */
    @NameInMap("RecallTimes")
    public Integer recallTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable auto-redial. Valid values:</p>
     * <br>
     * <p>*   **1**: enables auto-redial.</p>
     * <p>*   **0**: disables auto-redial.</p>
     */
    @NameInMap("RetryType")
    public Integer retryType;

    /**
     * <p>The task name. The task name can be up to 30 characters in length.</p>
     */
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
