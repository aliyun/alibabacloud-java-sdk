// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPoliciesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of protection policies to return on each page. Valid values: an integer from <strong>1</strong> to <strong>500</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. The value is a JSON string. The format is <code>QueryArgs={&quot;PolicyIds&quot;:&quot;The IDs of protection policies&quot;,&quot;RuleIds&quot;:&quot;The IDs of protection rules&quot;,&quot;PolicyNameLike&quot;:&quot;The name of the protection policy&quot;,&quot;DomainNames&quot;:&quot;The protected domain names&quot;,&quot;PolicyType&quot;:&quot;default&quot;,&quot;DefenseScenes&quot;:&quot;waf_group&quot;,&quot;PolicyStatus&quot;:&quot;on&quot;,&quot;OrderBy&quot;:&quot;GmtModified&quot;,&quot;Desc&quot;:&quot;false&quot;}</code></p>
     * <blockquote>
     * <p>If you do not set this parameter, all protection policies are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PolicyNameLIike&quot;:&quot;test_policy&quot;}</p>
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
