// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeTaskInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("States")
    public java.util.List<DescribeTaskInstanceStatisticsResponseBodyStates> states;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeTaskInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInstanceStatisticsResponseBody self = new DescribeTaskInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInstanceStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTaskInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskInstanceStatisticsResponseBody setStates(java.util.List<DescribeTaskInstanceStatisticsResponseBodyStates> states) {
        this.states = states;
        return this;
    }
    public java.util.List<DescribeTaskInstanceStatisticsResponseBodyStates> getStates() {
        return this.states;
    }

    public DescribeTaskInstanceStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTaskInstanceStatisticsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTaskInstanceStatisticsResponseBodyStates extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("StateType")
        public String stateType;

        public static DescribeTaskInstanceStatisticsResponseBodyStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInstanceStatisticsResponseBodyStates self = new DescribeTaskInstanceStatisticsResponseBodyStates();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInstanceStatisticsResponseBodyStates setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeTaskInstanceStatisticsResponseBodyStates setStateType(String stateType) {
            this.stateType = stateType;
            return this;
        }
        public String getStateType() {
            return this.stateType;
        }

    }

}
