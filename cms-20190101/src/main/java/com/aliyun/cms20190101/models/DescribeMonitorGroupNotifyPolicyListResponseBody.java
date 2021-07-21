// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public String success;

    @NameInMap("NotifyPolicyList")
    public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList notifyPolicyList;

    public static DescribeMonitorGroupNotifyPolicyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupNotifyPolicyListResponseBody self = new DescribeMonitorGroupNotifyPolicyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList notifyPolicyList) {
        this.notifyPolicyList = notifyPolicyList;
        return this;
    }
    public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList getNotifyPolicyList() {
        return this.notifyPolicyList;
    }

    public static class DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        public static DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy self = new DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList extends TeaModel {
        @NameInMap("NotifyPolicy")
        public java.util.List<DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy> notifyPolicy;

        public static DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList self = new DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList setNotifyPolicy(java.util.List<DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy> notifyPolicy) {
            this.notifyPolicy = notifyPolicy;
            return this;
        }
        public java.util.List<DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy> getNotifyPolicy() {
            return this.notifyPolicy;
        }

    }

}
