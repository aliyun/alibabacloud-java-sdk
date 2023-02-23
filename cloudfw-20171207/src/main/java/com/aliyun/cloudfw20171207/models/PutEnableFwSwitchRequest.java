// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchRequest extends TeaModel {
    /**
     * <p>The list of IP addresses.</p>
     * <br>
     * <p>>  You must specify at least one of the IpaddrList, RegionList, ResourceTypeList parameters.</p>
     */
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    /**
     * <p>The language of the content within the request and response.</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of regions.</p>
     * <br>
     * <p>>  You must specify at least one of the IpaddrList, RegionList, ResourceTypeList parameters.</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The list of asset types.</p>
     * <br>
     * <p>>  You must specify at least one of the IpaddrList, RegionList, ResourceTypeList parameters.</p>
     */
    @NameInMap("ResourceTypeList")
    public java.util.List<String> resourceTypeList;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static PutEnableFwSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEnableFwSwitchRequest self = new PutEnableFwSwitchRequest();
        return TeaModel.build(map, self);
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

    public PutEnableFwSwitchRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
