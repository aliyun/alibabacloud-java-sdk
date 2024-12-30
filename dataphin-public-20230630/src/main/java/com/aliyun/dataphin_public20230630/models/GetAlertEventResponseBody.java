// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAlertEventResponseBody extends TeaModel {
    @NameInMap("AlertEventInfo")
    public GetAlertEventResponseBodyAlertEventInfo alertEventInfo;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAlertEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertEventResponseBody self = new GetAlertEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertEventResponseBody setAlertEventInfo(GetAlertEventResponseBodyAlertEventInfo alertEventInfo) {
        this.alertEventInfo = alertEventInfo;
        return this;
    }
    public GetAlertEventResponseBodyAlertEventInfo getAlertEventInfo() {
        return this.alertEventInfo;
    }

    public GetAlertEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlertEventResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAlertEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlertEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("SourceSystemType")
        public String sourceSystemType;

        /**
         * <strong>example:</strong>
         * <p>VDM_BATCH_PYTHON37</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAlertEventResponseBodyAlertEventInfoAlertObject build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertObject self = new GetAlertEventResponseBodyAlertEventInfoAlertObject();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertObject setSourceSystemType(String sourceSystemType) {
            this.sourceSystemType = sourceSystemType;
            return this;
        }
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>biz_date</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>2024-11-04 00:00:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList self = new GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReason extends TeaModel {
        @NameInMap("AlertReasonParamList")
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList> alertReasonParamList;

        /**
         * <strong>example:</strong>
         * <p>2024-11-05 16:19:32</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>VDM_BATCH_FINISH</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>t_6340131422711644160_20241104_6340142</p>
         */
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReason build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReason self = new GetAlertEventResponseBodyAlertEventInfoAlertReason();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setAlertReasonParamList(java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList> alertReasonParamList) {
            this.alertReasonParamList = alertReasonParamList;
            return this;
        }
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList self = new GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReceiverList extends TeaModel {
        @NameInMap("AlertChannelTypeList")
        public java.util.List<String> alertChannelTypeList;

        @NameInMap("CustomAlertChannelIdList")
        public java.util.List<String> customAlertChannelIdList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnCallTableName")
        public String onCallTableName;

        /**
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("UserList")
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList> userList;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReceiverList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReceiverList self = new GetAlertEventResponseBodyAlertEventInfoAlertReceiverList();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setAlertChannelTypeList(java.util.List<String> alertChannelTypeList) {
            this.alertChannelTypeList = alertChannelTypeList;
            return this;
        }
        public java.util.List<String> getAlertChannelTypeList() {
            return this.alertChannelTypeList;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setOnCallTableName(String onCallTableName) {
            this.onCallTableName = onCallTableName;
            return this;
        }
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setUserList(java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList> getUserList() {
            return this.userList;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoBelongProject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>biz_1</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <strong>example:</strong>
         * <p>project_1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetAlertEventResponseBodyAlertEventInfoBelongProject build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoBelongProject self = new GetAlertEventResponseBodyAlertEventInfoBelongProject();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoBelongProject setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public GetAlertEventResponseBodyAlertEventInfoBelongProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoUrlConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://dataphin.com/ops/test3">https://dataphin.com/ops/test3</a></p>
         */
        @NameInMap("AlertConfigUrl")
        public String alertConfigUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dataphin.com/ops/test2">https://dataphin.com/ops/test2</a></p>
         */
        @NameInMap("LogUrl")
        public String logUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dataphin.com/ops/test1">https://dataphin.com/ops/test1</a></p>
         */
        @NameInMap("ObjectUrl")
        public String objectUrl;

        public static GetAlertEventResponseBodyAlertEventInfoUrlConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoUrlConfig self = new GetAlertEventResponseBodyAlertEventInfoUrlConfig();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoUrlConfig setAlertConfigUrl(String alertConfigUrl) {
            this.alertConfigUrl = alertConfigUrl;
            return this;
        }
        public String getAlertConfigUrl() {
            return this.alertConfigUrl;
        }

        public GetAlertEventResponseBodyAlertEventInfoUrlConfig setLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }
        public String getLogUrl() {
            return this.logUrl;
        }

        public GetAlertEventResponseBodyAlertEventInfoUrlConfig setObjectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            return this;
        }
        public String getObjectUrl() {
            return this.objectUrl;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("AlertFrequency")
        public String alertFrequency;

        @NameInMap("AlertObject")
        public GetAlertEventResponseBodyAlertEventInfoAlertObject alertObject;

        @NameInMap("AlertReason")
        public GetAlertEventResponseBodyAlertEventInfoAlertReason alertReason;

        @NameInMap("AlertReceiverList")
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverList> alertReceiverList;

        @NameInMap("BelongProject")
        public GetAlertEventResponseBodyAlertEventInfoBelongProject belongProject;

        /**
         * <strong>example:</strong>
         * <p>2024-11-05 00:00:00</p>
         */
        @NameInMap("DoNotDisturbEndTime")
        public String doNotDisturbEndTime;

        /**
         * <strong>example:</strong>
         * <p>2024-11-05 16:19:33</p>
         */
        @NameInMap("FirstAlertTime")
        public String firstAlertTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2024-11-05 16:19:33</p>
         */
        @NameInMap("LatestAlertTime")
        public String latestAlertTime;

        /**
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalAlertTimes")
        public Long totalAlertTimes;

        @NameInMap("UrlConfig")
        public GetAlertEventResponseBodyAlertEventInfoUrlConfig urlConfig;

        public static GetAlertEventResponseBodyAlertEventInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfo self = new GetAlertEventResponseBodyAlertEventInfo();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertFrequency(String alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public String getAlertFrequency() {
            return this.alertFrequency;
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertObject(GetAlertEventResponseBodyAlertEventInfoAlertObject alertObject) {
            this.alertObject = alertObject;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoAlertObject getAlertObject() {
            return this.alertObject;
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertReason(GetAlertEventResponseBodyAlertEventInfoAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoAlertReason getAlertReason() {
            return this.alertReason;
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertReceiverList(java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverList> alertReceiverList) {
            this.alertReceiverList = alertReceiverList;
            return this;
        }
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverList> getAlertReceiverList() {
            return this.alertReceiverList;
        }

        public GetAlertEventResponseBodyAlertEventInfo setBelongProject(GetAlertEventResponseBodyAlertEventInfoBelongProject belongProject) {
            this.belongProject = belongProject;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoBelongProject getBelongProject() {
            return this.belongProject;
        }

        public GetAlertEventResponseBodyAlertEventInfo setDoNotDisturbEndTime(String doNotDisturbEndTime) {
            this.doNotDisturbEndTime = doNotDisturbEndTime;
            return this;
        }
        public String getDoNotDisturbEndTime() {
            return this.doNotDisturbEndTime;
        }

        public GetAlertEventResponseBodyAlertEventInfo setFirstAlertTime(String firstAlertTime) {
            this.firstAlertTime = firstAlertTime;
            return this;
        }
        public String getFirstAlertTime() {
            return this.firstAlertTime;
        }

        public GetAlertEventResponseBodyAlertEventInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlertEventResponseBodyAlertEventInfo setLatestAlertTime(String latestAlertTime) {
            this.latestAlertTime = latestAlertTime;
            return this;
        }
        public String getLatestAlertTime() {
            return this.latestAlertTime;
        }

        public GetAlertEventResponseBodyAlertEventInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAlertEventResponseBodyAlertEventInfo setTotalAlertTimes(Long totalAlertTimes) {
            this.totalAlertTimes = totalAlertTimes;
            return this;
        }
        public Long getTotalAlertTimes() {
            return this.totalAlertTimes;
        }

        public GetAlertEventResponseBodyAlertEventInfo setUrlConfig(GetAlertEventResponseBodyAlertEventInfoUrlConfig urlConfig) {
            this.urlConfig = urlConfig;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoUrlConfig getUrlConfig() {
            return this.urlConfig;
        }

    }

}
