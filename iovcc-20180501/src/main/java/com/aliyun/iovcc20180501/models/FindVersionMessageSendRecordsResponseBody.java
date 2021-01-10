// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionMessageSendRecordsResponseBody extends TeaModel {
    @NameInMap("MessageSendRecordList")
    public FindVersionMessageSendRecordsResponseBodyMessageSendRecordList messageSendRecordList;

    @NameInMap("RequestId")
    public String requestId;

    public static FindVersionMessageSendRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionMessageSendRecordsResponseBody self = new FindVersionMessageSendRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionMessageSendRecordsResponseBody setMessageSendRecordList(FindVersionMessageSendRecordsResponseBodyMessageSendRecordList messageSendRecordList) {
        this.messageSendRecordList = messageSendRecordList;
        return this;
    }
    public FindVersionMessageSendRecordsResponseBodyMessageSendRecordList getMessageSendRecordList() {
        return this.messageSendRecordList;
    }

    public FindVersionMessageSendRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems extends TeaModel {
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("MessageType")
        public String messageType;

        @NameInMap("FailedCount")
        public String failedCount;

        @NameInMap("SkippedCount")
        public String skippedCount;

        @NameInMap("Result")
        public String result;

        @NameInMap("SucceededCount")
        public String succeededCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("ResultDesc")
        public String resultDesc;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("Id")
        public Long id;

        public static FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems self = new FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setSkippedCount(String skippedCount) {
            this.skippedCount = skippedCount;
            return this;
        }
        public String getSkippedCount() {
            return this.skippedCount;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setSucceededCount(String succeededCount) {
            this.succeededCount = succeededCount;
            return this;
        }
        public String getSucceededCount() {
            return this.succeededCount;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setResultDesc(String resultDesc) {
            this.resultDesc = resultDesc;
            return this;
        }
        public String getResultDesc() {
            return this.resultDesc;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class FindVersionMessageSendRecordsResponseBodyMessageSendRecordList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems> items;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static FindVersionMessageSendRecordsResponseBodyMessageSendRecordList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionMessageSendRecordsResponseBodyMessageSendRecordList self = new FindVersionMessageSendRecordsResponseBodyMessageSendRecordList();
            return TeaModel.build(map, self);
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordList setItems(java.util.List<FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionMessageSendRecordsResponseBodyMessageSendRecordListItems> getItems() {
            return this.items;
        }

        public FindVersionMessageSendRecordsResponseBodyMessageSendRecordList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
