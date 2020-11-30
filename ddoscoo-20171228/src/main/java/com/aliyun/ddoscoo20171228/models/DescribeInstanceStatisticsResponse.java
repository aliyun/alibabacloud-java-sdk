// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceStatistics")
    @Validation(required = true)
    public java.util.List<DescribeInstanceStatisticsResponseInstanceStatistics> instanceStatistics;

    public static DescribeInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsResponse self = new DescribeInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceStatisticsResponse setInstanceStatistics(java.util.List<DescribeInstanceStatisticsResponseInstanceStatistics> instanceStatistics) {
        this.instanceStatistics = instanceStatistics;
        return this;
    }
    public java.util.List<DescribeInstanceStatisticsResponseInstanceStatistics> getInstanceStatistics() {
        return this.instanceStatistics;
    }

    public static class DescribeInstanceStatisticsResponseInstanceStatistics extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("PortUsage")
        @Validation(required = true)
        public Integer portUsage;

        @NameInMap("DomainUsage")
        @Validation(required = true)
        public Integer domainUsage;

        @NameInMap("SiteUsage")
        @Validation(required = true)
        public Integer siteUsage;

        @NameInMap("DefenseCountUsage")
        @Validation(required = true)
        public Integer defenseCountUsage;

        public static DescribeInstanceStatisticsResponseInstanceStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatisticsResponseInstanceStatistics self = new DescribeInstanceStatisticsResponseInstanceStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatisticsResponseInstanceStatistics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceStatisticsResponseInstanceStatistics setPortUsage(Integer portUsage) {
            this.portUsage = portUsage;
            return this;
        }
        public Integer getPortUsage() {
            return this.portUsage;
        }

        public DescribeInstanceStatisticsResponseInstanceStatistics setDomainUsage(Integer domainUsage) {
            this.domainUsage = domainUsage;
            return this;
        }
        public Integer getDomainUsage() {
            return this.domainUsage;
        }

        public DescribeInstanceStatisticsResponseInstanceStatistics setSiteUsage(Integer siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }
        public Integer getSiteUsage() {
            return this.siteUsage;
        }

        public DescribeInstanceStatisticsResponseInstanceStatistics setDefenseCountUsage(Integer defenseCountUsage) {
            this.defenseCountUsage = defenseCountUsage;
            return this;
        }
        public Integer getDefenseCountUsage() {
            return this.defenseCountUsage;
        }

    }

}
