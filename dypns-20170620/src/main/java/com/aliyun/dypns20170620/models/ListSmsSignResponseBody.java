// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListSmsSignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSmsSignResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmsSignResponseBody self = new ListSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSmsSignResponseBody setData(java.util.List<ListSmsSignResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSmsSignResponseBodyData> getData() {
        return this.data;
    }

    public ListSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSmsSignResponseBodyData extends TeaModel {
        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("CreateDate")
        public Long createDate;

        @NameInMap("DefaultFlag")
        public Boolean defaultFlag;

        @NameInMap("SmsSignName")
        public String smsSignName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TestFlag")
        public Boolean testFlag;

        public static ListSmsSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSmsSignResponseBodyData self = new ListSmsSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSmsSignResponseBodyData setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public ListSmsSignResponseBodyData setCreateDate(Long createDate) {
            this.createDate = createDate;
            return this;
        }
        public Long getCreateDate() {
            return this.createDate;
        }

        public ListSmsSignResponseBodyData setDefaultFlag(Boolean defaultFlag) {
            this.defaultFlag = defaultFlag;
            return this;
        }
        public Boolean getDefaultFlag() {
            return this.defaultFlag;
        }

        public ListSmsSignResponseBodyData setSmsSignName(String smsSignName) {
            this.smsSignName = smsSignName;
            return this;
        }
        public String getSmsSignName() {
            return this.smsSignName;
        }

        public ListSmsSignResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSmsSignResponseBodyData setTestFlag(Boolean testFlag) {
            this.testFlag = testFlag;
            return this;
        }
        public Boolean getTestFlag() {
            return this.testFlag;
        }

    }

}
