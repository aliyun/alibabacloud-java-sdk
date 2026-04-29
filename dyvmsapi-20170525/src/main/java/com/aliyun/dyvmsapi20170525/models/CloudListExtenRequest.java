// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListExtenRequest extends TeaModel {
    /**
     * <p>区号</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("AreaCode")
    public String areaCode;

    /**
     * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallPower")
    public String callPower;

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
     * <p>分机号</p>
     * 
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("Exten")
    public String exten;

    /**
     * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IbRecord")
    public Long ibRecord;

    /**
     * <p>是否被座席绑定，1 绑定 0未绑定</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsBind")
    public Long isBind;

    /**
     * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOb")
    public String isOb;

    /**
     * <p>网络防抖</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("JitterBuffer")
    public Long jitterBuffer;

    /**
     * <p>条数；正整数 大于0 小于等于500 默认为10条</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObRecord")
    public Long obRecord;

    /**
     * <p>从第几条开始；正整数 默认为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>类型，1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Long type;

    public static CloudListExtenRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListExtenRequest self = new CloudListExtenRequest();
        return TeaModel.build(map, self);
    }

    public CloudListExtenRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public CloudListExtenRequest setCallPower(String callPower) {
        this.callPower = callPower;
        return this;
    }
    public String getCallPower() {
        return this.callPower;
    }

    public CloudListExtenRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListExtenRequest setExten(String exten) {
        this.exten = exten;
        return this;
    }
    public String getExten() {
        return this.exten;
    }

    public CloudListExtenRequest setIbRecord(Long ibRecord) {
        this.ibRecord = ibRecord;
        return this;
    }
    public Long getIbRecord() {
        return this.ibRecord;
    }

    public CloudListExtenRequest setIsBind(Long isBind) {
        this.isBind = isBind;
        return this;
    }
    public Long getIsBind() {
        return this.isBind;
    }

    public CloudListExtenRequest setIsOb(String isOb) {
        this.isOb = isOb;
        return this;
    }
    public String getIsOb() {
        return this.isOb;
    }

    public CloudListExtenRequest setJitterBuffer(Long jitterBuffer) {
        this.jitterBuffer = jitterBuffer;
        return this;
    }
    public Long getJitterBuffer() {
        return this.jitterBuffer;
    }

    public CloudListExtenRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudListExtenRequest setObRecord(Long obRecord) {
        this.obRecord = obRecord;
        return this;
    }
    public Long getObRecord() {
        return this.obRecord;
    }

    public CloudListExtenRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public CloudListExtenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListExtenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListExtenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudListExtenRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
