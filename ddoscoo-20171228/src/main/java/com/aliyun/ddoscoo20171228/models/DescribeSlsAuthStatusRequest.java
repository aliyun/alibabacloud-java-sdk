// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSlsAuthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusRequest self = new DescribeSlsAuthStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSlsAuthStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSlsAuthStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
