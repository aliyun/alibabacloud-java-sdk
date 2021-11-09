// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchRequest extends TeaModel {
    @NameInMap("IpaddrList")
    public java.util.List<String> ipaddrList;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    @NameInMap("ResourceTypeList")
    public java.util.List<String> resourceTypeList;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static PutDisableFwSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDisableFwSwitchRequest self = new PutDisableFwSwitchRequest();
        return TeaModel.build(map, self);
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

    public PutDisableFwSwitchRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
