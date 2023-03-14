// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer7CCRulesRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeLayer7CCRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer7CCRulesRequest self = new DescribeLayer7CCRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLayer7CCRulesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLayer7CCRulesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeLayer7CCRulesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLayer7CCRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLayer7CCRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
