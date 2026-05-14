// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateExtenRequest extends TeaModel {
    /**
     * <p>语音编码。 IP话机支持的语音编码：1、2、3、4、5 软电话支持的语音编码：5、6 1：g729(已弃用) 2：g729,alaw,ulaw 3：alaw,ulaw,g729 4：myopus,alaw,ulaw,g729 5：alaw,ulaw 6：myopus,alaw,ulaw</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Allow")
    public Long allow;

    /**
     * <p>话机区号。以 0 开头 3-4 位数字</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("AreaCode")
    public String areaCode;

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
     * <p>话机号码。3-6 位数字，要求唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12235</p>
     */
    @NameInMap("ExtenNumber")
    public String extenNumber;

    /**
     * <p>是否允许主叫外呼，1：允许；0：不允许。话机类型为IP话机时，可以开启主叫外呼功能，直接通过IP话机进行外呼。若要使用主叫外呼功能，需要开启企业级开关。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDirect")
    public Long isDirect;

    /**
     * <p>网络防抖，0：关闭；1：开启，默认关闭，当开启时，语音编码类型默认为5</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("JittBuffer")
    public Long jittBuffer;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>话机密码，密码规则参见企业配置</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>话机类型。1: IP话机， 2: 软电话</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Long type;

    public static ClinkCreateExtenRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateExtenRequest self = new ClinkCreateExtenRequest();
        return TeaModel.build(map, self);
    }

    public ClinkCreateExtenRequest setAllow(Long allow) {
        this.allow = allow;
        return this;
    }
    public Long getAllow() {
        return this.allow;
    }

    public ClinkCreateExtenRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public ClinkCreateExtenRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkCreateExtenRequest setExtenNumber(String extenNumber) {
        this.extenNumber = extenNumber;
        return this;
    }
    public String getExtenNumber() {
        return this.extenNumber;
    }

    public ClinkCreateExtenRequest setIsDirect(Long isDirect) {
        this.isDirect = isDirect;
        return this;
    }
    public Long getIsDirect() {
        return this.isDirect;
    }

    public ClinkCreateExtenRequest setJittBuffer(Long jittBuffer) {
        this.jittBuffer = jittBuffer;
        return this;
    }
    public Long getJittBuffer() {
        return this.jittBuffer;
    }

    public ClinkCreateExtenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkCreateExtenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ClinkCreateExtenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkCreateExtenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkCreateExtenRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
