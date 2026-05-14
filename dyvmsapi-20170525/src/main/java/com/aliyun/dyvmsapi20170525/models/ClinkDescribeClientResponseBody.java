// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeClientResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDescribeClientResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ED815433-724A-4357-9991-A54AD2FF09FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkDescribeClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeClientResponseBody self = new ClinkDescribeClientResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeClientResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeClientResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeClientResponseBody setData(ClinkDescribeClientResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeClientResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeClientResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeClientResponseBodyDataClientClidArea extends TeaModel {
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
         * <p>xxx</p>
         */
        @NameInMap("DynamicTelGroupName")
        public String dynamicTelGroupName;

        /**
         * <p>外显号码</p>
         */
        @NameInMap("ObClids")
        public java.util.List<String> obClids;

        public static ClinkDescribeClientResponseBodyDataClientClidArea build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeClientResponseBodyDataClientClidArea self = new ClinkDescribeClientResponseBodyDataClientClidArea();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeClientResponseBodyDataClientClidArea setAreaGroupName(String areaGroupName) {
            this.areaGroupName = areaGroupName;
            return this;
        }
        public String getAreaGroupName() {
            return this.areaGroupName;
        }

        public ClinkDescribeClientResponseBodyDataClientClidArea setAssignType(Long assignType) {
            this.assignType = assignType;
            return this;
        }
        public Long getAssignType() {
            return this.assignType;
        }

        public ClinkDescribeClientResponseBodyDataClientClidArea setDynamicTelGroupName(String dynamicTelGroupName) {
            this.dynamicTelGroupName = dynamicTelGroupName;
            return this;
        }
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        public ClinkDescribeClientResponseBodyDataClientClidArea setObClids(java.util.List<String> obClids) {
            this.obClids = obClids;
            return this;
        }
        public java.util.List<String> getObClids() {
            return this.obClids;
        }

    }

    public static class ClinkDescribeClientResponseBodyDataClientPermission extends TeaModel {
        /**
         * <p>语音转写，0: 关闭；1: 呼入开启；2 外呼开启；3 全部开启；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Asr")
        public Long asr;

        /**
         * <p>外呼权限，0: 关闭；1: 无限制；2: 国内长途；3: 国内本地，默认值为 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Call")
        public Long call;

        /**
         * <p>通话记录查看权限，1: 全部；2: 所属队列；3:本座席，默认值为 1</p>
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
         * <p>通话录音权限，0: 关闭；1: 呼入；2: 外呼；3: 全部，默认值为 3</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Record")
        public Long record;

        /**
         * <p>录音试听下载权限，0: 关闭；1: 试听下载；2：试听，默认值 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordDownload")
        public Long recordDownload;

        /**
         * <p>短信发送权限，0: 关闭；1: 开启，默认值为 0</p>
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

        public static ClinkDescribeClientResponseBodyDataClientPermission build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeClientResponseBodyDataClientPermission self = new ClinkDescribeClientResponseBodyDataClientPermission();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setAsr(Long asr) {
            this.asr = asr;
            return this;
        }
        public Long getAsr() {
            return this.asr;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setCall(Long call) {
            this.call = call;
            return this;
        }
        public Long getCall() {
            return this.call;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setCdr(Long cdr) {
            this.cdr = cdr;
            return this;
        }
        public Long getCdr() {
            return this.cdr;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setChat(Long chat) {
            this.chat = chat;
            return this;
        }
        public Long getChat() {
            return this.chat;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setOtherData(Long otherData) {
            this.otherData = otherData;
            return this;
        }
        public Long getOtherData() {
            return this.otherData;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setRecord(Long record) {
            this.record = record;
            return this;
        }
        public Long getRecord() {
            return this.record;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setRecordDownload(Long recordDownload) {
            this.recordDownload = recordDownload;
            return this;
        }
        public Long getRecordDownload() {
            return this.recordDownload;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setSms(Long sms) {
            this.sms = sms;
            return this;
        }
        public Long getSms() {
            return this.sms;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setTaskInventory(Long taskInventory) {
            this.taskInventory = taskInventory;
            return this;
        }
        public Long getTaskInventory() {
            return this.taskInventory;
        }

        public ClinkDescribeClientResponseBodyDataClientPermission setTransfer(Long transfer) {
            this.transfer = transfer;
            return this;
        }
        public Long getTransfer() {
            return this.transfer;
        }

    }

    public static class ClinkDescribeClientResponseBodyDataClientQueues extends TeaModel {
        /**
         * <p>队列名称</p>
         * 
         * <strong>example:</strong>
         * <p>xx1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>优先级</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Penalty")
        public Long penalty;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("Qno")
        public String qno;

        public static ClinkDescribeClientResponseBodyDataClientQueues build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeClientResponseBodyDataClientQueues self = new ClinkDescribeClientResponseBodyDataClientQueues();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeClientResponseBodyDataClientQueues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkDescribeClientResponseBodyDataClientQueues setPenalty(Long penalty) {
            this.penalty = penalty;
            return this;
        }
        public Long getPenalty() {
            return this.penalty;
        }

        public ClinkDescribeClientResponseBodyDataClientQueues setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

    }

    public static class ClinkDescribeClientResponseBodyDataClient extends TeaModel {
        /**
         * <p>是否激活，0: 否；1: 是</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>座席满意度自动执行，1：开启；0：关闭，默认开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoInvestigation")
        public Long autoInvestigation;

        /**
         * <p>座席绑定电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("BindTel")
        public String bindTel;

        /**
         * <p>外显号码数组</p>
         */
        @NameInMap("Clid")
        public java.util.List<String> clid;

        /**
         * <p>按地区外显配置，当clidType（外显号码类型）值为3且clidRule（外显规则）值为2（自定义）时有意义，具体配置项见 clidArea 对象</p>
         */
        @NameInMap("ClidArea")
        public java.util.List<ClinkDescribeClientResponseBodyDataClientClidArea> clidArea;

        /**
         * <p>外显规则 当clidType（外显号码类型）值为0（全部）时，1:随机；2: 轮选。 当clidType（外显号码类型）值为3（智能外显）时，1:动态；2: 自定义。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClidRule")
        public Long clidRule;

        /**
         * <p>外显号码类型，0: 全部; 2: 座席指定; 3: 智能外显</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>云号码四种呼叫模式；数组长度 为 4，依次对应云号码外呼的四种模式（实体卡、工作卡、两端呼、RTC)的开启状态；</p>
         */
        @NameInMap("CloudNumberModes")
        public java.util.List<Long> cloudNumberModes;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>座席crm id</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CrmId")
        public String crmId;

        /**
         * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HiddenTel")
        public String hiddenTel;

        /**
         * <p>呼入整理时长，客户来电座席接听，双方通话结束后座席的话后处理时长，此期间座席不接收新的客户来电。取值范围：0～3600秒。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IbWrapupTime")
        public Long ibWrapupTime;

        /**
         * <p>呼入整理类型，1：队列；2：座席。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbWrapupType")
        public Long ibWrapupType;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>xclient</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>外呼挂机短信开关 0：关闭， 1：开启。开启后，当座席发起外呼时，系统会依据【短信中心 - 短信设置 - 外呼双方接听通知 / 外呼客户未接听通知】中的配置条件发送短信。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ObHangupSms")
        public Long obHangupSms;

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
         */
        @NameInMap("Permission")
        public ClinkDescribeClientResponseBodyDataClientPermission permission;

        /**
         * <p>座席所属队列的队列号数组</p>
         */
        @NameInMap("Qnos")
        public java.util.List<String> qnos;

        /**
         * <p>座席所属队列详情</p>
         */
        @NameInMap("Queues")
        public java.util.List<ClinkDescribeClientResponseBodyDataClientQueues> queues;

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

        /**
         * <p>座席备用手机号</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ReserveTel")
        public String reserveTel;

        /**
         * <p>座席角色，0: 普通座席；1: 班长座席</p>
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
         * <p>座席状态，0: 离线；1: 在线</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>电话绑定类型，电话类型， 1: 固话；2: 手机；3:IP话机；4:软电话</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TelType")
        public Long telType;

        /**
         * <p>座席类型，1：全渠道、2：呼叫中心、3：在线客服</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>整理时长，座席进行外呼操作后的整理时间，取值范围 0-300 秒。</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static ClinkDescribeClientResponseBodyDataClient build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeClientResponseBodyDataClient self = new ClinkDescribeClientResponseBodyDataClient();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeClientResponseBodyDataClient setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public ClinkDescribeClientResponseBodyDataClient setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public ClinkDescribeClientResponseBodyDataClient setAutoInvestigation(Long autoInvestigation) {
            this.autoInvestigation = autoInvestigation;
            return this;
        }
        public Long getAutoInvestigation() {
            return this.autoInvestigation;
        }

        public ClinkDescribeClientResponseBodyDataClient setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public ClinkDescribeClientResponseBodyDataClient setClid(java.util.List<String> clid) {
            this.clid = clid;
            return this;
        }
        public java.util.List<String> getClid() {
            return this.clid;
        }

        public ClinkDescribeClientResponseBodyDataClient setClidArea(java.util.List<ClinkDescribeClientResponseBodyDataClientClidArea> clidArea) {
            this.clidArea = clidArea;
            return this;
        }
        public java.util.List<ClinkDescribeClientResponseBodyDataClientClidArea> getClidArea() {
            return this.clidArea;
        }

        public ClinkDescribeClientResponseBodyDataClient setClidRule(Long clidRule) {
            this.clidRule = clidRule;
            return this;
        }
        public Long getClidRule() {
            return this.clidRule;
        }

        public ClinkDescribeClientResponseBodyDataClient setClidType(Long clidType) {
            this.clidType = clidType;
            return this;
        }
        public Long getClidType() {
            return this.clidType;
        }

        public ClinkDescribeClientResponseBodyDataClient setCloudNumberEnabled(Long cloudNumberEnabled) {
            this.cloudNumberEnabled = cloudNumberEnabled;
            return this;
        }
        public Long getCloudNumberEnabled() {
            return this.cloudNumberEnabled;
        }

        public ClinkDescribeClientResponseBodyDataClient setCloudNumberModes(java.util.List<Long> cloudNumberModes) {
            this.cloudNumberModes = cloudNumberModes;
            return this;
        }
        public java.util.List<Long> getCloudNumberModes() {
            return this.cloudNumberModes;
        }

        public ClinkDescribeClientResponseBodyDataClient setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeClientResponseBodyDataClient setCrmId(String crmId) {
            this.crmId = crmId;
            return this;
        }
        public String getCrmId() {
            return this.crmId;
        }

        public ClinkDescribeClientResponseBodyDataClient setHiddenTel(String hiddenTel) {
            this.hiddenTel = hiddenTel;
            return this;
        }
        public String getHiddenTel() {
            return this.hiddenTel;
        }

        public ClinkDescribeClientResponseBodyDataClient setIbWrapupTime(Long ibWrapupTime) {
            this.ibWrapupTime = ibWrapupTime;
            return this;
        }
        public Long getIbWrapupTime() {
            return this.ibWrapupTime;
        }

        public ClinkDescribeClientResponseBodyDataClient setIbWrapupType(Long ibWrapupType) {
            this.ibWrapupType = ibWrapupType;
            return this;
        }
        public Long getIbWrapupType() {
            return this.ibWrapupType;
        }

        public ClinkDescribeClientResponseBodyDataClient setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkDescribeClientResponseBodyDataClient setObHangupSms(Long obHangupSms) {
            this.obHangupSms = obHangupSms;
            return this;
        }
        public Long getObHangupSms() {
            return this.obHangupSms;
        }

        public ClinkDescribeClientResponseBodyDataClient setPauseLogin(Long pauseLogin) {
            this.pauseLogin = pauseLogin;
            return this;
        }
        public Long getPauseLogin() {
            return this.pauseLogin;
        }

        public ClinkDescribeClientResponseBodyDataClient setPermission(ClinkDescribeClientResponseBodyDataClientPermission permission) {
            this.permission = permission;
            return this;
        }
        public ClinkDescribeClientResponseBodyDataClientPermission getPermission() {
            return this.permission;
        }

        public ClinkDescribeClientResponseBodyDataClient setQnos(java.util.List<String> qnos) {
            this.qnos = qnos;
            return this;
        }
        public java.util.List<String> getQnos() {
            return this.qnos;
        }

        public ClinkDescribeClientResponseBodyDataClient setQueues(java.util.List<ClinkDescribeClientResponseBodyDataClientQueues> queues) {
            this.queues = queues;
            return this;
        }
        public java.util.List<ClinkDescribeClientResponseBodyDataClientQueues> getQueues() {
            return this.queues;
        }

        public ClinkDescribeClientResponseBodyDataClient setRecurrentselectionType(Long recurrentselectionType) {
            this.recurrentselectionType = recurrentselectionType;
            return this;
        }
        public Long getRecurrentselectionType() {
            return this.recurrentselectionType;
        }

        public ClinkDescribeClientResponseBodyDataClient setRecurrentselectionValue(Long recurrentselectionValue) {
            this.recurrentselectionValue = recurrentselectionValue;
            return this;
        }
        public Long getRecurrentselectionValue() {
            return this.recurrentselectionValue;
        }

        public ClinkDescribeClientResponseBodyDataClient setReserveTel(String reserveTel) {
            this.reserveTel = reserveTel;
            return this;
        }
        public String getReserveTel() {
            return this.reserveTel;
        }

        public ClinkDescribeClientResponseBodyDataClient setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ClinkDescribeClientResponseBodyDataClient setServeArea(java.util.List<String> serveArea) {
            this.serveArea = serveArea;
            return this;
        }
        public java.util.List<String> getServeArea() {
            return this.serveArea;
        }

        public ClinkDescribeClientResponseBodyDataClient setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ClinkDescribeClientResponseBodyDataClient setTelType(Long telType) {
            this.telType = telType;
            return this;
        }
        public Long getTelType() {
            return this.telType;
        }

        public ClinkDescribeClientResponseBodyDataClient setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ClinkDescribeClientResponseBodyDataClient setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class ClinkDescribeClientResponseBodyData extends TeaModel {
        @NameInMap("Client")
        public ClinkDescribeClientResponseBodyDataClient client;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkDescribeClientResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeClientResponseBodyData self = new ClinkDescribeClientResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeClientResponseBodyData setClient(ClinkDescribeClientResponseBodyDataClient client) {
            this.client = client;
            return this;
        }
        public ClinkDescribeClientResponseBodyDataClient getClient() {
            return this.client;
        }

        public ClinkDescribeClientResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
