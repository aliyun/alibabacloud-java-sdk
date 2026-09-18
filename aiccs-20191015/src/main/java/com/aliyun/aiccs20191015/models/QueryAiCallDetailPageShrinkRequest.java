// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageShrinkRequest extends TeaModel {
    /**
     * <p>The batch ID. On the <strong>Call Task Management</strong> page, click Details to view the batch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1183**************</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The call result. Valid values:</p>
     * <ul>
     * <li>CALL_FORWARDING: call forwarding.</li>
     * <li>INCOMING_CALL_BARRED: incoming call barred.</li>
     * <li>CALL_REJECTED: call rejected.</li>
     * <li>ANSWERED: answered.</li>
     * <li>USER_BUSY: user busy.</li>
     * <li>POWERED_OFF: powered off.</li>
     * <li>NO_USER_RESPONSE: out of service area.</li>
     * <li>OPERATOR_BLOCK: blocked by carrier.</li>
     * <li>OTHERS: other status.</li>
     * <li>SUSPEND: suspended.</li>
     * <li>CANCEL: canceled by caller.</li>
     * <li>INVALID_NUMBER: invalid number.</li>
     * <li>UNAVAILABLE: temporarily unavailable.</li>
     * <li>NETWORK_BUSY: network busy.</li>
     * <li>NO_ANSWER: no answer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ANSWERED</p>
     */
    @NameInMap("CallResult")
    public String callResult;

    /**
     * <p>The called number.</p>
     * 
     * <strong>example:</strong>
     * <p>053714454****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The list of task detail IDs. A maximum of 100 IDs can be specified.</p>
     */
    @NameInMap("DetailIds")
    public String detailIdsShrink;

    /**
     * <p>The encryption type. Valid values: 0: no encryption. 1: MD5. 2: SHA256. 3: SM3.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <p>The end calling time. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("EndCallingTime")
    public Long endCallingTime;

    /**
     * <p>The end import time. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("EndImportedTime")
    public Long endImportedTime;

    /**
     * <p>The major intent. On the <a href="https://aiccs.console.aliyun.com/agent/customize">Communication Agent Management</a> page, click agent details to view the major intent.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("MajorIntent")
    public String majorIntent;

    /**
     * <p>The maximum conversation duration. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxConversationDuration")
    public Long maxConversationDuration;

    /**
     * <p>The minimum conversation duration. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinConversationDuration")
    public Long minConversationDuration;

    /**
     * <p>The ID reserved for the caller. This ID is returned to the caller in the receipt message.</p>
     * 
     * <strong>example:</strong>
     * <p>94ba739b-c01a-ef91-335d-4be006c34899</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start calling time. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("StartCallingTime")
    public Long startCallingTime;

    /**
     * <p>The start import time. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("StartImportedTime")
    public Long startImportedTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p>0: pending.</p>
     * </li>
     * <li><p>1: completed.</p>
     * </li>
     * <li><p>2: failed.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1187**************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryAiCallDetailPageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallDetailPageShrinkRequest self = new QueryAiCallDetailPageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiCallDetailPageShrinkRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryAiCallDetailPageShrinkRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public QueryAiCallDetailPageShrinkRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public QueryAiCallDetailPageShrinkRequest setDetailIdsShrink(String detailIdsShrink) {
        this.detailIdsShrink = detailIdsShrink;
        return this;
    }
    public String getDetailIdsShrink() {
        return this.detailIdsShrink;
    }

    public QueryAiCallDetailPageShrinkRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public QueryAiCallDetailPageShrinkRequest setEndCallingTime(Long endCallingTime) {
        this.endCallingTime = endCallingTime;
        return this;
    }
    public Long getEndCallingTime() {
        return this.endCallingTime;
    }

    public QueryAiCallDetailPageShrinkRequest setEndImportedTime(Long endImportedTime) {
        this.endImportedTime = endImportedTime;
        return this;
    }
    public Long getEndImportedTime() {
        return this.endImportedTime;
    }

    public QueryAiCallDetailPageShrinkRequest setMajorIntent(String majorIntent) {
        this.majorIntent = majorIntent;
        return this;
    }
    public String getMajorIntent() {
        return this.majorIntent;
    }

    public QueryAiCallDetailPageShrinkRequest setMaxConversationDuration(Long maxConversationDuration) {
        this.maxConversationDuration = maxConversationDuration;
        return this;
    }
    public Long getMaxConversationDuration() {
        return this.maxConversationDuration;
    }

    public QueryAiCallDetailPageShrinkRequest setMinConversationDuration(Long minConversationDuration) {
        this.minConversationDuration = minConversationDuration;
        return this;
    }
    public Long getMinConversationDuration() {
        return this.minConversationDuration;
    }

    public QueryAiCallDetailPageShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public QueryAiCallDetailPageShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAiCallDetailPageShrinkRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAiCallDetailPageShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAiCallDetailPageShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAiCallDetailPageShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAiCallDetailPageShrinkRequest setStartCallingTime(Long startCallingTime) {
        this.startCallingTime = startCallingTime;
        return this;
    }
    public Long getStartCallingTime() {
        return this.startCallingTime;
    }

    public QueryAiCallDetailPageShrinkRequest setStartImportedTime(Long startImportedTime) {
        this.startImportedTime = startImportedTime;
        return this;
    }
    public Long getStartImportedTime() {
        return this.startImportedTime;
    }

    public QueryAiCallDetailPageShrinkRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryAiCallDetailPageShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
