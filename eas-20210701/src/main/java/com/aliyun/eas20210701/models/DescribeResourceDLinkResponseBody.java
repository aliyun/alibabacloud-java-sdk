// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceDLinkResponseBody extends TeaModel {
    @NameInMap("AuxVSwitchList")
    public java.util.List<String> auxVSwitchList;

    /**
     * <p>The CIDR blocks of the clients that you want to connect to. The CIDR blocks are added to the back-to-origin route of the server.</p>
     */
    @NameInMap("DestinationCIDRs")
    public String destinationCIDRs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeResourceDLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDLinkResponseBody self = new DescribeResourceDLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDLinkResponseBody setAuxVSwitchList(java.util.List<String> auxVSwitchList) {
        this.auxVSwitchList = auxVSwitchList;
        return this;
    }
    public java.util.List<String> getAuxVSwitchList() {
        return this.auxVSwitchList;
    }

    public DescribeResourceDLinkResponseBody setDestinationCIDRs(String destinationCIDRs) {
        this.destinationCIDRs = destinationCIDRs;
        return this;
    }
    public String getDestinationCIDRs() {
        return this.destinationCIDRs;
    }

    public DescribeResourceDLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceDLinkResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeResourceDLinkResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeResourceDLinkResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
