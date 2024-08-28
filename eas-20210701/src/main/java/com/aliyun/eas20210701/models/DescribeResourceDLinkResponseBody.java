// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceDLinkResponseBody extends TeaModel {
    /**
     * <p>The IDs of the secondary vSwitches that are directly connected.</p>
     */
    @NameInMap("AuxVSwitchList")
    public java.util.List<String> auxVSwitchList;

    /**
     * <p>The CIDR blocks of the clients that you want to connect to. After this parameter is specified, the CIDR blocks are added to the back-to-origin route of the server. Either this parameter or the VSwitchIdList parameter can be used to determine CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>72.16.0.0/16</p>
     */
    @NameInMap("DestinationCIDRs")
    public String destinationCIDRs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the security group that is directly connected.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1j1z7297hcink9d****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the primary vSwitch that is directly connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vbqn2at0kljjxxxx****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC that is directly connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
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
