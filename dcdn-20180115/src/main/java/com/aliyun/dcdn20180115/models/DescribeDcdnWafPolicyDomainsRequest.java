// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyDomainsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: **1** to **100000**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names to return on each page. Valid values: an integer from **1** to **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the protection policy. You can specify only one ID in each request.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static DescribeDcdnWafPolicyDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyDomainsRequest self = new DescribeDcdnWafPolicyDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafPolicyDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafPolicyDomainsRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
