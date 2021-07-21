// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("CustomEventCounts")
    public DescribeCustomEventCountResponseBodyCustomEventCounts customEventCounts;

    public static DescribeCustomEventCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventCountResponseBody self = new DescribeCustomEventCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomEventCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomEventCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomEventCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCustomEventCountResponseBody setCustomEventCounts(DescribeCustomEventCountResponseBodyCustomEventCounts customEventCounts) {
        this.customEventCounts = customEventCounts;
        return this;
    }
    public DescribeCustomEventCountResponseBodyCustomEventCounts getCustomEventCounts() {
        return this.customEventCounts;
    }

    public static class DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Num")
        public Integer num;

        @NameInMap("Name")
        public String name;

        public static DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount self = new DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeCustomEventCountResponseBodyCustomEventCounts extends TeaModel {
        @NameInMap("CustomEventCount")
        public java.util.List<DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount> customEventCount;

        public static DescribeCustomEventCountResponseBodyCustomEventCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventCountResponseBodyCustomEventCounts self = new DescribeCustomEventCountResponseBodyCustomEventCounts();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventCountResponseBodyCustomEventCounts setCustomEventCount(java.util.List<DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount> customEventCount) {
            this.customEventCount = customEventCount;
            return this;
        }
        public java.util.List<DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount> getCustomEventCount() {
            return this.customEventCount;
        }

    }

}
