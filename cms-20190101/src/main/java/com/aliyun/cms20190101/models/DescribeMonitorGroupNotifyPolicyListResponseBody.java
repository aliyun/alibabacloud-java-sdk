// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned policies.</p>
     */
    @NameInMap("NotifyPolicyList")
    public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList notifyPolicyList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6072F026-C441-41A6-B114-35A1E8F8FDD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Total")
    public Integer total;

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

    public DescribeMonitorGroupNotifyPolicyListResponseBody setNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList notifyPolicyList) {
        this.notifyPolicyList = notifyPolicyList;
        return this;
    }
    public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyList getNotifyPolicyList() {
        return this.notifyPolicyList;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeMonitorGroupNotifyPolicyListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy extends TeaModel {
        /**
         * <p>The end of the time range to query.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1551761781273</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>6780****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1551761781273</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PauseNotify</p>
         */
        @NameInMap("Type")
        public String type;

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

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeMonitorGroupNotifyPolicyListResponseBodyNotifyPolicyListNotifyPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
