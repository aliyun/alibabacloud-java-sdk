// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection rules to return per page. Valid values: integers from <strong>1</strong> to <strong>500</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. The value needs to be a JSON string in the following format: <code>QueryArgs={&quot;PolicyIds&quot;:&quot;The range of protection policy IDs&quot;,&quot;RuleIds&quot;:&quot;The range of protection rule IDs&quot;,&quot;RuleNameLike&quot;:&quot;The name of the protection rule&quot;,&quot;DomainNames&quot;:&quot;The protected domain names&quot;,&quot;DefenseScenes&quot;:&quot;waf_group&quot;,&quot;RuleStatus&quot;:&quot;on&quot;,&quot;OrderBy&quot;:&quot;GmtModified&quot;,&quot;Desc&quot;:&quot;false&quot;}</code>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, all protection rules are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RuleIds&quot;:&quot;100001,200002&quot;}</p>
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
