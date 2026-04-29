// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateExtenRequest extends TeaModel {
    /**
     * <p>允许的语音编码,支持格式: 1. g729 2. g729,alaw,ulaw 3. alaw,ulaw,g729 4. alaw,ulaw 5. myopus,alaw,ulaw5. myopus,alaw,ulaw6. myopus,g729,alaw,ulaw 7. myopus,g729 公网+远程话机支持配置1/2/3;专线+远程话机支持配置1/2;公网+软电话支持配置4;专线+软电话支持配置5;</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Allow")
    public String allow;

    /**
     * <p>区号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("AreaCode")
    public String areaCode;

    /**
     * <p>呼叫权限；0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallPower")
    public String callPower;

    /**
     * <p>降噪开关；0:关闭 1:开启 (该参数只有在类型为注册到webrtc才有效)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Denoise")
    public String denoise;

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
     * <p>分机号,3-11位</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("Exten")
    public String exten;

    /**
     * <p>iad网关；该参数只有在类型为，注册到IAD分机，才有效</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("IadName")
    public String iadName;

    /**
     * <p>呼入是否录音；0：不录用，1：录音，默认录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IbRecord")
    public Long ibRecord;

    /**
     * <p>是否允许摘机外呼，0：不允许，1：可以，默认允许</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDirect")
    public Long isDirect;

    /**
     * <p>是否允许外呼；0：不允许，1：可以，默认允许</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOb")
    public String isOb;

    /**
     * <p>网络防抖；0：关闭，1：开启，默认关闭</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("JitterBuffer")
    public Long jitterBuffer;

    /**
     * <p>外呼是否录音；0：不录音，1：录音，默认录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObRecord")
    public Long obRecord;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>密码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aa248236</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>属性</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Property")
    public String property;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>类型；1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Long type;

    public static CloudCreateExtenRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateExtenRequest self = new CloudCreateExtenRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateExtenRequest setAllow(String allow) {
        this.allow = allow;
        return this;
    }
    public String getAllow() {
        return this.allow;
    }

    public CloudCreateExtenRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public CloudCreateExtenRequest setCallPower(String callPower) {
        this.callPower = callPower;
        return this;
    }
    public String getCallPower() {
        return this.callPower;
    }

    public CloudCreateExtenRequest setDenoise(String denoise) {
        this.denoise = denoise;
        return this;
    }
    public String getDenoise() {
        return this.denoise;
    }

    public CloudCreateExtenRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateExtenRequest setExten(String exten) {
        this.exten = exten;
        return this;
    }
    public String getExten() {
        return this.exten;
    }

    public CloudCreateExtenRequest setIadName(String iadName) {
        this.iadName = iadName;
        return this;
    }
    public String getIadName() {
        return this.iadName;
    }

    public CloudCreateExtenRequest setIbRecord(Long ibRecord) {
        this.ibRecord = ibRecord;
        return this;
    }
    public Long getIbRecord() {
        return this.ibRecord;
    }

    public CloudCreateExtenRequest setIsDirect(Long isDirect) {
        this.isDirect = isDirect;
        return this;
    }
    public Long getIsDirect() {
        return this.isDirect;
    }

    public CloudCreateExtenRequest setIsOb(String isOb) {
        this.isOb = isOb;
        return this;
    }
    public String getIsOb() {
        return this.isOb;
    }

    public CloudCreateExtenRequest setJitterBuffer(Long jitterBuffer) {
        this.jitterBuffer = jitterBuffer;
        return this;
    }
    public Long getJitterBuffer() {
        return this.jitterBuffer;
    }

    public CloudCreateExtenRequest setObRecord(Long obRecord) {
        this.obRecord = obRecord;
        return this;
    }
    public Long getObRecord() {
        return this.obRecord;
    }

    public CloudCreateExtenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateExtenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CloudCreateExtenRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public CloudCreateExtenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateExtenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudCreateExtenRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
