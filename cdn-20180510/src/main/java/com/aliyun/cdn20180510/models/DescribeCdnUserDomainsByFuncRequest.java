// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncRequest extends TeaModel {
    @NameInMap("FuncId")
    public Integer funcId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

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
