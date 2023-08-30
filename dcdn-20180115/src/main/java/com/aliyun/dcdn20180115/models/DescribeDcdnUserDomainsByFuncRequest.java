// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsByFuncRequest extends TeaModel {
    /**
     * <p>The accelerated domain name whose ICP filing status you want to update.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether the feature that is specified by the FuncId parameter is enabled.</p>
     * <br>
     * <p>*   **config**: enabled</p>
     * <p>*   **unconfig**: not enabled</p>
     */
    @NameInMap("FuncFilter")
    public String funcFilter;

    /**
     * <p>The ID of the feature. For more information about how to query feature IDs, see [Parameters for configuring features for domain names](~~410622~~). For example, the ID of the origin host feature (set_req_host_header) is 18.</p>
     */
    @NameInMap("FuncId")
    public Integer funcId;

    /**
     * <p>The number of the page to return. Default value: **1**. Valid values: **1 to 100000**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**. Valid values: **1 to 500**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDcdnUserDomainsByFuncRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsByFuncRequest self = new DescribeDcdnUserDomainsByFuncRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsByFuncRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnUserDomainsByFuncRequest setFuncFilter(String funcFilter) {
        this.funcFilter = funcFilter;
        return this;
    }
    public String getFuncFilter() {
        return this.funcFilter;
    }

    public DescribeDcdnUserDomainsByFuncRequest setFuncId(Integer funcId) {
        this.funcId = funcId;
        return this;
    }
    public Integer getFuncId() {
        return this.funcId;
    }

    public DescribeDcdnUserDomainsByFuncRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsByFuncRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsByFuncRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
