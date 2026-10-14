// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics on the instance.</p>
     */
    @NameInMap("InstanceStatistics")
    public java.util.List<DescribeInstanceStatisticsResponseBodyInstanceStatistics> instanceStatistics;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>642319A9-D1F2-4459-A447-E57CFC599FDE</p>
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
         * <p>The number of advanced mitigation sessions that are used in this month.</p>
         * <blockquote>
         * <p> This parameter is returned only if Anti-DDoS Proxy (Outside Chinese Mainland) instances are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefenseCountUsage")
        public Integer defenseCountUsage;

        /**
         * <p>The number of domain names that are protected by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DomainUsage")
        public Integer domainUsage;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of ports that are protected by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PortUsage")
        public Integer portUsage;

        /**
         * <p>The number of websites that are protected by the instance.</p>
         * 
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
