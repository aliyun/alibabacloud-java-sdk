// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupRequest extends TeaModel {
    /**
     * <p>The ID of the WAF rule group. You can query the ID by calling the <a href="~~DescribeDcdnWafGroups~~">DescribeDcdnWafGroups</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1012</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>zh</strong>: Chinese.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>The query conditions. The value is a JSON string in the following format:</p>
     * <p><code>QueryArgs={&quot;PolicyIds&quot;:&quot;The range of protection policy IDs&quot;,&quot;RuleIds&quot;:&quot;The range of protection rule IDs&quot;,&quot;RuleNameLike&quot;:&quot;The name of the protection rule&quot;,&quot;DomainNames&quot;:&quot;The protected domain names&quot;,&quot;DefenseScenes&quot;:&quot;waf_group&quot;,&quot;RuleStatus&quot;:&quot;on&quot;,&quot;OrderBy&quot;:&quot;GmtModified&quot;,&quot;Desc&quot;:&quot;false&quot;}</code></p>
     * <blockquote>
     * <p> If you do not specify this parameter, all protection rules are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;RiskLevel\&quot;:\&quot;\&quot;,\&quot;ProtectionType\&quot;:\&quot;\&quot;,\&quot;ApplicationType\&quot;:\&quot;\&quot;,\&quot;RuleIdLike\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgs;

    /**
     * <p>The range of the rule group to be queried.</p>
     * <ul>
     * <li><strong>in</strong>: Rules in the rule group are returned.</li>
     * <li><strong>out</strong>: Rules that are in the full rule set but are not in the rule group are returned.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static DescribeDcdnWafGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGroupRequest self = new DescribeDcdnWafGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeDcdnWafGroupRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeDcdnWafGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnWafGroupRequest setQueryArgs(String queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public String getQueryArgs() {
        return this.queryArgs;
    }

    public DescribeDcdnWafGroupRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
