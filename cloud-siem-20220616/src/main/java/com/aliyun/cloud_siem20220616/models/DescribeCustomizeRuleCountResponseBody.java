// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleCountResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeCustomizeRuleCountResponseBodyData data;

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

    public static DescribeCustomizeRuleCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleCountResponseBody self = new DescribeCustomizeRuleCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleCountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCustomizeRuleCountResponseBody setData(DescribeCustomizeRuleCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomizeRuleCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomizeRuleCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomizeRuleCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizeRuleCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomizeRuleCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of rules that are used to identify high-risk threats.</p>
         */
        @NameInMap("HighRuleNum")
        public Integer highRuleNum;

        /**
         * <p>The total number of rules.</p>
         */
        @NameInMap("InUseRuleNum")
        public Integer inUseRuleNum;

        /**
         * <p>The number of rules that are used to identify low-risk threats.</p>
         */
        @NameInMap("LowRuleNum")
        public Integer lowRuleNum;

        /**
         * <p>The number of rules that are used to identify medium-risk threats.</p>
         */
        @NameInMap("MediumRuleNum")
        public Integer mediumRuleNum;

        public static DescribeCustomizeRuleCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeRuleCountResponseBodyData self = new DescribeCustomizeRuleCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeRuleCountResponseBodyData setHighRuleNum(Integer highRuleNum) {
            this.highRuleNum = highRuleNum;
            return this;
        }
        public Integer getHighRuleNum() {
            return this.highRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setInUseRuleNum(Integer inUseRuleNum) {
            this.inUseRuleNum = inUseRuleNum;
            return this;
        }
        public Integer getInUseRuleNum() {
            return this.inUseRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setLowRuleNum(Integer lowRuleNum) {
            this.lowRuleNum = lowRuleNum;
            return this;
        }
        public Integer getLowRuleNum() {
            return this.lowRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setMediumRuleNum(Integer mediumRuleNum) {
            this.mediumRuleNum = mediumRuleNum;
            return this;
        }
        public Integer getMediumRuleNum() {
            return this.mediumRuleNum;
        }

    }

}
