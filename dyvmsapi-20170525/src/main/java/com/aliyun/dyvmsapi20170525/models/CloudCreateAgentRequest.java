// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAgentRequest extends TeaModel {
    /**
     * <p>是否激活；取值0或1，取值说明 0：不激活，1激活，默认激活</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Long active;

    /**
     * <p>座席所属区号；区号格式</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("AreaCode")
    public String areaCode;

    /**
     * <p>呼叫权限；取值说明 0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallPower")
    public Long callPower;

    /**
     * <p>座席工号；正整数，取值3-10位数字</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>备注</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Comment")
    public String comment;

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
     * <p>呼入是否录音；取值说明 0：不录用，1：录音，默认录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IbRecord")
    public Long ibRecord;

    /**
     * <p>是否开启ASR转写；取值说明：0：不开启，1：开启，默认不开启</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsAsr")
    public Long isAsr;

    /**
     * <p>是否允许外呼；取值说明 0：不允许，1：可以，默认允许</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOb")
    public Long isOb;

    /**
     * <p>外呼主叫记忆开关；取值说明：0：关闭 1：开启；默认开启</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsObRemember")
    public String isObRemember;

    /**
     * <p>是否开启座席质检；取值说明：0：不开启，1：开启，默认开启</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsQualityCheck")
    public Long isQualityCheck;

    /**
     * <p>座席姓名；需进行UTF-8格式的URLEncode编码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>透传号码；可传入企业中继号码或设置好的客户侧外显号码，当obClidType值为2或3时必选</p>
     * 
     * <strong>example:</strong>
     * <p>22223333</p>
     */
    @NameInMap("ObClid")
    public String obClid;

    /**
     * <p>外显属性；取值：{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1,&quot;isRandom&quot;:1}；obClidType=4时，isMatchCapital表示是否匹配省会号码，1是 0否，areaCodeRule表示区号匹配规则，1座席区号 2客户号码区号 ;isRandom 随机外显</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1,&quot;isRandom&quot;:1}</p>
     */
    @NameInMap("ObClidProperty")
    public String obClidProperty;

    /**
     * <p>外显规则；取值：1:默认 2:随机 3:按区号 4 动态外显 ，默认值为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObClidType")
    public Long obClidType;

    /**
     * <p>外呼是否录音；取值说明 0：不录音，1：录音，默认录音</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObRecord")
    public Long obRecord;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>可外呼时间段；格式：08:00,20:00</p>
     * 
     * <strong>example:</strong>
     * <p>08:00,20:00</p>
     */
    @NameInMap("PermitObPreviewTime")
    public String permitObPreviewTime;

    /**
     * <p>座席权限；取值1或0，取值说明 1：班长席，0：普通座席，默认为0 普通座席</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Power")
    public Long power;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>所选的技能id；可选择多个，多个之间使用英文标点逗号间隔.例如:&quot;1,2,3&quot;；传入skillIds时，需要同时传入skillLevels</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("SkillIds")
    public String skillIds;

    /**
     * <p>所选的技能的等级；值越小技能越高，多个间用英文标点逗号间隔。(与技能id相对应) 例如:&quot;5,1,1&quot;表示技能id为1的等级是5; 技能id为2的等级是1; 技能id为3的等级是1.</p>
     * 
     * <strong>example:</strong>
     * <p>5,1,1</p>
     */
    @NameInMap("SkillLevels")
    public String skillLevels;

    /**
     * <p>webrtc软电话返回地址；取值说明：0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WebrtcUrlType")
    public Long webrtcUrlType;

    /**
     * <p>整理时间；单位秒数，默认10秒</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Wrapup")
    public Long wrapup;

    public static CloudCreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAgentRequest self = new CloudCreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateAgentRequest setActive(Long active) {
        this.active = active;
        return this;
    }
    public Long getActive() {
        return this.active;
    }

    public CloudCreateAgentRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public CloudCreateAgentRequest setCallPower(Long callPower) {
        this.callPower = callPower;
        return this;
    }
    public Long getCallPower() {
        return this.callPower;
    }

    public CloudCreateAgentRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudCreateAgentRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CloudCreateAgentRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateAgentRequest setIbRecord(Long ibRecord) {
        this.ibRecord = ibRecord;
        return this;
    }
    public Long getIbRecord() {
        return this.ibRecord;
    }

    public CloudCreateAgentRequest setIsAsr(Long isAsr) {
        this.isAsr = isAsr;
        return this;
    }
    public Long getIsAsr() {
        return this.isAsr;
    }

    public CloudCreateAgentRequest setIsOb(Long isOb) {
        this.isOb = isOb;
        return this;
    }
    public Long getIsOb() {
        return this.isOb;
    }

    public CloudCreateAgentRequest setIsObRemember(String isObRemember) {
        this.isObRemember = isObRemember;
        return this;
    }
    public String getIsObRemember() {
        return this.isObRemember;
    }

    public CloudCreateAgentRequest setIsQualityCheck(Long isQualityCheck) {
        this.isQualityCheck = isQualityCheck;
        return this;
    }
    public Long getIsQualityCheck() {
        return this.isQualityCheck;
    }

    public CloudCreateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudCreateAgentRequest setObClid(String obClid) {
        this.obClid = obClid;
        return this;
    }
    public String getObClid() {
        return this.obClid;
    }

    public CloudCreateAgentRequest setObClidProperty(String obClidProperty) {
        this.obClidProperty = obClidProperty;
        return this;
    }
    public String getObClidProperty() {
        return this.obClidProperty;
    }

    public CloudCreateAgentRequest setObClidType(Long obClidType) {
        this.obClidType = obClidType;
        return this;
    }
    public Long getObClidType() {
        return this.obClidType;
    }

    public CloudCreateAgentRequest setObRecord(Long obRecord) {
        this.obRecord = obRecord;
        return this;
    }
    public Long getObRecord() {
        return this.obRecord;
    }

    public CloudCreateAgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateAgentRequest setPermitObPreviewTime(String permitObPreviewTime) {
        this.permitObPreviewTime = permitObPreviewTime;
        return this;
    }
    public String getPermitObPreviewTime() {
        return this.permitObPreviewTime;
    }

    public CloudCreateAgentRequest setPower(Long power) {
        this.power = power;
        return this;
    }
    public Long getPower() {
        return this.power;
    }

    public CloudCreateAgentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateAgentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudCreateAgentRequest setSkillIds(String skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public String getSkillIds() {
        return this.skillIds;
    }

    public CloudCreateAgentRequest setSkillLevels(String skillLevels) {
        this.skillLevels = skillLevels;
        return this;
    }
    public String getSkillLevels() {
        return this.skillLevels;
    }

    public CloudCreateAgentRequest setWebrtcUrlType(Long webrtcUrlType) {
        this.webrtcUrlType = webrtcUrlType;
        return this;
    }
    public Long getWebrtcUrlType() {
        return this.webrtcUrlType;
    }

    public CloudCreateAgentRequest setWrapup(Long wrapup) {
        this.wrapup = wrapup;
        return this;
    }
    public Long getWrapup() {
        return this.wrapup;
    }

}
