// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("NotifyPolicyList")
    @Validation(required = true)
    public DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyList notifyPolicyList;

    public static DescribeMonitorGroupNotifyPolicyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupNotifyPolicyListResponse self = new DescribeMonitorGroupNotifyPolicyListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyListNotifyPolicy extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyListNotifyPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyListNotifyPolicy self = new DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyListNotifyPolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyList extends TeaModel {
        @NameInMap("NotifyPolicy")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyListNotifyPolicy> notifyPolicy;

        public static DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyList self = new DescribeMonitorGroupNotifyPolicyListResponseNotifyPolicyList();
            return TeaModel.build(map, self);
        }

    }

}
