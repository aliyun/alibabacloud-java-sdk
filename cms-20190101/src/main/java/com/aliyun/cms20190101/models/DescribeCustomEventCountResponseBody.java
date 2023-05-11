// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of times that the custom event occurred in the specified time period.</p>
     */
    @NameInMap("CustomEventCounts")
    public DescribeCustomEventCountResponseBodyCustomEventCounts customEventCounts;

    /**
     * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details of the custom event.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the custom event occurred.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DescribeCustomEventCountResponseBody setCustomEventCounts(DescribeCustomEventCountResponseBodyCustomEventCounts customEventCounts) {
        this.customEventCounts = customEventCounts;
        return this;
    }
    public DescribeCustomEventCountResponseBodyCustomEventCounts getCustomEventCounts() {
        return this.customEventCounts;
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

    public static class DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount extends TeaModel {
        /**
         * <p>Queries the number of times that a custom event occurred in a specified time period.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>>  This operation counts the number of times that a custom event occurred for each service.</p>
         */
        @NameInMap("Num")
        public Integer num;

        /**
         * <p>The name of the custom event.</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount self = new DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public DescribeCustomEventCountResponseBodyCustomEventCountsCustomEventCount setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
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
