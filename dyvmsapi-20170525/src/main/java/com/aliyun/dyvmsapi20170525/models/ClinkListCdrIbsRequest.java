// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>177xxxx7750</p>
     */
    @NameInMap("ClientNumber")
    public String clientNumber;

    /**
     * <strong>example:</strong>
     * <p>0032</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CustomerNumber")
    public String customerNumber;

    /**
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenType")
    public Long hiddenType;

    /**
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <strong>example:</strong>
     * <p>uniq_1-162046xxxx.12</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>2233</p>
     */
    @NameInMap("Qno")
    public String qno;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("QueueAnswerInTime")
    public Long queueAnswerInTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    public static ClinkListCdrIbsRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbsRequest self = new ClinkListCdrIbsRequest();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbsRequest setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }
    public String getClientNumber() {
        return this.clientNumber;
    }

    public ClinkListCdrIbsRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public ClinkListCdrIbsRequest setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public ClinkListCdrIbsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ClinkListCdrIbsRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkListCdrIbsRequest setHiddenType(Long hiddenType) {
        this.hiddenType = hiddenType;
        return this;
    }
    public Long getHiddenType() {
        return this.hiddenType;
    }

    public ClinkListCdrIbsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ClinkListCdrIbsRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public ClinkListCdrIbsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ClinkListCdrIbsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkListCdrIbsRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public ClinkListCdrIbsRequest setQueueAnswerInTime(Long queueAnswerInTime) {
        this.queueAnswerInTime = queueAnswerInTime;
        return this;
    }
    public Long getQueueAnswerInTime() {
        return this.queueAnswerInTime;
    }

    public ClinkListCdrIbsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkListCdrIbsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkListCdrIbsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ClinkListCdrIbsRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
