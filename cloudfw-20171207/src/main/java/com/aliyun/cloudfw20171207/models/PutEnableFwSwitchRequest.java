// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchRequest extends TeaModel {
    // The list of IP addresses.
    // 
    // >  You must specify at least one of the IpaddrList, RegionList, ResourceTypeList parameters.
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    // The language of the content within the request and response.
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The list of regions.
    // 
    // >  You must specify at least one of the IpaddrList, RegionList, ResourceTypeList parameters.
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    // The list of asset types.
    // 
    // >  You must specify at least one of the IpaddrList, RegionList, ResourceTypeList parameters.
    @NameInMap("ResourceTypeList")
    public java.util.List<String> resourceTypeList;

    // The source IP address of the request.
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
