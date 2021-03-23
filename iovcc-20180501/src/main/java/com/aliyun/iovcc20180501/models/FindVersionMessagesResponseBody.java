// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionMessagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageList")
    public FindVersionMessagesResponseBodyMessageList messageList;

    public static FindVersionMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionMessagesResponseBody self = new FindVersionMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindVersionMessagesResponseBody setMessageList(FindVersionMessagesResponseBodyMessageList messageList) {
        this.messageList = messageList;
        return this;
    }
    public FindVersionMessagesResponseBodyMessageList getMessageList() {
        return this.messageList;
    }

    public static class FindVersionMessagesResponseBodyMessageListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("TestId")
        public String testId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindVersionMessagesResponseBodyMessageListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionMessagesResponseBodyMessageListItems self = new FindVersionMessagesResponseBodyMessageListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionMessagesResponseBodyMessageListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindVersionMessagesResponseBodyMessageListItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public FindVersionMessagesResponseBodyMessageListItems setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public FindVersionMessagesResponseBodyMessageListItems setTestId(String testId) {
            this.testId = testId;
            return this;
        }
        public String getTestId() {
            return this.testId;
        }

        public FindVersionMessagesResponseBodyMessageListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindVersionMessagesResponseBodyMessageListItems setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public FindVersionMessagesResponseBodyMessageListItems setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public FindVersionMessagesResponseBodyMessageListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionMessagesResponseBodyMessageListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindVersionMessagesResponseBodyMessageListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindVersionMessagesResponseBodyMessageListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

    public static class FindVersionMessagesResponseBodyMessageList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindVersionMessagesResponseBodyMessageListItems> items;

        public static FindVersionMessagesResponseBodyMessageList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionMessagesResponseBodyMessageList self = new FindVersionMessagesResponseBodyMessageList();
            return TeaModel.build(map, self);
        }

        public FindVersionMessagesResponseBodyMessageList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindVersionMessagesResponseBodyMessageList setItems(java.util.List<FindVersionMessagesResponseBodyMessageListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionMessagesResponseBodyMessageListItems> getItems() {
            return this.items;
        }

    }

}
