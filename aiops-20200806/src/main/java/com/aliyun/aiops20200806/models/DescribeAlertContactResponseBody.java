// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertContactResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Total")
    public Long total;

    public static DescribeAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactResponseBody self = new DescribeAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertContactResponseBody setData(java.util.List<DescribeAlertContactResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertContactResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertContactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAlertContactResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeAlertContactResponseBodyData extends TeaModel {
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

        public static DescribeAlertContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertContactResponseBodyData self = new DescribeAlertContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertContactResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeAlertContactResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAlertContactResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlertContactResponseBodyData setGroupNames(String groupNames) {
            this.groupNames = groupNames;
            return this;
        }
        public String getGroupNames() {
            return this.groupNames;
        }

        public DescribeAlertContactResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAlertContactResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlertContactResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeAlertContactResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public DescribeAlertContactResponseBodyData setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
