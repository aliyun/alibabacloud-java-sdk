// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetLinkedVpcResponseBody extends TeaModel {
    /**
     * <p>The ID of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The list of internal access endpoints.</p>
     */
    @NameInMap("IntranetLinkedVpcList")
    public java.util.List<ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList> intranetLinkedVpcList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGatewayIntranetLinkedVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetLinkedVpcResponseBody self = new ListGatewayIntranetLinkedVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetLinkedVpcResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewayIntranetLinkedVpcResponseBody setIntranetLinkedVpcList(java.util.List<ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList> intranetLinkedVpcList) {
        this.intranetLinkedVpcList = intranetLinkedVpcList;
        return this;
    }
    public java.util.List<ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList> getIntranetLinkedVpcList() {
        return this.intranetLinkedVpcList;
    }

    public ListGatewayIntranetLinkedVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that owns the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>161*******66</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Indicates whether authoritative DNS resolution is enabled. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthoritativeDnsEnabled")
        public Boolean authoritativeDnsEnabled;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.11</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze4pgstgszvgq******</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p>Creating: The endpoint is being created.</p>
         * </li>
         * <li><p>Running: The endpoint is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual switch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vb2qjoiio6m9pg******</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zetuli9ws0qgjd******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList self = new ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList();
            return TeaModel.build(map, self);
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setAuthoritativeDnsEnabled(Boolean authoritativeDnsEnabled) {
            this.authoritativeDnsEnabled = authoritativeDnsEnabled;
            return this;
        }
        public Boolean getAuthoritativeDnsEnabled() {
            return this.authoritativeDnsEnabled;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGatewayIntranetLinkedVpcResponseBodyIntranetLinkedVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
