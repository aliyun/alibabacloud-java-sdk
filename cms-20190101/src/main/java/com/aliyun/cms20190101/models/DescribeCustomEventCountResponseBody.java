// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the custom event.</p>
     */
    @NameInMap("CustomEventCounts")
    public DescribeCustomEventCountResponseBodyCustomEventCounts customEventCounts;

    /**
     * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>BABEL_BUY</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of times that the custom event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Num")
        public Integer num;

        /**
         * <p>The time when the event occurred.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552267615000</p>
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
