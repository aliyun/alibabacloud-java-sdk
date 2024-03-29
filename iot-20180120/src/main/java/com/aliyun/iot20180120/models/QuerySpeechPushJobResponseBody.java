// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechPushJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySpeechPushJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobResponseBody self = new QuerySpeechPushJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechPushJobResponseBody setData(QuerySpeechPushJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechPushJobResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechPushJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechPushJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechPushJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechPushJobResponseBodyDataListItems extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("FailDeviceNum")
        public Integer failDeviceNum;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("PushMode")
        public String pushMode;

        @NameInMap("RunningDeviceNum")
        public Integer runningDeviceNum;

        @NameInMap("SpeechNum")
        public Integer speechNum;

        @NameInMap("SpeechStatus")
        public Boolean speechStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuccessDeviceNum")
        public Integer successDeviceNum;

        @NameInMap("TotalDeviceNum")
        public Integer totalDeviceNum;

        public static QuerySpeechPushJobResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobResponseBodyDataListItems self = new QuerySpeechPushJobResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobResponseBodyDataListItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setFailDeviceNum(Integer failDeviceNum) {
            this.failDeviceNum = failDeviceNum;
            return this;
        }
        public Integer getFailDeviceNum() {
            return this.failDeviceNum;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setPushMode(String pushMode) {
            this.pushMode = pushMode;
            return this;
        }
        public String getPushMode() {
            return this.pushMode;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setRunningDeviceNum(Integer runningDeviceNum) {
            this.runningDeviceNum = runningDeviceNum;
            return this;
        }
        public Integer getRunningDeviceNum() {
            return this.runningDeviceNum;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setSpeechNum(Integer speechNum) {
            this.speechNum = speechNum;
            return this;
        }
        public Integer getSpeechNum() {
            return this.speechNum;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setSpeechStatus(Boolean speechStatus) {
            this.speechStatus = speechStatus;
            return this;
        }
        public Boolean getSpeechStatus() {
            return this.speechStatus;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setSuccessDeviceNum(Integer successDeviceNum) {
            this.successDeviceNum = successDeviceNum;
            return this;
        }
        public Integer getSuccessDeviceNum() {
            return this.successDeviceNum;
        }

        public QuerySpeechPushJobResponseBodyDataListItems setTotalDeviceNum(Integer totalDeviceNum) {
            this.totalDeviceNum = totalDeviceNum;
            return this;
        }
        public Integer getTotalDeviceNum() {
            return this.totalDeviceNum;
        }

    }

    public static class QuerySpeechPushJobResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechPushJobResponseBodyDataListItems> items;

        public static QuerySpeechPushJobResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobResponseBodyDataList self = new QuerySpeechPushJobResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobResponseBodyDataList setItems(java.util.List<QuerySpeechPushJobResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySpeechPushJobResponseBodyDataList list;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QuerySpeechPushJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobResponseBodyData self = new QuerySpeechPushJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobResponseBodyData setList(QuerySpeechPushJobResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechPushJobResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySpeechPushJobResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechPushJobResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechPushJobResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
