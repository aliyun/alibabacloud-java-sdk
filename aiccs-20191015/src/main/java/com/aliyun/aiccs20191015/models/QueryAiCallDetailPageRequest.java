// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageRequest extends TeaModel {
    /**
     * <p>The batch ID. You can find this ID by clicking Details on the <strong>Call Task Management</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>1183**************</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The call result. Valid values:</p>
     * <ul>
     * <li><p>CALL_FORWARDING: Call Forwarding.</p>
     * </li>
     * <li><p>INCOMING_CALL_BARRED: Incoming Call Barred.</p>
     * </li>
     * <li><p>CALL_REJECTED: Call Rejected.</p>
     * </li>
     * <li><p>ANSWERED: Answered.</p>
     * </li>
     * <li><p>USER_BUSY: User Busy.</p>
     * </li>
     * <li><p>POWERED_OFF: Powered Off.</p>
     * </li>
     * <li><p>NO_USER_RESPONSE: No User Response.</p>
     * </li>
     * <li><p>OPERATOR_BLOCK: Operator Block.</p>
     * </li>
     * <li><p>OTHERS: Others.</p>
     * </li>
     * <li><p>SUSPEND: Suspend.</p>
     * </li>
     * <li><p>CANCEL: Canceled by the caller.</p>
     * </li>
     * <li><p>INVALID_NUMBER: Invalid Number.</p>
     * </li>
     * <li><p>UNAVAILABLE: Unavailable.</p>
     * </li>
     * <li><p>NETWORK_BUSY: Network Busy.</p>
     * </li>
     * <li><p>NO_ANSWER: No Answer.</p>
     * </li>
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
     * <p>A list of up to 100 detail IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value Sample value</p>
     */
    @NameInMap("DetailIds")
    public java.util.List<Long> detailIds;

    /**
     * <p>The encryption method. Valid values: 0 (None), 1 (MD5), 2 (SHA256), and 3 (SM3).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <p>The end of the call time range. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("EndCallingTime")
    public Long endCallingTime;

    /**
     * <p>The end of the import time range. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("EndImportedTime")
    public Long endImportedTime;

    /**
     * <p>The major intent. You can find this intent by clicking Agent Details on the <a href="https://aiccs.console.aliyun.com/agent/customize">Communication Agent Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("MajorIntent")
    public String majorIntent;

    /**
     * <p>The maximum conversation duration, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxConversationDuration")
    public Long maxConversationDuration;

    /**
     * <p>The minimum conversation duration, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinConversationDuration")
    public Long minConversationDuration;

    /**
     * <p>A custom ID provided by the caller. This ID is returned in the receipt message for request tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>94ba739b-c01a-ef91-335d-4be006c34899</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. The default value is <strong>10</strong>.</p>
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
     * <p>The start of the call time range. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("StartCallingTime")
    public Long startCallingTime;

    /**
     * <p>The start of the import time range. This value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("StartImportedTime")
    public Long startImportedTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p>0: Pending.</p>
     * </li>
     * <li><p>1: Completed.</p>
     * </li>
     * <li><p>2: Failed.</p>
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

    public static QueryAiCallDetailPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallDetailPageRequest self = new QueryAiCallDetailPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiCallDetailPageRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryAiCallDetailPageRequest setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }
    public String getCallResult() {
        return this.callResult;
    }

    public QueryAiCallDetailPageRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public QueryAiCallDetailPageRequest setDetailIds(java.util.List<Long> detailIds) {
        this.detailIds = detailIds;
        return this;
    }
    public java.util.List<Long> getDetailIds() {
        return this.detailIds;
    }

    public QueryAiCallDetailPageRequest setEncryptionType(Long encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    public QueryAiCallDetailPageRequest setEndCallingTime(Long endCallingTime) {
        this.endCallingTime = endCallingTime;
        return this;
    }
    public Long getEndCallingTime() {
        return this.endCallingTime;
    }

    public QueryAiCallDetailPageRequest setEndImportedTime(Long endImportedTime) {
        this.endImportedTime = endImportedTime;
        return this;
    }
    public Long getEndImportedTime() {
        return this.endImportedTime;
    }

    public QueryAiCallDetailPageRequest setMajorIntent(String majorIntent) {
        this.majorIntent = majorIntent;
        return this;
    }
    public String getMajorIntent() {
        return this.majorIntent;
    }

    public QueryAiCallDetailPageRequest setMaxConversationDuration(Long maxConversationDuration) {
        this.maxConversationDuration = maxConversationDuration;
        return this;
    }
    public Long getMaxConversationDuration() {
        return this.maxConversationDuration;
    }

    public QueryAiCallDetailPageRequest setMinConversationDuration(Long minConversationDuration) {
        this.minConversationDuration = minConversationDuration;
        return this;
    }
    public Long getMinConversationDuration() {
        return this.minConversationDuration;
    }

    public QueryAiCallDetailPageRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public QueryAiCallDetailPageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAiCallDetailPageRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAiCallDetailPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAiCallDetailPageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAiCallDetailPageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAiCallDetailPageRequest setStartCallingTime(Long startCallingTime) {
        this.startCallingTime = startCallingTime;
        return this;
    }
    public Long getStartCallingTime() {
        return this.startCallingTime;
    }

    public QueryAiCallDetailPageRequest setStartImportedTime(Long startImportedTime) {
        this.startImportedTime = startImportedTime;
        return this;
    }
    public Long getStartImportedTime() {
        return this.startImportedTime;
    }

    public QueryAiCallDetailPageRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryAiCallDetailPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
