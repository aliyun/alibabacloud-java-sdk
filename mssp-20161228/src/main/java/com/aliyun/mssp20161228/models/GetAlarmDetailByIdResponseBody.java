// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAlarmDetailByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAlarmDetailByIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

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
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        @NameInMap("AlarmId")
        public Long alarmId;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmSource")
        public String alarmSource;

        @NameInMap("AlarmTime")
        public String alarmTime;

        @NameInMap("AnalysisResult")
        public String analysisResult;

        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        @NameInMap("DealTime")
        public String dealTime;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("EventDetails")
        public java.util.List<GetAlarmDetailByIdResponseBodyDataEventDetails> eventDetails;

        @NameInMap("EventLevel")
        public String eventLevel;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

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
