// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsEndpointListResponseBody extends TeaModel {
    /**
     * <p>A list of private instances.</p>
     */
    @NameInMap("AccessInstanceList")
    public java.util.List<DescribePrivateDnsEndpointListResponseBodyAccessInstanceList> accessInstanceList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePrivateDnsEndpointListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsEndpointListResponseBody self = new DescribePrivateDnsEndpointListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsEndpointListResponseBody setAccessInstanceList(java.util.List<DescribePrivateDnsEndpointListResponseBodyAccessInstanceList> accessInstanceList) {
        this.accessInstanceList = accessInstanceList;
        return this;
    }
    public java.util.List<DescribePrivateDnsEndpointListResponseBodyAccessInstanceList> getAccessInstanceList() {
        return this.accessInstanceList;
    }

    public DescribePrivateDnsEndpointListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePrivateDnsEndpointListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePrivateDnsEndpointListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrivateDnsEndpointListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePrivateDnsEndpointListResponseBodyAccessInstanceList extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AccessInstanceId")
        public String accessInstanceId;

        /**
         * <p>The name of the private instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessInstanceName")
        public String accessInstanceName;

        /**
         * <p>The UID of the Alibaba Cloud account that owns the Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>1379490574415****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The number of domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DomainNameCount")
        public Long domainNameCount;

        /**
         * <p>The type of Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>internet</strong></p>
         * </li>
         * <li><p><strong>vpc</strong></p>
         * </li>
         * <li><p><strong>nat</strong></p>
         * </li>
         * </ul>
         */
        @NameInMap("FirewallType")
        public java.util.List<String> firewallType;

        /**
         * <p>The time when the instance was created. The value is a UNIX timestamp measured in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1715075765</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The IP protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public Integer ipProtocol;

        /**
         * <p>The UID of the Cloud Firewall member account.</p>
         * 
         * <strong>example:</strong>
         * <p>1844802493****</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The primary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("PrimaryDns")
        public String primaryDns;

        /**
         * <p>The type of private DNS. Valid values:</p>
         * <ul>
         * <li><p><strong>PrivateZone</strong></p>
         * </li>
         * <li><p><strong>Custom</strong> (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PrivateDnsType")
        public String privateDnsType;

        /**
         * <p>The ID of the region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The standby DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.2</p>
         */
        @NameInMap("StandbyDns")
        public String standbyDns;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>creating</strong>: The instance is being created.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
         * </li>
         * <li><p><strong>normal</strong>: The instance is running as expected.</p>
         * </li>
         * <li><p><strong>updating</strong>: The instance is being updated.</p>
         * </li>
         * <li><p><strong>abnormal</strong>: The instance is in an abnormal state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The unique ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zelphbaourpun****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribePrivateDnsEndpointListResponseBodyAccessInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribePrivateDnsEndpointListResponseBodyAccessInstanceList self = new DescribePrivateDnsEndpointListResponseBodyAccessInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setAccessInstanceId(String accessInstanceId) {
            this.accessInstanceId = accessInstanceId;
            return this;
        }
        public String getAccessInstanceId() {
            return this.accessInstanceId;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setAccessInstanceName(String accessInstanceName) {
            this.accessInstanceName = accessInstanceName;
            return this;
        }
        public String getAccessInstanceName() {
            return this.accessInstanceName;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setDomainNameCount(Long domainNameCount) {
            this.domainNameCount = domainNameCount;
            return this;
        }
        public Long getDomainNameCount() {
            return this.domainNameCount;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setFirewallType(java.util.List<String> firewallType) {
            this.firewallType = firewallType;
            return this;
        }
        public java.util.List<String> getFirewallType() {
            return this.firewallType;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setIpProtocol(Integer ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public Integer getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setPrimaryDns(String primaryDns) {
            this.primaryDns = primaryDns;
            return this;
        }
        public String getPrimaryDns() {
            return this.primaryDns;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setPrivateDnsType(String privateDnsType) {
            this.privateDnsType = privateDnsType;
            return this;
        }
        public String getPrivateDnsType() {
            return this.privateDnsType;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setStandbyDns(String standbyDns) {
            this.standbyDns = standbyDns;
            return this;
        }
        public String getStandbyDns() {
            return this.standbyDns;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePrivateDnsEndpointListResponseBodyAccessInstanceList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
