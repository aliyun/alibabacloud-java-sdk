// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateClientResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkCreateClientResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkCreateClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateClientResponseBody self = new ClinkCreateClientResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkCreateClientResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkCreateClientResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkCreateClientResponseBody setData(ClinkCreateClientResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkCreateClientResponseBodyData getData() {
        return this.data;
    }

    public ClinkCreateClientResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkCreateClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkCreateClientResponseBodyDataClientClidArea extends TeaModel {
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

        public static ClinkCreateClientResponseBodyDataClientClidArea build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateClientResponseBodyDataClientClidArea self = new ClinkCreateClientResponseBodyDataClientClidArea();
            return TeaModel.build(map, self);
        }

        public ClinkCreateClientResponseBodyDataClientClidArea setAreaGroupName(String areaGroupName) {
            this.areaGroupName = areaGroupName;
            return this;
        }
        public String getAreaGroupName() {
            return this.areaGroupName;
        }

        public ClinkCreateClientResponseBodyDataClientClidArea setAssignType(Long assignType) {
            this.assignType = assignType;
            return this;
        }
        public Long getAssignType() {
            return this.assignType;
        }

        public ClinkCreateClientResponseBodyDataClientClidArea setDynamicTelGroupName(String dynamicTelGroupName) {
            this.dynamicTelGroupName = dynamicTelGroupName;
            return this;
        }
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        public ClinkCreateClientResponseBodyDataClientClidArea setObClids(java.util.List<String> obClids) {
            this.obClids = obClids;
            return this;
        }
        public java.util.List<String> getObClids() {
            return this.obClids;
        }

    }

    public static class ClinkCreateClientResponseBodyDataClientPermission extends TeaModel {
        /**
         * <p>语音转写，0: 关闭；1: 呼入开启；2 外呼开启；3 全部开启；默认值为 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>0</p>
         */
        @NameInMap("Chat")
        public Long chat;

        /**
         * <p>其他数据查看权限：1：全部 2：所属员工组 3：自己 4:指定员工组 ,默认所属员工组</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OtherData")
        public Long otherData;

        /**
         * <p>通话录音权限，0: 关闭；1: 呼入；2: 外呼；3: 全部，默认值为 3</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>0</p>
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

        public static ClinkCreateClientResponseBodyDataClientPermission build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateClientResponseBodyDataClientPermission self = new ClinkCreateClientResponseBodyDataClientPermission();
            return TeaModel.build(map, self);
        }

        public ClinkCreateClientResponseBodyDataClientPermission setAsr(Long asr) {
            this.asr = asr;
            return this;
        }
        public Long getAsr() {
            return this.asr;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setCall(Long call) {
            this.call = call;
            return this;
        }
        public Long getCall() {
            return this.call;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setCdr(Long cdr) {
            this.cdr = cdr;
            return this;
        }
        public Long getCdr() {
            return this.cdr;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setChat(Long chat) {
            this.chat = chat;
            return this;
        }
        public Long getChat() {
            return this.chat;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setOtherData(Long otherData) {
            this.otherData = otherData;
            return this;
        }
        public Long getOtherData() {
            return this.otherData;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setRecord(Long record) {
            this.record = record;
            return this;
        }
        public Long getRecord() {
            return this.record;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setRecordDownload(Long recordDownload) {
            this.recordDownload = recordDownload;
            return this;
        }
        public Long getRecordDownload() {
            return this.recordDownload;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setSms(Long sms) {
            this.sms = sms;
            return this;
        }
        public Long getSms() {
            return this.sms;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setTaskInventory(Long taskInventory) {
            this.taskInventory = taskInventory;
            return this;
        }
        public Long getTaskInventory() {
            return this.taskInventory;
        }

        public ClinkCreateClientResponseBodyDataClientPermission setTransfer(Long transfer) {
            this.transfer = transfer;
            return this;
        }
        public Long getTransfer() {
            return this.transfer;
        }

    }

    public static class ClinkCreateClientResponseBodyDataClient extends TeaModel {
        /**
         * <p>启用状态，0: 停用；1: 启用</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>可外显号码集合</p>
         */
        @NameInMap("Clid")
        public java.util.List<String> clid;

        /**
         * <p>给地区指定可外显号码</p>
         */
        @NameInMap("ClidArea")
        public java.util.List<ClinkCreateClientResponseBodyDataClientClidArea> clidArea;

        /**
         * <p>缺省外显号码集合，当clidType（外显号码类型）值为3且clidRule（外显规则）值为1时，支持配置缺省外显</p>
         */
        @NameInMap("ClidDefault")
        public java.util.List<String> clidDefault;

        /**
         * <p>外显规则，根据外显号码类型值来定义，1: 随机；2: 轮选 或 1: 动态；2: 自定义</p>
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
         * <p>云号码四种呼叫模式；数组长度 为 4，依次对应云号码外呼的四种模式（实体卡、工作卡、两端呼、RTC)的开启状态；</p>
         */
        @NameInMap("CloudNumberModes")
        public java.util.List<Long> cloudNumberModes;

        /**
         * <p>座席工号</p>
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
         * <p>20</p>
         */
        @NameInMap("CrmId")
        public Long crmId;

        /**
         * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DynamicTelGroupName")
        public String dynamicTelGroupName;

        /**
         * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HiddenTel")
        public Long hiddenTel;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>座席密码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>permission</p>
         */
        @NameInMap("Permission")
        public ClinkCreateClientResponseBodyDataClientPermission permission;

        /**
         * <p>所属队列号集合</p>
         */
        @NameInMap("Qnos")
        public java.util.List<String> qnos;

        /**
         * <p>轮选方式，1: 按天轮选；2: 按次轮选</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrentselectionType")
        public Long recurrentselectionType;

        /**
         * <p>轮选值设置 1: 按天轮选，每 n 天外呼更换一次外显号码，可设置 1-30 天 2: 按次轮选，每 n 次外呼更换一次外显号码，可设置 1-30 次</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrentselectionValue")
        public Long recurrentselectionValue;

        /**
         * <p>座席角色，0: 普通座席；1: 班长座席</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Role")
        public Long role;

        /**
         * <p>座席类型，1：全渠道、2：呼叫中心、3：在线客服</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>整理时长，座席进行外呼操作后的整理时间</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static ClinkCreateClientResponseBodyDataClient build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateClientResponseBodyDataClient self = new ClinkCreateClientResponseBodyDataClient();
            return TeaModel.build(map, self);
        }

        public ClinkCreateClientResponseBodyDataClient setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public ClinkCreateClientResponseBodyDataClient setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public ClinkCreateClientResponseBodyDataClient setAssignType(Long assignType) {
            this.assignType = assignType;
            return this;
        }
        public Long getAssignType() {
            return this.assignType;
        }

        public ClinkCreateClientResponseBodyDataClient setClid(java.util.List<String> clid) {
            this.clid = clid;
            return this;
        }
        public java.util.List<String> getClid() {
            return this.clid;
        }

        public ClinkCreateClientResponseBodyDataClient setClidArea(java.util.List<ClinkCreateClientResponseBodyDataClientClidArea> clidArea) {
            this.clidArea = clidArea;
            return this;
        }
        public java.util.List<ClinkCreateClientResponseBodyDataClientClidArea> getClidArea() {
            return this.clidArea;
        }

        public ClinkCreateClientResponseBodyDataClient setClidDefault(java.util.List<String> clidDefault) {
            this.clidDefault = clidDefault;
            return this;
        }
        public java.util.List<String> getClidDefault() {
            return this.clidDefault;
        }

        public ClinkCreateClientResponseBodyDataClient setClidRule(Long clidRule) {
            this.clidRule = clidRule;
            return this;
        }
        public Long getClidRule() {
            return this.clidRule;
        }

        public ClinkCreateClientResponseBodyDataClient setClidType(Long clidType) {
            this.clidType = clidType;
            return this;
        }
        public Long getClidType() {
            return this.clidType;
        }

        public ClinkCreateClientResponseBodyDataClient setCloudNumberEnabled(Long cloudNumberEnabled) {
            this.cloudNumberEnabled = cloudNumberEnabled;
            return this;
        }
        public Long getCloudNumberEnabled() {
            return this.cloudNumberEnabled;
        }

        public ClinkCreateClientResponseBodyDataClient setCloudNumberModes(java.util.List<Long> cloudNumberModes) {
            this.cloudNumberModes = cloudNumberModes;
            return this;
        }
        public java.util.List<Long> getCloudNumberModes() {
            return this.cloudNumberModes;
        }

        public ClinkCreateClientResponseBodyDataClient setCno(Long cno) {
            this.cno = cno;
            return this;
        }
        public Long getCno() {
            return this.cno;
        }

        public ClinkCreateClientResponseBodyDataClient setCrmId(Long crmId) {
            this.crmId = crmId;
            return this;
        }
        public Long getCrmId() {
            return this.crmId;
        }

        public ClinkCreateClientResponseBodyDataClient setDynamicTelGroupName(String dynamicTelGroupName) {
            this.dynamicTelGroupName = dynamicTelGroupName;
            return this;
        }
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        public ClinkCreateClientResponseBodyDataClient setHiddenTel(Long hiddenTel) {
            this.hiddenTel = hiddenTel;
            return this;
        }
        public Long getHiddenTel() {
            return this.hiddenTel;
        }

        public ClinkCreateClientResponseBodyDataClient setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkCreateClientResponseBodyDataClient setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ClinkCreateClientResponseBodyDataClient setPermission(ClinkCreateClientResponseBodyDataClientPermission permission) {
            this.permission = permission;
            return this;
        }
        public ClinkCreateClientResponseBodyDataClientPermission getPermission() {
            return this.permission;
        }

        public ClinkCreateClientResponseBodyDataClient setQnos(java.util.List<String> qnos) {
            this.qnos = qnos;
            return this;
        }
        public java.util.List<String> getQnos() {
            return this.qnos;
        }

        public ClinkCreateClientResponseBodyDataClient setRecurrentselectionType(Long recurrentselectionType) {
            this.recurrentselectionType = recurrentselectionType;
            return this;
        }
        public Long getRecurrentselectionType() {
            return this.recurrentselectionType;
        }

        public ClinkCreateClientResponseBodyDataClient setRecurrentselectionValue(Long recurrentselectionValue) {
            this.recurrentselectionValue = recurrentselectionValue;
            return this;
        }
        public Long getRecurrentselectionValue() {
            return this.recurrentselectionValue;
        }

        public ClinkCreateClientResponseBodyDataClient setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ClinkCreateClientResponseBodyDataClient setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ClinkCreateClientResponseBodyDataClient setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class ClinkCreateClientResponseBodyData extends TeaModel {
        @NameInMap("Client")
        public ClinkCreateClientResponseBodyDataClient client;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkCreateClientResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateClientResponseBodyData self = new ClinkCreateClientResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkCreateClientResponseBodyData setClient(ClinkCreateClientResponseBodyDataClient client) {
            this.client = client;
            return this;
        }
        public ClinkCreateClientResponseBodyDataClient getClient() {
            return this.client;
        }

        public ClinkCreateClientResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
