// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncRequest extends TeaModel {
    /**
     * <p>The ID of the feature. For more information about how to query feature IDs, see [Feature settings for a domain name](~~388460~~). For example, the ID of the origin host feature (set_req_host_header) is 18.</p>
     */
    @NameInMap("FuncId")
    public Integer funcId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     * <br>
     * <p>Valid values: **1** to **100000**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     * <br>
     * <p>Valid values: **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     */
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
