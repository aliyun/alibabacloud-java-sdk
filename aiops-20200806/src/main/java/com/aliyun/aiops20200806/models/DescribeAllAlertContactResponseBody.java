// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAllAlertContactResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAllAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactResponseBody self = new DescribeAllAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAllAlertContactResponseBody setData(java.util.List<DescribeAllAlertContactResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAllAlertContactResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAllAlertContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAllAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllAlertContactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAllAlertContactResponseBodyData extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("groupNames")
        public String groupNames;

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

        public static DescribeAllAlertContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllAlertContactResponseBodyData self = new DescribeAllAlertContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllAlertContactResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeAllAlertContactResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAllAlertContactResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAllAlertContactResponseBodyData setGroupNames(String groupNames) {
            this.groupNames = groupNames;
            return this;
        }
        public String getGroupNames() {
            return this.groupNames;
        }

        public DescribeAllAlertContactResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAllAlertContactResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAllAlertContactResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeAllAlertContactResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public DescribeAllAlertContactResponseBodyData setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
