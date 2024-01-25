// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithAlertSettingIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertContactWithAlertSettingIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAlertContactWithAlertSettingIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactWithAlertSettingIdResponseBody self = new DescribeAlertContactWithAlertSettingIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactWithAlertSettingIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertContactWithAlertSettingIdResponseBody setData(java.util.List<DescribeAlertContactWithAlertSettingIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertContactWithAlertSettingIdResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertContactWithAlertSettingIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertContactWithAlertSettingIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertContactWithAlertSettingIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAlertContactWithAlertSettingIdResponseBodyData extends TeaModel {
        @NameInMap("contactId")
        public Long contactId;

        @NameInMap("contactName")
        public String contactName;

        @NameInMap("contactType")
        public Long contactType;

        public static DescribeAlertContactWithAlertSettingIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertContactWithAlertSettingIdResponseBodyData self = new DescribeAlertContactWithAlertSettingIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertContactWithAlertSettingIdResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public DescribeAlertContactWithAlertSettingIdResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public DescribeAlertContactWithAlertSettingIdResponseBodyData setContactType(Long contactType) {
            this.contactType = contactType;
            return this;
        }
        public Long getContactType() {
            return this.contactType;
        }

    }

}
