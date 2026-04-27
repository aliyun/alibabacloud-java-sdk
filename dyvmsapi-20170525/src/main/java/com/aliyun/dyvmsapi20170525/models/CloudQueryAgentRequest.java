// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentRequest extends TeaModel {
    /**
     * <p>是否启用；正整数，只能是0或者1，0是停用，1是启用</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Long active;

    /**
     * <p>多个座席号以英文逗号分隔 最多支持500个座席</p>
     * 
     * <strong>example:</strong>
     * <p>1111,2222</p>
     */
    @NameInMap("Cnos")
    public String cnos;

    /**
     * <p>通过座席备注信息检索；取值说明：前缀模糊匹配</p>
     * 
     * <strong>example:</strong>
     * <p>comment1</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>创建时间终止时间点；取值说明：&quot;2019-10-11 23:59:59&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 12:00:00</p>
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
     * <p>查询条数；正整数，大于0，最大不能超过1000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>通过座席名称检索；取值说明：前后缀模糊匹配</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>队列号；当qno不为空时，查询指定队列的所有座席记录</p>
     * 
     * <strong>example:</strong>
     * <p>333</p>
     */
    @NameInMap("Qno")
    public String qno;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>是否返回绑定座席的队列信息；0:不返回 1:需要返回 默认值:1</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ReturnQueue")
    public Long returnQueue;

    /**
     * <p>从第几条开始；正整数，大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>创建时间起始时间点；取值说明：&quot;2019-10-11 00:00:00&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>是否在线；正整数，只能是0或者1，0是离线，1是在线</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>webrtc软电话返回地址；取值说明：0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WebrtcUrlType")
    public Long webrtcUrlType;

    public static CloudQueryAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentRequest self = new CloudQueryAgentRequest();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentRequest setActive(Long active) {
        this.active = active;
        return this;
    }
    public Long getActive() {
        return this.active;
    }

    public CloudQueryAgentRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudQueryAgentRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CloudQueryAgentRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudQueryAgentRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudQueryAgentRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudQueryAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudQueryAgentRequest setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public CloudQueryAgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudQueryAgentRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public CloudQueryAgentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudQueryAgentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudQueryAgentRequest setReturnQueue(Long returnQueue) {
        this.returnQueue = returnQueue;
        return this;
    }
    public Long getReturnQueue() {
        return this.returnQueue;
    }

    public CloudQueryAgentRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudQueryAgentRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudQueryAgentRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CloudQueryAgentRequest setWebrtcUrlType(Long webrtcUrlType) {
        this.webrtcUrlType = webrtcUrlType;
        return this;
    }
    public Long getWebrtcUrlType() {
        return this.webrtcUrlType;
    }

}
