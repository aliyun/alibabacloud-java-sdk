// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAllAlertContactGroupResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAllAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactGroupResponseBody self = new DescribeAllAlertContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAllAlertContactGroupResponseBody setData(java.util.List<DescribeAllAlertContactGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAllAlertContactGroupResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAllAlertContactGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAllAlertContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllAlertContactGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAllAlertContactGroupResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("id")
        public Long id;

        @NameInMap("uid")
        public Long uid;

        public static DescribeAllAlertContactGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllAlertContactGroupResponseBodyData self = new DescribeAllAlertContactGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllAlertContactGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAllAlertContactGroupResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAllAlertContactGroupResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAllAlertContactGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAllAlertContactGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAllAlertContactGroupResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
