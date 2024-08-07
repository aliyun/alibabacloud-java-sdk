// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleCountResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
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
    public DescribeCustomizeRuleCountResponseBodyData data;

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
         * <p>同类聚合规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AggregationRuleNum")
        public Integer aggregationRuleNum;

        /**
         * <p>自定义规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CustomizeRuleNum")
        public Integer customizeRuleNum;

        /**
         * <p>专家规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ExpertRuleNum")
        public Integer expertRuleNum;

        /**
         * <p>图计算规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("GraphComputingRuleNum")
        public Integer graphComputingRuleNum;

        /**
         * <p>The number of rules that are used to identify high-risk threats.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("HighRuleNum")
        public Integer highRuleNum;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("InUseRuleNum")
        public Integer inUseRuleNum;

        /**
         * <p>The number of rules that are used to identify low-risk threats.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LowRuleNum")
        public Integer lowRuleNum;

        /**
         * <p>The number of rules that are used to identify medium-risk threats.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MediumRuleNum")
        public Integer mediumRuleNum;

        /**
         * <p>预定义规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PredefinedRuleNum")
        public Integer predefinedRuleNum;

        /**
         * <p>告警透传规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SingleAlertRuleNum")
        public Integer singleAlertRuleNum;

        /**
         * <p>总规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalRuleNum")
        public Integer totalRuleNum;

        /**
         * <p>不产生事件规则数。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UnEventRuleNum")
        public Integer unEventRuleNum;

        public static DescribeCustomizeRuleCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeRuleCountResponseBodyData self = new DescribeCustomizeRuleCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeRuleCountResponseBodyData setAggregationRuleNum(Integer aggregationRuleNum) {
            this.aggregationRuleNum = aggregationRuleNum;
            return this;
        }
        public Integer getAggregationRuleNum() {
            return this.aggregationRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setCustomizeRuleNum(Integer customizeRuleNum) {
            this.customizeRuleNum = customizeRuleNum;
            return this;
        }
        public Integer getCustomizeRuleNum() {
            return this.customizeRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setExpertRuleNum(Integer expertRuleNum) {
            this.expertRuleNum = expertRuleNum;
            return this;
        }
        public Integer getExpertRuleNum() {
            return this.expertRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setGraphComputingRuleNum(Integer graphComputingRuleNum) {
            this.graphComputingRuleNum = graphComputingRuleNum;
            return this;
        }
        public Integer getGraphComputingRuleNum() {
            return this.graphComputingRuleNum;
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

        public DescribeCustomizeRuleCountResponseBodyData setPredefinedRuleNum(Integer predefinedRuleNum) {
            this.predefinedRuleNum = predefinedRuleNum;
            return this;
        }
        public Integer getPredefinedRuleNum() {
            return this.predefinedRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setSingleAlertRuleNum(Integer singleAlertRuleNum) {
            this.singleAlertRuleNum = singleAlertRuleNum;
            return this;
        }
        public Integer getSingleAlertRuleNum() {
            return this.singleAlertRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setTotalRuleNum(Integer totalRuleNum) {
            this.totalRuleNum = totalRuleNum;
            return this;
        }
        public Integer getTotalRuleNum() {
            return this.totalRuleNum;
        }

        public DescribeCustomizeRuleCountResponseBodyData setUnEventRuleNum(Integer unEventRuleNum) {
            this.unEventRuleNum = unEventRuleNum;
            return this;
        }
        public Integer getUnEventRuleNum() {
            return this.unEventRuleNum;
        }

    }

}
