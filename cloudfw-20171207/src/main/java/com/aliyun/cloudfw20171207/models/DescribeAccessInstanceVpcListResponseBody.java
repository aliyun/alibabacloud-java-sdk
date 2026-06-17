// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceVpcListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>450D47F5-956E-543E-8502-2F71C8C54E72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of VPCs.</p>
     */
    @NameInMap("VpcList")
    public java.util.List<DescribeAccessInstanceVpcListResponseBodyVpcList> vpcList;

    public static DescribeAccessInstanceVpcListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceVpcListResponseBody self = new DescribeAccessInstanceVpcListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceVpcListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAccessInstanceVpcListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessInstanceVpcListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessInstanceVpcListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessInstanceVpcListResponseBody setVpcList(java.util.List<DescribeAccessInstanceVpcListResponseBodyVpcList> vpcList) {
        this.vpcList = vpcList;
        return this;
    }
    public java.util.List<DescribeAccessInstanceVpcListResponseBodyVpcList> getVpcList() {
        return this.vpcList;
    }

    public static class DescribeAccessInstanceVpcListResponseBodyVpcList extends TeaModel {
        /**
         * <p>Indicates whether the VPC is managed by Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FirewallVpc")
        public Boolean firewallVpc;

        /**
         * <p>The ID of the VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze1t4irqj0fljlbb****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud_Firewall_VPC</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeAccessInstanceVpcListResponseBodyVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessInstanceVpcListResponseBodyVpcList self = new DescribeAccessInstanceVpcListResponseBodyVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeAccessInstanceVpcListResponseBodyVpcList setFirewallVpc(Boolean firewallVpc) {
            this.firewallVpc = firewallVpc;
            return this;
        }
        public Boolean getFirewallVpc() {
            return this.firewallVpc;
        }

        public DescribeAccessInstanceVpcListResponseBodyVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeAccessInstanceVpcListResponseBodyVpcList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
