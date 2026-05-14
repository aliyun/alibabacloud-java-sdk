// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateClientShrinkRequest extends TeaModel {
    /**
     * <p>启用状态，0: 停用；1: 启用，默认值为 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Long active;

    /**
     * <p>所属区号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("AreaCode")
    public String areaCode;

    /**
     * <p>号码类型，默认值为0，0: 号码；1: 动态号码组</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AssignType")
    public Long assignType;

    /**
     * <p>可外显号码集合，当clidType（外显号码类型）值为非0时为必填项</p>
     */
    @NameInMap("Clid")
    public String clidShrink;

    /**
     * <p>按地区外显配置，当clidType（外显号码类型）值为3且clidRule（外显规则）值为2（自定义）时有意义，具体配置项见 clidArea 对象</p>
     */
    @NameInMap("ClidArea")
    public String clidAreaShrink;

    /**
     * <p>缺省外显号码集合，当clidType（外显号码类型）值为3且clidRule（外显规则）值为1（动态）时，支持配置缺省外显</p>
     */
    @NameInMap("ClidDefault")
    public String clidDefaultShrink;

    /**
     * <p>外显规则，默认值为 1 当clidType（外显号码类型）值为0（全部）时，1:随机；2: 轮选。 当clidType（外显号码类型）值为3（智能外显）时，1:动态；2: 自定义。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClidRule")
    public Long clidRule;

    /**
     * <p>外显号码类型，0: 全部；2: 座席指定；3: 智能外显；默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ClidType")
    public Long clidType;

    /**
     * <p>云号码外呼开关，0-关，1-开</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CloudNumberEnabled")
    public Long cloudNumberEnabled;

    /**
     * <p>云号码四种呼叫模式；数组长度 为 4，依次对应云号码外呼的四种模式（实体卡、工作卡、两端呼、RTC)的开启状态； 例如：[0,0,0,1] 表示 座席只可使用 RTC 外呼模式。 注意：仅当企业开启了云手机外呼功能，才能为座席设置该属性，否则，座席将创建失败</p>
     */
    @NameInMap("CloudNumberModes")
    public String cloudNumberModesShrink;

    /**
     * <p>座席工号，长度为4-11个字符，必须全部为数字，要求唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public Long cno;

    /**
     * <p>CRM 编号，与第三方 CRM 系统对接时，可作为唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>87</p>
     */
    @NameInMap("CrmId")
    public Long crmId;

    /**
     * <p>缺省动态外呼组id，当obClidDefaultType值为1时为必填项</p>
     * 
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("DynamicTelGroupIdDefault")
    public Long dynamicTelGroupIdDefault;

    /**
     * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("DynamicTelGroupName")
    public String dynamicTelGroupName;

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
     * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致，默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenTel")
    public Long hiddenTel;

    /**
     * <p>座席名称，只允许输入中文、字母、数字、下划线，长度不超过 20 个字符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>缺省号码类型 0：号码 1：动态号码组 默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ObClidDefaultType")
    public Long obClidDefaultType;

    /**
     * <p>外呼挂机短信开关 0：关闭， 1：开启。开启后，当座席发起外呼时，系统会依据【短信中心 - 短信设置 - 外呼双方接听通知 / 外呼客户未接听通知】中的配置条件发送短信。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ObHangupSms")
    public Long obHangupSms;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>座席密码，采用 AES加密 ，默认长度为 8 位。如果企业开启了密码安全设置，则需要按照设置的规则设置</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>是否可置忙登录，关闭后，座席不允许置忙登录，0：关闭，1：开启，默认1。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PauseLogin")
    public Long pauseLogin;

    /**
     * <p>permission</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Permission")
    public String permissionShrink;

    /**
     * <p>所属队列号集合</p>
     */
    @NameInMap("Qnos")
    public String qnosShrink;

    /**
     * <p>轮选方式，1: 按天轮选；2: 按次轮选，当外显号码类型为全部、外显规则为轮选时配置才生效</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecurrentselectionType")
    public Long recurrentselectionType;

    /**
     * <p>轮选值设置，当外显号码类型为全部、外显规则为轮选时配置才生效 1: 按天轮选，每 n 天外呼更换一次外显号码，可设置 1-30 天 2: 按次轮选，每 n 次外呼更换一次外显号码，可设置 1-30 次</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecurrentselectionValue")
    public Long recurrentselectionValue;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>座席角色，0: 普通座席；1: 班长座席，默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Role")
    public Long role;

    /**
     * <p>座席服务地区，区号数组 配置座席服务的地区，可用于外呼任务中“按服务地区分配”的策略。</p>
     */
    @NameInMap("ServeArea")
    public String serveAreaShrink;

    /**
     * <p>座席类型，1：全渠道、2：呼叫中心、3：在线客服；默认值为 2</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Long type;

    /**
     * <p>微信小程序RTC开关 1：开启 0：关闭 默认关闭</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WechatMiniProgramRtc")
    public Long wechatMiniProgramRtc;

    /**
     * <p>整理时长，座席进行外呼操作后的整理时间。取值范围 0-300 秒，默认值为 30</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("WrapupTime")
    public Long wrapupTime;

    public static ClinkCreateClientShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateClientShrinkRequest self = new ClinkCreateClientShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ClinkCreateClientShrinkRequest setActive(Long active) {
        this.active = active;
        return this;
    }
    public Long getActive() {
        return this.active;
    }

    public ClinkCreateClientShrinkRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public ClinkCreateClientShrinkRequest setAssignType(Long assignType) {
        this.assignType = assignType;
        return this;
    }
    public Long getAssignType() {
        return this.assignType;
    }

    public ClinkCreateClientShrinkRequest setClidShrink(String clidShrink) {
        this.clidShrink = clidShrink;
        return this;
    }
    public String getClidShrink() {
        return this.clidShrink;
    }

    public ClinkCreateClientShrinkRequest setClidAreaShrink(String clidAreaShrink) {
        this.clidAreaShrink = clidAreaShrink;
        return this;
    }
    public String getClidAreaShrink() {
        return this.clidAreaShrink;
    }

    public ClinkCreateClientShrinkRequest setClidDefaultShrink(String clidDefaultShrink) {
        this.clidDefaultShrink = clidDefaultShrink;
        return this;
    }
    public String getClidDefaultShrink() {
        return this.clidDefaultShrink;
    }

    public ClinkCreateClientShrinkRequest setClidRule(Long clidRule) {
        this.clidRule = clidRule;
        return this;
    }
    public Long getClidRule() {
        return this.clidRule;
    }

    public ClinkCreateClientShrinkRequest setClidType(Long clidType) {
        this.clidType = clidType;
        return this;
    }
    public Long getClidType() {
        return this.clidType;
    }

    public ClinkCreateClientShrinkRequest setCloudNumberEnabled(Long cloudNumberEnabled) {
        this.cloudNumberEnabled = cloudNumberEnabled;
        return this;
    }
    public Long getCloudNumberEnabled() {
        return this.cloudNumberEnabled;
    }

    public ClinkCreateClientShrinkRequest setCloudNumberModesShrink(String cloudNumberModesShrink) {
        this.cloudNumberModesShrink = cloudNumberModesShrink;
        return this;
    }
    public String getCloudNumberModesShrink() {
        return this.cloudNumberModesShrink;
    }

    public ClinkCreateClientShrinkRequest setCno(Long cno) {
        this.cno = cno;
        return this;
    }
    public Long getCno() {
        return this.cno;
    }

    public ClinkCreateClientShrinkRequest setCrmId(Long crmId) {
        this.crmId = crmId;
        return this;
    }
    public Long getCrmId() {
        return this.crmId;
    }

    public ClinkCreateClientShrinkRequest setDynamicTelGroupIdDefault(Long dynamicTelGroupIdDefault) {
        this.dynamicTelGroupIdDefault = dynamicTelGroupIdDefault;
        return this;
    }
    public Long getDynamicTelGroupIdDefault() {
        return this.dynamicTelGroupIdDefault;
    }

    public ClinkCreateClientShrinkRequest setDynamicTelGroupName(String dynamicTelGroupName) {
        this.dynamicTelGroupName = dynamicTelGroupName;
        return this;
    }
    public String getDynamicTelGroupName() {
        return this.dynamicTelGroupName;
    }

    public ClinkCreateClientShrinkRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkCreateClientShrinkRequest setHiddenTel(Long hiddenTel) {
        this.hiddenTel = hiddenTel;
        return this;
    }
    public Long getHiddenTel() {
        return this.hiddenTel;
    }

    public ClinkCreateClientShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClinkCreateClientShrinkRequest setObClidDefaultType(Long obClidDefaultType) {
        this.obClidDefaultType = obClidDefaultType;
        return this;
    }
    public Long getObClidDefaultType() {
        return this.obClidDefaultType;
    }

    public ClinkCreateClientShrinkRequest setObHangupSms(Long obHangupSms) {
        this.obHangupSms = obHangupSms;
        return this;
    }
    public Long getObHangupSms() {
        return this.obHangupSms;
    }

    public ClinkCreateClientShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkCreateClientShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ClinkCreateClientShrinkRequest setPauseLogin(Long pauseLogin) {
        this.pauseLogin = pauseLogin;
        return this;
    }
    public Long getPauseLogin() {
        return this.pauseLogin;
    }

    public ClinkCreateClientShrinkRequest setPermissionShrink(String permissionShrink) {
        this.permissionShrink = permissionShrink;
        return this;
    }
    public String getPermissionShrink() {
        return this.permissionShrink;
    }

    public ClinkCreateClientShrinkRequest setQnosShrink(String qnosShrink) {
        this.qnosShrink = qnosShrink;
        return this;
    }
    public String getQnosShrink() {
        return this.qnosShrink;
    }

    public ClinkCreateClientShrinkRequest setRecurrentselectionType(Long recurrentselectionType) {
        this.recurrentselectionType = recurrentselectionType;
        return this;
    }
    public Long getRecurrentselectionType() {
        return this.recurrentselectionType;
    }

    public ClinkCreateClientShrinkRequest setRecurrentselectionValue(Long recurrentselectionValue) {
        this.recurrentselectionValue = recurrentselectionValue;
        return this;
    }
    public Long getRecurrentselectionValue() {
        return this.recurrentselectionValue;
    }

    public ClinkCreateClientShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkCreateClientShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkCreateClientShrinkRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public ClinkCreateClientShrinkRequest setServeAreaShrink(String serveAreaShrink) {
        this.serveAreaShrink = serveAreaShrink;
        return this;
    }
    public String getServeAreaShrink() {
        return this.serveAreaShrink;
    }

    public ClinkCreateClientShrinkRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public ClinkCreateClientShrinkRequest setWechatMiniProgramRtc(Long wechatMiniProgramRtc) {
        this.wechatMiniProgramRtc = wechatMiniProgramRtc;
        return this;
    }
    public Long getWechatMiniProgramRtc() {
        return this.wechatMiniProgramRtc;
    }

    public ClinkCreateClientShrinkRequest setWrapupTime(Long wrapupTime) {
        this.wrapupTime = wrapupTime;
        return this;
    }
    public Long getWrapupTime() {
        return this.wrapupTime;
    }

}
