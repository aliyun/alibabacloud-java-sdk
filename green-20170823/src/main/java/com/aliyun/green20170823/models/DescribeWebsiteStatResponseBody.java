// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteStatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("WebsiteStatList")
    public java.util.List<DescribeWebsiteStatResponseBodyWebsiteStatList> websiteStatList;

    public static DescribeWebsiteStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteStatResponseBody self = new DescribeWebsiteStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteStatResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebsiteStatResponseBody setWebsiteStatList(java.util.List<DescribeWebsiteStatResponseBodyWebsiteStatList> websiteStatList) {
        this.websiteStatList = websiteStatList;
        return this;
    }
    public java.util.List<DescribeWebsiteStatResponseBodyWebsiteStatList> getWebsiteStatList() {
        return this.websiteStatList;
    }

    public static class DescribeWebsiteStatResponseBodyWebsiteStatList extends TeaModel {
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("RiskCount")
        public Integer riskCount;

        @NameInMap("ScanCount")
        public Integer scanCount;

        @NameInMap("SubServiceModule")
        public String subServiceModule;

        public static DescribeWebsiteStatResponseBodyWebsiteStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebsiteStatResponseBodyWebsiteStatList self = new DescribeWebsiteStatResponseBodyWebsiteStatList();
            return TeaModel.build(map, self);
        }

        public DescribeWebsiteStatResponseBodyWebsiteStatList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeWebsiteStatResponseBodyWebsiteStatList setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeWebsiteStatResponseBodyWebsiteStatList setScanCount(Integer scanCount) {
            this.scanCount = scanCount;
            return this;
        }
        public Integer getScanCount() {
            return this.scanCount;
        }

        public DescribeWebsiteStatResponseBodyWebsiteStatList setSubServiceModule(String subServiceModule) {
            this.subServiceModule = subServiceModule;
            return this;
        }
        public String getSubServiceModule() {
            return this.subServiceModule;
        }

    }

}
