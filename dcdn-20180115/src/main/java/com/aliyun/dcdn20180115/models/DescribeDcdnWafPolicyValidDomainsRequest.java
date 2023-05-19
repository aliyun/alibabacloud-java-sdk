// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyValidDomainsRequest extends TeaModel {
    /**
     * <p>The type of the Web Application Firewall (WAF) protection policy. Valid values:</p>
     * <br>
     * <p>*   waf_group: basic web protection</p>
     * <p>*   custom_acl: custom protection</p>
     * <p>*   whitelist: IP address whitelist</p>
     * <p>*   ip_blacklist: IP address blacklist</p>
     * <p>*   region_block: region blacklist</p>
     * <p>*   bot: bot management</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The protected domain name. Fuzzy search is supported.</p>
     */
    @NameInMap("DomainNameLike")
    public String domainNameLike;

    /**
     * <p>The page number of the returned page. Valid values: **1** to **100000**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names to return on each page. Valid values: an integer from **1** to **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDcdnWafPolicyValidDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyValidDomainsRequest self = new DescribeDcdnWafPolicyValidDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyValidDomainsRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public DescribeDcdnWafPolicyValidDomainsRequest setDomainNameLike(String domainNameLike) {
        this.domainNameLike = domainNameLike;
        return this;
    }
    public String getDomainNameLike() {
        return this.domainNameLike;
    }

    public DescribeDcdnWafPolicyValidDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnWafPolicyValidDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
