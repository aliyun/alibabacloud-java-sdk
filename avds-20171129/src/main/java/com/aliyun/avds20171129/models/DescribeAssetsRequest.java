// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAssetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Search")
    public String search;

    @NameInMap("AssetGroupId")
    public String assetGroupId;

    @NameInMap("Source")
    public String source;

    @NameInMap("GmtCreateFrom")
    public Long gmtCreateFrom;

    @NameInMap("GmtCreateTo")
    public Long gmtCreateTo;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Types")
    public java.util.List<String> types;

    @NameInMap("Assets")
    public java.util.List<String> assets;

    public static DescribeAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsRequest self = new DescribeAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAssetsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAssetsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAssetsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public DescribeAssetsRequest setAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
        return this;
    }
    public String getAssetGroupId() {
        return this.assetGroupId;
    }

    public DescribeAssetsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAssetsRequest setGmtCreateFrom(Long gmtCreateFrom) {
        this.gmtCreateFrom = gmtCreateFrom;
        return this;
    }
    public Long getGmtCreateFrom() {
        return this.gmtCreateFrom;
    }

    public DescribeAssetsRequest setGmtCreateTo(Long gmtCreateTo) {
        this.gmtCreateTo = gmtCreateTo;
        return this;
    }
    public Long getGmtCreateTo() {
        return this.gmtCreateTo;
    }

    public DescribeAssetsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAssetsRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public DescribeAssetsRequest setAssets(java.util.List<String> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<String> getAssets() {
        return this.assets;
    }

}
