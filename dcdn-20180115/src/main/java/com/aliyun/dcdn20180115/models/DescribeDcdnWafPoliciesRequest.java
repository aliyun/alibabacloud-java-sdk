// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPoliciesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: **1** to **100000**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection policies to return on each page. Valid values: an integer from **1** to **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. The value is a JSON string. The format is `QueryArgs={"PolicyIds":"The IDs of protection policies","RuleIds":"The IDs of protection rules","PolicyNameLike":"The name of the protection policy","DomainNames":"The protected domain names","PolicyType":"default","DefenseScenes":"waf_group","PolicyStatus":"on","OrderBy":"GmtModified","Desc":"false"}`</p>
     * <br>
     * <p>> If you do not set this parameter, all protection policies are queried.</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgs;

    public static DescribeDcdnWafPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPoliciesRequest self = new DescribeDcdnWafPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafPoliciesRequest setQueryArgs(String queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public String getQueryArgs() {
        return this.queryArgs;
    }

}
