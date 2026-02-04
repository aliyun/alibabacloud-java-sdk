// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1212131231****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <strong>example:</strong>
     * <p>ANSWERED</p>
     */
    @NameInMap("CallResult")
    public String callResult;

    /**
     * <strong>example:</strong>
     * <p>053714454****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("DetailIds")
    public java.util.List<Long> detailIds;

    /**
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("EncryptionType")
    public Long encryptionType;

    /**
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("EndCallingTime")
    public Long endCallingTime;

    /**
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("EndImportedTime")
    public Long endImportedTime;

    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("MajorIntent")
    public String majorIntent;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxConversationDuration")
    public Long maxConversationDuration;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinConversationDuration")
    public Long minConversationDuration;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
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
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("StartCallingTime")
    public Long startCallingTime;

    /**
     * <strong>example:</strong>
     * <p>1748948749000</p>
     */
    @NameInMap("StartImportedTime")
    public Long startImportedTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1212131231****</p>
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
