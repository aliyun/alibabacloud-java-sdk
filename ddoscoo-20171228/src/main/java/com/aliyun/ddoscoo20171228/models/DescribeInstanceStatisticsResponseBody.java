// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("InstanceStatistics")
    public java.util.List<DescribeInstanceStatisticsResponseBodyInstanceStatistics> instanceStatistics;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsResponseBody self = new DescribeInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsResponseBody setInstanceStatistics(java.util.List<DescribeInstanceStatisticsResponseBodyInstanceStatistics> instanceStatistics) {
        this.instanceStatistics = instanceStatistics;
        return this;
    }
    public java.util.List<DescribeInstanceStatisticsResponseBodyInstanceStatistics> getInstanceStatistics() {
        return this.instanceStatistics;
    }

    public DescribeInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStatisticsResponseBodyInstanceStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefenseCountUsage")
        public Integer defenseCountUsage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DomainUsage")
        public Integer domainUsage;

        /**
         * <strong>example:</strong>
         * <p>ddoscoo-cn-XXXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PortUsage")
        public Integer portUsage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteUsage")
        public Integer siteUsage;

        public static DescribeInstanceStatisticsResponseBodyInstanceStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatisticsResponseBodyInstanceStatistics self = new DescribeInstanceStatisticsResponseBodyInstanceStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatisticsResponseBodyInstanceStatistics setDefenseCountUsage(Integer defenseCountUsage) {
            this.defenseCountUsage = defenseCountUsage;
            return this;
        }
        public Integer getDefenseCountUsage() {
            return this.defenseCountUsage;
        }

        public DescribeInstanceStatisticsResponseBodyInstanceStatistics setDomainUsage(Integer domainUsage) {
            this.domainUsage = domainUsage;
            return this;
        }
        public Integer getDomainUsage() {
            return this.domainUsage;
        }

        public DescribeInstanceStatisticsResponseBodyInstanceStatistics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceStatisticsResponseBodyInstanceStatistics setPortUsage(Integer portUsage) {
            this.portUsage = portUsage;
            return this;
        }
        public Integer getPortUsage() {
            return this.portUsage;
        }

        public DescribeInstanceStatisticsResponseBodyInstanceStatistics setSiteUsage(Integer siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }
        public Integer getSiteUsage() {
            return this.siteUsage;
        }

    }

}
