// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertNotificationsResponseBody extends TeaModel {
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
    public ListAlertNotificationsResponseBodyListResult listResult;

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

    public static ListAlertNotificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotificationsResponseBody self = new ListAlertNotificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertNotificationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlertNotificationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAlertNotificationsResponseBody setListResult(ListAlertNotificationsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListAlertNotificationsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListAlertNotificationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlertNotificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertNotificationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertObject extends TeaModel {
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
         * <p>VDM_BATCH_SHELL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAlertNotificationsResponseBodyListResultDataAlertObject build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertObject self = new ListAlertNotificationsResponseBodyListResultDataAlertObject();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertObject setSourceSystemType(String sourceSystemType) {
            this.sourceSystemType = sourceSystemType;
            return this;
        }
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList extends TeaModel {
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

        public static ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList self = new ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReason extends TeaModel {
        @NameInMap("AlertReasonParamList")
        public java.util.List<ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList;

        /**
         * <strong>example:</strong>
         * <p>20241125</p>
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
         * <p>123456</p>
         */
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReason build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReason self = new ListAlertNotificationsResponseBodyListResultDataAlertReason();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setAlertReasonParamList(java.util.List<ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList) {
            this.alertReasonParamList = alertReasonParamList;
            return this;
        }
        public java.util.List<ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser self = new ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReceiver extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        @NameInMap("AlertChannelType")
        public String alertChannelType;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CustomAlertChannelId")
        public String customAlertChannelId;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("OnCallTableId")
        public String onCallTableId;

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

        @NameInMap("User")
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser user;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReceiver build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReceiver self = new ListAlertNotificationsResponseBodyListResultDataAlertReceiver();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setAlertChannelType(String alertChannelType) {
            this.alertChannelType = alertChannelType;
            return this;
        }
        public String getAlertChannelType() {
            return this.alertChannelType;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setCustomAlertChannelId(String customAlertChannelId) {
            this.customAlertChannelId = customAlertChannelId;
            return this;
        }
        public String getCustomAlertChannelId() {
            return this.customAlertChannelId;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setOnCallTableId(String onCallTableId) {
            this.onCallTableId = onCallTableId;
            return this;
        }
        public String getOnCallTableId() {
            return this.onCallTableId;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setOnCallTableName(String onCallTableName) {
            this.onCallTableName = onCallTableName;
            return this;
        }
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setUser(ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser user) {
            this.user = user;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser getUser() {
            return this.user;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertSend extends TeaModel {
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SendContent")
        public String sendContent;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("SendTime")
        public String sendTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAlertNotificationsResponseBodyListResultDataAlertSend build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertSend self = new ListAlertNotificationsResponseBodyListResultDataAlertSend();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setSendContent(String sendContent) {
            this.sendContent = sendContent;
            return this;
        }
        public String getSendContent() {
            return this.sendContent;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AlertEventId")
        public String alertEventId;

        @NameInMap("AlertObject")
        public ListAlertNotificationsResponseBodyListResultDataAlertObject alertObject;

        @NameInMap("AlertReason")
        public ListAlertNotificationsResponseBodyListResultDataAlertReason alertReason;

        @NameInMap("AlertReceiver")
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver alertReceiver;

        @NameInMap("AlertSend")
        public ListAlertNotificationsResponseBodyListResultDataAlertSend alertSend;

        public static ListAlertNotificationsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultData self = new ListAlertNotificationsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertEventId(String alertEventId) {
            this.alertEventId = alertEventId;
            return this;
        }
        public String getAlertEventId() {
            return this.alertEventId;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertObject(ListAlertNotificationsResponseBodyListResultDataAlertObject alertObject) {
            this.alertObject = alertObject;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertObject getAlertObject() {
            return this.alertObject;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertReason(ListAlertNotificationsResponseBodyListResultDataAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertReason getAlertReason() {
            return this.alertReason;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertReceiver(ListAlertNotificationsResponseBodyListResultDataAlertReceiver alertReceiver) {
            this.alertReceiver = alertReceiver;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver getAlertReceiver() {
            return this.alertReceiver;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertSend(ListAlertNotificationsResponseBodyListResultDataAlertSend alertSend) {
            this.alertSend = alertSend;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertSend getAlertSend() {
            return this.alertSend;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListAlertNotificationsResponseBodyListResultData> data;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlertNotificationsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResult self = new ListAlertNotificationsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResult setData(java.util.List<ListAlertNotificationsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAlertNotificationsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListAlertNotificationsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
