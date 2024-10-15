// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRobotTaskRequest extends TeaModel {
    /**
     * <p>The calling number.</p>
     * <p>You must use the phone numbers that you have purchased and separate multiple numbers with commas (,). You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Real Number Service</strong> &gt; <strong>Real Number Management</strong> to view the numbers you purchased.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571****5678</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>The company name, which must be the same as the <strong>enterprise name</strong> on the qualification management page.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The ID of the robot or communication script that is used to initiate the call.</p>
     * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Intelligent Voice Robot</strong> &gt; <strong>Communication Script Management</strong> to view the communication script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000023****</p>
     */
    @NameInMap("DialogId")
    public Long dialogId;

    /**
     * <p>Specifies whether to call the self-managed line. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>true</strong>, calling numbers are not verified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    /**
     * <p>Specifies whether to enable number status identification. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>true</strong>, the reason why a call is not answered is recorded.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NumberStatusIdent")
    public Boolean numberStatusIdent;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The redial interval. Unit: minutes. The value must be greater than 1.</p>
     * <blockquote>
     * <p>The maximum redial interval is 30 minutes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RecallInterval")
    public Integer recallInterval;

    /**
     * <p>The call state in which redial is required. Separate multiple call states with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>200010</strong>: The phone of the called party is powered off.</li>
     * <li><strong>200011</strong>: The number of the called party is out of service.</li>
     * <li><strong>200002</strong>: The line is busy.</li>
     * <li><strong>200012</strong>: The call is lost.</li>
     * <li><strong>200005</strong>: The called party cannot be connected.</li>
     * <li><strong>200003</strong>: The called party does not respond to the call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200010,200011</p>
     */
    @NameInMap("RecallStateCodes")
    public String recallStateCodes;

    /**
     * <p>The number of redial times.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallTimes")
    public Integer recallTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable auto-redial. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables auto-redial.</li>
     * <li><strong>0</strong>: disables auto-redial.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetryType")
    public Integer retryType;

    /**
     * <p>The task name. The task name can be up to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Template</p>
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
