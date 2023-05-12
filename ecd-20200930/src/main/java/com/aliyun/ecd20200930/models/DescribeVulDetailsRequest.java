// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsRequest extends TeaModel {
    /**
     * <p>Details about the vulnerability.</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The Common Vulnerability Scoring System (CVSS) score of the vulnerability, which indicates the severity of the vulnerability. A larger value indicates a higher severity. Valid values: 0 to 10.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The alias of the vulnerability.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the vulnerability.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeVulDetails.</p>
     */
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
