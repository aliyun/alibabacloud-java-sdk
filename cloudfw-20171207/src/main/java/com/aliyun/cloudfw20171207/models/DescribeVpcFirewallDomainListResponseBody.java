// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDomainListResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVpcFirewallDomainListResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>133173B9-8010-5DF5-8B93-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDomainListResponseBody self = new DescribeVpcFirewallDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDomainListResponseBody setDataList(java.util.List<DescribeVpcFirewallDomainListResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallDomainListResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVpcFirewallDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallDomainListResponseBodyDataList extends TeaModel {
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <strong>example:</strong>
         * <p>Google</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.a.com">www.a.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>Google</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>3214</p>
         */
        @NameInMap("RequestBytes")
        public Long requestBytes;

        /**
         * <strong>example:</strong>
         * <p>4582</p>
         */
        @NameInMap("ResponseBytes")
        public Long responseBytes;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SrcIpCount")
        public Long srcIpCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SrcVpcCount")
        public Long srcVpcCount;

        /**
         * <strong>example:</strong>
         * <p>8111126106</p>
         */
        @NameInMap("TotalBytes")
        public Long totalBytes;

        public static DescribeVpcFirewallDomainListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDomainListResponseBodyDataList self = new DescribeVpcFirewallDomainListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setRequestBytes(Long requestBytes) {
            this.requestBytes = requestBytes;
            return this;
        }
        public Long getRequestBytes() {
            return this.requestBytes;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setResponseBytes(Long responseBytes) {
            this.responseBytes = responseBytes;
            return this;
        }
        public Long getResponseBytes() {
            return this.responseBytes;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setSrcIpCount(Long srcIpCount) {
            this.srcIpCount = srcIpCount;
            return this;
        }
        public Long getSrcIpCount() {
            return this.srcIpCount;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setSrcVpcCount(Long srcVpcCount) {
            this.srcVpcCount = srcVpcCount;
            return this;
        }
        public Long getSrcVpcCount() {
            return this.srcVpcCount;
        }

        public DescribeVpcFirewallDomainListResponseBodyDataList setTotalBytes(Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public Long getTotalBytes() {
            return this.totalBytes;
        }

    }

}
