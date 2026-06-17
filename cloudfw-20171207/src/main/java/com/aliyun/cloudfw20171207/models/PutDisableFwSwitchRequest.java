// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchRequest extends TeaModel {
    /**
     * <p>The IP version.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The IP addresses.</p>
     * <blockquote>
     * <p>You must specify a value for at least one of the following parameters: <code>IpaddrList</code>, <code>RegionList</code>, and <code>ResourceTypeList</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.0.XX.XX&quot;,&quot;192.0.XX.XX&quot;]</p>
     */
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique identifier of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The regions.</p>
     * <blockquote>
     * <p>You must specify a value for at least one of the following parameters: <code>IpaddrList</code>, <code>RegionList</code>, and <code>ResourceTypeList</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;,&quot;cn-shanghai&quot;]</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The asset types. Valid values:</p>
     * <ul>
     * <li><p><strong>BastionHostEgressIP</strong>: The egress IP address of a bastion host.</p>
     * </li>
     * <li><p><strong>BastionHostIngressIP</strong>: The ingress IP address of a bastion host.</p>
     * </li>
     * <li><p><strong>EcsEIP</strong>: The Elastic IP Address (EIP) of an ECS instance.</p>
     * </li>
     * <li><p><strong>EcsPublicIP</strong>: The public IP address of an ECS instance.</p>
     * </li>
     * <li><p><strong>EIP</strong>: An Elastic IP Address (EIP).</p>
     * </li>
     * <li><p><strong>EniEIP</strong>: The EIP of an elastic network interface (ENI).</p>
     * </li>
     * <li><p><strong>NatEIP</strong>: The EIP of a NAT Gateway instance.</p>
     * </li>
     * <li><p><strong>SlbEIP</strong>: The EIP of a Server Load Balancer (SLB) or Classic Load Balancer (CLB) instance.</p>
     * </li>
     * <li><p><strong>SlbPublicIP</strong>: The public IP address of an SLB or CLB instance.</p>
     * </li>
     * <li><p><strong>NatPublicIP</strong>: The public IP address of a NAT Gateway instance.</p>
     * </li>
     * <li><p><strong>HAVIP</strong>: A High-availability Virtual IP (HAVIP).</p>
     * </li>
     * <li><p><strong>NlbEIP</strong>: The EIP of a Network Load Balancer (NLB) instance.</p>
     * </li>
     * <li><p><strong>ApiGatewayEIP</strong>: The public IP address of an API Gateway instance.</p>
     * </li>
     * <li><p><strong>AlbEIP</strong>: The EIP of an Application Load Balancer (ALB) instance.</p>
     * </li>
     * <li><p><strong>AiGatewayEIP</strong>: The public IP address of an AI Gateway instance.</p>
     * </li>
     * <li><p><strong>GaEIP</strong>: The EIP of a Global Accelerator (GA) instance.</p>
     * </li>
     * <li><p><strong>SwasEIP</strong>: The public IP address of a Simple Application Server instance.</p>
     * </li>
     * <li><p><strong>EcdEIP</strong>: The public IP address of an Elastic Desktop Service (ECD) instance.</p>
     * </li>
     * <li><p><strong>BastionHostIP</strong>: The IP address of a bastion host.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify a value for at least one of the following parameters: <code>IpaddrList</code>, <code>RegionList</code>, and <code>ResourceTypeList</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;EcsPublicIp&quot;,&quot;NatEip&quot;]</p>
     */
    @NameInMap("ResourceTypeList")
    public java.util.List<String> resourceTypeList;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    public static PutDisableFwSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDisableFwSwitchRequest self = new PutDisableFwSwitchRequest();
        return TeaModel.build(map, self);
    }

    public PutDisableFwSwitchRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public PutDisableFwSwitchRequest setIpaddrList(java.util.List<String> ipaddrList) {
        this.ipaddrList = ipaddrList;
        return this;
    }
    public java.util.List<String> getIpaddrList() {
        return this.ipaddrList;
    }

    public PutDisableFwSwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PutDisableFwSwitchRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public PutDisableFwSwitchRequest setRegionList(java.util.List<String> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    public PutDisableFwSwitchRequest setResourceTypeList(java.util.List<String> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    @Deprecated
    public PutDisableFwSwitchRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
