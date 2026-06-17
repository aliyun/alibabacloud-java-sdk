// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchRequest extends TeaModel {
    /**
     * <p>The IP version.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The list of IP addresses.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>IpaddrList</code>, <code>RegionList</code>, and <code>ResourceTypeList</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.0.X.X&quot;,&quot;192.0.X.X&quot;]</p>
     */
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
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
     * <p>The UID of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The list of regions.</p>
     * <blockquote>
     * <p>You must specify at least one of the <code>IpaddrList</code>, <code>RegionList</code>, and <code>ResourceTypeList</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;,&quot;cn-shanghai&quot;]</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The list of asset types.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>BastionHostEgressIP</strong>: the egress IP address of a bastion host.</p>
     * </li>
     * <li><p><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host.</p>
     * </li>
     * <li><p><strong>EcsEIP</strong>: the EIP of an ECS instance.</p>
     * </li>
     * <li><p><strong>EcsPublicIP</strong>: the public IP address of an ECS instance.</p>
     * </li>
     * <li><p><strong>EIP</strong>: an EIP.</p>
     * </li>
     * <li><p><strong>EniEIP</strong>: the EIP of an ENI.</p>
     * </li>
     * <li><p><strong>NatEIP</strong>: the EIP of a NAT gateway.</p>
     * </li>
     * <li><p><strong>SlbEIP</strong>: the EIP of an SLB instance or a CLB instance.</p>
     * </li>
     * <li><p><strong>SlbPublicIP</strong>: the public IP address of an SLB instance or a CLB instance.</p>
     * </li>
     * <li><p><strong>NatPublicIP</strong>: the public IP address of a NAT gateway.</p>
     * </li>
     * <li><p><strong>HAVIP</strong>: an HAVIP.</p>
     * </li>
     * <li><p><strong>NlbEIP</strong>: the EIP of an NLB instance.</p>
     * </li>
     * <li><p><strong>ApiGatewayEIP</strong>: the public IP address of an API gateway.</p>
     * </li>
     * <li><p><strong>AlbEIP</strong>: the EIP of an ALB instance.</p>
     * </li>
     * <li><p><strong>AiGatewayEIP</strong>: the public IP address of an AI gateway.</p>
     * </li>
     * <li><p><strong>GaEIP</strong>: the EIP of a GA instance.</p>
     * </li>
     * <li><p><strong>SwasEIP</strong>: the public IP address of a Simple Application Server instance.</p>
     * </li>
     * <li><p><strong>EcdEIP</strong>: the public IP address of an Elastic Desktop Service instance.</p>
     * </li>
     * <li><p><strong>BastionHostIP</strong>: the IP address of a bastion host.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least one of the <code>IpaddrList</code>, <code>RegionList</code>, and <code>ResourceTypeList</code> parameters.</p>
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

    public static PutEnableFwSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEnableFwSwitchRequest self = new PutEnableFwSwitchRequest();
        return TeaModel.build(map, self);
    }

    public PutEnableFwSwitchRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public PutEnableFwSwitchRequest setIpaddrList(java.util.List<String> ipaddrList) {
        this.ipaddrList = ipaddrList;
        return this;
    }
    public java.util.List<String> getIpaddrList() {
        return this.ipaddrList;
    }

    public PutEnableFwSwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PutEnableFwSwitchRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public PutEnableFwSwitchRequest setRegionList(java.util.List<String> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    public PutEnableFwSwitchRequest setResourceTypeList(java.util.List<String> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    @Deprecated
    public PutEnableFwSwitchRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
