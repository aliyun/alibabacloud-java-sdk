// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCfwRiskLevelSummaryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of risks.</p>
     */
    @NameInMap("RiskList")
    public java.util.List<DescribeCfwRiskLevelSummaryResponseBodyRiskList> riskList;

    public static DescribeCfwRiskLevelSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCfwRiskLevelSummaryResponseBody self = new DescribeCfwRiskLevelSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCfwRiskLevelSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCfwRiskLevelSummaryResponseBody setRiskList(java.util.List<DescribeCfwRiskLevelSummaryResponseBodyRiskList> riskList) {
        this.riskList = riskList;
        return this;
    }
    public java.util.List<DescribeCfwRiskLevelSummaryResponseBodyRiskList> getRiskList() {
        return this.riskList;
    }

    public static class DescribeCfwRiskLevelSummaryResponseBodyRiskList extends TeaModel {
        /**
         * <p>The risk levels. Valid values:</p>
         * <br>
         * <p>*   **medium**</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The number of at-risk Elastic Compute Service (ECS) instances.</p>
         */
        @NameInMap("Num")
        public String num;

        /**
         * <p>The type.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCfwRiskLevelSummaryResponseBodyRiskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCfwRiskLevelSummaryResponseBodyRiskList self = new DescribeCfwRiskLevelSummaryResponseBodyRiskList();
            return TeaModel.build(map, self);
        }

        public DescribeCfwRiskLevelSummaryResponseBodyRiskList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeCfwRiskLevelSummaryResponseBodyRiskList setNum(String num) {
            this.num = num;
            return this;
        }
        public String getNum() {
            return this.num;
        }

        public DescribeCfwRiskLevelSummaryResponseBodyRiskList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
