// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertContactWithGroupIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAlertContactWithGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactWithGroupIdResponseBody self = new DescribeAlertContactWithGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactWithGroupIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertContactWithGroupIdResponseBody setData(java.util.List<DescribeAlertContactWithGroupIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertContactWithGroupIdResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertContactWithGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertContactWithGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertContactWithGroupIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAlertContactWithGroupIdResponseBodyData extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("phone")
        public String phone;

        @NameInMap("uid")
        public Long uid;

        @NameInMap("webhook")
        public String webhook;

        public static DescribeAlertContactWithGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertContactWithGroupIdResponseBodyData self = new DescribeAlertContactWithGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public DescribeAlertContactWithGroupIdResponseBodyData setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
