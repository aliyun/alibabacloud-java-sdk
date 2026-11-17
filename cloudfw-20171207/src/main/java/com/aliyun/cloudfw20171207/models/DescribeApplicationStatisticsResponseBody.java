// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatisticsResponseBody extends TeaModel {
    /**
     * <p>The list of application counts grouped by application category.</p>
     */
    @NameInMap("CategoryList")
    public java.util.List<DescribeApplicationStatisticsResponseBodyCategoryList> categoryList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of application counts grouped by risk level.</p>
     */
    @NameInMap("RiskList")
    public java.util.List<DescribeApplicationStatisticsResponseBodyRiskList> riskList;

    /**
     * <p>The list of application counts grouped by technology type.</p>
     */
    @NameInMap("TechnologyList")
    public java.util.List<DescribeApplicationStatisticsResponseBodyTechnologyList> technologyList;

    public static DescribeApplicationStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatisticsResponseBody self = new DescribeApplicationStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatisticsResponseBody setCategoryList(java.util.List<DescribeApplicationStatisticsResponseBodyCategoryList> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public java.util.List<DescribeApplicationStatisticsResponseBodyCategoryList> getCategoryList() {
        return this.categoryList;
    }

    public DescribeApplicationStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationStatisticsResponseBody setRiskList(java.util.List<DescribeApplicationStatisticsResponseBodyRiskList> riskList) {
        this.riskList = riskList;
        return this;
    }
    public java.util.List<DescribeApplicationStatisticsResponseBodyRiskList> getRiskList() {
        return this.riskList;
    }

    public DescribeApplicationStatisticsResponseBody setTechnologyList(java.util.List<DescribeApplicationStatisticsResponseBodyTechnologyList> technologyList) {
        this.technologyList = technologyList;
        return this;
    }
    public java.util.List<DescribeApplicationStatisticsResponseBodyTechnologyList> getTechnologyList() {
        return this.technologyList;
    }

    public static class DescribeApplicationStatisticsResponseBodyCategoryList extends TeaModel {
        /**
         * <p>The number of applications in the application category.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ApplicationCount")
        public Long applicationCount;

        /**
         * <p>The name of the application category. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Office collaboration</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        public static DescribeApplicationStatisticsResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationStatisticsResponseBodyCategoryList self = new DescribeApplicationStatisticsResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationStatisticsResponseBodyCategoryList setApplicationCount(Long applicationCount) {
            this.applicationCount = applicationCount;
            return this;
        }
        public Long getApplicationCount() {
            return this.applicationCount;
        }

        public DescribeApplicationStatisticsResponseBodyCategoryList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

    public static class DescribeApplicationStatisticsResponseBodyRiskList extends TeaModel {
        /**
         * <p>The number of applications at the risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ApplicationCount")
        public Long applicationCount;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>Information</strong>: Informational.</li>
         * <li><strong>Low</strong>: Low.</li>
         * <li><strong>Medium</strong>: Medium.</li>
         * <li><strong>High</strong>: High.</li>
         * <li><strong>Critical</strong>: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Low</p>
         */
        @NameInMap("Risk")
        public String risk;

        public static DescribeApplicationStatisticsResponseBodyRiskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationStatisticsResponseBodyRiskList self = new DescribeApplicationStatisticsResponseBodyRiskList();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationStatisticsResponseBodyRiskList setApplicationCount(Long applicationCount) {
            this.applicationCount = applicationCount;
            return this;
        }
        public Long getApplicationCount() {
            return this.applicationCount;
        }

        public DescribeApplicationStatisticsResponseBodyRiskList setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

    }

    public static class DescribeApplicationStatisticsResponseBodyTechnologyList extends TeaModel {
        /**
         * <p>The number of applications of the technology type.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ApplicationCount")
        public Long applicationCount;

        /**
         * <p>The name of the technology type. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Browser-based</p>
         */
        @NameInMap("Technology")
        public String technology;

        public static DescribeApplicationStatisticsResponseBodyTechnologyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationStatisticsResponseBodyTechnologyList self = new DescribeApplicationStatisticsResponseBodyTechnologyList();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationStatisticsResponseBodyTechnologyList setApplicationCount(Long applicationCount) {
            this.applicationCount = applicationCount;
            return this;
        }
        public Long getApplicationCount() {
            return this.applicationCount;
        }

        public DescribeApplicationStatisticsResponseBodyTechnologyList setTechnology(String technology) {
            this.technology = technology;
            return this;
        }
        public String getTechnology() {
            return this.technology;
        }

    }

}
