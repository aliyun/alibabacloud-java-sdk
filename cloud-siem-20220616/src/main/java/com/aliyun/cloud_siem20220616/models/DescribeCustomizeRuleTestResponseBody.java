// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeCustomizeRuleTestResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
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
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The historical data that is used in the simulation test.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;,&quot;key3&quot;:&quot;value3&quot;,&quot;key4&quot;:&quot;value4&quot;,&quot;key5&quot;:&quot;value5&quot;}]</p>
         */
        @NameInMap("SimulateData")
        public String simulateData;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>0: The rule is in the initial state.</li>
         * <li>10: The simulation data is tested.</li>
         * <li>15: The business data is being tested.</li>
         * <li>20: The business data test ends.</li>
         * <li>100: The rule takes effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
