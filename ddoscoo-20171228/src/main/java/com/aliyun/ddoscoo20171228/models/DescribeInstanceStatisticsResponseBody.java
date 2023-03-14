// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("InstanceStatistics")
    public java.util.List<DescribeInstanceStatisticsResponseBodyInstanceStatistics> instanceStatistics;

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
        @NameInMap("DefenseCountUsage")
        public Integer defenseCountUsage;

        @NameInMap("DomainUsage")
        public Integer domainUsage;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PortUsage")
        public Integer portUsage;

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
