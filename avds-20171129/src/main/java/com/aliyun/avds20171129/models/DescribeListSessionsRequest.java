// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeListSessionsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Asset")
    public String asset;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeListSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListSessionsRequest self = new DescribeListSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListSessionsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeListSessionsRequest setAsset(String asset) {
        this.asset = asset;
        return this;
    }
    public String getAsset() {
        return this.asset;
    }

    public DescribeListSessionsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeListSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
