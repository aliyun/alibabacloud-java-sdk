// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public String status;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Data")
    public java.util.List<DescribeAlertContactGroupResponseBodyData> data;

    public static DescribeAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactGroupResponseBody self = new DescribeAlertContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertContactGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertContactGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertContactGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAlertContactGroupResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeAlertContactGroupResponseBody setData(java.util.List<DescribeAlertContactGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertContactGroupResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeAlertContactGroupResponseBodyData extends TeaModel {
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

        public static DescribeAlertContactGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertContactGroupResponseBodyData self = new DescribeAlertContactGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertContactGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlertContactGroupResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAlertContactGroupResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlertContactGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAlertContactGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAlertContactGroupResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
