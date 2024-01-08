// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGroupRequest extends TeaModel {
    /**
     * <p>The ID of the WAF rule group. You can query the ID by calling the [DescribeDcdnWafGroups](~~DescribeDcdnWafGroups~~) operation.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   **en**: English</p>
     * <p>*    **zh**: Chinese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. The value needs to be a JSON string in the following format: Format:</p>
     * <br>
     * <p>`QueryArgs={"PolicyIds":"IDs of protection policies","RuleIds":"IDs of protection rules","RuleNameLike":"Names of protection rules","DomainNames":"Protected domain names","DefenseScenes":"waf_group","RuleStatus":"on","OrderBy":"GmtModified","Desc":"false"}`</p>
     * <br>
     * <p>> If you do not specify this parameter, all protection rules are queried.</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgs;

    /**
     * <p>The range of the rule group to be queried.</p>
     * <br>
     * <p>*   **in**: rules in the rule group are returned.</p>
     * <p>*  **out**: rules that are in the full rule set but are not in the rule group are returned.</p>
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
