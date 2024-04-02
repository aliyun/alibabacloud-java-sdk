// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteScanResultDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeWebsiteScanResultDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteScanResultDetailRequest self = new DescribeWebsiteScanResultDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteScanResultDetailRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DescribeWebsiteScanResultDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWebsiteScanResultDetailRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeWebsiteScanResultDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
