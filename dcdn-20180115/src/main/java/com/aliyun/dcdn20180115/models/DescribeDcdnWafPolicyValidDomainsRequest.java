// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyValidDomainsRequest extends TeaModel {
    @NameInMap("DefenseScene")
    public String defenseScene;

    @NameInMap("DomainNameLike")
    public String domainNameLike;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

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

    public DescribeDcdnWafPolicyValidDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
