// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAlarmDetailByIdResponseBody extends TeaModel {
    /**
     * <p>API response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public GetAlarmDetailByIdResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1B0668-442C-57AE-9668-D894B0B012EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful: - true: Success. - false: Failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAlarmDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmDetailByIdResponseBody self = new GetAlarmDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlarmDetailByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlarmDetailByIdResponseBody setData(GetAlarmDetailByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlarmDetailByIdResponseBodyData getData() {
        return this.data;
    }

    public GetAlarmDetailByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAlarmDetailByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlarmDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlarmDetailByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAlarmDetailByIdResponseBodyDataEventDetails extends TeaModel {
        /**
         * <p>Alarm event display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>Alarm event type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Path where the alarm event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/crontab</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>Path where the alarm event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/crontab</p>
         */
        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static GetAlarmDetailByIdResponseBodyDataEventDetails build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmDetailByIdResponseBodyDataEventDetails self = new GetAlarmDetailByIdResponseBodyDataEventDetails();
            return TeaModel.build(map, self);
        }

        public GetAlarmDetailByIdResponseBodyDataEventDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public GetAlarmDetailByIdResponseBodyDataEventDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlarmDetailByIdResponseBodyDataEventDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetAlarmDetailByIdResponseBodyDataEventDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class GetAlarmDetailByIdResponseBodyData extends TeaModel {
        /**
         * <p>Alarm event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <p>Alarm event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        /**
         * <p>Alarm ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202427220</p>
         */
        @NameInMap("AlarmId")
        public Long alarmId;

        /**
         * <p>Alarm name.</p>
         * 
         * <strong>example:</strong>
         * <p>负载均衡可挂载服务器数量告警</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>Alarm source.</p>
         * 
         * <strong>example:</strong>
         * <p>SUSP_EVENT</p>
         */
        @NameInMap("AlarmSource")
        public String alarmSource;

        /**
         * <p>Latest alarm time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
        @NameInMap("AlarmTime")
        public String alarmTime;

        /**
         * <p>Analysis process.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;value&quot;:&quot;服务器可能已被黑客攻击，存在恶意进程在运行。 分析过程：告警显示，服务端存在一个名为”dns.exe”的进程在访问”polling.burpcollaborator.net”，这是一个被黑名单列出的恶意域名。在正常情况下,”dns.exe”不应该单独存在于系统的路径下，并且也不应该访问这类恶意域名。因此，这个进程可能是黑客留下的恶意进程。&quot;,&quot;key&quot;:&quot;结论&quot;},{&quot;value&quot;:&quot;尽快对服务器进行全面扫描，清除恶意进程。同时，联系网络安全专家进行深入调查，以确定是否有其他潜在的安全威胁。&quot;,&quot;key&quot;:&quot;处置建议&quot;}]</p>
         */
        @NameInMap("AnalysisResult")
        public String analysisResult;

        /**
         * <p>Whether high-protection mode is enabled. true means enabled, false means not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        /**
         * <p>Alarm handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
        @NameInMap("DealTime")
        public String dealTime;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>webshell</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Event details information.</p>
         */
        @NameInMap("EventDetails")
        public java.util.List<GetAlarmDetailByIdResponseBodyDataEventDetails> eventDetails;

        /**
         * <p>Alarm level.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>Primary key ID of the work order.</p>
         * 
         * <strong>example:</strong>
         * <p>9772</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Public IP.</p>
         * 
         * <strong>example:</strong>
         * <p>47.116.126.79</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Private IP.</p>
         * 
         * <strong>example:</strong>
         * <p>172.19.195.176</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>First occurrence time</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        /**
         * <p>Owner.</p>
         * 
         * <strong>example:</strong>
         * <p>324546</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Disposal method.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Handling status.</p>
         * 
         * <strong>example:</strong>
         * <p>要查询的告警事件状态。取值：</p>
         * <p>0：全部
         * 1：待处理
         * 2：已忽略
         * 4：已确认
         * 8：已标记为误报
         * 16：处理中
         * 32：处理完毕
         * 64：已经过期
         * 128：已经删除
         * 512：自动拦截中
         * 513：自动拦截完毕</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>ATT&amp;CK tactic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Malicious scripts-Malicious script code execution</p>
         */
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

        public static GetAlarmDetailByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmDetailByIdResponseBodyData self = new GetAlarmDetailByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlarmDetailByIdResponseBodyData setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public GetAlarmDetailByIdResponseBodyData setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
            this.alarmEventTypeDisplay = alarmEventTypeDisplay;
            return this;
        }
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        public GetAlarmDetailByIdResponseBodyData setAlarmId(Long alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Long getAlarmId() {
            return this.alarmId;
        }

        public GetAlarmDetailByIdResponseBodyData setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public GetAlarmDetailByIdResponseBodyData setAlarmSource(String alarmSource) {
            this.alarmSource = alarmSource;
            return this;
        }
        public String getAlarmSource() {
            return this.alarmSource;
        }

        public GetAlarmDetailByIdResponseBodyData setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public GetAlarmDetailByIdResponseBodyData setAnalysisResult(String analysisResult) {
            this.analysisResult = analysisResult;
            return this;
        }
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        public GetAlarmDetailByIdResponseBodyData setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public GetAlarmDetailByIdResponseBodyData setDealTime(String dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public String getDealTime() {
            return this.dealTime;
        }

        public GetAlarmDetailByIdResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetAlarmDetailByIdResponseBodyData setEventDetails(java.util.List<GetAlarmDetailByIdResponseBodyDataEventDetails> eventDetails) {
            this.eventDetails = eventDetails;
            return this;
        }
        public java.util.List<GetAlarmDetailByIdResponseBodyDataEventDetails> getEventDetails() {
            return this.eventDetails;
        }

        public GetAlarmDetailByIdResponseBodyData setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public GetAlarmDetailByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlarmDetailByIdResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetAlarmDetailByIdResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetAlarmDetailByIdResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetAlarmDetailByIdResponseBodyData setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public GetAlarmDetailByIdResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetAlarmDetailByIdResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetAlarmDetailByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAlarmDetailByIdResponseBodyData setTacticDisplayName(String tacticDisplayName) {
            this.tacticDisplayName = tacticDisplayName;
            return this;
        }
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

    }

}
