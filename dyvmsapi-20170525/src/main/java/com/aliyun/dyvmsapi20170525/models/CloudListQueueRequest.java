// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListQueueRequest extends TeaModel {
    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>创建时间终止时间点；取值说明：&quot;2019-10-11 23:59:59&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 23:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>条数；正整数，大于0，最大不能超过500， 默认为500</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>第几条开始；正整数 大于等于0 默认为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>排序方式,按照创建时间排序；0正序 1倒序</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Order")
    public Long order;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>队列号</p>
     * 
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("Qno")
    public String qno;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>创建时间起始时间点；取值说明：&quot;2019-10-11 00:00:00&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CloudListQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListQueueRequest self = new CloudListQueueRequest();
        return TeaModel.build(map, self);
    }

    public CloudListQueueRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CloudListQueueRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudListQueueRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListQueueRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudListQueueRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public CloudListQueueRequest setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public CloudListQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListQueueRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public CloudListQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudListQueueRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
