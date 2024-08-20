// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>en</strong> (default): English.</li>
     * <li><strong>zh</strong>: Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. The value is a string in the JSON format. Format: <code>QueryArgs={&quot;PolicyIds&quot;:&quot;IDs of protection policies&quot;,&quot;RuleIds&quot;:&quot;IDs of the protection rules&quot;,&quot;RuleNameLike&quot;:&quot;Names of the protection rule&quot;,&quot;DomainNames&quot;:&quot;Protected domain names&quot;,&quot;DefenseScenes&quot;:&quot;waf_group&quot;,&quot;RuleStatus&quot;:&quot;on&quot;,&quot;OrderBy&quot;:&quot;GmtModified&quot;,&quot;Desc&quot;:&quot;false&quot;}</code></p>
     * <blockquote>
     * <p>If you do not specify this parameter, all protection rules are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RuleIds&quot;:&quot;100001,200002&quot;}</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgs;

    public static DescribeDcdnWafGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGroupsRequest self = new DescribeDcdnWafGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGroupsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeDcdnWafGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafGroupsRequest setQueryArgs(String queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public String getQueryArgs() {
        return this.queryArgs;
    }

}
