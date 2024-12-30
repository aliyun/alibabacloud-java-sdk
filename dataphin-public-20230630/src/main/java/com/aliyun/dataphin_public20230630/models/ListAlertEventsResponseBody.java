// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertEventsResponseBody extends TeaModel {
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

    @NameInMap("ListResult")
    public ListAlertEventsResponseBodyListResult listResult;

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

    public static ListAlertEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsResponseBody self = new ListAlertEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlertEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAlertEventsResponseBody setListResult(ListAlertEventsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListAlertEventsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListAlertEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlertEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlertEventsResponseBodyListResultDataAlertObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>VDM_BATCH</p>
         */
        @NameInMap("SourceSystemType")
        public String sourceSystemType;

        /**
         * <strong>example:</strong>
         * <p>STREAM_TASK</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAlertEventsResponseBodyListResultDataAlertObject build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertObject self = new ListAlertEventsResponseBodyListResultDataAlertObject();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertEventsResponseBodyListResultDataAlertObject setSourceSystemType(String sourceSystemType) {
            this.sourceSystemType = sourceSystemType;
            return this;
        }
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        public ListAlertEventsResponseBodyListResultDataAlertObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>biz_date</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>2024-11-24 00:00:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList self = new ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReason extends TeaModel {
        @NameInMap("AlertReasonParamList")
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
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
         * <p>t_6340134343289405440_20241124_639873707610</p>
         */
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static ListAlertEventsResponseBodyListResultDataAlertReason build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReason self = new ListAlertEventsResponseBodyListResultDataAlertReason();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setAlertReasonParamList(java.util.List<ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList) {
            this.alertReasonParamList = alertReasonParamList;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList self = new ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReceiverList extends TeaModel {
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
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList> userList;

        public static ListAlertEventsResponseBodyListResultDataAlertReceiverList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReceiverList self = new ListAlertEventsResponseBodyListResultDataAlertReceiverList();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setAlertChannelTypeList(java.util.List<String> alertChannelTypeList) {
            this.alertChannelTypeList = alertChannelTypeList;
            return this;
        }
        public java.util.List<String> getAlertChannelTypeList() {
            return this.alertChannelTypeList;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setOnCallTableName(String onCallTableName) {
            this.onCallTableName = onCallTableName;
            return this;
        }
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setUserList(java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList> getUserList() {
            return this.userList;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataBelongProject extends TeaModel {
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

        public static ListAlertEventsResponseBodyListResultDataBelongProject build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataBelongProject self = new ListAlertEventsResponseBodyListResultDataBelongProject();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataBelongProject setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public ListAlertEventsResponseBodyListResultDataBelongProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataUrlConfig extends TeaModel {
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

        public static ListAlertEventsResponseBodyListResultDataUrlConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataUrlConfig self = new ListAlertEventsResponseBodyListResultDataUrlConfig();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataUrlConfig setAlertConfigUrl(String alertConfigUrl) {
            this.alertConfigUrl = alertConfigUrl;
            return this;
        }
        public String getAlertConfigUrl() {
            return this.alertConfigUrl;
        }

        public ListAlertEventsResponseBodyListResultDataUrlConfig setLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }
        public String getLogUrl() {
            return this.logUrl;
        }

        public ListAlertEventsResponseBodyListResultDataUrlConfig setObjectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            return this;
        }
        public String getObjectUrl() {
            return this.objectUrl;
        }

    }

    public static class ListAlertEventsResponseBodyListResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("AlertFrequency")
        public String alertFrequency;

        @NameInMap("AlertObject")
        public ListAlertEventsResponseBodyListResultDataAlertObject alertObject;

        @NameInMap("AlertReason")
        public ListAlertEventsResponseBodyListResultDataAlertReason alertReason;

        @NameInMap("AlertReceiverList")
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> alertReceiverList;

        @NameInMap("BelongProject")
        public ListAlertEventsResponseBodyListResultDataBelongProject belongProject;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 00:00:00</p>
         */
        @NameInMap("DoNotDisturbEndTime")
        public String doNotDisturbEndTime;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("FirstAlertTime")
        public String firstAlertTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
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
        public ListAlertEventsResponseBodyListResultDataUrlConfig urlConfig;

        public static ListAlertEventsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultData self = new ListAlertEventsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultData setAlertFrequency(String alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public String getAlertFrequency() {
            return this.alertFrequency;
        }

        public ListAlertEventsResponseBodyListResultData setAlertObject(ListAlertEventsResponseBodyListResultDataAlertObject alertObject) {
            this.alertObject = alertObject;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataAlertObject getAlertObject() {
            return this.alertObject;
        }

        public ListAlertEventsResponseBodyListResultData setAlertReason(ListAlertEventsResponseBodyListResultDataAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataAlertReason getAlertReason() {
            return this.alertReason;
        }

        public ListAlertEventsResponseBodyListResultData setAlertReceiverList(java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> alertReceiverList) {
            this.alertReceiverList = alertReceiverList;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> getAlertReceiverList() {
            return this.alertReceiverList;
        }

        public ListAlertEventsResponseBodyListResultData setBelongProject(ListAlertEventsResponseBodyListResultDataBelongProject belongProject) {
            this.belongProject = belongProject;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataBelongProject getBelongProject() {
            return this.belongProject;
        }

        public ListAlertEventsResponseBodyListResultData setDoNotDisturbEndTime(String doNotDisturbEndTime) {
            this.doNotDisturbEndTime = doNotDisturbEndTime;
            return this;
        }
        public String getDoNotDisturbEndTime() {
            return this.doNotDisturbEndTime;
        }

        public ListAlertEventsResponseBodyListResultData setFirstAlertTime(String firstAlertTime) {
            this.firstAlertTime = firstAlertTime;
            return this;
        }
        public String getFirstAlertTime() {
            return this.firstAlertTime;
        }

        public ListAlertEventsResponseBodyListResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlertEventsResponseBodyListResultData setLatestAlertTime(String latestAlertTime) {
            this.latestAlertTime = latestAlertTime;
            return this;
        }
        public String getLatestAlertTime() {
            return this.latestAlertTime;
        }

        public ListAlertEventsResponseBodyListResultData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAlertEventsResponseBodyListResultData setTotalAlertTimes(Long totalAlertTimes) {
            this.totalAlertTimes = totalAlertTimes;
            return this;
        }
        public Long getTotalAlertTimes() {
            return this.totalAlertTimes;
        }

        public ListAlertEventsResponseBodyListResultData setUrlConfig(ListAlertEventsResponseBodyListResultDataUrlConfig urlConfig) {
            this.urlConfig = urlConfig;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataUrlConfig getUrlConfig() {
            return this.urlConfig;
        }

    }

    public static class ListAlertEventsResponseBodyListResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListAlertEventsResponseBodyListResultData> data;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlertEventsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResult self = new ListAlertEventsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResult setData(java.util.List<ListAlertEventsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListAlertEventsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
