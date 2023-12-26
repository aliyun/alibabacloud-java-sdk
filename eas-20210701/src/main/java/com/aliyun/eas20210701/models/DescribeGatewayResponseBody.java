// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeGatewayResponseBody extends TeaModel {
    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>网关创建时间</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExternalClusterId")
    public String externalClusterId;

    /**
     * <p>网关ID</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <p>网关创建的实例种类</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The Internet access control policies.</p>
     */
    @NameInMap("InternetAclPolicyList")
    public java.util.List<DescribeGatewayResponseBodyInternetAclPolicyList> internetAclPolicyList;

    /**
     * <p>网关内部域名</p>
     */
    @NameInMap("InternetDomain")
    public String internetDomain;

    @NameInMap("InternetEnabled")
    public Boolean internetEnabled;

    /**
     * <p>网关外部域名</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    @NameInMap("IntranetEnabled")
    public Boolean intranetEnabled;

    @NameInMap("IntranetLinkedVpcList")
    public java.util.List<DescribeGatewayResponseBodyIntranetLinkedVpcList> intranetLinkedVpcList;

    /**
     * <p>创建网关的用户ID</p>
     */
    @NameInMap("ParentUid")
    public String parentUid;

    /**
     * <p>网关所在地域</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>网关现在的状态</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>网关最后一次的更新时间</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static DescribeGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayResponseBody self = new DescribeGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayResponseBody setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public DescribeGatewayResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGatewayResponseBody setExternalClusterId(String externalClusterId) {
        this.externalClusterId = externalClusterId;
        return this;
    }
    public String getExternalClusterId() {
        return this.externalClusterId;
    }

    public DescribeGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayResponseBody setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public DescribeGatewayResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeGatewayResponseBody setInternetAclPolicyList(java.util.List<DescribeGatewayResponseBodyInternetAclPolicyList> internetAclPolicyList) {
        this.internetAclPolicyList = internetAclPolicyList;
        return this;
    }
    public java.util.List<DescribeGatewayResponseBodyInternetAclPolicyList> getInternetAclPolicyList() {
        return this.internetAclPolicyList;
    }

    public DescribeGatewayResponseBody setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
        return this;
    }
    public String getInternetDomain() {
        return this.internetDomain;
    }

    public DescribeGatewayResponseBody setInternetEnabled(Boolean internetEnabled) {
        this.internetEnabled = internetEnabled;
        return this;
    }
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    public DescribeGatewayResponseBody setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public DescribeGatewayResponseBody setIntranetEnabled(Boolean intranetEnabled) {
        this.intranetEnabled = intranetEnabled;
        return this;
    }
    public Boolean getIntranetEnabled() {
        return this.intranetEnabled;
    }

    public DescribeGatewayResponseBody setIntranetLinkedVpcList(java.util.List<DescribeGatewayResponseBodyIntranetLinkedVpcList> intranetLinkedVpcList) {
        this.intranetLinkedVpcList = intranetLinkedVpcList;
        return this;
    }
    public java.util.List<DescribeGatewayResponseBodyIntranetLinkedVpcList> getIntranetLinkedVpcList() {
        return this.intranetLinkedVpcList;
    }

    public DescribeGatewayResponseBody setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public DescribeGatewayResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGatewayResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class DescribeGatewayResponseBodyInternetAclPolicyList extends TeaModel {
        /**
         * <p>The description.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The accessible CIDR block.</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The state of the private gateway.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Creating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGatewayResponseBodyInternetAclPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayResponseBodyInternetAclPolicyList self = new DescribeGatewayResponseBodyInternetAclPolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayResponseBodyInternetAclPolicyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeGatewayResponseBodyInternetAclPolicyList setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

        public DescribeGatewayResponseBodyInternetAclPolicyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGatewayResponseBodyIntranetLinkedVpcList extends TeaModel {
        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The state of the private gateway.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Creating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeGatewayResponseBodyIntranetLinkedVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayResponseBodyIntranetLinkedVpcList self = new DescribeGatewayResponseBodyIntranetLinkedVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayResponseBodyIntranetLinkedVpcList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGatewayResponseBodyIntranetLinkedVpcList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeGatewayResponseBodyIntranetLinkedVpcList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGatewayResponseBodyIntranetLinkedVpcList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeGatewayResponseBodyIntranetLinkedVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
