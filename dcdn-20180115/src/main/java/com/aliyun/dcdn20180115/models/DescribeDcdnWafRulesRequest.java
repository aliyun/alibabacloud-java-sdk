// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: **1** to **100000**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection rules to return per page. Valid values: integers from **1** to **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. The value needs to be a JSON string in the following format: `QueryArgs={"PolicyIds":"The range of protection policy IDs","RuleIds":"The range of protection rule IDs","RuleNameLike":"The name of the protection rule","DomainNames":"The protected domain names","DefenseScenes":"waf_group","RuleStatus":"on","OrderBy":"GmtModified","Desc":"false"}`.</p>
     * <br>
     * <p>> If you do not specify this parameter, all protection rules are queried.</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgs;

    public static DescribeDcdnWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafRulesRequest self = new DescribeDcdnWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafRulesRequest setQueryArgs(String queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public String getQueryArgs() {
        return this.queryArgs;
    }

}
