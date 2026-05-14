// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkUpdateClientRequest extends TeaModel {
    /**
     * <p>启用状态， 0: 停用；1: 启用。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Long active;

    /**
     * <p>所属区号</p>
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
     * <p>可外显号码集合，当外显类型非全部时需指定此参数值。</p>
     */
    @NameInMap("Clid")
    public java.util.List<String> clid;

    /**
     * <p>按地区外显配置，当clidType（外显号码类型）值为3且clidRule（外显规则）值为2（自定义）时有意义，具体配置项见 clidArea 对象</p>
     */
    @NameInMap("ClidArea")
    public java.util.List<ClinkUpdateClientRequestClidArea> clidArea;

    /**
     * <p>缺省外显号码集合，当clidType（外显号码类型）值为3且clidRule（外显规则）值为1（动态）时，支持配置缺省外显</p>
     */
    @NameInMap("ClidDefault")
    public java.util.List<String> clidDefault;

    /**
     * <p>外显规则， 当clidType（外显号码类型）值为0（全部）时，1:随机；2: 轮选。 当clidType（外显号码类型）值为3（智能外显）时，1:动态；2: 自定义。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClidRule")
    public Long clidRule;

    /**
     * <p>外显号码类型，0: 全部；2: 座席指定；3: 智能外显</p>
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
    public java.util.List<Long> cloudNumberModes;

    /**
     * <p>座席工号，4-11位数字，要求唯一</p>
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
     * <p>95</p>
     */
    @NameInMap("CrmId")
    public Long crmId;

    /**
     * <p>缺省动态外呼组id，当obClidDefaultType值为1时为必填项</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
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
     * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenTel")
    public Long hiddenTel;

    /**
     * <p>呼入整理时长，客户来电座席接听，双方通话结束后座席的话后处理时长，此期间座席不接收新的客户来电。取值范围：0～3600秒。</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("IbWrapupTime")
    public Long ibWrapupTime;

    /**
     * <p>呼入整理类型，1：队列；2：座席。</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("IbWrapupType")
    public Long ibWrapupType;

    /**
     * <p>座席名称，只允许输入中文，字母，数字，下划线，长度不超过 20 个字符</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>缺省号码类型 0：号码 1：动态号码组 默认0</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>是否可置忙登录，关闭后，座席不允许置忙登录，0：关闭，1：开启。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PauseLogin")
    public Long pauseLogin;

    /**
     * <p>permission</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Permission")
    public ClinkUpdateClientRequestPermission permission;

    /**
     * <p>所属队列号集合</p>
     */
    @NameInMap("Qnos")
    public java.util.List<String> qnos;

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
     * <p>座席角色，0: 普通座席；1: 班长座席。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Role")
    public Long role;

    /**
     * <p>座席服务地区，区号数组 配置座席服务的地区，可用于外呼任务中“按服务地区分配”的策略。</p>
     */
    @NameInMap("ServeArea")
    public java.util.List<String> serveArea;

    /**
     * <p>微信小程序RTC开关 1：开启 0：关闭 默认关闭</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WechatMiniProgramRtc")
    public Long wechatMiniProgramRtc;

    /**
     * <p>整理时长，座席进行外呼操作后的整理时间，取值范围 0-300 秒。</p>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("WrapupTime")
    public Long wrapupTime;

    public static ClinkUpdateClientRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkUpdateClientRequest self = new ClinkUpdateClientRequest();
        return TeaModel.build(map, self);
    }

    public ClinkUpdateClientRequest setActive(Long active) {
        this.active = active;
        return this;
    }
    public Long getActive() {
        return this.active;
    }

    public ClinkUpdateClientRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public ClinkUpdateClientRequest setAssignType(Long assignType) {
        this.assignType = assignType;
        return this;
    }
    public Long getAssignType() {
        return this.assignType;
    }

    public ClinkUpdateClientRequest setClid(java.util.List<String> clid) {
        this.clid = clid;
        return this;
    }
    public java.util.List<String> getClid() {
        return this.clid;
    }

    public ClinkUpdateClientRequest setClidArea(java.util.List<ClinkUpdateClientRequestClidArea> clidArea) {
        this.clidArea = clidArea;
        return this;
    }
    public java.util.List<ClinkUpdateClientRequestClidArea> getClidArea() {
        return this.clidArea;
    }

    public ClinkUpdateClientRequest setClidDefault(java.util.List<String> clidDefault) {
        this.clidDefault = clidDefault;
        return this;
    }
    public java.util.List<String> getClidDefault() {
        return this.clidDefault;
    }

    public ClinkUpdateClientRequest setClidRule(Long clidRule) {
        this.clidRule = clidRule;
        return this;
    }
    public Long getClidRule() {
        return this.clidRule;
    }

    public ClinkUpdateClientRequest setClidType(Long clidType) {
        this.clidType = clidType;
        return this;
    }
    public Long getClidType() {
        return this.clidType;
    }

    public ClinkUpdateClientRequest setCloudNumberEnabled(Long cloudNumberEnabled) {
        this.cloudNumberEnabled = cloudNumberEnabled;
        return this;
    }
    public Long getCloudNumberEnabled() {
        return this.cloudNumberEnabled;
    }

    public ClinkUpdateClientRequest setCloudNumberModes(java.util.List<Long> cloudNumberModes) {
        this.cloudNumberModes = cloudNumberModes;
        return this;
    }
    public java.util.List<Long> getCloudNumberModes() {
        return this.cloudNumberModes;
    }

    public ClinkUpdateClientRequest setCno(Long cno) {
        this.cno = cno;
        return this;
    }
    public Long getCno() {
        return this.cno;
    }

    public ClinkUpdateClientRequest setCrmId(Long crmId) {
        this.crmId = crmId;
        return this;
    }
    public Long getCrmId() {
        return this.crmId;
    }

    public ClinkUpdateClientRequest setDynamicTelGroupIdDefault(Long dynamicTelGroupIdDefault) {
        this.dynamicTelGroupIdDefault = dynamicTelGroupIdDefault;
        return this;
    }
    public Long getDynamicTelGroupIdDefault() {
        return this.dynamicTelGroupIdDefault;
    }

    public ClinkUpdateClientRequest setDynamicTelGroupName(String dynamicTelGroupName) {
        this.dynamicTelGroupName = dynamicTelGroupName;
        return this;
    }
    public String getDynamicTelGroupName() {
        return this.dynamicTelGroupName;
    }

    public ClinkUpdateClientRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkUpdateClientRequest setHiddenTel(Long hiddenTel) {
        this.hiddenTel = hiddenTel;
        return this;
    }
    public Long getHiddenTel() {
        return this.hiddenTel;
    }

    public ClinkUpdateClientRequest setIbWrapupTime(Long ibWrapupTime) {
        this.ibWrapupTime = ibWrapupTime;
        return this;
    }
    public Long getIbWrapupTime() {
        return this.ibWrapupTime;
    }

    public ClinkUpdateClientRequest setIbWrapupType(Long ibWrapupType) {
        this.ibWrapupType = ibWrapupType;
        return this;
    }
    public Long getIbWrapupType() {
        return this.ibWrapupType;
    }

    public ClinkUpdateClientRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClinkUpdateClientRequest setObClidDefaultType(Long obClidDefaultType) {
        this.obClidDefaultType = obClidDefaultType;
        return this;
    }
    public Long getObClidDefaultType() {
        return this.obClidDefaultType;
    }

    public ClinkUpdateClientRequest setObHangupSms(Long obHangupSms) {
        this.obHangupSms = obHangupSms;
        return this;
    }
    public Long getObHangupSms() {
        return this.obHangupSms;
    }

    public ClinkUpdateClientRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkUpdateClientRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ClinkUpdateClientRequest setPauseLogin(Long pauseLogin) {
        this.pauseLogin = pauseLogin;
        return this;
    }
    public Long getPauseLogin() {
        return this.pauseLogin;
    }

    public ClinkUpdateClientRequest setPermission(ClinkUpdateClientRequestPermission permission) {
        this.permission = permission;
        return this;
    }
    public ClinkUpdateClientRequestPermission getPermission() {
        return this.permission;
    }

    public ClinkUpdateClientRequest setQnos(java.util.List<String> qnos) {
        this.qnos = qnos;
        return this;
    }
    public java.util.List<String> getQnos() {
        return this.qnos;
    }

    public ClinkUpdateClientRequest setRecurrentselectionType(Long recurrentselectionType) {
        this.recurrentselectionType = recurrentselectionType;
        return this;
    }
    public Long getRecurrentselectionType() {
        return this.recurrentselectionType;
    }

    public ClinkUpdateClientRequest setRecurrentselectionValue(Long recurrentselectionValue) {
        this.recurrentselectionValue = recurrentselectionValue;
        return this;
    }
    public Long getRecurrentselectionValue() {
        return this.recurrentselectionValue;
    }

    public ClinkUpdateClientRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkUpdateClientRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkUpdateClientRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public ClinkUpdateClientRequest setServeArea(java.util.List<String> serveArea) {
        this.serveArea = serveArea;
        return this;
    }
    public java.util.List<String> getServeArea() {
        return this.serveArea;
    }

    public ClinkUpdateClientRequest setWechatMiniProgramRtc(Long wechatMiniProgramRtc) {
        this.wechatMiniProgramRtc = wechatMiniProgramRtc;
        return this;
    }
    public Long getWechatMiniProgramRtc() {
        return this.wechatMiniProgramRtc;
    }

    public ClinkUpdateClientRequest setWrapupTime(Long wrapupTime) {
        this.wrapupTime = wrapupTime;
        return this;
    }
    public Long getWrapupTime() {
        return this.wrapupTime;
    }

    public static class ClinkUpdateClientRequestClidArea extends TeaModel {
        /**
         * <p>地区组名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AreaGroupName")
        public String areaGroupName;

        /**
         * <p>号码类型，默认值为0，0: 号码；1: 动态号码组</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssignType")
        public Long assignType;

        /**
         * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("DynamicTelGroupName")
        public String dynamicTelGroupName;

        /**
         * <p>外显号码</p>
         */
        @NameInMap("ObClids")
        public java.util.List<String> obClids;

        public static ClinkUpdateClientRequestClidArea build(java.util.Map<String, ?> map) throws Exception {
            ClinkUpdateClientRequestClidArea self = new ClinkUpdateClientRequestClidArea();
            return TeaModel.build(map, self);
        }

        public ClinkUpdateClientRequestClidArea setAreaGroupName(String areaGroupName) {
            this.areaGroupName = areaGroupName;
            return this;
        }
        public String getAreaGroupName() {
            return this.areaGroupName;
        }

        public ClinkUpdateClientRequestClidArea setAssignType(Long assignType) {
            this.assignType = assignType;
            return this;
        }
        public Long getAssignType() {
            return this.assignType;
        }

        public ClinkUpdateClientRequestClidArea setDynamicTelGroupName(String dynamicTelGroupName) {
            this.dynamicTelGroupName = dynamicTelGroupName;
            return this;
        }
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        public ClinkUpdateClientRequestClidArea setObClids(java.util.List<String> obClids) {
            this.obClids = obClids;
            return this;
        }
        public java.util.List<String> getObClids() {
            return this.obClids;
        }

    }

    public static class ClinkUpdateClientRequestPermission extends TeaModel {
        /**
         * <p>语音转写，0: 关闭；1: 呼入开启；2 外呼开启；3 全部开启；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Asr")
        public Long asr;

        /**
         * <p>外呼权限，0:关闭；1: 无限制；2: 国内长途；3: 国内本地</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Call")
        public Long call;

        /**
         * <p>通话记录查看权限，1: 全部；2: 所属队列；3: 本座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cdr")
        public Long cdr;

        /**
         * <p>在线客服查看会话记录权限 ，0：全部、1：所属队列、2：本座席； 默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Chat")
        public Long chat;

        /**
         * <p>其他数据查看权限：1：全部 2：所属员工组 3：自己 4:指定员工组 ,默认所属员工组</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OtherData")
        public Long otherData;

        /**
         * <p>通话录音权限，0: 关闭；1: 呼入；2: 外呼；3: 全部</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Record")
        public Long record;

        /**
         * <p>录音试听下载权限， 0: 关闭；1: 试听；2: 试听下载</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordDownload")
        public Long recordDownload;

        /**
         * <p>短信发送权限，0: 关闭；1: 开启。默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sms")
        public Long sms;

        /**
         * <p>外呼任务查看权限，1：全部 3：自己，默认全部</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskInventory")
        public Long taskInventory;

        /**
         * <p>通话转移/咨询权限，可选范围，0：全部，1：所属员工组, 默认所属员工组</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Transfer")
        public Long transfer;

        public static ClinkUpdateClientRequestPermission build(java.util.Map<String, ?> map) throws Exception {
            ClinkUpdateClientRequestPermission self = new ClinkUpdateClientRequestPermission();
            return TeaModel.build(map, self);
        }

        public ClinkUpdateClientRequestPermission setAsr(Long asr) {
            this.asr = asr;
            return this;
        }
        public Long getAsr() {
            return this.asr;
        }

        public ClinkUpdateClientRequestPermission setCall(Long call) {
            this.call = call;
            return this;
        }
        public Long getCall() {
            return this.call;
        }

        public ClinkUpdateClientRequestPermission setCdr(Long cdr) {
            this.cdr = cdr;
            return this;
        }
        public Long getCdr() {
            return this.cdr;
        }

        public ClinkUpdateClientRequestPermission setChat(Long chat) {
            this.chat = chat;
            return this;
        }
        public Long getChat() {
            return this.chat;
        }

        public ClinkUpdateClientRequestPermission setOtherData(Long otherData) {
            this.otherData = otherData;
            return this;
        }
        public Long getOtherData() {
            return this.otherData;
        }

        public ClinkUpdateClientRequestPermission setRecord(Long record) {
            this.record = record;
            return this;
        }
        public Long getRecord() {
            return this.record;
        }

        public ClinkUpdateClientRequestPermission setRecordDownload(Long recordDownload) {
            this.recordDownload = recordDownload;
            return this;
        }
        public Long getRecordDownload() {
            return this.recordDownload;
        }

        public ClinkUpdateClientRequestPermission setSms(Long sms) {
            this.sms = sms;
            return this;
        }
        public Long getSms() {
            return this.sms;
        }

        public ClinkUpdateClientRequestPermission setTaskInventory(Long taskInventory) {
            this.taskInventory = taskInventory;
            return this;
        }
        public Long getTaskInventory() {
            return this.taskInventory;
        }

        public ClinkUpdateClientRequestPermission setTransfer(Long transfer) {
            this.transfer = transfer;
            return this;
        }
        public Long getTransfer() {
            return this.transfer;
        }

    }

}
