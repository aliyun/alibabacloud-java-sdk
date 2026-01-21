// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The IP addresses.</p>
     * <blockquote>
     * <p>You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.0.X.X&quot;,&quot;192.0.X.X&quot;]</p>
     */
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    /**
     * <p>The language of the content within the response.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The regions.</p>
     * <blockquote>
     * <p>You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;,&quot;cn-shanghai&quot;]</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The types of the assets.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>BastionHostIP: the egress IP address of a bastion host</li>
     * <li>BastionHostIngressIP: the ingress IP address of a bastion host</li>
     * <li>EcsEIP: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
     * <li>EcsPublicIP: the public IP address of an ECS instance</li>
     * <li>EIP: the EIP</li>
     * <li>EniEIP: the EIP of an elastic network interface (ENI)</li>
     * <li>NatEIP: the EIP of a NAT gateway</li>
     * <li>SlbEIP: the EIP of a Server Load Balancer (SLB) instance</li>
     * <li>SlbPublicIP: the public IP address of an SLB instance</li>
     * <li>NatPublicIP: the public IP address of a NAT gateway</li>
     * <li>HAVIP: the high-availability virtual IP address (HAVIP)</li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
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
     * <p>192.0.X.X</p>
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
