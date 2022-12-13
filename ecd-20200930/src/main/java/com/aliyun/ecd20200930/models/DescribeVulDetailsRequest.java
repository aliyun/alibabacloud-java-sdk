// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsRequest extends TeaModel {
    // The alias of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The natural language of the request and response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("Lang")
    public String lang;

    // The name of the Redhat Package Manager (RPM) package.
    // 
    // You can call the [DescribeVulList](~~223907~~) operation to obtain the names of RPM packages.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the vulnerability. Valid values:
    // 
    // *   cve: Linux software vulnerability
    // *   sys: Windows system vulnerability
    @NameInMap("Type")
    public String type;

    public static DescribeVulDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsRequest self = new DescribeVulDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeVulDetailsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVulDetailsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVulDetailsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVulDetailsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
