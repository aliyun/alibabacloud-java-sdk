// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListOnlineAgentRequest extends TeaModel {
    /**
     * <p>坐席工号，指定座席工号则查询该工号座席的监控信息，可指定多个座席工号，指定多个座席工号使用英文逗号&quot;,&quot;分隔，不指定则查询所有队列监控信息，不指定则查询该账户下所有座席的监控信息</p>
     * 
     * <strong>example:</strong>
     * <p>1111,1112</p>
     */
    @NameInMap("Cnos")
    public String cnos;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>置忙原因，根据座席置忙原因过滤监控数据，可指定多个置忙原因，指定多个置忙原因使用英文逗号&quot;,&quot;分隔，不指定则默认查询所有设置状态的座席</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("PauseDescription")
    public String pauseDescription;

    /**
     * <p>置忙类型，根据座席置忙类型过滤监控数据，可指定多个置忙类型，指定多个置忙类型使用英文逗号&quot;,&quot;分隔，不指定则默认查询所有设置状态的座席。<br>取值说明1普通，2休息，3 IM，4 强制</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PauseType")
    public String pauseType;

    /**
     * <p>队列号，指定队列号则查询该队列号所对应队列的监控信息，支持同时查询多个队列号对应队列的监控信息，多个队列号使用英文逗号&quot;,&quot;分隔，不指定则查询所有队列监控信息</p>
     * 
     * <strong>example:</strong>
     * <p>123,124</p>
     */
    @NameInMap("Qnos")
    public String qnos;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>坐席状态，s1:空闲，s2:置忙，s3:整理，s4:呼叫中，s5:响铃，s6通话   可传多个状态码，多个值之间以&quot;,&quot;分隔</p>
     * 
     * <strong>example:</strong>
     * <p>s1</p>
     */
    @NameInMap("StateCode")
    public String stateCode;

    public static CloudListOnlineAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListOnlineAgentRequest self = new CloudListOnlineAgentRequest();
        return TeaModel.build(map, self);
    }

    public CloudListOnlineAgentRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public CloudListOnlineAgentRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListOnlineAgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListOnlineAgentRequest setPauseDescription(String pauseDescription) {
        this.pauseDescription = pauseDescription;
        return this;
    }
    public String getPauseDescription() {
        return this.pauseDescription;
    }

    public CloudListOnlineAgentRequest setPauseType(String pauseType) {
        this.pauseType = pauseType;
        return this;
    }
    public String getPauseType() {
        return this.pauseType;
    }

    public CloudListOnlineAgentRequest setQnos(String qnos) {
        this.qnos = qnos;
        return this;
    }
    public String getQnos() {
        return this.qnos;
    }

    public CloudListOnlineAgentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListOnlineAgentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudListOnlineAgentRequest setStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }
    public String getStateCode() {
        return this.stateCode;
    }

}
