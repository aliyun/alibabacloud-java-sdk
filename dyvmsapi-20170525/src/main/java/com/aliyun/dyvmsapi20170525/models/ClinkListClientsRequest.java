// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListClientsRequest extends TeaModel {
    /**
     * <p>是否激活，1: 激活；0: 未激活</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Long active;

    /**
     * <p>绑定电话</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BindTel")
    public String bindTel;

    /**
     * <p>外显号码</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Clid")
    public String clid;

    /**
     * <p>创建时间查询范围-结束时间,秒级时间戳</p>
     * 
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
     * <p>查询记录条数，默认值为 10，最大范围 100</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>偏移量，默认值为 0，最大范围 10000</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>队列号</p>
     * 
     * <strong>example:</strong>
     * <p>12112</p>
     */
    @NameInMap("Qno")
    public String qno;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>创建时间查询范围-开始时间,秒级时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>修改时间查询范围-结束时间,秒级时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("UpdateEndTime")
    public Long updateEndTime;

    /**
     * <p>修改时间查询范围-开始时间,秒级时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("UpdateStartTime")
    public Long updateStartTime;

    public static ClinkListClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkListClientsRequest self = new ClinkListClientsRequest();
        return TeaModel.build(map, self);
    }

    public ClinkListClientsRequest setActive(Long active) {
        this.active = active;
        return this;
    }
    public Long getActive() {
        return this.active;
    }

    public ClinkListClientsRequest setBindTel(String bindTel) {
        this.bindTel = bindTel;
        return this;
    }
    public String getBindTel() {
        return this.bindTel;
    }

    public ClinkListClientsRequest setClid(String clid) {
        this.clid = clid;
        return this;
    }
    public String getClid() {
        return this.clid;
    }

    public ClinkListClientsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ClinkListClientsRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkListClientsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ClinkListClientsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ClinkListClientsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkListClientsRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public ClinkListClientsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkListClientsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkListClientsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ClinkListClientsRequest setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

    public ClinkListClientsRequest setUpdateStartTime(Long updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public Long getUpdateStartTime() {
        return this.updateStartTime;
    }

}
