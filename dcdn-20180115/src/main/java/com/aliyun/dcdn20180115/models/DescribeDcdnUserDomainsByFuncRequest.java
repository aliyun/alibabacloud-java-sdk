// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsByFuncRequest extends TeaModel {
    /**
     * <p>The accelerated domain name whose ICP filing status you want to update.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether the feature that is specified by the FuncId parameter is enabled.</p>
     * <ul>
     * <li><strong>config</strong>: enabled</li>
     * <li><strong>unconfig</strong>: not enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>config</p>
     */
    @NameInMap("FuncFilter")
    public String funcFilter;

    /**
     * <p>The ID of the feature. For more information about how to query feature IDs, see <a href="https://help.aliyun.com/document_detail/410622.html">Parameters for configuring features for domain names</a>. For example, the ID of the origin host feature (set_req_host_header) is 18.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FuncId")
    public Integer funcId;

    /**
     * <p>The type of the search. Default value: exact_match. Valid values:</p>
     * <ul>
     * <li>fuzzy_match: fuzzy search.</li>
     * <li>exact_match: exact search.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exact_match</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>. Valid values: <strong>1 to 100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Valid values: <strong>1 to 500</strong>.</p>
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
     * <p>rg-acfmyuji4b6r4**</p>
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

    public DescribeDcdnUserDomainsByFuncRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
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
