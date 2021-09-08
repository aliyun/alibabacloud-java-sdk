// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySpeechPushJobResponseData data;

    public static QuerySpeechPushJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobResponse self = new QuerySpeechPushJobResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechPushJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechPushJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechPushJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechPushJobResponse setData(QuerySpeechPushJobResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechPushJobResponseData getData() {
        return this.data;
    }

    public static class QuerySpeechPushJobResponseDataListItems extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public Long expiredTime;

        @NameInMap("PushMode")
        @Validation(required = true)
        public String pushMode;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public Long createdTime;

        @NameInMap("TotalDeviceNum")
        @Validation(required = true)
        public Integer totalDeviceNum;

        @NameInMap("SuccessDeviceNum")
        @Validation(required = true)
        public Integer successDeviceNum;

        @NameInMap("SpeechStatus")
        @Validation(required = true)
        public Boolean speechStatus;

        @NameInMap("FailDeviceNum")
        @Validation(required = true)
        public Integer failDeviceNum;

        @NameInMap("SpeechNum")
        @Validation(required = true)
        public Integer speechNum;

        @NameInMap("RunningDeviceNum")
        @Validation(required = true)
        public Integer runningDeviceNum;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        public static QuerySpeechPushJobResponseDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobResponseDataListItems self = new QuerySpeechPushJobResponseDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobResponseDataListItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QuerySpeechPushJobResponseDataListItems setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public QuerySpeechPushJobResponseDataListItems setPushMode(String pushMode) {
            this.pushMode = pushMode;
            return this;
        }
        public String getPushMode() {
            return this.pushMode;
        }

        public QuerySpeechPushJobResponseDataListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QuerySpeechPushJobResponseDataListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySpeechPushJobResponseDataListItems setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public QuerySpeechPushJobResponseDataListItems setTotalDeviceNum(Integer totalDeviceNum) {
            this.totalDeviceNum = totalDeviceNum;
            return this;
        }
        public Integer getTotalDeviceNum() {
            return this.totalDeviceNum;
        }

        public QuerySpeechPushJobResponseDataListItems setSuccessDeviceNum(Integer successDeviceNum) {
            this.successDeviceNum = successDeviceNum;
            return this;
        }
        public Integer getSuccessDeviceNum() {
            return this.successDeviceNum;
        }

        public QuerySpeechPushJobResponseDataListItems setSpeechStatus(Boolean speechStatus) {
            this.speechStatus = speechStatus;
            return this;
        }
        public Boolean getSpeechStatus() {
            return this.speechStatus;
        }

        public QuerySpeechPushJobResponseDataListItems setFailDeviceNum(Integer failDeviceNum) {
            this.failDeviceNum = failDeviceNum;
            return this;
        }
        public Integer getFailDeviceNum() {
            return this.failDeviceNum;
        }

        public QuerySpeechPushJobResponseDataListItems setSpeechNum(Integer speechNum) {
            this.speechNum = speechNum;
            return this;
        }
        public Integer getSpeechNum() {
            return this.speechNum;
        }

        public QuerySpeechPushJobResponseDataListItems setRunningDeviceNum(Integer runningDeviceNum) {
            this.runningDeviceNum = runningDeviceNum;
            return this;
        }
        public Integer getRunningDeviceNum() {
            return this.runningDeviceNum;
        }

        public QuerySpeechPushJobResponseDataListItems setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySpeechPushJobResponseDataListItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QuerySpeechPushJobResponseDataListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QuerySpeechPushJobResponseDataListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

    public static class QuerySpeechPushJobResponseDataList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechPushJobResponseDataListItems> items;

        public static QuerySpeechPushJobResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobResponseDataList self = new QuerySpeechPushJobResponseDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobResponseDataList setItems(java.util.List<QuerySpeechPushJobResponseDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobResponseDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageId")
        @Validation(required = true)
        public Integer pageId;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public QuerySpeechPushJobResponseDataList list;

        public static QuerySpeechPushJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobResponseData self = new QuerySpeechPushJobResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySpeechPushJobResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechPushJobResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechPushJobResponseData setList(QuerySpeechPushJobResponseDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechPushJobResponseDataList getList() {
            return this.list;
        }

    }

}
