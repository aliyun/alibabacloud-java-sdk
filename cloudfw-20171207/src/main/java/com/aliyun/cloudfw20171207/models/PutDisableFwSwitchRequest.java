// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The IP addresses.</p>
     * <blockquote>
     * <p> You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;192.0.XX.XX&quot;,&quot;192.0.XX.XX&quot;]</p>
     */
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
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
     * <p> You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;,&quot;cn-shanghai&quot;]</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The types of the assets.</p>
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
