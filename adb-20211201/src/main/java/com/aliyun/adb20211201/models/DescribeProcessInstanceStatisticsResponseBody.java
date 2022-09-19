// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("States")
    public java.util.List<DescribeProcessInstanceStatisticsResponseBodyStates> states;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProcessInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceStatisticsResponseBody self = new DescribeProcessInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProcessInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessInstanceStatisticsResponseBody setStates(java.util.List<DescribeProcessInstanceStatisticsResponseBodyStates> states) {
        this.states = states;
        return this;
    }
    public java.util.List<DescribeProcessInstanceStatisticsResponseBodyStates> getStates() {
        return this.states;
    }

    public DescribeProcessInstanceStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProcessInstanceStatisticsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProcessInstanceStatisticsResponseBodyStates extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("StateType")
        public String stateType;

        public static DescribeProcessInstanceStatisticsResponseBodyStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceStatisticsResponseBodyStates self = new DescribeProcessInstanceStatisticsResponseBodyStates();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceStatisticsResponseBodyStates setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeProcessInstanceStatisticsResponseBodyStates setStateType(String stateType) {
            this.stateType = stateType;
            return this;
        }
        public String getStateType() {
            return this.stateType;
        }

    }

}
