// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeCustomizeRuleTestResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomizeRuleTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleTestResponseBody self = new DescribeCustomizeRuleTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleTestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCustomizeRuleTestResponseBody setData(DescribeCustomizeRuleTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomizeRuleTestResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomizeRuleTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomizeRuleTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizeRuleTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomizeRuleTestResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The historical data that is used in the simulation test.</p>
         */
        @NameInMap("SimulateData")
        public String simulateData;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   0: The rule is in the initial state.</p>
         * <p>*   10: The simulation data is tested.</p>
         * <p>*   15: The business data is being tested.</p>
         * <p>*   20: The business data test ends.</p>
         * <p>*   100: The rule takes effect.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeCustomizeRuleTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeRuleTestResponseBodyData self = new DescribeCustomizeRuleTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeRuleTestResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomizeRuleTestResponseBodyData setSimulateData(String simulateData) {
            this.simulateData = simulateData;
            return this;
        }
        public String getSimulateData() {
            return this.simulateData;
        }

        public DescribeCustomizeRuleTestResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
