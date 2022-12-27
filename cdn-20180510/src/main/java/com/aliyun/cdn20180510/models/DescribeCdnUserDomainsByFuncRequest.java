// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncRequest extends TeaModel {
    // The ID of the feature.
    // 
    // For example, the ID of the origin host feature (set_req_host_header) is 18.
    @NameInMap("FuncId")
    public Integer funcId;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Default value: **1**.
    // 
    // Valid values: **1** to **100000**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of domain names to return on each page. Default value: **20**.
    // 
    // Valid values: **1** to **50**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeCdnUserDomainsByFuncRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserDomainsByFuncRequest self = new DescribeCdnUserDomainsByFuncRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserDomainsByFuncRequest setFuncId(Integer funcId) {
        this.funcId = funcId;
        return this;
    }
    public Integer getFuncId() {
        return this.funcId;
    }

    public DescribeCdnUserDomainsByFuncRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnUserDomainsByFuncRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnUserDomainsByFuncRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCdnUserDomainsByFuncRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
