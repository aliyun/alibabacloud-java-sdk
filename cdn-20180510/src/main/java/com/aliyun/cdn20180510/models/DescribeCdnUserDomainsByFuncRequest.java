// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncRequest extends TeaModel {
    /**
     * <p>The ID of the feature.</p>
     * <p>For example, the ID of the origin host feature (set_req_host_header) is 18.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FuncId")
    public Integer funcId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names to return on each page. Default value: <strong>20</strong>.</p>
     * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
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
