// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsByFuncRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FuncFilter")
    public String funcFilter;

    @NameInMap("FuncId")
    public Integer funcId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

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

    public DescribeDcdnUserDomainsByFuncRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
